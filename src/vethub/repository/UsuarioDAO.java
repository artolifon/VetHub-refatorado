package vethub.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vethub.model.Usuario;
import vethub.util.Conexao;
import java.sql.ResultSet;
import vethub.model.Endereco;
import vethub.service.EnderecoService;

/**
 *
 * @author Arthur
 */
public class UsuarioDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    public void cadastrar(Usuario u){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        if(conn != null){
            try {
                EnderecoService enderecoService = new EnderecoService();
                
                int enderecoId = enderecoService.cadastrar(u.getEndereco());
                
                String sql = "INSERT INTO usuario(nome, cpf, cargo, email, telefone, endereco_id, login, senha) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                ps = conn.prepareStatement(sql);
                ps.setString(1, u.getNome());
                ps.setString(2, u.getCpf().replace(".", "").replace("-",""));
                ps.setString(3, u.getCargo().toUpperCase());
                ps.setString(4, u.getEmail());
                ps.setString(5, u.getTelefone().replace("(","").replace(")",""));
                ps.setInt(6, enderecoId);
                ps.setString(7, u.getLogin());
                ps.setString(8, u.getSenha());
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
                
            } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: "+ ex.getMessage());
            } finally {
               Conexao.desconectar(conn); 
            }
        }
     }
    
    public Usuario validar(String login, String senha){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        Usuario u = null;
        String sql = "SELECT u.*, e.* FROM usuario AS u "
                + "JOIN endereco AS e ON u.endereco_id = e.id "
                + "WHERE login = ? AND senha = MD5(?)";
        
        
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
                
            rs = ps.executeQuery();
                
            if(rs.next()){
                u = new Usuario();
                Endereco e = new Endereco();
                    
                e.setId(rs.getInt("e.id"));
                e.setRuaNumero(rs.getString("e.rua_numero"));
                e.setBairro(rs.getString("e.bairro"));
                e.setCidade(rs.getString("e.cidade"));
                e.setEstado(rs.getString("e.estado"));
                e.setCep(rs.getString("e.cep"));
                    
                u.setId(rs.getInt("u.id"));
                u.setNome(rs.getString("u.nome"));
                u.setCpf(rs.getString("u.cpf"));
                u.setEmail(rs.getString("u.email"));
                u.setTelefone(rs.getString("u.telefone"));
                u.setEndereco(e);
                u.setCargo(rs.getString("u.cargo"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
            }
                
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            Conexao.desconectar(conn); 
        }
        
        return u;
    }
    
    public void criarAcesso(Usuario usuario){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "UPDATE usuario SET login = ?, senha = MD5(?) WHERE id = ?";
        
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setInt(3, usuario.getId());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Acesso criado com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao criar acesso: " + ex.getMessage());
        } finally{
            Conexao.desconectar(conn);
        }
    }
    
    public List<Usuario> buscarTodos(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Usuario> usuarios = null;
        
        try{
            ps = conn.prepareStatement("SELECT u.*, e.* FROM usuario AS u "
                    + "JOIN endereco AS e ON u.endereco_id = e.id");
            
            rs = ps.executeQuery();
            
            usuarios = new ArrayList();
            
            while(rs.next()){
                Usuario u = new Usuario();
                Endereco e = new Endereco();
                    
                e.setId(rs.getInt("e.id"));
                e.setRuaNumero(rs.getString("e.rua_numero"));
                e.setBairro(rs.getString("e.bairro"));
                e.setCidade(rs.getString("e.cidade"));
                e.setEstado(rs.getString("e.estado"));
                e.setCep(rs.getString("e.cep"));
                    
                u.setId(rs.getInt("u.id"));
                u.setNome(rs.getString("u.nome"));
                u.setCpf(rs.getString("u.cpf"));
                u.setEmail(rs.getString("u.email"));
                u.setTelefone(rs.getString("u.telefone"));
                u.setEndereco(e);
                u.setCargo(rs.getString("u.cargo"));

                usuarios.add(u);
            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuários: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return usuarios;
    }
    
    public Usuario buscarPorId(int id){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        Usuario u = null;
        
        try{
            ps = conn.prepareStatement("SELECT u.*, e.* FROM usuario AS u JOIN endereco AS e ON u.endereco_id = e.id WHERE u.id = ?");
            
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                u = new Usuario();
                Endereco e = new Endereco();
                    
                e.setId(rs.getInt("e.id"));
                e.setRuaNumero(rs.getString("e.rua_numero"));
                e.setBairro(rs.getString("e.bairro"));
                e.setCidade(rs.getString("e.cidade"));
                e.setEstado(rs.getString("e.estado"));
                e.setCep(rs.getString("e.cep"));
                    
                u.setId(rs.getInt("u.id"));
                u.setNome(rs.getString("u.nome"));
                u.setCpf(rs.getString("u.cpf"));
                u.setEmail(rs.getString("u.email"));
                u.setTelefone(rs.getString("u.telefone"));
                u.setEndereco(e);
                u.setCargo(rs.getString("u.cargo"));

            }
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuário: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return u;
    }
    
    public List<Usuario> filtrar(String nome, String cargo){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Usuario> usuarios = null;
        
        String sql = "SELECT * FROM usuario AS u "
                + "JOIN endereco AS e ON u.endereco_id = e.id "
                + "WHERE u.cargo LIKE ? AND u.nome LIKE ?";
        
        try{
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + cargo + "%");
            ps.setString(2, "%" + nome + "%");
            rs = ps.executeQuery();
            
            usuarios = new ArrayList();
            
            while(rs.next()){
                Usuario u = new Usuario();
                Endereco e = new Endereco();
                    
                e.setId(rs.getInt("e.id"));
                e.setRuaNumero(rs.getString("e.rua_numero"));
                e.setBairro(rs.getString("e.bairro"));
                e.setCidade(rs.getString("e.cidade"));
                e.setEstado(rs.getString("e.estado"));
                e.setCep(rs.getString("e.cep"));
                    
                u.setId(rs.getInt("u.id"));
                u.setNome(rs.getString("u.nome"));
                u.setCpf(rs.getString("u.cpf"));
                u.setEmail(rs.getString("u.email"));
                u.setTelefone(rs.getString("u.telefone"));
                u.setEndereco(e);
                u.setCargo(rs.getString("u.cargo"));

                usuarios.add(u);
            }
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao filtrar usuários: " + ex.getMessage());
        }
        
        return usuarios;
    }
    
    public void editar(Usuario u){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "UPDATE usuario SET nome = ?, cpf = ?, email = ?, telefone = ?, endereco_id = ? WHERE id = ?";
      
        EnderecoService es = new EnderecoService();
        Endereco e = u.getEndereco();
        
        try{
            int enderecoId = es.cadastrar(e);
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getNome());
            ps.setString(2, u.getCpf().replace(".", "").replace("-",""));
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getTelefone().replace("(", "").replace(")",""));
            ps.setInt(5, enderecoId);
            ps.setInt(6, u.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário editado com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao editar usuário: " + ex.getMessage());
        } finally{
            Conexao.desconectar(conn);
        }
        
    }
    
    public void excluir(int id){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "DELETE FROM usuario WHERE id = ?";
        
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao excluir usuário: " + ex.getMessage());
        } finally{
            Conexao.desconectar(conn);
        }
       
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
                
        String sql = "SELECT COUNT(*) FROM usuario";
        
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
    
    public int contarGerentes(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(*) FROM usuario WHERE cargo = 'GERENTE'";
        
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
    
    public int contarAtendentes(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(*) FROM usuario WHERE cargo = 'ATENDENTE'";
        
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
    
    public int contarVeterinarios(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        int quantidade = 0;
                
        String sql = "SELECT COUNT(*) FROM usuario WHERE cargo = 'VETERINARIO'";
        
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
