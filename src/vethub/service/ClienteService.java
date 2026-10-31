package vethub.service;

import java.sql.SQLException;
import vethub.model.Cliente;
import java.util.List;
import vethub.model.Animal;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vethub.repository.ClienteDAO;

/**
 *
 * @author Arthur
 */
public class ClienteService {
    private final ClienteDAO clienteDao;
    private final ValidadorService validador;
    
    public ClienteService(){
        this.clienteDao = new ClienteDAO();
        this.validador = new ValidadorService();
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
    
    public void cadastrar(Cliente cliente) throws ClassNotFoundException, SQLException, Exception{
        if (!validador.validarTelefone(cliente.getTelefone())) {
            throw new Exception("Formato de telefone inválido.");
        }
        
        if(!(cliente.getCpf() == null || cliente.getCpf().isEmpty()) && !validador.validarCpf(cliente.getCpf())){
            throw new Exception("Formato de CPF inválido.");
        }
        
        if(!(cliente.getEmail() == null || cliente.getEmail().isEmpty()) && !validador.validarEmail(cliente.getEmail())){
            throw new Exception("Formato de e-mail inválido.");
        }
        
        clienteDao.cadastrar(cliente);
    }
    
    public void editar(Cliente cliente) throws ClassNotFoundException, SQLException, Exception{
        if (!validador.validarTelefone(cliente.getTelefone())) {
            throw new Exception("Formato de telefone inválido.");
        }
        
        if(!(cliente.getCpf() == null || cliente.getCpf().isEmpty()) && !validador.validarCpf(cliente.getCpf())){
            throw new Exception("Formato de CPF inválido.");
        }
        
        if(!(cliente.getEmail() == null || cliente.getEmail().isEmpty()) && !validador.validarEmail(cliente.getEmail())){
            throw new Exception("Formato de e-mail inválido.");
        }
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
