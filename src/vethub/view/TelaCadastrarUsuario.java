package vethub.view;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import vethub.model.Animal;
import vethub.model.Cliente;
import java.time.format.DateTimeFormatter;
import vethub.model.Procedimento;
import vethub.model.Usuario;
import vethub.model.Endereco;
import vethub.service.ValidadorService;
import vethub.service.UsuarioService;
import javax.swing.JOptionPane;

/**
 *
 * @author Arthur
 */
public class TelaCadastrarUsuario extends javax.swing.JFrame {
    
    private final Usuario usuario;
    private final MenuUtil menuService;
    private final UsuarioService usuarioService;
    
    public TelaCadastrarUsuario(Usuario usuario) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.menuService = new MenuUtil(usuario);
        this.usuarioService = new UsuarioService();
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btnUsuarios);
        
        getRootPane().setDefaultButton(btnSalvar);
        
        txtNome.requestFocusInWindow();
       
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        lblSair = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        jPanel111 = new javax.swing.JPanel();
        b6 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        jPanel61 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        jPanel98 = new javax.swing.JPanel();
        jPanel112 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        btn15 = new javax.swing.JButton();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        btn16 = new javax.swing.JButton();
        jPanel117 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();
        jPanel120 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jPanel73 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        formulario = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        txtCpf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        txtTelefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        txtBairro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        txtCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        txtEstado = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Cadastrar Usuário");
        setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        setForeground(new java.awt.Color(76, 84, 84));

        jPanel4.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jPanel4.setMaximumSize(new java.awt.Dimension(1366, 768));
        jPanel4.setPreferredSize(new java.awt.Dimension(1366, 768));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(233, 199, 155));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 56));
        jPanel2.setPreferredSize(new java.awt.Dimension(1366, 48));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel16.setOpaque(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(180, 48));
        jPanel16.setLayout(new java.awt.GridBagLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo_icone.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(200, 48));
        jLabel2.setPreferredSize(new java.awt.Dimension(200, 48));
        jPanel16.add(jLabel2, new java.awt.GridBagConstraints());

        jPanel2.add(jPanel16, java.awt.BorderLayout.LINE_START);

        jPanel25.setOpaque(false);
        jPanel25.setPreferredSize(new java.awt.Dimension(150, 48));
        jPanel25.setLayout(new javax.swing.BoxLayout(jPanel25, javax.swing.BoxLayout.LINE_AXIS));

        jPanel26.setOpaque(false);
        jPanel26.setPreferredSize(new java.awt.Dimension(120, 40));
        jPanel26.setLayout(new java.awt.BorderLayout());

        lblSair.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblSair.setForeground(new java.awt.Color(76, 84, 84));
        lblSair.setText(" | Sair");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.setPreferredSize(new java.awt.Dimension(60, 24));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        jPanel26.add(lblSair, java.awt.BorderLayout.LINE_END);
        lblSair.getAccessibleContext().setAccessibleName("Sair");
        lblSair.getAccessibleContext().setAccessibleDescription("Clique para deslogar do sistema");

        lblUsuario.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(76, 84, 84));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_usuario.png"))); // NOI18N
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario.setMaximumSize(new java.awt.Dimension(60, 24));
        lblUsuario.setNextFocusableComponent(lblSair);
        lblUsuario.setPreferredSize(new java.awt.Dimension(60, 20));
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUsuarioMouseClicked(evt);
            }
        });
        jPanel26.add(lblUsuario, java.awt.BorderLayout.CENTER);
        lblUsuario.getAccessibleContext().setAccessibleName("Perfil de usuário");
        lblUsuario.getAccessibleContext().setAccessibleDescription("Clique para abrir seu perfil");

        jPanel25.add(jPanel26);

        jPanel2.add(jPanel25, java.awt.BorderLayout.LINE_END);

        jPanel4.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(76, 84, 84));
        jPanel3.setMaximumSize(new java.awt.Dimension(260, 32767));
        jPanel3.setPreferredSize(new java.awt.Dimension(260, 1206));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel27.setOpaque(false);
        jPanel27.setPreferredSize(new java.awt.Dimension(260, 57));
        jPanel27.setLayout(new java.awt.BorderLayout());

        jPanel28.setMaximumSize(new java.awt.Dimension(32767, 30));
        jPanel28.setOpaque(false);
        jPanel28.setPreferredSize(new java.awt.Dimension(260, 30));
        jPanel28.setLayout(new java.awt.BorderLayout());

        jPanel30.setMaximumSize(new java.awt.Dimension(200, 20));
        jPanel30.setOpaque(false);
        jPanel30.setPreferredSize(new java.awt.Dimension(77, 30));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        jPanel28.add(jPanel30, java.awt.BorderLayout.LINE_START);

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setLabelFor(Menu);
        jLabel5.setText("MENU");
        jPanel28.add(jLabel5, java.awt.BorderLayout.CENTER);

        jPanel27.add(jPanel28, java.awt.BorderLayout.CENTER);

        jPanel29.setMaximumSize(new java.awt.Dimension(32767, 27));
        jPanel29.setOpaque(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(260, 30));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel29, java.awt.BorderLayout.PAGE_START);

        jPanel3.add(jPanel27, java.awt.BorderLayout.PAGE_START);

        jPanel31.setOpaque(false);
        jPanel31.setPreferredSize(new java.awt.Dimension(77, 663));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel31, java.awt.BorderLayout.LINE_START);

        jPanel32.setOpaque(false);
        jPanel32.setLayout(new java.awt.BorderLayout());

        jPanel33.setOpaque(false);
        jPanel33.setPreferredSize(new java.awt.Dimension(183, 32));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jPanel32.add(jPanel33, java.awt.BorderLayout.PAGE_START);

        jPanel35.setOpaque(false);
        jPanel35.setPreferredSize(new java.awt.Dimension(183, 118));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );

        jPanel32.add(jPanel35, java.awt.BorderLayout.PAGE_END);

        Menu.setMaximumSize(new java.awt.Dimension(458, 32767));
        Menu.setOpaque(false);
        Menu.setPreferredSize(new java.awt.Dimension(458, 613));
        Menu.setLayout(new java.awt.GridLayout(9, 1));

        jPanel111.setOpaque(false);
        jPanel111.setLayout(new javax.swing.BoxLayout(jPanel111, javax.swing.BoxLayout.Y_AXIS));

        b6.setOpaque(false);
        b6.setLayout(new java.awt.BorderLayout());

        btn6.setBackground(new java.awt.Color(76, 84, 84));
        btn6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("Painel");
        btn6.setToolTipText("");
        btn6.setBorder(null);
        btn6.setContentAreaFilled(false);
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn6.setIconTextGap(0);
        btn6.setNextFocusableComponent(btn14);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6btn1ActionPerformed(evt);
            }
        });
        b6.add(btn6, java.awt.BorderLayout.LINE_START);
        btn6.getAccessibleContext().setAccessibleParent(Menu);

        jPanel111.add(b6);

        jPanel61.setOpaque(false);

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel111.add(jPanel61);

        Menu.add(jPanel111);

        jPanel67.setOpaque(false);
        jPanel67.setLayout(new javax.swing.BoxLayout(jPanel67, javax.swing.BoxLayout.Y_AXIS));

        jPanel97.setOpaque(false);
        jPanel97.setLayout(new java.awt.BorderLayout());

        btn8.setBackground(new java.awt.Color(76, 84, 84));
        btn8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setBorder(null);
        btn8.setContentAreaFilled(false);
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn8.setIconTextGap(0);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel97.add(btn8, java.awt.BorderLayout.LINE_START);

        btn14.setBackground(new java.awt.Color(76, 84, 84));
        btn14.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn14.setForeground(new java.awt.Color(255, 255, 255));
        btn14.setText("Agendamentos");
        btn14.setBorder(null);
        btn14.setContentAreaFilled(false);
        btn14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn14.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn14.setIconTextGap(0);
        btn14.setNextFocusableComponent(btn15);
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        jPanel97.add(btn14, java.awt.BorderLayout.PAGE_START);
        btn14.getAccessibleContext().setAccessibleParent(Menu);

        jPanel67.add(jPanel97);

        jPanel98.setOpaque(false);

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel67.add(jPanel98);

        Menu.add(jPanel67);

        jPanel112.setOpaque(false);
        jPanel112.setLayout(new javax.swing.BoxLayout(jPanel112, javax.swing.BoxLayout.Y_AXIS));

        jPanel113.setOpaque(false);
        jPanel113.setLayout(new java.awt.BorderLayout());

        btn15.setBackground(new java.awt.Color(76, 84, 84));
        btn15.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn15.setForeground(new java.awt.Color(255, 255, 255));
        btn15.setText("Animais");
        btn15.setBorder(null);
        btn15.setContentAreaFilled(false);
        btn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn15.setIconTextGap(0);
        btn15.setNextFocusableComponent(btn16);
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        jPanel113.add(btn15, java.awt.BorderLayout.PAGE_START);
        btn15.getAccessibleContext().setAccessibleParent(Menu);

        jPanel112.add(jPanel113);

        jPanel114.setOpaque(false);

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel112.add(jPanel114);

        Menu.add(jPanel112);

        jPanel115.setOpaque(false);
        jPanel115.setLayout(new javax.swing.BoxLayout(jPanel115, javax.swing.BoxLayout.Y_AXIS));

        jPanel116.setOpaque(false);
        jPanel116.setLayout(new java.awt.BorderLayout());

        btn16.setBackground(new java.awt.Color(76, 84, 84));
        btn16.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn16.setForeground(new java.awt.Color(255, 255, 255));
        btn16.setText("Clientes");
        btn16.setBorder(null);
        btn16.setContentAreaFilled(false);
        btn16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn16.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn16.setIconTextGap(0);
        btn16.setNextFocusableComponent(btnUsuarios);
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        jPanel116.add(btn16, java.awt.BorderLayout.PAGE_START);
        btn16.getAccessibleContext().setAccessibleParent(Menu);

        jPanel115.add(jPanel116);

        jPanel117.setOpaque(false);

        javax.swing.GroupLayout jPanel117Layout = new javax.swing.GroupLayout(jPanel117);
        jPanel117.setLayout(jPanel117Layout);
        jPanel117Layout.setHorizontalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel117Layout.setVerticalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel115.add(jPanel117);

        Menu.add(jPanel115);

        jPanel118.setOpaque(false);
        jPanel118.setLayout(new javax.swing.BoxLayout(jPanel118, javax.swing.BoxLayout.Y_AXIS));

        jPanel119.setOpaque(false);
        jPanel119.setLayout(new java.awt.BorderLayout());

        btnUsuarios.setBackground(new java.awt.Color(76, 84, 84));
        btnUsuarios.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(219, 161, 89));
        btnUsuarios.setText("Usuários");
        btnUsuarios.setBorder(null);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setIconTextGap(0);
        btnUsuarios.setNextFocusableComponent(lblUsuario);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jPanel119.add(btnUsuarios, java.awt.BorderLayout.LINE_START);
        btnUsuarios.getAccessibleContext().setAccessibleParent(Menu);

        jPanel118.add(jPanel119);

        jPanel120.setOpaque(false);

        javax.swing.GroupLayout jPanel120Layout = new javax.swing.GroupLayout(jPanel120);
        jPanel120.setLayout(jPanel120Layout);
        jPanel120Layout.setHorizontalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel120Layout.setVerticalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel118.add(jPanel120);

        Menu.add(jPanel118);

        jPanel40.setOpaque(false);
        jPanel40.setLayout(new javax.swing.BoxLayout(jPanel40, javax.swing.BoxLayout.Y_AXIS));

        jPanel121.setOpaque(false);
        jPanel121.setLayout(new java.awt.BorderLayout());
        jPanel40.add(jPanel121);

        jPanel122.setOpaque(false);

        javax.swing.GroupLayout jPanel122Layout = new javax.swing.GroupLayout(jPanel122);
        jPanel122.setLayout(jPanel122Layout);
        jPanel122Layout.setHorizontalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel122Layout.setVerticalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel40.add(jPanel122);

        Menu.add(jPanel40);

        jPanel32.add(Menu, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel32, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(1206, 640));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1660, 80));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 84, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CADASTRAR USUÁRIO");
        jLabel1.setMaximumSize(new java.awt.Dimension(1206, 90));
        jLabel1.setMinimumSize(new java.awt.Dimension(112, 90));
        jLabel1.setPreferredSize(new java.awt.Dimension(1206, 90));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel24.setOpaque(false);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel24, java.awt.BorderLayout.PAGE_END);

        jPanel73.setOpaque(false);
        jPanel73.setLayout(new java.awt.BorderLayout());

        jPanel74.setOpaque(false);
        jPanel74.setPreferredSize(new java.awt.Dimension(55, 528));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jPanel73.add(jPanel74, java.awt.BorderLayout.LINE_START);

        jPanel75.setOpaque(false);
        jPanel75.setPreferredSize(new java.awt.Dimension(55, 528));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jPanel73.add(jPanel75, java.awt.BorderLayout.LINE_END);

        jPanel76.setOpaque(false);
        jPanel76.setLayout(new java.awt.BorderLayout());

        jPanel77.setOpaque(false);
        jPanel77.setLayout(new java.awt.BorderLayout());

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(666, 59));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        jPanel77.add(jPanel6, java.awt.BorderLayout.NORTH);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel8.setLayout(new java.awt.BorderLayout());

        btnSalvar.setBackground(new java.awt.Color(118, 176, 65));
        btnSalvar.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setNextFocusableComponent(btnCancelar);
        btnSalvar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel8.add(btnSalvar, java.awt.BorderLayout.PAGE_START);
        btnSalvar.getAccessibleContext().setAccessibleDescription("Salvar cadastro");

        jPanel7.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel9.setLayout(new java.awt.BorderLayout());

        btnCancelar.setBackground(new java.awt.Color(76, 84, 84));
        btnCancelar.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setNextFocusableComponent(btn6);
        btnCancelar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel9.add(btnCancelar, java.awt.BorderLayout.NORTH);
        btnCancelar.getAccessibleContext().setAccessibleDescription("Cancelar cadastro e voltar para a tela Usuários");

        jPanel7.add(jPanel9, java.awt.BorderLayout.EAST);

        jPanel41.setOpaque(false);
        jPanel41.setLayout(new java.awt.BorderLayout());

        jPanel42.setOpaque(false);
        jPanel42.setPreferredSize(new java.awt.Dimension(676, 40));
        jPanel42.setLayout(new java.awt.GridBagLayout());
        jPanel41.add(jPanel42, java.awt.BorderLayout.NORTH);

        jPanel7.add(jPanel41, java.awt.BorderLayout.CENTER);

        jPanel77.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel76.add(jPanel77, java.awt.BorderLayout.PAGE_END);

        jPanel78.setOpaque(false);
        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel79.setOpaque(false);
        jPanel79.setPreferredSize(new java.awt.Dimension(906, 55));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 996, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel79, java.awt.BorderLayout.PAGE_START);

        jPanel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        jPanel80.setOpaque(false);
        jPanel80.setPreferredSize(new java.awt.Dimension(590, 330));
        jPanel80.setLayout(new java.awt.GridLayout(1, 2));

        formulario.setOpaque(false);
        formulario.setPreferredSize(new java.awt.Dimension(496, 330));
        formulario.setLayout(new java.awt.GridBagLayout());

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(385, 245));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.GridLayout(5, 1, 0, 22));

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 84, 84));
        jLabel4.setLabelFor(txtNome);
        jLabel4.setText("Nome:");
        jPanel18.add(jLabel4, java.awt.BorderLayout.LINE_START);
        jLabel4.getAccessibleContext().setAccessibleParent(formulario);

        txtNome.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(76, 84, 84));
        txtNome.setNextFocusableComponent(txtCpf);
        txtNome.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel18.add(txtNome, java.awt.BorderLayout.LINE_END);
        txtNome.getAccessibleContext().setAccessibleParent(formulario);

        jPanel17.add(jPanel18);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout());

        txtCpf.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(76, 84, 84));
        txtCpf.setToolTipText("Formato 000.000.000-00");
        txtCpf.setNextFocusableComponent(txtEmail);
        txtCpf.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel19.add(txtCpf, java.awt.BorderLayout.LINE_END);
        txtCpf.getAccessibleContext().setAccessibleParent(formulario);

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 84, 84));
        jLabel6.setLabelFor(txtCpf);
        jLabel6.setText("CPF:");
        jPanel19.add(jLabel6, java.awt.BorderLayout.LINE_START);
        jLabel6.getAccessibleContext().setAccessibleParent(formulario);

        jPanel17.add(jPanel19);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());

        txtEmail.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(76, 84, 84));
        txtEmail.setNextFocusableComponent(txtTelefone);
        txtEmail.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel20.add(txtEmail, java.awt.BorderLayout.LINE_END);
        txtEmail.getAccessibleContext().setAccessibleParent(formulario);

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 84, 84));
        jLabel7.setLabelFor(txtEmail);
        jLabel7.setText("E-mail");
        jPanel20.add(jLabel7, java.awt.BorderLayout.LINE_START);
        jLabel7.getAccessibleContext().setAccessibleParent(formulario);

        jPanel17.add(jPanel20);

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.BorderLayout());

        txtTelefone.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(76, 84, 84));
        txtTelefone.setToolTipText("000000000");
        txtTelefone.setNextFocusableComponent(txtCargo);
        txtTelefone.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel21.add(txtTelefone, java.awt.BorderLayout.LINE_END);
        txtTelefone.getAccessibleContext().setAccessibleDescription("Formato (00)000000000");
        txtTelefone.getAccessibleContext().setAccessibleParent(formulario);

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 84, 84));
        jLabel8.setLabelFor(txtTelefone);
        jLabel8.setText("Telefone:");
        jPanel21.add(jLabel8, java.awt.BorderLayout.LINE_START);
        jLabel8.getAccessibleContext().setAccessibleParent(formulario);

        jPanel17.add(jPanel21);

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 84, 84));
        jLabel11.setLabelFor(txtCargo);
        jLabel11.setText("Cargo:");
        jPanel43.add(jLabel11, java.awt.BorderLayout.LINE_START);
        jLabel11.getAccessibleContext().setAccessibleParent(formulario);

        txtCargo.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCargo.setForeground(new java.awt.Color(76, 84, 84));
        txtCargo.setNextFocusableComponent(txtRua);
        txtCargo.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel43.add(txtCargo, java.awt.BorderLayout.LINE_END);
        txtCargo.getAccessibleContext().setAccessibleParent(formulario);

        jPanel17.add(jPanel43);

        jPanel12.add(jPanel17, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel12, java.awt.BorderLayout.CENTER);

        formulario.add(jPanel13, new java.awt.GridBagConstraints());

        jPanel80.add(formulario);
        formulario.getAccessibleContext().setAccessibleName("Formulário");
        formulario.getAccessibleContext().setAccessibleDescription("Insira os dados do usuário");
        formulario.getAccessibleContext().setAccessibleParent(formulario);

        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(496, 330));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel44.setOpaque(false);
        jPanel44.setPreferredSize(new java.awt.Dimension(365, 238));
        jPanel44.setLayout(new java.awt.GridLayout(5, 1, 0, 22));

        jPanel45.setOpaque(false);
        jPanel45.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(76, 84, 84));
        jLabel12.setLabelFor(txtRua);
        jLabel12.setText("Rua e nº:");
        jPanel45.add(jLabel12, java.awt.BorderLayout.LINE_START);
        jLabel12.getAccessibleContext().setAccessibleParent(formulario);

        txtRua.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtRua.setForeground(new java.awt.Color(76, 84, 84));
        txtRua.setNextFocusableComponent(txtBairro);
        txtRua.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel45.add(txtRua, java.awt.BorderLayout.LINE_END);
        txtRua.getAccessibleContext().setAccessibleParent(formulario);

        jPanel44.add(jPanel45);

        jPanel46.setOpaque(false);
        jPanel46.setLayout(new java.awt.BorderLayout());

        txtBairro.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(76, 84, 84));
        txtBairro.setNextFocusableComponent(txtCidade);
        txtBairro.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel46.add(txtBairro, java.awt.BorderLayout.LINE_END);
        txtBairro.getAccessibleContext().setAccessibleParent(formulario);

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(76, 84, 84));
        jLabel13.setLabelFor(txtBairro);
        jLabel13.setText("Bairro:");
        jPanel46.add(jLabel13, java.awt.BorderLayout.LINE_START);
        jLabel13.getAccessibleContext().setAccessibleParent(formulario);

        jPanel44.add(jPanel46);

        jPanel71.setOpaque(false);
        jPanel71.setLayout(new java.awt.BorderLayout());

        txtCidade.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(76, 84, 84));
        txtCidade.setNextFocusableComponent(txtEstado);
        txtCidade.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel71.add(txtCidade, java.awt.BorderLayout.LINE_END);
        txtCidade.getAccessibleContext().setAccessibleParent(formulario);

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(76, 84, 84));
        jLabel14.setLabelFor(txtCidade);
        jLabel14.setText("Cidade:");
        jPanel71.add(jLabel14, java.awt.BorderLayout.LINE_START);
        jLabel14.getAccessibleContext().setAccessibleParent(formulario);

        jPanel44.add(jPanel71);

        jPanel72.setOpaque(false);
        jPanel72.setLayout(new java.awt.BorderLayout());

        txtEstado.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(76, 84, 84));
        txtEstado.setNextFocusableComponent(txtCep);
        txtEstado.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel72.add(txtEstado, java.awt.BorderLayout.LINE_END);
        txtEstado.getAccessibleContext().setAccessibleParent(formulario);

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(76, 84, 84));
        jLabel15.setLabelFor(txtEstado);
        jLabel15.setText("Estado:");
        jPanel72.add(jLabel15, java.awt.BorderLayout.LINE_START);
        jLabel15.getAccessibleContext().setAccessibleParent(formulario);

        jPanel44.add(jPanel72);

        jPanel81.setOpaque(false);
        jPanel81.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(76, 84, 84));
        jLabel16.setLabelFor(txtCep);
        jLabel16.setText("CEP:");
        jPanel81.add(jLabel16, java.awt.BorderLayout.LINE_START);
        jLabel16.getAccessibleContext().setAccessibleParent(formulario);

        txtCep.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCep.setForeground(new java.awt.Color(76, 84, 84));
        txtCep.setToolTipText("Formato 00000-000");
        txtCep.setNextFocusableComponent(btnSalvar);
        txtCep.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel81.add(txtCep, java.awt.BorderLayout.LINE_END);
        txtCep.getAccessibleContext().setAccessibleParent(formulario);

        jPanel44.add(jPanel81);

        jPanel11.add(jPanel44, new java.awt.GridBagConstraints());

        jPanel80.add(jPanel11);

        jPanel78.add(jPanel80, java.awt.BorderLayout.CENTER);

        jPanel76.add(jPanel78, java.awt.BorderLayout.CENTER);

        jPanel73.add(jPanel76, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel73, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Tela com formulário para cadastro de usuário");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new TelaUsuarios(usuario).setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            
            String nome = txtNome.getText().trim();
            String cpf = txtCpf.getText().trim().replace(".", "").replace("-", "");
            String email = txtEmail.getText().trim();
            String telefone = txtTelefone.getText().trim();
            String cargo = txtCargo.getText().trim().toUpperCase().replace("Á", "A");
            String rua = txtRua.getText().trim();
            String bairro = txtBairro.getText().trim();
            String cep = txtCep.getText().trim().replace("-", "");
            String cidade = txtCidade.getText().trim();
            String estado = txtEstado.getText().trim();
            
            if(nome.isEmpty() || cpf.isEmpty() || email.isEmpty() || telefone.isEmpty() || cargo.isEmpty() || rua.isEmpty() || bairro.isEmpty() || cep.isEmpty() || cidade.isEmpty() || estado.isEmpty()){
                JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
            } else {
                
                ValidadorService validador = new ValidadorService();
                
                if(validador.validarCpf(cpf) && validador.validarEmail(email) && validador.validarTelefone(telefone) && validador.validarCep(cep)){
                    Endereco e = new Endereco();
                    e.setRuaNumero(rua);
                    e.setBairro(bairro);
                    e.setCidade(cidade);
                    e.setEstado(estado);
                    e.setCep(cep);
                    
                    Usuario u = new Usuario();
                    u.setNome(nome);
                    u.setCpf(cpf);
                    u.setCargo(cargo);
                    u.setEmail(email);
                    u.setTelefone(telefone);
                    u.setEndereco(e);
                    
                    usuarioService.cadastrar(u);
                    
                    new TelaCriarAcesso(usuario, u).setVisible(true);
                    this.dispose();
                }
                
            }
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        this.dispose();
        new TelaPerfilUsuario(usuario, usuario).setVisible(true);
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void btn1btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1btn1ActionPerformed
    
    }//GEN-LAST:event_btn1btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
      
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

    }//GEN-LAST:event_btn5ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        menuService.abrirTela(btnUsuarios);
        this.dispose();;
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btn6btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6btn1ActionPerformed
        menuService.abrirTela(btn6);
        this.dispose();
    }//GEN-LAST:event_btn6btn1ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        menuService.abrirTela(btn14);
        this.dispose();
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        menuService.abrirTela(btn15);
        this.dispose();
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        menuService.abrirTela(btn16);
        this.dispose();
    }//GEN-LAST:event_btn16ActionPerformed

    private void blblSaironPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        
    }//GEN-LAST:event_btn17ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel b6;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
