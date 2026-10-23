package vethub.service;

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
    
    public Usuario validar(String login, String senha){
        Usuario usuario = usuarioDao.validar(login, senha);
        return usuario;
    }
    
    public void cadastrar(Usuario usuario){
        usuarioDao.cadastrar(usuario);
    }
    
    public void  criarAcesso(Usuario usuario){
        usuarioDao.criarAcesso(usuario);
    }
    
    public List<Usuario> buscarTodos(){
        return usuarioDao.buscarTodos();
    }
    
    public void editar(Usuario usuario){
        usuarioDao.editar(usuario);
    }
    
    public void excluir(int id){
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
    
    public int contarTodos(){
        return usuarioDao.contarTodos();
    }
    
    public int contarGerentes(){
        return usuarioDao.contarGerentes();
    }
    
    public int contarAtendentes(){
        return usuarioDao.contarAtendentes();
    }
    
    public int contarVeterinarios(){
        return usuarioDao.contarVeterinarios();
    }
    
    public List<Usuario> filtrar(String nome, String cargo){
        return usuarioDao.filtrar(nome, cargo);
    }
    
    public Usuario buscarPorId(int id){
        return usuarioDao.buscarPorId(id);
    }
}
