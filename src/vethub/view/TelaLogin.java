package vethub.view;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import vethub.model.Usuario;
import vethub.model.Animal;
import vethub.model.Cliente;
import vethub.model.Procedimento;
import vethub.model.Endereco;
import vethub.service.ValidadorService;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vethub.service.UsuarioService;

/**
 *
 * @author Arthur
 */
public class TelaLogin extends javax.swing.JFrame {
    
    private Usuario usuario;
    private final UsuarioService usuarioService;
    private final ValidadorService validador;
            
    /**
     * Creates new form LoginScreen
     */
    public TelaLogin() {
        
        this.usuarioService = new UsuarioService();
        this.validador = new ValidadorService();
        
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        
        txtLogin.requestFocusInWindow();
        
        getRootPane().setDefaultButton(btnEntrar);
        
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincpal = new javax.swing.JPanel();
        jPanelEsquerdo = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanelDireito = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanelFormulario = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtLogin = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txtSenha = new javax.swing.JPasswordField();
        jPanel10 = new javax.swing.JPanel();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Login");
        setMaximumSize(new java.awt.Dimension(1366, 768));
        setMinimumSize(new java.awt.Dimension(1000, 376));
        setSize(new java.awt.Dimension(1920, 1080));

        jPanelPrincpal.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanelPrincpal.setLayout(new java.awt.GridLayout(1, 2));

        jPanelEsquerdo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelEsquerdo.setMaximumSize(new java.awt.Dimension(225, 1080));
        jPanelEsquerdo.setMinimumSize(new java.awt.Dimension(500, 376));
        jPanelEsquerdo.setPreferredSize(new java.awt.Dimension(225, 1080));
        jPanelEsquerdo.setLayout(new javax.swing.BoxLayout(jPanelEsquerdo, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(960, 270));
        jPanel2.setPreferredSize(new java.awt.Dimension(960, 270));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setMaximumSize(new java.awt.Dimension(32767, 300));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(960, 300));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Arthur\\Documents\\NetBeansProjects\\VetHub\\resources\\images\\logo.png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(960, 320));
        jLabel1.setPreferredSize(new java.awt.Dimension(960, 320));
        jPanel2.add(jLabel1);

        jPanelEsquerdo.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(2312321, 355));
        jPanel1.setMinimumSize(new java.awt.Dimension(37, 37));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 355));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jLabel2.setBackground(new java.awt.Color(76, 84, 84));
        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 84, 84));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sistema de gerenciamento para clínicas veterinárias");
        jLabel2.setMaximumSize(new java.awt.Dimension(23121321, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(500, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(960, 37));
        jPanel1.add(jLabel2);

        jPanelEsquerdo.add(jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMaximumSize(new java.awt.Dimension(32767, 360));
        jPanel4.setPreferredSize(new java.awt.Dimension(960, 360));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 84, 84));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("<html>Gerencie sua clínica  <br>com eficiência e cuidado.</html>");
        jLabel3.setMaximumSize(new java.awt.Dimension(2312321, 58));
        jLabel3.setPreferredSize(new java.awt.Dimension(960, 58));
        jPanel4.add(jLabel3);

        jPanelEsquerdo.add(jPanel4);

        jPanelPrincpal.add(jPanelEsquerdo);

        jPanelDireito.setBackground(new java.awt.Color(76, 84, 84));
        jPanelDireito.setMaximumSize(new java.awt.Dimension(225, 1080));
        jPanelDireito.setPreferredSize(new java.awt.Dimension(225, 1080));
        jPanelDireito.setLayout(new javax.swing.BoxLayout(jPanelDireito, javax.swing.BoxLayout.Y_AXIS));

        jPanel5.setMaximumSize(new java.awt.Dimension(32767, 142));
        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(960, 142));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1058, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );

        jPanelDireito.add(jPanel5);

        jPanelFormulario.setMaximumSize(new java.awt.Dimension(32767, 483));
        jPanelFormulario.setOpaque(false);
        jPanelFormulario.setPreferredSize(new java.awt.Dimension(960, 483));
        jPanelFormulario.setLayout(new javax.swing.BoxLayout(jPanelFormulario, javax.swing.BoxLayout.Y_AXIS));

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ACESSO");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setMaximumSize(new java.awt.Dimension(110, 30));
        jPanelFormulario.add(jLabel4);
        jLabel4.getAccessibleContext().setAccessibleParent(null);

        jPanel6.setMaximumSize(new java.awt.Dimension(960, 70));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(960, 60));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanelFormulario.add(jPanel6);

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setLabelFor(txtLogin);
        jLabel5.setText("Usuário:");
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setMaximumSize(new java.awt.Dimension(320, 16));
        jLabel5.setPreferredSize(new java.awt.Dimension(320, 16));
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanelFormulario.add(jLabel5);
        jLabel5.getAccessibleContext().setAccessibleParent(null);

        jPanel7.setMaximumSize(new java.awt.Dimension(960, 17));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(960, 17));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanelFormulario.add(jPanel7);

        txtLogin.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(76, 84, 84));
        txtLogin.setBorder(null);
        txtLogin.setMaximumSize(new java.awt.Dimension(320, 40));
        txtLogin.setNextFocusableComponent(txtSenha);
        txtLogin.setPreferredSize(new java.awt.Dimension(320, 40));
        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });
        jPanelFormulario.add(txtLogin);
        txtLogin.getAccessibleContext().setAccessibleName("Login");
        txtLogin.getAccessibleContext().setAccessibleDescription("Informe seu login para fazer o acesso");
        txtLogin.getAccessibleContext().setAccessibleParent(null);

        jPanel8.setMaximumSize(new java.awt.Dimension(960, 34));
        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(960, 34));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        jPanelFormulario.add(jPanel8);

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setLabelFor(txtSenha);
        jLabel6.setText("Senha:");
        jLabel6.setAlignmentX(0.5F);
        jLabel6.setMaximumSize(new java.awt.Dimension(320, 16));
        jLabel6.setPreferredSize(new java.awt.Dimension(320, 16));
        jPanelFormulario.add(jLabel6);
        jLabel6.getAccessibleContext().setAccessibleParent(null);

        jPanel9.setMaximumSize(new java.awt.Dimension(960, 17));
        jPanel9.setOpaque(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanelFormulario.add(jPanel9);

        txtSenha.setForeground(new java.awt.Color(76, 84, 84));
        txtSenha.setBorder(null);
        txtSenha.setCaretColor(new java.awt.Color(76, 84, 84));
        txtSenha.setMaximumSize(new java.awt.Dimension(320, 40));
        txtSenha.setNextFocusableComponent(btnEntrar);
        txtSenha.setPreferredSize(new java.awt.Dimension(320, 40));
        jPanelFormulario.add(txtSenha);
        txtSenha.getAccessibleContext().setAccessibleName("Senha");
        txtSenha.getAccessibleContext().setAccessibleDescription("Informe sua senha para realizar o acesso");
        txtSenha.getAccessibleContext().setAccessibleParent(null);

        jPanel10.setMaximumSize(new java.awt.Dimension(960, 62));
        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(960, 60));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        jPanelFormulario.add(jPanel10);

        btnEntrar.setBackground(new java.awt.Color(118, 176, 65));
        btnEntrar.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setAlignmentX(0.5F);
        btnEntrar.setBorder(null);
        btnEntrar.setMaximumSize(new java.awt.Dimension(160, 40));
        btnEntrar.setNextFocusableComponent(txtLogin);
        btnEntrar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanelFormulario.add(btnEntrar);
        btnEntrar.getAccessibleContext().setAccessibleDescription("Clique para acessar o sistema");
        btnEntrar.getAccessibleContext().setAccessibleParent(null);

        jPanelDireito.add(jPanelFormulario);

        jPanelPrincpal.add(jPanelDireito);

        getContentPane().add(jPanelPrincpal, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("Tela de Login");
        getAccessibleContext().setAccessibleDescription("Insira seu login e senha para acessar o sistema");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        
        try {
            if(txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Os campos devem ser preenchidos.");
            } else {
                
                this.usuario = usuarioService.validar(txtLogin.getText().trim(), txtSenha.getText());

                if(usuario != null){
                    this.dispose();
                    if(usuario.getCargo().equals("GERENTE")){
                        new TelaPainelGerente(usuario).setVisible(true);
                    } else if(usuario.getCargo().equals("ATENDENTE") || usuario.getCargo().equals("VETERINARIO")){
                        new TelaPainel(usuario).setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos.");
                }
            }
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_btnEntrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelDireito;
    private javax.swing.JPanel jPanelEsquerdo;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelPrincpal;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
