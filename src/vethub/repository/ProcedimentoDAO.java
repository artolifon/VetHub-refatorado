package vethub.repository;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDateTime;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
import vethub.model.Procedimento;
import vethub.util.Conexao;
import javax.swing.JOptionPane;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.time.LocalDateTime;
import vethub.model.Animal;
import vethub.model.Cliente;
import vethub.model.Usuario;

/**
 *
 * @author Arthur
 */
public class ProcedimentoDAO {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    
    
    public void salvar(Procedimento p){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "INSERT INTO procedimento (data_hora, tipo, `status`, anotacoes, usuario_id, animal_id) VALUES (?, ?, ?, ?, ?, ?)";
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.setTimestamp(1, Timestamp.valueOf(p.getDataHora()));
            ps.setString(2, p.getTipo());
            ps.setString(3, p.getStatus());
            ps.setString(4, p.getAnotacoes());
            ps.setInt(5, p.getVeterinario().getId());
            ps.setInt(6, p.getAnimal().getId());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao salvar procedimento: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public void editar(Procedimento p){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "UPDATE procedimento SET data_hora = ?, tipo = ?, `status` = ?, anotacoes = ?, usuario_id = ?, animal_id = ? WHERE id = ?";
      
        try{
            
            ps = conn.prepareStatement(sql);
            
            ps.setTimestamp(1, Timestamp.valueOf(p.getDataHora()));
            ps.setString(2, p.getTipo());
            ps.setString(3, p.getStatus());
            ps.setString(4, p.getAnotacoes());
            ps.setInt(5, p.getVeterinario().getId());
            ps.setInt(6, p.getAnimal().getId());
            ps.setInt(7, p.getId());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Falha ao editar procedimento: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public List<Procedimento> buscarAgendamentos(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Procedimento> agendamentos = null;
        
        String sql = "SELECT * FROM procedimento WHERE `status` = 'agendada' "
                + "ORDER BY data_hora DESC";
        
        try{
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            agendamentos = new ArrayList();
            
            while(rs.next()){
                Procedimento p = new Procedimento();
                
                p.setId(rs.getInt("id"));
                p.setDataHora(rs.getTimestamp("data_hora").toLocalDateTime());
                p.setTipo(rs.getString("tipo"));
                p.setStatus(rs.getString("status"));
                
                AnimalDAO animalDao = new AnimalDAO();
                p.setAnimal(animalDao.buscarPorId(rs.getInt("animal_id")));
                
                UsuarioDAO usuarioDao = new UsuarioDAO();
                p.setVeterinario(usuarioDao.buscarPorId(rs.getInt("usuario_id")));
                
                agendamentos.add(p);
            }
            
        } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao buscar agendamentos: " + ex.getMessage());
            } finally {
               Conexao.desconectar(conn); 
            }
        
        return agendamentos;
    }
    
    public boolean verificarDisponibilidade(LocalDateTime dataHora){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        boolean disponibilidade = true;
        String sql = "SELECT * FROM procedimento WHERE data_hora = ?";
        
        try{
            ps = conn.prepareStatement(sql);
            
            ps.setTimestamp(1, Timestamp.valueOf(dataHora));
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                disponibilidade = false;
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return disponibilidade;
    }
    
    public void excluir(int id){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        String sql = "DELETE FROM procedimento WHERE id = ?";
        
        try{
            
            ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso.");
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao excluir procedimento: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
    }
    
    public List<Procedimento> mostrarUltimos(){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Procedimento> agendamentos = null;
        
        String sql = "SELECT * FROM procedimento WHERE `status` = 'agendada' AND data_hora > NOW() "
                + "ORDER BY data_hora DESC LIMIT 2";
        
        try{
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            agendamentos = new ArrayList();
            
            while(rs.next()){
                Procedimento p = new Procedimento();
                
                p.setId(rs.getInt("id"));
                p.setDataHora(rs.getTimestamp("data_hora").toLocalDateTime());
                p.setTipo(rs.getString("tipo"));
                p.setTipo(rs.getString("tipo"));
                p.setStatus(rs.getString("status"));
                
                AnimalDAO animalDao = new AnimalDAO();
                p.setAnimal(animalDao.buscarPorId(rs.getInt("animal_id")));
                
                UsuarioDAO usuarioDao = new UsuarioDAO();
                p.setVeterinario(usuarioDao.buscarPorId(rs.getInt("usuario_id")));
                
                agendamentos.add(p);
            }
            
        } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao buscar agendamentos: " + ex.getMessage());
            } finally {
               Conexao.desconectar(conn); 
            }
        
        return agendamentos;
    }
    
    public List<Procedimento> filtrar(int animalId, int clienteId, String data, String tipo){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Procedimento> procedimentos = null;
        
        String sql;
        
        try{
            if(clienteId == -1){
                sql = "SELECT p.* FROM procedimento AS p WHERE `status` = 'agendada' "
                        + "AND DATE_FORMAT(data_hora, '%d/%m/%Y') LIKE ? "
                        + "AND tipo LIKE ? "
                        + "ORDER BY p.data_hora DESC";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + data + "%");
                ps.setString(2, "%" + tipo + "%");
                
            } else if (clienteId != -1 && animalId == -1){
                sql = "SELECT p.* FROM procedimento AS p "
                        + "JOIN animal AS a ON p.animal_id = a.id "
                        + "WHERE p.status = 'agendada' "
                        + "AND DATE_FORMAT(p.data_hora, '%d/%m/%Y') LIKE ? "
                        + "AND p.tipo LIKE ? "
                        + "AND a.cliente_id = ? "
                        + "ORDER BY p.data_hora DESC";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + data + "%");
                ps.setString(2, "%" + tipo + "%");
                ps.setInt(3, clienteId);
                
            } else if(animalId != -1){
                sql = "SELECT p.* FROM procedimento AS p WHERE `status` = 'agendada' "
                        + "AND DATE_FORMAT(data_hora, '%d/%m/%Y') LIKE ? "
                        + "AND tipo LIKE ? "
                        + "AND animal_id = ? "
                        + "ORDER BY p.data_hora DESC";
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + data + "%");
                ps.setString(2, "%" + tipo + "%");
                ps.setInt(3, animalId);
                
            }
            
            rs = ps.executeQuery();
                
            procedimentos = new ArrayList();
                
            while(rs.next()){
                Procedimento p = new Procedimento();
                
                p.setId(rs.getInt("p.id"));
                p.setDataHora(rs.getTimestamp("p.data_hora").toLocalDateTime());
                p.setTipo(rs.getString("p.tipo"));
                p.setStatus(rs.getString("p.status"));

                AnimalDAO animalDao = new AnimalDAO();
                p.setAnimal(animalDao.buscarPorId(rs.getInt("p.animal_id")));

                UsuarioDAO usuarioDao = new UsuarioDAO();
                p.setVeterinario(usuarioDao.buscarPorId(rs.getInt("p.usuario_id")));
                    
                p.setAnotacoes(rs.getString("p.anotacoes"));

                procedimentos.add(p);
            }
                
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar filtrar: " + ex.getMessage());
        } finally {
           Conexao.desconectar(conn); 
        }    
        
        return procedimentos;
    }
    
    public List<Procedimento> filtrarProntuario(int animalId, int veterinarioId, String data, String status, String tipo){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Procedimento> procedimentos = null;
        
        
        String sql;
        
        try{
            if(veterinarioId == -1){
                sql = "SELECT * FROM procedimento "
                        + "WHERE `status` LIKE ? "
                        + "AND DATE_FORMAT(data_hora, '%d/%m/%Y') LIKE ? "
                        + "AND tipo LIKE ? "
                        + "AND animal_id = ? "
                        + "ORDER BY data_hora DESC";
                
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + status + "%");
                ps.setString(2, "%" + data + "%");
                ps.setString(3, "%" + tipo + "%");
                ps.setInt(4, animalId);
                
            } else {
                sql = "SELECT * FROM procedimento "
                        + "WHERE `status` LIKE ? "
                        + "AND DATE_FORMAT(data_hora, '%d/%m/%Y') LIKE ? "
                        + "AND tipo LIKE ? "
                        + "AND animal_id = ? "
                        + "AND usuario_id = ? "
                        + "ORDER BY data_hora DESC";
                
                ps = conn.prepareStatement(sql);
                ps.setString(1, "%" + status + "%");
                ps.setString(2, "%" + data + "%");
                ps.setString(3, "%" + tipo + "%");
                ps.setInt(4, animalId);
                ps.setInt(5, veterinarioId);
                
            }
            
            rs = ps.executeQuery();
            
            procedimentos = new ArrayList();
                
            while(rs.next()){
                Procedimento p = new Procedimento();
                
                p.setId(rs.getInt("id"));
                p.setDataHora(rs.getTimestamp("data_hora").toLocalDateTime());
                p.setTipo(rs.getString("tipo"));
                p.setStatus(rs.getString("status"));

                AnimalDAO animalDao = new AnimalDAO();
                p.setAnimal(animalDao.buscarPorId(rs.getInt("animal_id")));

                UsuarioDAO usuarioDao = new UsuarioDAO();
                p.setVeterinario(usuarioDao.buscarPorId(rs.getInt("usuario_id")));
                    
                p.setAnotacoes(rs.getString("anotacoes"));

                procedimentos.add(p);
            }
                
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro ao buscar filtrar: " + ex.getMessage());
        } finally {
           Conexao.desconectar(conn); 
        }    
        
        return procedimentos;
    }
    
    public Procedimento buscarPorId(int id){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        Procedimento p = null;
        
        try{
            ps = conn.prepareStatement("SELECT p.*, a.*, c.*, u.* FROM procedimento AS p "
                    + "JOIN animal AS a ON p.animal_id = a.id "
                    + "JOIN cliente AS c ON a.cliente_id = c.id "
                    + "JOIN usuario AS u ON p.usuario_id = u.id "
                    + "WHERE p.id = ?");
            
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                p = new Procedimento();
                Animal a = new Animal();
                Cliente c = new Cliente();
                Usuario u = new Usuario();
                    
                c.setId(rs.getInt("c.id"));
                c.setNome(rs.getString("c.nome"));
                
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
                a.setTutor(c);
                
                u.setId(rs.getInt("u.id"));
                u.setNome(rs.getString("u.nome"));
                
                p.setId(id);
                
                LocalDateTime dataHora = rs.getTimestamp("p.data_hora").toLocalDateTime();
                
                p.setDataHora(dataHora);
                p.setTipo(rs.getString("p.tipo"));
                p.setStatus(rs.getString("p.status"));
                p.setAnotacoes(rs.getString("p.anotacoes"));
                p.setAnimal(a);    
                p.setVeterinario(u);
            }
            
        } catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar animal: " + ex.getMessage());
        } finally {
            Conexao.desconectar(conn);
        }
        
        return p;
    }
    
    public List<Procedimento> buscarPorAnimal(Animal a){
        try{
            if(conn == null || conn.isClosed()){
                conn = Conexao.conectar();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
        List<Procedimento> procedimentos = null;
        
        String sql = "SELECT * FROM procedimento WHERE animal_id = ? "
                + "ORDER BY data_hora DESC";
        
        try{
            ps = conn.prepareStatement(sql);
            ps.setInt(1, a.getId());
            rs = ps.executeQuery();
            
            procedimentos = new ArrayList();
            
            while(rs.next()){
                Procedimento p = new Procedimento();
                
                p.setId(rs.getInt("id"));
                p.setDataHora(rs.getTimestamp("data_hora").toLocalDateTime());
                p.setTipo(rs.getString("tipo"));
                p.setStatus(rs.getString("status"));
                p.setAnimal(a);
                
                UsuarioDAO usuarioDao = new UsuarioDAO();
                p.setVeterinario(usuarioDao.buscarPorId(rs.getInt("usuario_id")));
                
                procedimentos.add(p);
            }
            
        } catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro ao buscar agendamentos: " + ex.getMessage());
            } finally {
               Conexao.desconectar(conn); 
            }
        
        return procedimentos;
    }
    
}
