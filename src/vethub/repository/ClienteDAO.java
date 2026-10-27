package vethub.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import vethub.model.Cliente;
import vethub.model.Endereco;
import vethub.model.Animal;
import vethub.service.EnderecoService;
import vethub.util.Conexao;
/**
 *
 * @author Arthur
 */
public class ClienteDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private List<Cliente> clientes;
    
    public ClienteDAO(){
        this.clientes = new ArrayList();
    }
    
    public List<Cliente> buscarTodos() throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        clientes.clear();
        
        try{
            ps = conn.prepareStatement("SELECT c.*, e.* FROM cliente AS c JOIN endereco AS e ON c.endereco_id = e.id");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                Endereco e = new Endereco();
                    
                e.setId(rs.getInt("e.id"));
                e.setRuaNumero(rs.getString("e.rua_numero"));
                e.setBairro(rs.getString("e.bairro"));
                e.setCidade(rs.getString("e.cidade"));
                e.setEstado(rs.getString("e.estado"));
                e.setCep(rs.getString("e.cep"));
                    
                c.setId(rs.getInt("c.id"));
                c.setNome(rs.getString("c.nome"));
                c.setCpf(rs.getString("c.cpf"));
                c.setEmail(rs.getString("c.email"));
                c.setTelefone(rs.getString("c.telefone"));
                c.setEndereco(e);

                clientes.add(c);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return clientes;
    }
    
    public Cliente buscarPorId(int id) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        Cliente c = null;
        
        try{
            
            String sql = "SELECT c.*, e.* FROM cliente AS c JOIN endereco AS e ON c.endereco_id = e.id WHERE c.id = ?";
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                Endereco e = new Endereco();
                c = new Cliente();
                    
                e.setId(rs.getInt("e.id"));
                e.setRuaNumero(rs.getString("e.rua_numero"));
                e.setBairro(rs.getString("e.bairro"));
                e.setCidade(rs.getString("e.cidade"));
                e.setEstado(rs.getString("e.estado"));
                e.setCep(rs.getString("e.cep"));
                    
                c.setId(rs.getInt("c.id"));
                c.setNome(rs.getString("c.nome"));
                c.setCpf(rs.getString("c.cpf"));
                c.setEmail(rs.getString("c.email"));
                c.setTelefone(rs.getString("c.telefone"));
                c.setEndereco(e);
            }
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar cliente: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return c;
    }
    
    public List<Animal> filtrarAnimais(Cliente tutor) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Animal> animais = null;
        
        String sql = "SELECT * FROM animal WHERE cliente_id = ?";
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.setInt(1, tutor.getId());
            
            ResultSet rs = ps.executeQuery();
            
            animais = new ArrayList();
            
            while(rs.next()){
                Animal a = new Animal();
                a.setId(rs.getInt("id"));
                a.setNome(rs.getString("nome"));
                a.setEspecie(rs.getString("especie"));
                a.setRaca(rs.getString("raca"));
                a.setSexo(rs.getString("sexo"));
                Date dataSql = rs.getDate("data_nascimento");
                if(dataSql != null){
                    a.setDataNascimento(rs.getDate("data_nascimento").toLocalDate());
                }
                a.setTutor(tutor);
                
                animais.add(a);
            }
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return animais;
    }
    
    public void cadastrar(Cliente c) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        try {
            EnderecoService enderecoService = new EnderecoService();
                
            int enderecoId = enderecoService.cadastrar(c.getEndereco());
            
            String sql = "INSERT INTO cliente(nome, cpf, email, telefone, endereco_id) VALUES (?, ?, ?, ?, ?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf().replace(".", "").replace("-",""));
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getTelefone().replace("(", "").replace(")",""));
            ps.setInt(5, enderecoId);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso.");
                
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            Conexao.desconectar(conn); 
        }
    }
    
    public void editar(Cliente c) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "UPDATE cliente SET nome = ?, cpf = ?, email = ?, telefone = ?, endereco_id = ? WHERE id = ?";
      
        EnderecoService es = new EnderecoService();
        Endereco e = c.getEndereco();
        
        try{
            int enderecoId = es.cadastrar(e);
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getCpf().replace(".", "").replace("-",""));
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getTelefone().replace("(", "").replace(")",""));
            ps.setInt(5, enderecoId);
            ps.setInt(6, c.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente editado com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao editar cliente: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public void excluir(int id) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "DELETE FROM cliente WHERE id = ?";
        
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao excluir cliente: " + ex.getMessage());
        } finally{
            Conexao.desconectar(conn);
        }
    }
    
    public int contarTodos() throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(*) FROM cliente";
        
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
    
    public int contarComPets() throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(DISTINCT cliente_id) FROM animal";
        
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
    
    public int contarSemPets() throws ClassNotFoundException, SQLException{
        return (contarTodos() - contarComPets());
    }
    
    public List<Cliente> filtrarPorNome(String nome) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        clientes.clear();
        String sql = "SELECT * FROM cliente WHERE nome LIKE ?";
        
        try{
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + nome + "%");
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                    
                c.setId(rs.getInt("id"));
                c.setNome(rs.getString("nome"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                
                
                clientes.add(c);
            }
           
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao filtrar: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        } 
        
        return clientes;
    }
    
}
