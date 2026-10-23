package vethub.service;

import java.time.LocalDateTime;
import vethub.model.Procedimento;
import vethub.model.Animal;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vethub.repository.ProcedimentoDAO;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

/**
 *
 * @author Arthur
 */
public class ProcedimentoService {
    private final ProcedimentoDAO procedimentoDao;
    
    public ProcedimentoService(){
        this.procedimentoDao = new ProcedimentoDAO();
    }
    
    public void salvar(Procedimento procedimento){
        procedimentoDao.salvar(procedimento);
    }
    
    public void editar(Procedimento procedimento){
        procedimentoDao.editar(procedimento);
    }
    
    public List<Procedimento> buscarAgendamentos(){
        return procedimentoDao.buscarAgendamentos();       
    }
    
    public boolean verificarDisponibilidade(LocalDateTime dataHora){
        return procedimentoDao.verificarDisponibilidade(dataHora);
    }
    
    public void preencherTabela(JTable table, List<Procedimento> procedimentos){
        if(procedimentos == null){
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        for(Procedimento p : procedimentos){
            String data = p.getDataHora().format(formatter);
            String[] procedimento = {data, p.getTipo(), p.getStatus(), p.getVeterinario().getNome()};
            
            model.addRow(procedimento);             
        }
    }
    
    public void preencherTabelaAgendamentos(JTable table, List<Procedimento> procedimentos){
        if(procedimentos == null){
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
       
        
        for(Procedimento p : procedimentos){
            String data = p.getDataHora().format(formatter);
            String hora = p.getDataHora().format(formatterHora);
            String[] procedimento = {data, hora, p.getAnimal().getNome(), p.getAnimal().getTutor().getNome(), p.getTipo()};
            
            model.addRow(procedimento);             
        }
    }
    
    public void excluir(int id){
        procedimentoDao.excluir(id);
    }
    
    public List<Procedimento> mostrarUltimos(){
        return procedimentoDao.mostrarUltimos();
    }
    
    public List<Procedimento> filtrar(int animalId, int clienteId, String data, String tipo){
        return procedimentoDao.filtrar(animalId, clienteId, data, tipo);
    }
    
    public List<Procedimento> filtrarProntuario(int animalId, int veterinarioId, String data, String status, String tipo){
        return procedimentoDao.filtrarProntuario(animalId, veterinarioId, data, status, tipo);       
    }
    
    public Procedimento buscarPorId(int id){
        return procedimentoDao.buscarPorId(id);
    }
    
    public List<Procedimento> buscarPorAnimal(Animal animal){
        return procedimentoDao.buscarPorAnimal(animal);
    }
}
