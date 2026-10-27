package vethub.service;

import java.sql.SQLException;
import vethub.model.Cliente;
import java.util.List;
import java.util.ArrayList;
import vethub.model.Animal;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vethub.repository.ClienteDAO;

/**
 *
 * @author Arthur
 */
public class ClienteService {
    public ClienteDAO clienteDao;
    
    public ClienteService(){
        clienteDao = new ClienteDAO();
    }
    
    public List<Cliente> buscarTodos() throws ClassNotFoundException, SQLException{
        return clienteDao.buscarTodos();
    }
    
    public Cliente buscarPorId(int id) throws ClassNotFoundException, SQLException{
        return clienteDao.buscarPorId(id);
    }
    
    public List<Animal> filtrarAnimais(Cliente tutor) throws ClassNotFoundException, SQLException{
        return clienteDao.filtrarAnimais(tutor);
    }
    
    public void cadastrar(Cliente cliente) throws ClassNotFoundException, SQLException{
        clienteDao.cadastrar(cliente);
    }
    
    public void editar(Cliente cliente) throws ClassNotFoundException, SQLException{
        clienteDao.editar(cliente);
    }
    
    public void excluir(int id) throws ClassNotFoundException, SQLException{
        clienteDao.excluir(id);
    }
    
    public void preencherTabela(JTable table, List<Cliente> clientes){
        if(clientes == null){
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.setRowCount(0);
        
        for(Cliente c : clientes){
            
            String[] linha = {c.getNome(), c.getCpf(), c.getEmail(), c.getTelefone(), c.getEndereco().toString()};
            
            model.addRow(linha);
        }
    }
    
    public int contarTodos()throws ClassNotFoundException, SQLException{
        return clienteDao.contarTodos();
    }
    
    public int contarComPets() throws ClassNotFoundException, SQLException{
        return clienteDao.contarComPets();
    }
    
    public int contarSemPets() throws ClassNotFoundException, SQLException{
        return clienteDao.contarSemPets();
    }
    
    public List<Cliente> filtrarPorNome(String nome) throws ClassNotFoundException, SQLException{
        return clienteDao.filtrarPorNome(nome);
    }
}
