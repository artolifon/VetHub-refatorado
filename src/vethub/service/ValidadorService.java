package vethub.service;

/**
 *
 * @author Arthur
 */
public class ValidadorService {

    
    public boolean validarData(String data){
        return(data.matches("\\d{2}[/\\.\\-]\\d{2}[/\\.\\-]\\d{4}"));
    }
    
    public boolean validarHora(String hora){
        return (hora.matches("\\d{2}[:h]\\d{2}"));
    }    
    
    public boolean validarPeso(String peso){
        return (peso.matches("\\d{1,3}|(\\d{1,3}[\\.\\,]\\d{1,3})"));
    }
    
    public boolean validarTelefone(String telefone){
        return(telefone.matches("\\(?\\d{2}\\)? ?\\d{9}"));
    }
    
    public boolean validarCpf(String cpf){
        return(cpf.matches("\\d{3}.?\\d{3}.?\\d{3}-?\\d{2}"));
    }
    
    public boolean validarEmail(String email){
        return(email.matches("\\w+@\\w+.\\w+(.\\w+)?"));
    }
    
    public boolean validarCep(String cep){
        return(cep.matches("\\d{5}-?\\d{3}"));
    }
}
