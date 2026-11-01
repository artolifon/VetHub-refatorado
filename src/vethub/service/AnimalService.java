package vethub.service;

import java.sql.SQLException;
import java.time.Period;
import vethub.model.Animal;
import vethub.model.Cliente;
import java.util.List;
import vethub.repository.AnimalDAO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Arthur
 */
public class AnimalService {
    private final AnimalDAO animalDao;
    private final ValidadorService validador;
    
    public AnimalService(){
        this.animalDao = new AnimalDAO();
        this.validador = new ValidadorService();
    }
    
    public int calcularIdade(LocalDate nascimento){
        if(nascimento == null){
            return 0;
        }
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(nascimento, hoje);
        return idade.getYears();
    }
    
    public void cadastrar(Animal animal) throws ClassNotFoundException, SQLException, Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = animal.getDataNascimento().format(formatter);
        
        if(animal.getDataNascimento() != null && !validador.validarData(data)){
            throw new Exception("A data deve estar no formato dd/mm/aaaa.");
        }
               
        if(animal.getPeso() != null && animal.getPeso() <= 0){
            throw new Exception("O peso deve ser maior do que zero.");
        }
        
        animalDao.cadastrar(animal);
    }
    
    public List<Animal> buscarTodos() throws ClassNotFoundException, SQLException{
        return animalDao.buscarTodos();
    }
    
    public Cliente selecionarTutor(int idTutor) throws ClassNotFoundException, SQLException{
        return animalDao.selecionarTutor(idTutor);
    }
    
    public void excluir(int id) throws ClassNotFoundException, SQLException{
        animalDao.excluir(id);
    }
    
    public void editar(Animal animal) throws ClassNotFoundException, SQLException, Exception{
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = animal.getDataNascimento().format(formatter);
        
        if(animal.getDataNascimento() != null && !validador.validarData(data)){
            throw new Exception("A data deve estar no formato dd/mm/aaaa.");
        }
               
        if(animal.getPeso() != null && animal.getPeso() <= 0){
            throw new Exception("O peso deve ser maior do que zero.");
        }
        
        animalDao.editar(animal);
    }
    
    public List<Animal> filtrarEspecie(String especie) throws ClassNotFoundException, SQLException{
        return animalDao.filtrarEspecie(especie);
    }
    
    public Animal buscarPorId(int id) throws ClassNotFoundException, SQLException{
        return animalDao.buscarPorId(id);
    }
    
    public List<Animal> filtrarPorNome(String nome) throws ClassNotFoundException, SQLException{
        return animalDao.filtrarPorNome(nome);
    }
    
    public int contarTodos() throws ClassNotFoundException, SQLException{
        return animalDao.contarTodos();
    }
    
    public int contarCaes() throws ClassNotFoundException, SQLException{
        return animalDao.contarCaes();
    }
    
    public int contarGatos() throws ClassNotFoundException, SQLException{
        return animalDao.contarGatos();
    }
}
