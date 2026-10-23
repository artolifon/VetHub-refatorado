package vethub.view;

import java.util.ArrayList;
import java.util.List;
import vethub.model.Animal;
import vethub.model.Cliente;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vethub.model.Endereco;
import vethub.model.Procedimento;
import vethub.model.Usuario;
import vethub.service.AnimalService;
import vethub.service.ProcedimentoService;
import vethub.service.ClienteService;

/**
 *
 * @author Arthur
 */
public class TelaAgendamentos extends javax.swing.JFrame {
    
    private final Usuario usuario;
    private final MenuUtil menuService;
    private final ProcedimentoService procedimentoService;
    private final ClienteService clienteService;
    private final AnimalService animalService;
    private boolean inicializando;
    private List<Procedimento> procedimentos;
    private List<Cliente> clientes;
    private List<Animal> animais;

    
    public TelaAgendamentos(Usuario usuario) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.procedimentos = new ArrayList();
        this.clienteService = new ClienteService();
        this.animalService = new AnimalService();
        this.menuService = new MenuUtil(usuario);
        this.procedimentoService = new ProcedimentoService();
        this.procedimentos = new ArrayList();
        this.clientes = clienteService.buscarTodos();
        this.animais = animalService.buscarTodos();
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn7);
        
        inicializando = true;
        
        for(int i=0; i < clientes.size(); i++){
            cmbTutor.addItem(clientes.get(i).getNome());
        }
        
        for(int i=0; i < animais.size(); i++){
            cmbAnimal.addItem(animais.get(i).getNome() + " (" + animais.get(i).getTutor().getNome() + ")");
        }
        
        cmbAnimal.setSelectedIndex(-1);
        cmbTutor.setSelectedIndex(-1);
        
        cmbProcedimento.addItem("consulta");
        cmbProcedimento.addItem("vacina");
        cmbProcedimento.addItem("castração");
        cmbProcedimento.setSelectedIndex(-1);
        
        inicializando = false;
        
        procedimentos = procedimentoService.buscarAgendamentos();
        
        procedimentoService.preencherTabelaAgendamentos(tbl, procedimentos);
        
        cmbAnimal.requestFocusInWindow();
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Filtros = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbAnimal = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmbTutor = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jPanel73 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cmbProcedimento = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel24 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Agendamentos");
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

        lblSair.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblSair.setForeground(new java.awt.Color(76, 84, 84));
        lblSair.setText(" | Sair");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.setNextFocusableComponent(cmbAnimal);
        lblSair.setPreferredSize(new java.awt.Dimension(60, 24));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        jPanel26.add(lblSair, java.awt.BorderLayout.LINE_END);
        lblSair.getAccessibleContext().setAccessibleName(" Sair");
        lblSair.getAccessibleContext().setAccessibleDescription("Clique para deslogar do sistema.");

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
        btn1.setToolTipText("Abre a tela Painel.");
        btn1.setBorder(null);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn1.setIconTextGap(0);
        btn1.setNextFocusableComponent(btn4);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1btn1ActionPerformed(evt);
            }
        });
        b4.add(btn1, java.awt.BorderLayout.LINE_START);
        btn1.getAccessibleContext().setAccessibleDescription("");
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
        btn4.setForeground(new java.awt.Color(219, 161, 89));
        btn4.setText("Agendamentos");
        btn4.setToolTipText("Abre a tela Agendamentos");
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
        btn4.getAccessibleContext().setAccessibleDescription("");
        btn4.getAccessibleContext().setAccessibleParent(Menu);

        jPanel48.add(jPanel49);
        jPanel49.getAccessibleContext().setAccessibleName("");

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
        btn9.setToolTipText("Abre a tela Animais");
        btn9.setBorder(null);
        btn9.setContentAreaFilled(false);
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn9.setIconTextGap(0);
        btn9.setNextFocusableComponent(btn3);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel52.add(btn9, java.awt.BorderLayout.PAGE_START);
        btn9.getAccessibleContext().setAccessibleDescription("");
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
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Clientes");
        btn3.setToolTipText("Abre a tela Clientes");
        btn3.setBorder(null);
        btn3.setContentAreaFilled(false);
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn3.setIconTextGap(0);
        btn3.setNextFocusableComponent(btn7);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel55.add(btn3, java.awt.BorderLayout.PAGE_START);
        btn3.getAccessibleContext().setAccessibleDescription("");
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
        btn7.setToolTipText("Abre a tela Usuarios");
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
        btn7.getAccessibleContext().setAccessibleDescription("");
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
        Menu.getAccessibleContext().setAccessibleName("Menu");
        Menu.getAccessibleContext().setAccessibleDescription("");

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
        jLabel1.setText("AGENDAMENTOS");
        jLabel1.setMaximumSize(new java.awt.Dimension(1206, 90));
        jLabel1.setMinimumSize(new java.awt.Dimension(112, 90));
        jLabel1.setPreferredSize(new java.awt.Dimension(1206, 90));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel6.setMinimumSize(new java.awt.Dimension(100, 134));
        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(1180, 234));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel7.setMinimumSize(new java.awt.Dimension(100, 234));
        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(1106, 134));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setOpaque(false);
        jPanel8.setPreferredSize(new java.awt.Dimension(62, 140));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, java.awt.BorderLayout.LINE_START);

        jPanel9.setMinimumSize(new java.awt.Dimension(100, 140));
        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(234, 140));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jPanel19.setOpaque(false);
        jPanel19.setPreferredSize(new java.awt.Dimension(73, 134));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel19, java.awt.BorderLayout.LINE_END);

        jPanel20.setOpaque(false);
        jPanel20.setPreferredSize(new java.awt.Dimension(280, 0));
        jPanel20.setLayout(new java.awt.BorderLayout());
        jPanel9.add(jPanel20, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel9, java.awt.BorderLayout.LINE_END);

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(840, 130));
        jPanel10.setLayout(new java.awt.BorderLayout());

        Filtros.setOpaque(false);
        Filtros.setPreferredSize(new java.awt.Dimension(850, 65));
        Filtros.setLayout(new java.awt.GridLayout(1, 4, 65, 0));

        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(0, 65));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 84, 84));
        jLabel6.setLabelFor(cmbAnimal);
        jLabel6.setText("Animal");
        jLabel6.setRequestFocusEnabled(false);
        jPanel15.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        cmbAnimal.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbAnimal.setForeground(new java.awt.Color(76, 84, 84));
        cmbAnimal.setToolTipText("Filtrar por animal");
        cmbAnimal.setMinimumSize(new java.awt.Dimension(135, 30));
        cmbAnimal.setNextFocusableComponent(cmbTutor);
        cmbAnimal.setPreferredSize(new java.awt.Dimension(135, 30));
        cmbAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnimalActionPerformed(evt);
            }
        });
        jPanel15.add(cmbAnimal, java.awt.BorderLayout.PAGE_END);
        cmbAnimal.getAccessibleContext().setAccessibleName("Animal");
        cmbAnimal.getAccessibleContext().setAccessibleDescription("");

        Filtros.add(jPanel15);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 84, 84));
        jLabel7.setLabelFor(cmbTutor);
        jLabel7.setText("Tutor");
        jLabel7.setRequestFocusEnabled(false);
        jPanel17.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        cmbTutor.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbTutor.setForeground(new java.awt.Color(76, 84, 84));
        cmbTutor.setToolTipText("Filtrar por tutor");
        cmbTutor.setMinimumSize(new java.awt.Dimension(135, 30));
        cmbTutor.setNextFocusableComponent(txtData);
        cmbTutor.setPreferredSize(new java.awt.Dimension(135, 30));
        cmbTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTutorActionPerformed(evt);
            }
        });
        jPanel17.add(cmbTutor, java.awt.BorderLayout.PAGE_END);
        cmbTutor.getAccessibleContext().setAccessibleName("Tutor");
        cmbTutor.getAccessibleContext().setAccessibleDescription("");

        Filtros.add(jPanel17);

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 84, 84));
        jLabel8.setLabelFor(txtData);
        jLabel8.setText("Data");
        jLabel8.setRequestFocusEnabled(false);
        jPanel18.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        txtData.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtData.setForeground(new java.awt.Color(76, 84, 84));
        txtData.setToolTipText("Filtrar por data (formato DD/MM/AAAA)");
        txtData.setNextFocusableComponent(cmbProcedimento);
        txtData.setPreferredSize(new java.awt.Dimension(135, 30));
        txtData.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDataCaretUpdate(evt);
            }
        });
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        jPanel18.add(txtData, java.awt.BorderLayout.PAGE_END);
        txtData.getAccessibleContext().setAccessibleName("Data");
        txtData.getAccessibleContext().setAccessibleDescription("Formato DD/MM/AAAA");

        Filtros.add(jPanel18);

        jPanel73.setOpaque(false);
        jPanel73.setPreferredSize(new java.awt.Dimension(135, 65));
        jPanel73.setRequestFocusEnabled(false);
        jPanel73.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 84, 84));
        jLabel9.setLabelFor(cmbProcedimento);
        jLabel9.setText("Procedimento");
        jLabel9.setRequestFocusEnabled(false);
        jPanel73.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        cmbProcedimento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbProcedimento.setForeground(new java.awt.Color(76, 84, 84));
        cmbProcedimento.setToolTipText("Filtrar por procedimento");
        cmbProcedimento.setMinimumSize(new java.awt.Dimension(135, 30));
        cmbProcedimento.setName(""); // NOI18N
        cmbProcedimento.setNextFocusableComponent(btnNovo);
        cmbProcedimento.setPreferredSize(new java.awt.Dimension(135, 30));
        cmbProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProcedimentoActionPerformed(evt);
            }
        });
        jPanel73.add(cmbProcedimento, java.awt.BorderLayout.PAGE_END);
        cmbProcedimento.getAccessibleContext().setAccessibleName("Procedimento");
        cmbProcedimento.getAccessibleContext().setAccessibleDescription("");

        Filtros.add(jPanel73);

        jPanel10.add(Filtros, java.awt.BorderLayout.NORTH);

        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(145, 65));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(810, 40));
        jPanel11.setLayout(new java.awt.BorderLayout());

        btnNovo.setBackground(new java.awt.Color(118, 176, 65));
        btnNovo.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.setToolTipText("Fazer novo agendamento");
        btnNovo.setBorder(null);
        btnNovo.setBorderPainted(false);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setNextFocusableComponent(tbl);
        btnNovo.setPreferredSize(new java.awt.Dimension(160, 40));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        btnNovo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnNovoKeyPressed(evt);
            }
        });
        jPanel11.add(btnNovo, java.awt.BorderLayout.LINE_START);
        btnNovo.getAccessibleContext().setAccessibleDescription("Criar novo agendamento");

        jPanel14.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jPanel10.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel10, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(1106, 92));
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel39.setOpaque(false);
        jPanel39.setPreferredSize(new java.awt.Dimension(62, 92));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel39, java.awt.BorderLayout.LINE_START);

        jPanel40.setOpaque(false);
        jPanel40.setPreferredSize(new java.awt.Dimension(73, 92));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel40, java.awt.BorderLayout.LINE_END);

        jPanel41.setOpaque(false);
        jPanel41.setLayout(new java.awt.BorderLayout());

        jPanel42.setOpaque(false);
        jPanel42.setPreferredSize(new java.awt.Dimension(971, 50));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel41.add(jPanel42, java.awt.BorderLayout.PAGE_START);

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.GridLayout(1, 4));

        jPanel44.setOpaque(false);
        jPanel44.setLayout(new java.awt.BorderLayout());

        btnEditar.setBackground(new java.awt.Color(76, 84, 84));
        btnEditar.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setToolTipText("");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setNextFocusableComponent(btnExcluir);
        btnEditar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel44.add(btnEditar, java.awt.BorderLayout.WEST);
        btnEditar.getAccessibleContext().setAccessibleDescription("Editar o agendamento selecionado");

        jPanel43.add(jPanel44);

        jPanel45.setOpaque(false);
        jPanel45.setLayout(new java.awt.GridBagLayout());
        jPanel43.add(jPanel45);

        jPanel71.setOpaque(false);
        jPanel71.setLayout(new java.awt.GridBagLayout());
        jPanel43.add(jPanel71);

        jPanel72.setOpaque(false);
        jPanel72.setLayout(new java.awt.BorderLayout());

        btnExcluir.setBackground(new java.awt.Color(166, 60, 6));
        btnExcluir.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("");
        btnExcluir.setBorder(null);
        btnExcluir.setBorderPainted(false);
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setNextFocusableComponent(btn1);
        btnExcluir.setPreferredSize(new java.awt.Dimension(160, 40));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        jPanel72.add(btnExcluir, java.awt.BorderLayout.LINE_END);
        btnExcluir.getAccessibleContext().setAccessibleDescription("Excluir o agendamento selecionado");

        jPanel43.add(jPanel72);

        jPanel41.add(jPanel43, java.awt.BorderLayout.CENTER);

        jPanel21.add(jPanel41, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel21, java.awt.BorderLayout.PAGE_END);

        jPanel22.setOpaque(false);
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(62, 140));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel23, java.awt.BorderLayout.LINE_START);

        jPanel36.setOpaque(false);
        jPanel36.setPreferredSize(new java.awt.Dimension(73, 302));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );

        jPanel22.add(jPanel36, java.awt.BorderLayout.LINE_END);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel74.setOpaque(false);
        jPanel74.setPreferredSize(new java.awt.Dimension(971, 30));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 971, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel12.add(jPanel74, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setOpaque(false);

        tbl.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        tbl.setForeground(new java.awt.Color(76, 84, 84));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "HORA", "ANIMAL", "TUTOR", "PROCEDIMENTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.setToolTipText("Selecione para realizar uma ação");
        tbl.setGridColor(new java.awt.Color(76, 84, 84));
        tbl.setNextFocusableComponent(btnEditar);
        tbl.setRowHeight(30);
        tbl.setSelectionBackground(new java.awt.Color(233, 199, 155));
        tbl.setSelectionForeground(new java.awt.Color(76, 84, 84));
        jScrollPane2.setViewportView(tbl);
        tbl.getAccessibleContext().setAccessibleName("Tabela de listagem de agendamentos");

        jPanel12.add(jScrollPane2, java.awt.BorderLayout.CENTER);
        jScrollPane2.getAccessibleContext().setAccessibleName("Agendamentos");
        jScrollPane2.getAccessibleContext().setAccessibleDescription("Listagem de agendamentos. Selecione uma linha para editar ou excluir.");

        jPanel22.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel22, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

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

        getAccessibleContext().setAccessibleName("Tela de listagem de agendamentos");
        getAccessibleContext().setAccessibleDescription("Selecione um animal da tabela e clique em Agendar ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int i = tbl.getSelectedRow();
        
        int procedimentoId = procedimentos.get(i).getId();
        Procedimento p = procedimentoService.buscarPorId(procedimentoId);
        new TelaEditarAgendamento(usuario, p).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void cmbAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnimalActionPerformed
        if(inicializando == true){
            return;
        }
        
        int i = cmbAnimal.getSelectedIndex();
        
        if(cmbTutor.getSelectedIndex() == -1){
            Cliente tutor = animalService.selecionarTutor(animais.get(i).getTutor().getId());
            inicializando = true;
            cmbTutor.setSelectedItem(tutor.getNome());
            inicializando = false;
        }
        
        String data = txtData.getText();
        String tipo = "";
        
        if(cmbProcedimento.getSelectedIndex() != -1){
            tipo = (String) cmbProcedimento.getSelectedItem();
        }
        
        int clienteId = clientes.get(cmbTutor.getSelectedIndex()).getId();
        
        procedimentos.clear();
        procedimentos = procedimentoService.filtrar(animais.get(i).getId(), clienteId, data, tipo);
        procedimentoService.preencherTabelaAgendamentos(tbl, procedimentos);
    }//GEN-LAST:event_cmbAnimalActionPerformed

    private void cmbTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTutorActionPerformed
        if(inicializando == true){
            return;
        }
        
        int i = cmbTutor.getSelectedIndex();
        int j = cmbAnimal.getSelectedIndex();
        
        int animalId = -1;
       
        if(j != -1)
        {
            animalId = animais.get(j).getId();
        }
        
        String data = txtData.getText();
        String tipo = "";  

        if(cmbProcedimento.getSelectedIndex() != -1){
            tipo = (String) cmbProcedimento.getSelectedItem();
        }
       
        procedimentos.clear();
        procedimentos = procedimentoService.filtrar(animalId, clientes.get(i).getId(), data, tipo);
        procedimentoService.preencherTabelaAgendamentos(tbl, procedimentos);
        
        animais.clear();
        animais = clienteService.filtrarAnimais(clientes.get(i));
        
        inicializando = true;
        
        cmbAnimal.removeAllItems();
       
        for (Animal a : animais){
            cmbAnimal.addItem(a.getNome());
        }
        
        cmbAnimal.setSelectedIndex(-1);
        
        inicializando = false;  
    }//GEN-LAST:event_cmbTutorActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(tbl.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Você deve selecionar uma linha.");
        
        } else {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja excluir o agendamento selecionado?");
            if(confirmacao == 0){
                ProcedimentoService ps = new ProcedimentoService();
                int linha = tbl.getSelectedRow();
                int id = procedimentos.get(linha).getId();
                ps.excluir(id);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.dispose();
        new TelaNovoAgendamento(usuario).setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnNovoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnNovoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoKeyPressed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
                
    }//GEN-LAST:event_txtDataActionPerformed

    private void cmbProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProcedimentoActionPerformed
        if(inicializando == true){
            return;
        }
        
        int i = cmbTutor.getSelectedIndex();
        int j = cmbAnimal.getSelectedIndex();
        
        int animalId = -1;
        int clienteId = -1;
        
        if(i != -1)
        {
            clienteId = clientes.get(i).getId();
        }
        
        if(j != -1)
        {
            animalId = animais.get(j).getId();
        }
        
        String data = txtData.getText();
        String tipo = (String) cmbProcedimento.getSelectedItem();
        
        procedimentos.clear();
        procedimentos = procedimentoService.filtrar(animalId, clienteId, data, tipo);
        procedimentoService.preencherTabelaAgendamentos(tbl, procedimentos);
        
    }//GEN-LAST:event_cmbProcedimentoActionPerformed

    private void txtDataCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDataCaretUpdate
        if(inicializando == true){
            return;
        }
        
        int i = cmbTutor.getSelectedIndex();
        int j = cmbAnimal.getSelectedIndex();
        
        int animalId = -1;
        int clienteId = -1;
        
        if(i != -1)
        {
            clienteId = clientes.get(i).getId();
        }
        
        if(j != -1)
        {
            animalId = animais.get(j).getId();
        }
        
        String data = txtData.getText();
        String tipo = "";  

        if(cmbProcedimento.getSelectedIndex() != -1){
            tipo = (String) cmbProcedimento.getSelectedItem();
        }
        
        procedimentos.clear();
        procedimentos = procedimentoService.filtrar(animalId, clienteId, data, tipo);
        procedimentoService.preencherTabelaAgendamentos(tbl, procedimentos);
        
    }//GEN-LAST:event_txtDataCaretUpdate

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Filtros;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel b4;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cmbAnimal;
    private javax.swing.JComboBox<String> cmbProcedimento;
    private javax.swing.JComboBox<String> cmbTutor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
