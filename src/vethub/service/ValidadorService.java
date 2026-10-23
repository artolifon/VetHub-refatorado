package vethub.service;

import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class ValidadorService {

    
    public boolean validarData(String data){
        if(data.matches("\\d{2}[/\\.\\-]\\d{2}[/\\.\\-]\\d{4}")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de data inválido.");
            return false;
        }                    
    }
    
    public boolean validarHora(String hora){
        if(hora.matches("\\d{2}[:h]\\d{2}")){
            return true;
        }else {
            JOptionPane.showMessageDialog(null, "Formato de hora inválido.");
            return false;
        } 
    }    
    
    public boolean validarPeso(String peso){
        if(peso.matches("\\d{1,3}|(\\d{1,3}[\\.\\,]\\d{1,3})")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de peso inválido.");
            return false;
        }
    }
    
    public boolean validarTelefone(String telefone){
        if(telefone.matches("\\(?\\d{2}\\)? ?\\d{9}")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de telefone inválido.");
            return false;
        }
    }
    
    public boolean validarCpf(String cpf){
        if(cpf.matches("\\d{3}.?\\d{3}.?\\d{3}-?\\d{2}")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de CPF inválido.");
            return false;
        }
    }
    
    public boolean validarEmail(String email){
        if(email.matches("\\w+@\\w+.\\w+(.\\w+)?")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de e-mail inválido.");
            return false;
        }
    }
    
    public boolean validarCep(String cep){
        if(cep.matches("\\d{5}-?\\d{3}")){
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Formato de CEP inválido.");
            return false;
        }
    }
}
