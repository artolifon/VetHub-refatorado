package vethub.repository;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
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
    
    public List<Animal> buscarTodos() throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
              conn = Conexao.conectar();
            }
       
        
            animais.clear();


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

            return animais;  
            } finally {
                Conexao.desconectar(conn);
            }
    }
    
    public void cadastrar(Animal a) throws ClassNotFoundException, SQLException{ 
        try{
            if(conn == null || conn.isClosed()){
               conn = Conexao.conectar();
            }


           if(conn != null){

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

           }   
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public Cliente selecionarTutor(int idTutor) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
            
            Cliente tutor = null;
        
            String sql = "SELECT * FROM cliente WHERE id = ?";


            ps = conn.prepareStatement(sql);
            ps.setInt(1, idTutor);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                tutor = new Cliente();

                tutor.setId(rs.getInt("id"));
                tutor.setNome(rs.getString("nome"));
            }
            return tutor;
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public void editar(Animal a) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
            String sql = "UPDATE animal SET nome = ?, especie = ?, sexo = ?, raca = ?, data_nascimento = ?, peso = ?, cliente_id = ? WHERE id = ?";



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
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public List<Animal> filtrarEspecie(String especie) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
            animais.clear();



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


            return animais;    
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public Animal buscarPorId(int id) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }


            Animal a = null;


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

            return a;    
        } finally {
            Conexao.desconectar(conn);
        }
        
    }
    
    public void excluir(int id) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }


            String sql = "DELETE FROM animal WHERE id = ?";


            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ps.executeUpdate();      
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public List<Animal> filtrarPorNome(String nome) throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }


            animais.clear();
            String sql = "SELECT a.*, c.* FROM animal AS a "
                    + "JOIN cliente AS c ON a.cliente_id = c.id "
                    + "WHERE a.nome LIKE ?";



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

            return animais;    
        } finally {
            Conexao.desconectar(conn);
        }
    }    
    
    public int contarTodos() throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }


            int quantidade = 0;

            String sql = "SELECT COUNT(*) FROM animal";




            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            if(rs.next()){
                quantidade = rs.getInt(1);
            }

            return quantidade;  
        } finally {
            Conexao.desconectar(conn);
        }
        
    }
    
    public int contarCaes()throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
              conn = Conexao.conectar();
            }

            int quantidade = 0;

            String sql = "SELECT COUNT(*) FROM animal WHERE especie = 'Cão'";



            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            if(rs.next()){
                quantidade = rs.getInt(1);
            }

            return quantidade;  
        } finally {
            Conexao.desconectar(conn);
        }
        
    }
    
    public int contarGatos() throws ClassNotFoundException, SQLException{
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }

            int quantidade = 0;

            String sql = "SELECT COUNT(*) FROM animal WHERE especie = 'Gato'";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            if(rs.next()){
                quantidade = rs.getInt(1);
            }

            return quantidade;    
        } finally {
            Conexao.desconectar(conn);
        }
        
    }
}
