package vethub.model;

/**
 *
 * @author Arthur
 */
public class Endereco {
    private int id;
    private String ruaNumero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(int id, String ruaNumero, String bairro, String cidade, String estado, String cep) {
        this.id = id;
        this.ruaNumero = ruaNumero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }
    
    public Endereco(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRuaNumero() {
        return ruaNumero;
    }

    public void setRuaNumero(String ruaNumero) {
        this.ruaNumero = ruaNumero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    @Override
    public String toString(){
        return (this.getRuaNumero() + " - " + this.getBairro() + "\n" + this.getCidade() + " - " + this.getEstado() + ", " + this.getCep());
    }
}
