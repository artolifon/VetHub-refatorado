package vethub.service;

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
    
    public List<Cliente> buscarTodos(){
        return clienteDao.buscarTodos();
    }
    
    public Cliente buscarPorId(int id){
        return clienteDao.buscarPorId(id);
    }
    
    public List<Animal> filtrarAnimais(Cliente tutor){
        return clienteDao.filtrarAnimais(tutor);
    }
    
    public void cadastrar(Cliente cliente){
        clienteDao.cadastrar(cliente);
    }
    
    public void editar(Cliente cliente){
        clienteDao.editar(cliente);
    }
    
    public void excluir(int id){
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
    
    public int contarTodos(){
        return clienteDao.contarTodos();
    }
    
    public int contarComPets(){
        return clienteDao.contarComPets();
    }
    
    public int contarSemPets(){
        return clienteDao.contarSemPets();
    }
    
    public List<Cliente> filtrarPorNome(String nome){
        return clienteDao.filtrarPorNome(nome);
    }
}
