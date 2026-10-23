package vethub.view;

import vethub.model.Usuario;
import javax.swing.JButton;
import vethub.service.PermissaoService;

/**
 *
 * @author Arthur
 */
public class MenuUtil {
    
    private Usuario usuario;
    private PermissaoService permissao;
    
    public MenuUtil(Usuario usuario) {
        this.usuario = usuario;
        this.permissao = new PermissaoService(usuario);
    }
    
    public void abrirTela(JButton btn){
        String cargo = usuario.getCargo();

        switch(btn.getText()){
            case "Painel":
                if(permissao.temPermissaoGerente()){
                    new TelaPainelGerente(usuario).setVisible(true);
                    break;
                } else {
                    new TelaPainel(usuario).setVisible(true);
                    break;
                }
            case "Animais":
                new TelaAnimais(usuario).setVisible(true);
                break;
            case "Agendamentos":
                new TelaAgendamentos(usuario).setVisible(true);
                break;
            case "Clientes":
                new TelaClientes(usuario).setVisible(true);
                break;
            case "Usuários":
                new TelaUsuarios(usuario).setVisible(true);
                break;
        }
    }
    
    public void carregarMenu(JButton btn){
        if(!permissao.temPermissaoGerente()){
            btn.setVisible(false);
        }
    }
}
