package vethub.service;

import java.sql.SQLException;
import vethub.model.Usuario;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vethub.repository.UsuarioDAO;

/**
 *
 * @author Arthur
 */
public class UsuarioService {
    private final UsuarioDAO usuarioDao = new UsuarioDAO();
    
    public Usuario validar(String login, String senha) throws ClassNotFoundException, SQLException{
        Usuario usuario = usuarioDao.validar(login, senha);
        return usuario;
    }
    
    public void cadastrar(Usuario usuario) throws ClassNotFoundException, SQLException{
        usuarioDao.cadastrar(usuario);
    }
    
    public void  criarAcesso(Usuario usuario) throws ClassNotFoundException, SQLException{
        usuarioDao.criarAcesso(usuario);
    }
    
    public List<Usuario> buscarTodos() throws ClassNotFoundException, SQLException{
        return usuarioDao.buscarTodos();
    }
    
    public void editar(Usuario usuario) throws ClassNotFoundException, SQLException{
        usuarioDao.editar(usuario);
    }
    
    public void excluir(int id) throws ClassNotFoundException, SQLException{
        usuarioDao.excluir(id);
    }
    
    public void preencherTabela(JTable table, List<Usuario> usuarios){
        if(usuarios == null){
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.setRowCount(0);
        
        for(Usuario u : usuarios){
            
            String[] linha = {u.getNome(), u.getCpf(), u.getEmail(), u.getTelefone(), u.getCargo()};
            
            model.addRow(linha);
        }
    }
    
    public int contarTodos() throws ClassNotFoundException, SQLException{
        return usuarioDao.contarTodos();
    }
    
    public int contarGerentes() throws ClassNotFoundException, SQLException{
        return usuarioDao.contarGerentes();
    }
    
    public int contarAtendentes() throws ClassNotFoundException, SQLException{
        return usuarioDao.contarAtendentes();
    }
    
    public int contarVeterinarios() throws ClassNotFoundException, SQLException{
        return usuarioDao.contarVeterinarios();
    }
    
    public List<Usuario> filtrar(String nome, String cargo) throws ClassNotFoundException, SQLException{
        return usuarioDao.filtrar(nome, cargo);
    }
    
    public Usuario buscarPorId(int id) throws ClassNotFoundException, SQLException{
        return usuarioDao.buscarPorId(id);
    }
}
