package vethub.repository;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;
import vethub.util.Conexao;
import vethub.model.Animal;
import vethub.model.Cliente;
import vethub.model.Endereco;
import java.sql.Date;

/**
 *
 * @author Arthur
 */
public class AnimalDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private List<Animal> animais;
    
    public AnimalDAO(){
        this.animais = new ArrayList();
    }
    
    public List<Animal> buscarTodos(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        animais.clear();
        
        try{
            ps = conn.prepareStatement("SELECT a.*, c.*, e.* FROM animal AS a JOIN cliente AS c ON a.cliente_id = c.id JOIN endereco AS e ON c.endereco_id = e.id");
            rs = ps.executeQuery();
            while(rs.next()){
                Animal a = new Animal();
                a.setId(rs.getInt("a.id"));
                a.setNome(rs.getString("a.nome"));
                a.setEspecie(rs.getString("a.especie"));
                a.setRaca(rs.getString("a.raca"));
                a.setSexo(rs.getString("a.sexo"));
                Date dataSql = rs.getDate("a.data_nascimento");
                if(dataSql != null){
                    a.setDataNascimento(rs.getDate("a.data_nascimento").toLocalDate());
                }
                
                Double peso = null;
                
                if(rs.getDouble("a.peso") != 0.0){
                    peso = rs.getDouble("a.peso");
                }
                
                a.setPeso(peso);
                a.getTutor().setId(rs.getInt("a.cliente_id"));
                a.getTutor().setNome(rs.getString("c.nome"));
                a.getTutor().setCpf(rs.getString("c.cpf"));
                a.getTutor().setEmail(rs.getString("c.email"));
                a.getTutor().setTelefone(rs.getString("c.telefone"));
                a.getTutor().getEndereco().setRuaNumero(rs.getString("e.rua_numero"));
                a.getTutor().getEndereco().setBairro(rs.getString("e.bairro"));
                a.getTutor().getEndereco().setCidade(rs.getString("e.cidade"));
                a.getTutor().getEndereco().setEstado(rs.getString("e.estado"));
                a.getTutor().getEndereco().setCep(rs.getString("e.cep"));

                animais.add(a);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return animais;
    }
    
    public void cadastrar(Animal a){ 
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        if(conn != null){
            try {
                String sql = "INSERT INTO animal(nome, especie, sexo, raca, data_nascimento, peso, cliente_id) VALUES (?, ?, ?, ? , ?, ?, ?)";
                
                ps = conn.prepareStatement(sql);
                
                ps.setString(1, a.getNome());
                ps.setString(2, a.getEspecie());
                ps.setString(3, a.getSexo());
                ps.setString(4, a.getRaca());
                
                Date sqlDate = null;
                if(a.getDataNascimento() != null){
                    sqlDate = Date.valueOf(a.getDataNascimento());
                }
                ps.setDate(5, sqlDate);
                
                if(a.getPeso() != null){
                    ps.setDouble(6, a.getPeso());  
                } else {
                    ps.setNull(6, java.sql.Types.DOUBLE); 
                }
                
                ps.setInt(7, a.getTutor().getId());
                ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
                
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            } finally {
               Conexao.desconectar(conn); 
            }
        }
    }
    
    public Cliente selecionarTutor(int idTutor){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        Cliente tutor = null;
        
        String sql = "SELECT * FROM cliente WHERE id = ?";
        
        try{
          ps = conn.prepareStatement(sql);
          ps.setInt(1, idTutor);
          
          ResultSet rs = ps.executeQuery();
          
            if(rs.next()){
                tutor = new Cliente();
              
                tutor.setId(rs.getInt("id"));
                tutor.setNome(rs.getString("nome"));
            }
            
        } catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return tutor;
    }
    
    public void editar(Animal a){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "UPDATE animal SET nome = ?, especie = ?, sexo = ?, raca = ?, data_nascimento = ?, peso = ?, cliente_id = ? WHERE id = ?";
      
        try{
            
            ps = conn.prepareStatement(sql);
            
            ps.setString(1, a.getNome());
            ps.setString(2, a.getEspecie());
            ps.setString(3, a.getSexo());
            ps.setString(4, a.getRaca());
            
            if(a.getDataNascimento() != null){
                ps.setDate(5, Date.valueOf(a.getDataNascimento()));
            } else {
                ps.setDate(5, null);
            }
            
            if(a.getPeso() != null){
                ps.setDouble(6, a.getPeso());
            } else {
                ps.setObject(6, null);
            }
            
            ps.setInt(7, a.getTutor().getId());
            ps.setInt(8, a.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Animal editado com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao editar animal: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public List<Animal> filtrarEspecie(String especie){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        animais.clear();
        
        try{
            
            String sql = "SELECT a.*, c.*, e.* FROM animal AS a "
                    + "JOIN cliente AS c ON a.cliente_id = c.id "
                    + "JOIN endereco AS e ON c.endereco_id = e.id "
                    + "WHERE especie LIKE ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, "%" + especie + "%");
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                Animal a = new Animal();
                
                a.setNome(rs.getString("a.nome"));
                a.setEspecie(rs.getString("a.especie"));
                a.setSexo(rs.getString("a.sexo"));
                a.setRaca(rs.getString("a.raca"));
                Date dataSql = rs.getDate("a.data_nascimento");
                if(dataSql != null){
                    a.setDataNascimento(rs.getDate("a.data_nascimento").toLocalDate());
                }
                a.setPeso(rs.getDouble("a.peso"));
                a.getTutor().setId(rs.getInt("a.cliente_id"));
                a.getTutor().setNome(rs.getString("c.nome"));
                a.getTutor().setCpf(rs.getString("c.cpf"));
                a.getTutor().setEmail(rs.getString("c.email"));
                a.getTutor().setTelefone(rs.getString("c.telefone"));
                a.getTutor().getEndereco().setRuaNumero(rs.getString("e.rua_numero"));
                a.getTutor().getEndereco().setBairro(rs.getString("e.bairro"));
                a.getTutor().getEndereco().setCidade(rs.getString("e.cidade"));
                a.getTutor().getEndereco().setEstado(rs.getString("e.rua_numero"));
                a.getTutor().getEndereco().setCep(rs.getString("e.cep"));

                animais.add(a);
            }  
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados");
        } finally {
            Conexao.desconectar(conn);
        }
        
        return animais;
    }
    
    public Animal buscarPorId(int id){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        Animal a = null;
        
        try{
            ps = conn.prepareStatement("SELECT a.*, c.* FROM animal AS a "
                    + "JOIN cliente AS c ON a.cliente_id = c.id WHERE a.id = ?");
            
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                a = new Animal();
                Cliente c = new Cliente();
                    
                c.setId(rs.getInt("c.id"));
                c.setNome(rs.getString("c.nome"));
                c.setCpf(rs.getString("c.cpf"));
                c.setEmail(rs.getString("c.email"));
                c.setTelefone(rs.getString("c.telefone"));
                
                a.setId(rs.getInt("a.id"));
                a.setNome(rs.getString("a.nome"));
                a.setEspecie(rs.getString("a.especie"));
                a.setSexo(rs.getString("a.sexo"));
                a.setRaca(rs.getString("a.raca"));
                Date dataSql = rs.getDate("a.data_nascimento");
                if(dataSql != null){
                    a.setDataNascimento(rs.getDate("a.data_nascimento").toLocalDate());
                }
                
                Double peso = null;
                
                if(rs.getDouble("a.peso") != 0.0){
                    peso = rs.getDouble("a.peso");
                }
                
                a.setPeso(peso);
                a.setTutor(c);
            }
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar animal: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return a;
    }
    
    public void excluir(int id){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "DELETE FROM animal WHERE id = ?";
            
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
        
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Animal excluído com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir animal: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }    
    }
    
    public List<Animal> filtrarPorNome(String nome){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        animais.clear();
        String sql = "SELECT a.*, c.* FROM animal AS a "
                + "JOIN cliente AS c ON a.cliente_id = c.id "
                + "WHERE a.nome LIKE ?";
        
        try{
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                Animal a = new Animal();
                Cliente c = new Cliente();
                    
                c.setId(rs.getInt("c.id"));
                c.setNome(rs.getString("c.nome"));
                c.setCpf(rs.getString("c.cpf"));
                c.setEmail(rs.getString("c.email"));
                c.setTelefone(rs.getString("c.telefone"));
                    
                a.setNome(rs.getString("nome"));
                a.setEspecie(rs.getString("especie"));
                a.setSexo(rs.getString("sexo"));
                a.setRaca(rs.getString("raca"));
                Date dataSql = rs.getDate("a.data_nascimento");
                if(dataSql != null){
                    a.setDataNascimento(rs.getDate("a.data_nascimento").toLocalDate());
                }
                a.setPeso(rs.getDouble("peso"));
                a.setTutor(c);
                
                animais.add(a);
            }
           
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao filtrar: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        } 
        
        return animais;
    }    
    
    public int contarTodos(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(*) FROM animal";
        
        try{
            
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                quantidade = rs.getInt(1);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao contar: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        } 
        
        return quantidade;
    }
    
    public int contarCaes(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(*) FROM animal WHERE especie = 'Cão'";
        
        try{
            
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                quantidade = rs.getInt(1);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao contar: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        } 
        
        return quantidade;
    }
    
    public int contarGatos(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(*) FROM animal WHERE especie = 'Gato'";
        
        try{
            
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if(rs.next()){
                quantidade = rs.getInt(1);
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao contar: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        } 
        
        return quantidade;
    }
}
