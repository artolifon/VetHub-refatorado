package vethub.view;

import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;
import vethub.model.Animal;
import vethub.model.Cliente;
import javax.swing.JOptionPane;
import vethub.model.Endereco;
import vethub.model.Procedimento;
import vethub.model.Usuario;
import vethub.service.ClienteService;
import vethub.service.AnimalService;

/**
 *
 * @author Arthur
 */
public class TelaPerfilCliente extends javax.swing.JFrame {
    
    private final Usuario usuario;
    private final MenuUtil menuService;
    private final ClienteService clienteService;
    private final AnimalService animalService;
    private Cliente cliente;
    private List<Animal> animais;
    
    public TelaPerfilCliente(Usuario usuario, Cliente cliente) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.cliente = cliente;
        this.animalService = new AnimalService();
        this.clienteService = new ClienteService();
        this.menuService = new MenuUtil(usuario);
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn7);
        
        if(usuario.getCargo().equals("VETERINARIO")){
            btnPrincipal.setText("Prontuário");
        } else {
            btnPrincipal.setText("Agendar");
        }
        
        btnEditar.requestFocusInWindow();
        
        txtNome.setText(cliente.getNome());
        txtCpf.setText(cliente.getCpf());
        txtEmail.setText(cliente.getEmail());
        txtTelefone.setText(cliente.getTelefone());
        taEndereco.setText(cliente.getEndereco().toString());
        
        try{
            animais = clienteService.filtrarAnimais(cliente);
        
            animalService.preencherTabela(tbl, animais, "cliente");
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
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
        jPanel10 = new javax.swing.JPanel();
        painelDados = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taEndereco = new javax.swing.JTextArea();
        painelAnimais = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel77 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        btnPrincipal = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Perfil do Cliente");
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
        lblSair.getAccessibleContext().setAccessibleName(" Sair");
        lblSair.getAccessibleContext().setAccessibleDescription("Clique para deslogar do sistema");

        lblUsuario.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(76, 84, 84));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_usuario.png"))); // NOI18N
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario.setMaximumSize(new java.awt.Dimension(60, 24));
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
        btn1.getAccessibleContext().setAccessibleParent(Menu);

        jPanel104.add(b4);

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
        jLabel1.setText("PERFIL DO CLIENTE");
        jLabel1.setMaximumSize(new java.awt.Dimension(1206, 90));
        jLabel1.setMinimumSize(new java.awt.Dimension(112, 90));
        jLabel1.setPreferredSize(new java.awt.Dimension(1206, 90));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel24.setOpaque(false);
        jPanel24.setPreferredSize(new java.awt.Dimension(1106, 70));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
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
            .addGap(0, 570, Short.MAX_VALUE)
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
            .addGap(0, 570, Short.MAX_VALUE)
        );

        jPanel73.add(jPanel75, java.awt.BorderLayout.LINE_END);

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new java.awt.BorderLayout());

        painelDados.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        painelDados.setOpaque(false);
        painelDados.setPreferredSize(new java.awt.Dimension(996, 250));
        painelDados.setLayout(new java.awt.GridLayout(1, 0));

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(384, 190));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(384, 20));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 84, 84));
        jLabel4.setText("DADOS DO CLIENTE");
        jPanel9.add(jLabel4, java.awt.BorderLayout.LINE_START);
        jLabel4.getAccessibleContext().setAccessibleParent(painelDados);

        jPanel8.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(384, 131));
        jPanel13.setLayout(new java.awt.GridLayout(3, 0, 0, 22));

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 84, 84));
        jLabel6.setLabelFor(txtNome);
        jLabel6.setText("Nome:");
        jLabel6.setToolTipText("");
        jPanel14.add(jLabel6, java.awt.BorderLayout.LINE_START);
        jLabel6.getAccessibleContext().setAccessibleParent(painelDados);

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(76, 84, 84));
        txtNome.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel14.add(txtNome, java.awt.BorderLayout.LINE_END);
        txtNome.getAccessibleContext().setAccessibleParent(painelDados);

        jPanel13.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 84, 84));
        jLabel7.setLabelFor(txtCpf);
        jLabel7.setText("CPF:");
        jLabel7.setToolTipText("");
        jPanel15.add(jLabel7, java.awt.BorderLayout.LINE_START);
        jLabel7.getAccessibleContext().setAccessibleParent(painelDados);

        txtCpf.setEditable(false);
        txtCpf.setBackground(new java.awt.Color(255, 255, 255));
        txtCpf.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtCpf.setForeground(new java.awt.Color(76, 84, 84));
        txtCpf.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel15.add(txtCpf, java.awt.BorderLayout.LINE_END);
        txtCpf.getAccessibleContext().setAccessibleParent(painelDados);

        jPanel13.add(jPanel15);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 84, 84));
        jLabel8.setLabelFor(txtEmail);
        jLabel8.setText("E-mail:");
        jLabel8.setToolTipText("");
        jPanel17.add(jLabel8, java.awt.BorderLayout.LINE_START);
        jLabel8.getAccessibleContext().setAccessibleParent(painelDados);

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(76, 84, 84));
        txtEmail.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel17.add(txtEmail, java.awt.BorderLayout.LINE_END);
        txtEmail.getAccessibleContext().setAccessibleParent(painelDados);

        jPanel13.add(jPanel17);

        jPanel8.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        jPanel6.add(jPanel8, new java.awt.GridBagConstraints());

        painelDados.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridBagLayout());

        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(384, 197));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(384, 40));
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel34.setOpaque(false);
        jPanel34.setPreferredSize(new java.awt.Dimension(350, 40));
        jPanel34.setLayout(new java.awt.BorderLayout());

        btnEditar.setBackground(new java.awt.Color(118, 176, 65));
        btnEditar.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel34.add(btnEditar, java.awt.BorderLayout.WEST);
        btnEditar.getAccessibleContext().setAccessibleDescription("Editar os dados do cliente");
        btnEditar.getAccessibleContext().setAccessibleParent(painelDados);

        jPanel36.setOpaque(false);
        jPanel36.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel36.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(new java.awt.Color(76, 84, 84));
        jButton7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Voltar");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel36.add(jButton7, java.awt.BorderLayout.NORTH);
        jButton7.getAccessibleContext().setAccessibleDescription("Voltar para a página Clientes");
        jButton7.getAccessibleContext().setAccessibleParent(painelDados);

        jPanel34.add(jPanel36, java.awt.BorderLayout.EAST);

        jPanel19.add(jPanel34, java.awt.BorderLayout.LINE_END);

        jPanel18.add(jPanel19, java.awt.BorderLayout.PAGE_START);

        jPanel20.setOpaque(false);
        jPanel20.setPreferredSize(new java.awt.Dimension(384, 131));
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 84, 84));
        jLabel9.setLabelFor(txtTelefone);
        jLabel9.setText("Telefone:");
        jLabel9.setToolTipText("");
        jPanel21.add(jLabel9, java.awt.BorderLayout.LINE_START);
        jLabel9.getAccessibleContext().setAccessibleParent(painelDados);

        txtTelefone.setEditable(false);
        txtTelefone.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(76, 84, 84));
        txtTelefone.setPreferredSize(new java.awt.Dimension(280, 30));
        jPanel21.add(txtTelefone, java.awt.BorderLayout.LINE_END);
        txtTelefone.getAccessibleContext().setAccessibleParent(painelDados);

        jPanel20.add(jPanel21, java.awt.BorderLayout.NORTH);

        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(336, 80));
        jPanel22.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 84, 84));
        jLabel10.setText("Endereço:");
        jLabel10.setToolTipText("");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel22.add(jLabel10, java.awt.BorderLayout.LINE_START);
        jLabel10.getAccessibleContext().setAccessibleParent(painelDados);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(280, 20));

        taEndereco.setEditable(false);
        taEndereco.setBackground(new java.awt.Color(255, 255, 255));
        taEndereco.setColumns(20);
        taEndereco.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        taEndereco.setForeground(new java.awt.Color(76, 84, 84));
        taEndereco.setRows(5);
        taEndereco.setPreferredSize(new java.awt.Dimension(280, 20));
        jScrollPane2.setViewportView(taEndereco);

        jPanel22.add(jScrollPane2, java.awt.BorderLayout.EAST);

        jPanel20.add(jPanel22, java.awt.BorderLayout.SOUTH);

        jPanel18.add(jPanel20, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(jPanel18, new java.awt.GridBagConstraints());

        painelDados.add(jPanel7);

        jPanel10.add(painelDados, java.awt.BorderLayout.PAGE_START);
        painelDados.getAccessibleContext().setAccessibleName("Painel de Dados");
        painelDados.getAccessibleContext().setAccessibleDescription("Contém os dados do cliente");
        painelDados.getAccessibleContext().setAccessibleParent(painelDados);

        painelAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        painelAnimais.setOpaque(false);
        painelAnimais.setPreferredSize(new java.awt.Dimension(996, 310));
        painelAnimais.setLayout(new java.awt.GridBagLayout());

        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(970, 280));
        jPanel23.setLayout(new java.awt.BorderLayout());

        jPanel37.setOpaque(false);
        jPanel37.setPreferredSize(new java.awt.Dimension(970, 40));
        jPanel37.setLayout(new java.awt.BorderLayout());

        jPanel39.setOpaque(false);
        jPanel39.setPreferredSize(new java.awt.Dimension(300, 40));
        jPanel39.setLayout(new java.awt.BorderLayout());

        jPanel40.setOpaque(false);
        jPanel40.setPreferredSize(new java.awt.Dimension(45, 40));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel39.add(jPanel40, java.awt.BorderLayout.LINE_START);

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 84, 84));
        jLabel11.setText("ANIMAIS DO CLIENTE");
        jPanel39.add(jLabel11, java.awt.BorderLayout.CENTER);
        jLabel11.getAccessibleContext().setAccessibleParent(painelAnimais);

        jPanel37.add(jPanel39, java.awt.BorderLayout.LINE_START);

        jPanel77.setOpaque(false);
        jPanel77.setPreferredSize(new java.awt.Dimension(200, 40));
        jPanel77.setLayout(new java.awt.BorderLayout());

        jPanel84.setOpaque(false);
        jPanel84.setPreferredSize(new java.awt.Dimension(42, 40));

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel77.add(jPanel84, java.awt.BorderLayout.LINE_END);

        jButton6.setBackground(new java.awt.Color(118, 176, 65));
        jButton6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Novo");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel77.add(jButton6, java.awt.BorderLayout.WEST);
        jButton6.getAccessibleContext().setAccessibleDescription("Cadastrar novo animal deste tutor");
        jButton6.getAccessibleContext().setAccessibleParent(painelAnimais);

        jPanel37.add(jPanel77, java.awt.BorderLayout.LINE_END);

        jPanel23.add(jPanel37, java.awt.BorderLayout.PAGE_START);

        jPanel41.setOpaque(false);
        jPanel41.setPreferredSize(new java.awt.Dimension(970, 64));
        jPanel41.setLayout(new java.awt.GridLayout(1, 4));

        jPanel42.setOpaque(false);
        jPanel42.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jPanel46.setMinimumSize(new java.awt.Dimension(100, 40));
        jPanel46.setOpaque(false);
        jPanel46.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel46.setLayout(new java.awt.GridBagLayout());

        btnPrincipal.setBackground(new java.awt.Color(118, 176, 65));
        btnPrincipal.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnPrincipal.setText("Agendar");
        btnPrincipal.setBorder(null);
        btnPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrincipal.setPreferredSize(new java.awt.Dimension(160, 40));
        btnPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrincipalActionPerformed(evt);
            }
        });
        jPanel46.add(btnPrincipal, new java.awt.GridBagConstraints());
        btnPrincipal.getAccessibleContext().setAccessibleDescription("Fazer agendamento para o animal selecionado");
        btnPrincipal.getAccessibleContext().setAccessibleParent(painelAnimais);

        jPanel42.add(jPanel46, java.awt.BorderLayout.PAGE_START);

        jPanel41.add(jPanel42);

        jPanel43.setOpaque(false);
        jPanel43.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel71.setOpaque(false);
        jPanel71.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel71.setLayout(new java.awt.GridBagLayout());

        jButton8.setBackground(new java.awt.Color(76, 84, 84));
        jButton8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Editar");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel71.add(jButton8, new java.awt.GridBagConstraints());
        jButton8.getAccessibleContext().setAccessibleDescription("Editar cadastro do animal selecionado");
        jButton8.getAccessibleContext().setAccessibleParent(painelAnimais);

        jPanel43.add(jPanel71, java.awt.BorderLayout.PAGE_START);

        jPanel41.add(jPanel43);

        jPanel44.setOpaque(false);
        jPanel44.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jPanel72.setOpaque(false);
        jPanel72.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel72.setLayout(new java.awt.GridBagLayout());

        jButton9.setBackground(new java.awt.Color(76, 84, 84));
        jButton9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Voltar");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel72.add(jButton9, new java.awt.GridBagConstraints());
        jButton9.getAccessibleContext().setAccessibleDescription("Voltar para a página Clientes");
        jButton9.getAccessibleContext().setAccessibleParent(painelAnimais);

        jPanel44.add(jPanel72, java.awt.BorderLayout.PAGE_START);

        jPanel41.add(jPanel44);

        jPanel45.setOpaque(false);
        jPanel45.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel76.setOpaque(false);
        jPanel76.setPreferredSize(new java.awt.Dimension(242, 40));
        jPanel76.setLayout(new java.awt.GridBagLayout());

        jButton11.setBackground(new java.awt.Color(166, 60, 6));
        jButton11.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Excluir");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel76.add(jButton11, new java.awt.GridBagConstraints());
        jButton11.getAccessibleContext().setAccessibleDescription("Excluir cadastro do animal selecionado");
        jButton11.getAccessibleContext().setAccessibleParent(painelAnimais);

        jPanel45.add(jPanel76, java.awt.BorderLayout.PAGE_START);

        jPanel41.add(jPanel45);

        jPanel23.add(jPanel41, java.awt.BorderLayout.PAGE_END);

        jPanel78.setOpaque(false);
        jPanel78.setPreferredSize(new java.awt.Dimension(970, 420));
        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel79.setOpaque(false);
        jPanel79.setPreferredSize(new java.awt.Dimension(42, 186));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel79, java.awt.BorderLayout.LINE_START);

        jPanel80.setOpaque(false);
        jPanel80.setPreferredSize(new java.awt.Dimension(42, 186));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel80, java.awt.BorderLayout.LINE_END);

        jPanel81.setOpaque(false);
        jPanel81.setLayout(new java.awt.BorderLayout());

        jPanel82.setOpaque(false);
        jPanel82.setPreferredSize(new java.awt.Dimension(886, 20));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel81.add(jPanel82, java.awt.BorderLayout.PAGE_START);

        jPanel83.setOpaque(false);
        jPanel83.setPreferredSize(new java.awt.Dimension(886, 20));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 886, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel81.add(jPanel83, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setForeground(new java.awt.Color(76, 84, 84));
        jScrollPane1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jScrollPane1.setOpaque(false);

        tbl.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        tbl.setForeground(new java.awt.Color(76, 84, 84));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "ESPÉCIE", "IDADE", "PESO (Kg)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl.setGridColor(new java.awt.Color(76, 84, 84));
        tbl.setOpaque(false);
        tbl.setRowHeight(30);
        tbl.setSelectionBackground(new java.awt.Color(233, 199, 155));
        tbl.setSelectionForeground(new java.awt.Color(76, 84, 84));
        jScrollPane1.setViewportView(tbl);
        tbl.getAccessibleContext().setAccessibleParent(painelAnimais);

        jPanel81.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel78.add(jPanel81, java.awt.BorderLayout.CENTER);

        jPanel23.add(jPanel78, java.awt.BorderLayout.CENTER);

        painelAnimais.add(jPanel23, new java.awt.GridBagConstraints());

        jPanel10.add(painelAnimais, java.awt.BorderLayout.PAGE_END);
        painelAnimais.getAccessibleContext().setAccessibleName("Painel de Animais");
        painelAnimais.getAccessibleContext().setAccessibleDescription("Contém uma listagem de animais do cliente");

        jPanel73.add(jPanel10, java.awt.BorderLayout.CENTER);

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

        getAccessibleContext().setAccessibleDescription("Tela com os dados do cliente selecionado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(tbl.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Você deve selecionar uma linha.");
            
        } else {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja excluir o cadastro selecionado?");
            if(confirmacao == 0){
                int linha = tbl.getSelectedRow();
                int id = animais.get(linha).getId();
                
                try{
                    animalService.excluir(id);

                    animais.clear();
                    animais = clienteService.filtrarAnimais(cliente);

                    animalService.preencherTabela(tbl, animais, "clientes");
                } catch(ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
                } catch (Exception e){
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
                }
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

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

    private void btnPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrincipalActionPerformed
        if(tbl.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela.");
            return;
        } 
        
        this.dispose();
        
        int i = tbl.getSelectedRow();
        
        int animalId = animais.get(i).getId();
        
        try{
            Animal animal = animalService.buscarPorId(animalId);
            if(usuario.getCargo().equals("VETERINARIO")){
            new TelaProntuario(usuario, animal).setVisible(true);

            } else {
                new TelaNovoAgendamento(usuario, animal).setVisible(true);
            }
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_btnPrincipalActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        new TelaEditarCliente(usuario, cliente).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new TelaClientes(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new TelaClientes(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(tbl.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma linha da tabela.");
            return;
        } 
        
        int i = tbl.getSelectedRow();
        
        int animalId = animais.get(i).getId();
        
        try{
            Animal animal = animalService.buscarPorId(animalId);
        
            new TelaEditarAnimal(usuario, animal).setVisible(true);
            this.dispose();
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new TelaCadastrarAnimal(usuario, cliente).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel b4;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnPrincipal;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
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
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
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
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel painelAnimais;
    private javax.swing.JPanel painelDados;
    private javax.swing.JTextArea taEndereco;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
