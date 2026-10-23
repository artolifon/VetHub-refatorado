package vethub.service;

import java.time.LocalDate;
import java.time.Period;
import vethub.model.Animal;
import javax.swing.JOptionPane;
import vethub.model.Cliente;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vethub.repository.AnimalDAO;

/**
 *
 * @author Arthur
 */
public class AnimalService {
    private final AnimalDAO animalDao = new AnimalDAO();
    
    public int calcularIdade(LocalDate nascimento){
        if(nascimento == null){
            return 0;
        }
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento, hoje);
        return idade.getYears();
    }
    
    public void cadastrar(Animal animal){
        animalDao.cadastrar(animal);
    }
    
    public List<Animal> buscarTodos(){
        return animalDao.buscarTodos();
    }
    
    public Cliente selecionarTutor(int idTutor){
        return animalDao.selecionarTutor(idTutor);
    }
    
    public void excluir(int id){
        animalDao.excluir(id);
    }
    
    public void editar(Animal animal){
        animalDao.editar(animal);
    }
    
    public List<Animal> filtrarEspecie(String especie){
        return animalDao.filtrarEspecie(especie);
    }
    
    public void preencherTabela(JTable table, List<Animal> lista, String tela){
        if(lista == null){
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        
        model.setRowCount(0);
        
        for(Animal a : lista){
            
            String idade = "";
            int idadeInt;
            String palavra;
            
            if(a.getDataNascimento() != null){
               idadeInt = calcularIdade(a.getDataNascimento());
               if(idadeInt == 0){
                    palavra = "";
                } else {
                    palavra = idadeInt > 1? " anos" : " ano";
                }
               idade = String.valueOf(idadeInt) + palavra;
            }
            
            String peso = "";
            
            if(a.getPeso() != null){
                peso = String.valueOf(a.getPeso());
            }
            
            
            String[] linha = null;
            
            if(tela.equals("animais")){
                linha = new String[]{a.getNome(), a.getEspecie(), idade, a.getTutor().getNome()};
                
            } else if (tela.equals("cliente")){
                linha = new String[]{a.getNome(), a.getEspecie(), idade, peso};
            }
            
            model.addRow(linha);
        }
    }
    
    public Animal buscarPorId(int id){
        return animalDao.buscarPorId(id);
    }
    
    public List<Animal> filtrarPorNome(String nome){
        return animalDao.filtrarPorNome(nome);
    }
    
    public int contarTodos(){
        return animalDao.contarTodos();
    }
    
    public int contarCaes(){
        return animalDao.contarCaes();
    }
    
    public int contarGatos(){
        return animalDao.contarGatos();
    }
}
