package vethub.model;

import java.time.LocalDateTime;

public class Procedimento {
  private int id;
  private LocalDateTime dataHora;
  private String tipo;
  private String status;
  private Animal animal;
  private Usuario veterinario;
  private String anotacoes;

    public Procedimento(int id, LocalDateTime dataHora, String tipo, String status, Animal animal, Usuario veterinario, String anotacoes) {
        this.id = id;
        this.dataHora = dataHora;
        this.tipo = tipo;
        this.status = status;
        this.animal = animal;
        this.veterinario = veterinario;
        this.anotacoes = anotacoes;
    }
    
    public Procedimento(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Usuario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Usuario veterinario) {
        this.veterinario = veterinario;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }
  
  
}
