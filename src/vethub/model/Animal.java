package vethub.model;

import java.time.LocalDate;

public class Animal {
    private int id;
    private String nome;
    private String especie;
    private String sexo;
    private String raca;
    private LocalDate dataNascimento;
    private Double peso;
    private Cliente tutor;
    
    public Animal(){
        this.tutor = new Cliente();
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Cliente getTutor() {
        return tutor;
    }

    public void setTutor(Cliente tutor) {
        this.tutor = tutor;
    }    
}
