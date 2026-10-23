package vethub.service;

import vethub.model.Usuario;

/**
 *
 * @author Arthur
 */
public class PermissaoService {
    private Usuario usuario;
    
    public PermissaoService(Usuario usuario){
        this.usuario = usuario;
    }
    
    public boolean temPermissaoGerente(){
        return usuario.getCargo().equals("GERENTE");
    }
        
}
