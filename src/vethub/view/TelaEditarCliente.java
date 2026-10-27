package vethub.view;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import vethub.model.Animal;
import vethub.model.Cliente;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import vethub.model.Endereco;
import vethub.model.Procedimento;
import vethub.model.Usuario;
import vethub.service.ClienteService;
import vethub.service.ValidadorService;

/**
 *
 * @author Arthur
 */
public class TelaEditarCliente extends javax.swing.JFrame {
    
    private final Usuario usuario;
    private final MenuUtil menuService;
    private final ClienteService clienteService;
    private Cliente cliente;
    
    public TelaEditarCliente(Usuario usuario, Cliente cliente) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.cliente = cliente;
        this.clienteService = new ClienteService();
        this.menuService = new MenuUtil(usuario);
        
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn7);
       
        txtNome.setText(cliente.getNome());
        txtCpf.setText(cliente.getCpf());
        txtEmail.setText(cliente.getEmail());
        txtTelefone.setText(cliente.getTelefone());
        txtRua.setText(cliente.getEndereco().getRuaNumero());
        txtBairro.setText(cliente.getEndereco().getBairro());
        txtCidade.setText(cliente.getEndereco().getCidade());
        txtEstado.setText(cliente.getEndereco().getEstado());
        txtCep.setText(cliente.getEndereco().getCep());
        
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
        jPanel104 = new javax.swing.JPanel();
        b4 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        jPanel47 = new javax.swing.JPanel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jPanel50 = new javax.swing.JPanel();
        jPanel51 = new javax.swing.JPanel();
        jPanel52 = new javax.swing.JPanel();
        btn9 = new javax.swing.JButton();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jPanel55 = new javax.swing.JPanel();
        btn3 = new javax.swing.JButton();
        jPanel56 = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        btn7 = new javax.swing.JButton();
        jPanel65 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jPanel69 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
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
        formulario = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jPanel88 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel39 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jPanel40 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Editar Cliente");
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
        lblSair.setNextFocusableComponent(txtNome);
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

        jPanel104.setOpaque(false);
        jPanel104.setLayout(new javax.swing.BoxLayout(jPanel104, javax.swing.BoxLayout.Y_AXIS));

        b4.setOpaque(false);
        b4.setLayout(new java.awt.BorderLayout());

        btn1.setBackground(new java.awt.Color(76, 84, 84));
        btn1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("Painel");
        btn1.setToolTipText("");
        btn1.setBorder(null);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn1.setIconTextGap(0);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1btn1ActionPerformed(evt);
            }
        });
        b4.add(btn1, java.awt.BorderLayout.LINE_START);

        jPanel104.add(b4);
        b4.getAccessibleContext().setAccessibleParent(Menu);

        jPanel47.setOpaque(false);

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel104.add(jPanel47);

        Menu.add(jPanel104);

        jPanel48.setOpaque(false);
        jPanel48.setLayout(new javax.swing.BoxLayout(jPanel48, javax.swing.BoxLayout.Y_AXIS));

        jPanel49.setOpaque(false);
        jPanel49.setLayout(new java.awt.BorderLayout());

        btn2.setBackground(new java.awt.Color(76, 84, 84));
        btn2.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setBorder(null);
        btn2.setContentAreaFilled(false);
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn2.setIconTextGap(0);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel49.add(btn2, java.awt.BorderLayout.LINE_START);

        btn4.setBackground(new java.awt.Color(76, 84, 84));
        btn4.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("Agendamentos");
        btn4.setBorder(null);
        btn4.setContentAreaFilled(false);
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn4.setIconTextGap(0);
        btn4.setNextFocusableComponent(btn9);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel49.add(btn4, java.awt.BorderLayout.PAGE_START);
        btn4.getAccessibleContext().setAccessibleParent(Menu);

        jPanel48.add(jPanel49);

        jPanel50.setOpaque(false);

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel48.add(jPanel50);

        Menu.add(jPanel48);

        jPanel51.setOpaque(false);
        jPanel51.setLayout(new javax.swing.BoxLayout(jPanel51, javax.swing.BoxLayout.Y_AXIS));

        jPanel52.setOpaque(false);
        jPanel52.setLayout(new java.awt.BorderLayout());

        btn9.setBackground(new java.awt.Color(76, 84, 84));
        btn9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("Animais");
        btn9.setBorder(null);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn9.setIconTextGap(0);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel52.add(btn9, java.awt.BorderLayout.PAGE_START);
        btn9.getAccessibleContext().setAccessibleParent(Menu);

        jPanel51.add(jPanel52);

        jPanel53.setOpaque(false);

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel53);

        Menu.add(jPanel51);

        jPanel54.setOpaque(false);
        jPanel54.setLayout(new javax.swing.BoxLayout(jPanel54, javax.swing.BoxLayout.Y_AXIS));

        jPanel55.setOpaque(false);
        jPanel55.setLayout(new java.awt.BorderLayout());

        btn3.setBackground(new java.awt.Color(76, 84, 84));
        btn3.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn3.setForeground(new java.awt.Color(219, 161, 89));
        btn3.setText("Clientes");
        btn3.setBorder(null);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn3.setIconTextGap(0);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel55.add(btn3, java.awt.BorderLayout.PAGE_START);
        btn3.getAccessibleContext().setAccessibleParent(Menu);

        jPanel54.add(jPanel55);

        jPanel56.setOpaque(false);

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel54.add(jPanel56);

        Menu.add(jPanel54);

        jPanel63.setOpaque(false);
        jPanel63.setLayout(new javax.swing.BoxLayout(jPanel63, javax.swing.BoxLayout.Y_AXIS));

        jPanel64.setOpaque(false);
        jPanel64.setLayout(new java.awt.BorderLayout());

        btn7.setBackground(new java.awt.Color(76, 84, 84));
        btn7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("Usuários");
        btn7.setBorder(null);
        btn7.setContentAreaFilled(false);
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn7.setIconTextGap(0);
        btn7.setNextFocusableComponent(lblUsuario);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel64.add(btn7, java.awt.BorderLayout.LINE_START);
        btn7.getAccessibleContext().setAccessibleParent(Menu);

        jPanel63.add(jPanel64);

        jPanel65.setOpaque(false);

        javax.swing.GroupLayout jPanel65Layout = new javax.swing.GroupLayout(jPanel65);
        jPanel65.setLayout(jPanel65Layout);
        jPanel65Layout.setHorizontalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel65Layout.setVerticalGroup(
            jPanel65Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel63.add(jPanel65);

        Menu.add(jPanel63);

        jPanel38.setOpaque(false);
        jPanel38.setLayout(new javax.swing.BoxLayout(jPanel38, javax.swing.BoxLayout.Y_AXIS));

        jPanel69.setOpaque(false);
        jPanel69.setLayout(new java.awt.BorderLayout());
        jPanel38.add(jPanel69);

        jPanel70.setOpaque(false);

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel38.add(jPanel70);

        Menu.add(jPanel38);

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
        jLabel1.setText("EDITAR CLIENTE");
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
        btnSalvar.setBorder(null);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel8.add(btnSalvar, java.awt.BorderLayout.PAGE_START);
        btnSalvar.getAccessibleContext().setAccessibleDescription("Salvar alteraçoes");

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
        btnCancelar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel9.add(btnCancelar, java.awt.BorderLayout.NORTH);
        btnCancelar.getAccessibleContext().setAccessibleDescription("Cancelar alterações e voltar para a página Clientes");

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

        formulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        formulario.setOpaque(false);
        formulario.setPreferredSize(new java.awt.Dimension(590, 330));
        formulario.setLayout(new java.awt.GridLayout(3, 3));

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridBagLayout());

        jPanel82.setOpaque(false);
        jPanel82.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel82.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 84, 84));
        jLabel9.setLabelFor(txtNome);
        jLabel9.setText("Nome*:");
        jPanel82.add(jLabel9, java.awt.BorderLayout.PAGE_START);
        jLabel9.getAccessibleContext().setAccessibleParent(formulario);

        txtNome.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtNome.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel82.add(txtNome, java.awt.BorderLayout.PAGE_END);
        txtNome.getAccessibleContext().setAccessibleParent(formulario);

        jPanel14.add(jPanel82, new java.awt.GridBagConstraints());

        formulario.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.GridBagLayout());

        jPanel85.setOpaque(false);
        jPanel85.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel85.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(76, 84, 84));
        jLabel12.setLabelFor(txtTelefone);
        jLabel12.setText("Telefone*:");
        jPanel85.add(jLabel12, java.awt.BorderLayout.PAGE_START);
        jLabel12.getAccessibleContext().setAccessibleParent(formulario);

        txtTelefone.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtTelefone.setToolTipText("Formato (00)000000000");
        txtTelefone.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel85.add(txtTelefone, java.awt.BorderLayout.PAGE_END);
        txtTelefone.getAccessibleContext().setAccessibleParent(formulario);

        jPanel15.add(jPanel85, new java.awt.GridBagConstraints());

        formulario.add(jPanel15);

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.GridBagLayout());

        jPanel88.setOpaque(false);
        jPanel88.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel88.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(76, 84, 84));
        jLabel15.setLabelFor(txtCidade);
        jLabel15.setText("Cidade:");
        jPanel88.add(jLabel15, java.awt.BorderLayout.PAGE_START);
        jLabel15.getAccessibleContext().setAccessibleParent(formulario);

        txtCidade.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCidade.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel88.add(txtCidade, java.awt.BorderLayout.PAGE_END);
        txtCidade.getAccessibleContext().setAccessibleParent(formulario);

        jPanel22.add(jPanel88, new java.awt.GridBagConstraints());

        formulario.add(jPanel22);

        jPanel23.setOpaque(false);
        jPanel23.setLayout(new java.awt.GridBagLayout());

        jPanel83.setOpaque(false);
        jPanel83.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel83.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 84, 84));
        jLabel10.setLabelFor(txtCpf);
        jLabel10.setText("CPF:");
        jPanel83.add(jLabel10, java.awt.BorderLayout.PAGE_START);
        jLabel10.getAccessibleContext().setAccessibleParent(formulario);

        txtCpf.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCpf.setToolTipText("Formato 000.000.000-00");
        txtCpf.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel83.add(txtCpf, java.awt.BorderLayout.PAGE_END);
        txtCpf.getAccessibleContext().setAccessibleParent(formulario);

        jPanel23.add(jPanel83, new java.awt.GridBagConstraints());

        formulario.add(jPanel23);

        jPanel34.setOpaque(false);
        jPanel34.setLayout(new java.awt.GridBagLayout());

        jPanel86.setOpaque(false);
        jPanel86.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel86.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(76, 84, 84));
        jLabel13.setLabelFor(txtRua);
        jLabel13.setText("Rua e nº:");
        jPanel86.add(jLabel13, java.awt.BorderLayout.PAGE_START);
        jLabel13.getAccessibleContext().setAccessibleParent(formulario);

        txtRua.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtRua.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel86.add(txtRua, java.awt.BorderLayout.PAGE_END);
        txtRua.getAccessibleContext().setAccessibleParent(formulario);

        jPanel34.add(jPanel86, new java.awt.GridBagConstraints());

        formulario.add(jPanel34);

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.GridBagLayout());

        jPanel89.setOpaque(false);
        jPanel89.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel89.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(76, 84, 84));
        jLabel16.setLabelFor(txtEstado);
        jLabel16.setText("Estado:");
        jPanel89.add(jLabel16, java.awt.BorderLayout.PAGE_START);
        jLabel16.getAccessibleContext().setAccessibleParent(formulario);

        txtEstado.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtEstado.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel89.add(txtEstado, java.awt.BorderLayout.PAGE_END);
        txtEstado.getAccessibleContext().setAccessibleParent(formulario);

        jPanel36.add(jPanel89, new java.awt.GridBagConstraints());

        formulario.add(jPanel36);

        jPanel37.setOpaque(false);
        jPanel37.setLayout(new java.awt.GridBagLayout());

        jPanel84.setOpaque(false);
        jPanel84.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel84.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 84, 84));
        jLabel11.setLabelFor(txtEmail);
        jLabel11.setText("E-mail:");
        jPanel84.add(jLabel11, java.awt.BorderLayout.PAGE_START);
        jLabel11.getAccessibleContext().setAccessibleParent(formulario);

        txtEmail.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtEmail.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel84.add(txtEmail, java.awt.BorderLayout.PAGE_END);
        txtEmail.getAccessibleContext().setAccessibleParent(formulario);

        jPanel37.add(jPanel84, new java.awt.GridBagConstraints());

        formulario.add(jPanel37);

        jPanel39.setOpaque(false);
        jPanel39.setLayout(new java.awt.GridBagLayout());

        jPanel87.setOpaque(false);
        jPanel87.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel87.setLayout(new java.awt.BorderLayout());

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(76, 84, 84));
        jLabel14.setLabelFor(txtBairro);
        jLabel14.setText("Bairro:");
        jPanel87.add(jLabel14, java.awt.BorderLayout.PAGE_START);
        jLabel14.getAccessibleContext().setAccessibleParent(formulario);

        txtBairro.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtBairro.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel87.add(txtBairro, java.awt.BorderLayout.PAGE_END);
        txtBairro.getAccessibleContext().setAccessibleParent(formulario);

        jPanel39.add(jPanel87, new java.awt.GridBagConstraints());

        formulario.add(jPanel39);

        jPanel40.setOpaque(false);
        jPanel40.setLayout(new java.awt.GridBagLayout());

        jPanel90.setOpaque(false);
        jPanel90.setPreferredSize(new java.awt.Dimension(200, 60));
        jPanel90.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(76, 84, 84));
        jLabel17.setLabelFor(txtCep);
        jLabel17.setText("CEP:");
        jPanel90.add(jLabel17, java.awt.BorderLayout.PAGE_START);
        jLabel17.getAccessibleContext().setAccessibleParent(formulario);

        txtCep.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCep.setToolTipText("Formato 00000-000");
        txtCep.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel90.add(txtCep, java.awt.BorderLayout.PAGE_END);
        txtCep.getAccessibleContext().setAccessibleParent(formulario);

        jPanel40.add(jPanel90, new java.awt.GridBagConstraints());

        formulario.add(jPanel40);

        jPanel78.add(formulario, java.awt.BorderLayout.CENTER);
        formulario.getAccessibleContext().setAccessibleName("Formulário");
        formulario.getAccessibleContext().setAccessibleDescription("Altere os dados desejados");

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

        getAccessibleContext().setAccessibleDescription("Tela com formulário para editar o cliente selecionado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new TelaClientes(usuario).setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            String nome = txtNome.getText().trim();
            String cpf = txtCpf.getText().trim();
            String email = txtEmail.getText().trim();
            String telefone = txtTelefone.getText().trim();
            String rua = txtRua.getText().trim();
            String bairro = txtBairro.getText().trim();
            String cidade = txtCidade.getText().trim();
            String estado = txtEstado.getText().trim();
            String cep = txtCep.getText().trim();
            
            if(nome.isEmpty() || telefone.isEmpty()){
                JOptionPane.showMessageDialog(null, "Os campos com asterisco são obrigatórios."); 
                return;
            } else {
                
                ValidadorService validador = new ValidadorService();
                if((cpf.isEmpty() || validador.validarCpf(cpf)) && (email.isEmpty() || validador.validarEmail(email)) && (cep.isEmpty() || validador.validarCep(cep))){
                    
                    Endereco e = new Endereco();
                    e.setRuaNumero(rua);
                    e.setBairro(bairro);
                    e.setCidade(cidade);
                    e.setEstado(estado);
                    e.setCep(cep);
                    
                    Cliente c = new Cliente();
                    c.setId(cliente.getId());
                    c.setNome(nome);
                    c.setCpf(cpf);
                    c.setEmail(email);
                    c.setTelefone(telefone);
                    c.setEndereco(e);
                    
                    clienteService.editar(c);
                    JOptionPane.showMessageDialog(null, "Cliente editado com sucesso.");
                } else {
                    return;
                }
            }
            new TelaClientes(usuario).setVisible(true);
            this.dispose();
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
        menuService.abrirTela(btn1);
        this.dispose();
    }//GEN-LAST:event_btn1btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        menuService.abrirTela(btn2);
        this.dispose();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        menuService.abrirTela(btn4);
        this.dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        menuService.abrirTela(btn9);
        this.dispose();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        menuService.abrirTela(btn3);
        this.dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        menuService.abrirTela(btn7);
        this.dispose();
    }//GEN-LAST:event_btn7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel b4;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
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
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtBairro;
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
