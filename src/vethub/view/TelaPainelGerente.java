package vethub.view;

import java.util.List;
import java.util.ArrayList;
import vethub.model.Animal;
import vethub.model.Cliente;
import vethub.model.Endereco;
import vethub.model.Procedimento;
import vethub.model.Usuario;
import vethub.service.ProcedimentoService;
import vethub.service.AnimalService;
import vethub.service.ClienteService;
import vethub.service.UsuarioService;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Arthur
 */
public class TelaPainelGerente extends javax.swing.JFrame {
    private final Usuario usuario;
    private final MenuUtil menuService;
    private final ProcedimentoService procedimentoService;
    private final AnimalService animalService;
    private final ClienteService clienteService;
    private final UsuarioService usuarioService;
    List<Procedimento> agendamentos;

    /**
     * Creates new form TelaDashboardGerente
     */
    public TelaPainelGerente(Usuario usuario) {
        this.usuario = usuario;
        this.menuService = new MenuUtil(usuario);
        this.procedimentoService = new ProcedimentoService();
        this.animalService = new AnimalService();
        this.clienteService = new ClienteService();
        this.usuarioService = new UsuarioService();
        this.agendamentos = new ArrayList();
    
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        lblUsuario.setText(usuario.getNome());
        
        btnNovoAgendamento.requestFocusInWindow();
        
        List<Procedimento> agendamentos = procedimentoService.mostrarUltimos();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        if(agendamentos.size() >= 2){
            Procedimento a1 = agendamentos.get(0);
            Procedimento a2 = agendamentos.get(1);

            lblNome1.setText(a1.getAnimal().getNome() + " (" + a1.getAnimal().getTutor().getNome() + ")");
            lblData1.setText(a1.getDataHora().format(formatter));
            lblProcedimento1.setText(a1.getTipo());

            lblNome2.setText(a2.getAnimal().getNome() + " (" + a2.getAnimal().getTutor().getNome() + ")");
            lblData2.setText(a2.getDataHora().format(formatter));
            lblProcedimento2.setText(a2.getTipo());
        
        } else if (agendamentos.size() == 1){
            
            Procedimento a1 = agendamentos.get(0);
            
            lblNome1.setText(a1.getAnimal().getNome());
            lblData1.setText(a1.getDataHora().format(formatter));
            lblProcedimento1.setText(a1.getTipo());
        } else {
            lblNome1.setText("Nenhum agendamento.");
        }
        
        lblTotalAnimais.setText(String.valueOf(animalService.contarTodos()));
        lblCaes.setText(String.valueOf(animalService.contarCaes()));
        lblGatos.setText(String.valueOf(animalService.contarGatos()));
        
        lblTotalClientes.setText(String.valueOf(clienteService.contarTodos()));
        lblCom.setText(String.valueOf(clienteService.contarComPets()));
        lblSem.setText(String.valueOf(clienteService.contarSemPets()));
        
        lblGerencia.setText(String.valueOf(usuarioService.contarGerentes()));
        lblMedicina.setText(String.valueOf(usuarioService.contarVeterinarios()));
        lblAtendimento.setText(String.valueOf(usuarioService.contarAtendentes()));
        
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
        painel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        cardAgendamentos = new javax.swing.JPanel();
        jPanel110 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel111 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel112 = new javax.swing.JPanel();
        jPanel113 = new javax.swing.JPanel();
        jPanel114 = new javax.swing.JPanel();
        jPanel115 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jPanel117 = new javax.swing.JPanel();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        btnNovoAgendamento = new javax.swing.JButton();
        btnVerAgendamento = new javax.swing.JButton();
        jPanel120 = new javax.swing.JPanel();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        lblData1 = new javax.swing.JLabel();
        lblProcedimento1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        lblNome1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblData2 = new javax.swing.JLabel();
        lblProcedimento2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblNome2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cardAnimais = new javax.swing.JPanel();
        jPanel163 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel164 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel165 = new javax.swing.JPanel();
        jPanel166 = new javax.swing.JPanel();
        jPanel167 = new javax.swing.JPanel();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        jPanel83 = new javax.swing.JPanel();
        jPanel84 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        btnNovoAnimal = new javax.swing.JButton();
        btnVerAnimal = new javax.swing.JButton();
        jPanel78 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        lblTotalAnimais = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        panel1212 = new javax.swing.JPanel();
        lblCaes = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel76 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        lblGatos = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        cardClientes = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel89 = new javax.swing.JPanel();
        jPanel90 = new javax.swing.JPanel();
        jPanel91 = new javax.swing.JPanel();
        jPanel92 = new javax.swing.JPanel();
        jPanel93 = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jPanel95 = new javax.swing.JPanel();
        jPanel96 = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnVerCliente = new javax.swing.JButton();
        jPanel97 = new javax.swing.JPanel();
        jPanel98 = new javax.swing.JPanel();
        jPanel99 = new javax.swing.JPanel();
        jPanel100 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel102 = new javax.swing.JPanel();
        lblTotalClientes = new javax.swing.JLabel();
        jPanel103 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel105 = new javax.swing.JPanel();
        lblCom = new javax.swing.JLabel();
        jPanel106 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel108 = new javax.swing.JPanel();
        lblSem = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        cardUsuarios = new javax.swing.JPanel();
        jPanel256 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jPanel257 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        jPanel258 = new javax.swing.JPanel();
        jPanel259 = new javax.swing.JPanel();
        jPanel260 = new javax.swing.JPanel();
        jPanel261 = new javax.swing.JPanel();
        jPanel262 = new javax.swing.JPanel();
        jPanel263 = new javax.swing.JPanel();
        jPanel264 = new javax.swing.JPanel();
        jPanel265 = new javax.swing.JPanel();
        btnNovoUsuario = new javax.swing.JButton();
        btnVerUsuario = new javax.swing.JButton();
        jPanel266 = new javax.swing.JPanel();
        jPanel267 = new javax.swing.JPanel();
        jPanel268 = new javax.swing.JPanel();
        jPanel269 = new javax.swing.JPanel();
        jPanel270 = new javax.swing.JPanel();
        jPanel271 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jPanel272 = new javax.swing.JPanel();
        lblGerencia = new javax.swing.JLabel();
        jPanel273 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jPanel274 = new javax.swing.JPanel();
        lblAtendimento = new javax.swing.JLabel();
        jPanel275 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        jPanel276 = new javax.swing.JPanel();
        lblMedicina = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Painel");
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
        lblSair.setNextFocusableComponent(btnNovoAgendamento);
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
        btn1.setForeground(new java.awt.Color(219, 161, 89));
        btn1.setText("Painel");
        btn1.setToolTipText("");
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
        btn9.setNextFocusableComponent(btn3);
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
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("Clientes");
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

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setPreferredSize(new java.awt.Dimension(1206, 640));
        painel.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1660, 80));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 84, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAINEL DO GERENTE");
        jLabel1.setMaximumSize(new java.awt.Dimension(1206, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(1206, 30));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        painel.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(1180, 560));
        jPanel6.setLayout(new java.awt.GridLayout(2, 4));

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new java.awt.GridBagLayout());

        cardAgendamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        cardAgendamentos.setOpaque(false);
        cardAgendamentos.setPreferredSize(new java.awt.Dimension(240, 250));
        cardAgendamentos.setLayout(new java.awt.BorderLayout());

        jPanel110.setMaximumSize(new java.awt.Dimension(2147483647, 76));
        jPanel110.setName(""); // NOI18N
        jPanel110.setOpaque(false);
        jPanel110.setPreferredSize(new java.awt.Dimension(236, 76));
        jPanel110.setLayout(new java.awt.GridBagLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_card_agendamentos.png"))); // NOI18N
        jPanel110.add(jLabel22, new java.awt.GridBagConstraints());
        jLabel22.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        cardAgendamentos.add(jPanel110, java.awt.BorderLayout.PAGE_START);

        jPanel111.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel111.setMinimumSize(new java.awt.Dimension(89, 20));
        jPanel111.setOpaque(false);
        jPanel111.setPreferredSize(new java.awt.Dimension(236, 20));
        jPanel111.setLayout(new java.awt.GridBagLayout());

        jLabel23.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(76, 84, 84));
        jLabel23.setText("AGENDAMENTOS");
        jLabel23.setPreferredSize(new java.awt.Dimension(180, 20));
        jPanel111.add(jLabel23, new java.awt.GridBagConstraints());
        jLabel23.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        cardAgendamentos.add(jPanel111, java.awt.BorderLayout.CENTER);

        jPanel112.setMaximumSize(new java.awt.Dimension(32767, 144));
        jPanel112.setOpaque(false);
        jPanel112.setPreferredSize(new java.awt.Dimension(236, 144));
        jPanel112.setLayout(new java.awt.BorderLayout());

        jPanel113.setOpaque(false);
        jPanel113.setPreferredSize(new java.awt.Dimension(236, 56));
        jPanel113.setLayout(new java.awt.BorderLayout());

        jPanel114.setOpaque(false);
        jPanel114.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel113.add(jPanel114, java.awt.BorderLayout.LINE_START);

        jPanel115.setOpaque(false);
        jPanel115.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel113.add(jPanel115, java.awt.BorderLayout.LINE_END);

        jPanel116.setOpaque(false);
        jPanel116.setPreferredSize(new java.awt.Dimension(100, 56));
        jPanel116.setLayout(new java.awt.BorderLayout());

        jPanel117.setOpaque(false);
        jPanel117.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel117Layout = new javax.swing.GroupLayout(jPanel117);
        jPanel117.setLayout(jPanel117Layout);
        jPanel117Layout.setHorizontalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel117Layout.setVerticalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel116.add(jPanel117, java.awt.BorderLayout.PAGE_START);

        jPanel118.setOpaque(false);
        jPanel118.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel118Layout = new javax.swing.GroupLayout(jPanel118);
        jPanel118.setLayout(jPanel118Layout);
        jPanel118Layout.setHorizontalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel118Layout.setVerticalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel116.add(jPanel118, java.awt.BorderLayout.PAGE_END);

        jPanel119.setOpaque(false);
        jPanel119.setLayout(new java.awt.BorderLayout());

        btnNovoAgendamento.setBackground(new java.awt.Color(118, 176, 65));
        btnNovoAgendamento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnNovoAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoAgendamento.setText("Novo");
        btnNovoAgendamento.setBorder(null);
        btnNovoAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoAgendamento.setNextFocusableComponent(btnVerAgendamento);
        btnNovoAgendamento.setPreferredSize(new java.awt.Dimension(90, 32));
        btnNovoAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAgendamentoActionPerformed(evt);
            }
        });
        jPanel119.add(btnNovoAgendamento, java.awt.BorderLayout.LINE_START);
        btnNovoAgendamento.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        btnVerAgendamento.setBackground(new java.awt.Color(76, 84, 84));
        btnVerAgendamento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnVerAgendamento.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAgendamento.setText("Ver");
        btnVerAgendamento.setBorder(null);
        btnVerAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerAgendamento.setNextFocusableComponent(btnNovoAnimal);
        btnVerAgendamento.setPreferredSize(new java.awt.Dimension(90, 32));
        btnVerAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAgendamentoActionPerformed(evt);
            }
        });
        jPanel119.add(btnVerAgendamento, java.awt.BorderLayout.LINE_END);
        btnVerAgendamento.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        jPanel116.add(jPanel119, java.awt.BorderLayout.CENTER);

        jPanel113.add(jPanel116, java.awt.BorderLayout.CENTER);

        jPanel112.add(jPanel113, java.awt.BorderLayout.PAGE_END);

        jPanel120.setOpaque(false);
        jPanel120.setLayout(new javax.swing.BoxLayout(jPanel120, javax.swing.BoxLayout.X_AXIS));

        jPanel121.setOpaque(false);
        jPanel121.setPreferredSize(new java.awt.Dimension(49, 88));

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel120.add(jPanel121);

        jPanel122.setOpaque(false);
        jPanel122.setPreferredSize(new java.awt.Dimension(236, 88));
        jPanel122.setLayout(new java.awt.BorderLayout());

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(180, 36));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(180, 18));
        jPanel13.setLayout(new java.awt.BorderLayout());

        lblData1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblData1.setForeground(new java.awt.Color(166, 60, 6));
        jPanel13.add(lblData1, java.awt.BorderLayout.LINE_START);
        lblData1.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        lblProcedimento1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblProcedimento1.setForeground(new java.awt.Color(76, 84, 84));
        jPanel13.add(lblProcedimento1, java.awt.BorderLayout.LINE_END);
        lblProcedimento1.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        jPanel10.add(jPanel13, java.awt.BorderLayout.NORTH);

        jPanel15.setOpaque(false);
        jPanel15.setPreferredSize(new java.awt.Dimension(180, 18));
        jPanel15.setLayout(new java.awt.BorderLayout());

        lblNome1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblNome1.setForeground(new java.awt.Color(76, 84, 84));
        jPanel15.add(lblNome1, java.awt.BorderLayout.LINE_START);
        lblNome1.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        jPanel10.add(jPanel15, java.awt.BorderLayout.SOUTH);

        jPanel122.add(jPanel10, java.awt.BorderLayout.NORTH);

        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(180, 36));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(180, 18));
        jPanel17.setLayout(new java.awt.BorderLayout());

        lblData2.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblData2.setForeground(new java.awt.Color(166, 60, 6));
        jPanel17.add(lblData2, java.awt.BorderLayout.LINE_START);
        lblData2.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        lblProcedimento2.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblProcedimento2.setForeground(new java.awt.Color(76, 84, 84));
        jPanel17.add(lblProcedimento2, java.awt.BorderLayout.LINE_END);
        lblProcedimento2.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        jPanel11.add(jPanel17, java.awt.BorderLayout.NORTH);

        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(180, 18));
        jPanel18.setLayout(new java.awt.BorderLayout());

        lblNome2.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblNome2.setForeground(new java.awt.Color(76, 84, 84));
        jPanel18.add(lblNome2, java.awt.BorderLayout.LINE_START);
        lblNome2.getAccessibleContext().setAccessibleParent(cardAgendamentos);

        jPanel11.add(jPanel18, java.awt.BorderLayout.SOUTH);

        jPanel122.add(jPanel11, java.awt.BorderLayout.SOUTH);

        jPanel120.add(jPanel122);

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(24, 88));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel120.add(jPanel5);

        jPanel112.add(jPanel120, java.awt.BorderLayout.CENTER);

        cardAgendamentos.add(jPanel112, java.awt.BorderLayout.PAGE_END);

        jPanel7.add(cardAgendamentos, new java.awt.GridBagConstraints());
        cardAgendamentos.getAccessibleContext().setAccessibleName("Card Agendamentos");
        cardAgendamentos.getAccessibleContext().setAccessibleDescription("Card de acesso rápido");
        cardAgendamentos.getAccessibleContext().setAccessibleParent(painel);

        jPanel6.add(jPanel7);

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new java.awt.GridBagLayout());

        cardAnimais.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        cardAnimais.setOpaque(false);
        cardAnimais.setPreferredSize(new java.awt.Dimension(240, 250));
        cardAnimais.setLayout(new java.awt.BorderLayout());

        jPanel163.setMaximumSize(new java.awt.Dimension(2147483647, 76));
        jPanel163.setName(""); // NOI18N
        jPanel163.setOpaque(false);
        jPanel163.setPreferredSize(new java.awt.Dimension(236, 76));
        jPanel163.setLayout(new java.awt.GridBagLayout());

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_card_animais.png"))); // NOI18N
        jPanel163.add(jLabel42, new java.awt.GridBagConstraints());
        jLabel42.getAccessibleContext().setAccessibleParent(cardAnimais);

        cardAnimais.add(jPanel163, java.awt.BorderLayout.PAGE_START);

        jPanel164.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel164.setMinimumSize(new java.awt.Dimension(89, 20));
        jPanel164.setOpaque(false);
        jPanel164.setPreferredSize(new java.awt.Dimension(236, 20));
        jPanel164.setLayout(new java.awt.GridBagLayout());

        jLabel43.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(76, 84, 84));
        jLabel43.setText("ANIMAIS");
        jLabel43.setPreferredSize(new java.awt.Dimension(89, 20));
        jPanel164.add(jLabel43, new java.awt.GridBagConstraints());
        jLabel43.getAccessibleContext().setAccessibleParent(cardAnimais);

        cardAnimais.add(jPanel164, java.awt.BorderLayout.CENTER);

        jPanel165.setMaximumSize(new java.awt.Dimension(32767, 144));
        jPanel165.setOpaque(false);
        jPanel165.setPreferredSize(new java.awt.Dimension(236, 144));
        jPanel165.setLayout(new java.awt.BorderLayout());

        jPanel166.setOpaque(false);
        jPanel166.setPreferredSize(new java.awt.Dimension(236, 56));
        jPanel166.setLayout(new java.awt.BorderLayout());

        jPanel167.setOpaque(false);
        jPanel167.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel167Layout = new javax.swing.GroupLayout(jPanel167);
        jPanel167.setLayout(jPanel167Layout);
        jPanel167Layout.setHorizontalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel167Layout.setVerticalGroup(
            jPanel167Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel166.add(jPanel167, java.awt.BorderLayout.LINE_START);

        jPanel81.setOpaque(false);
        jPanel81.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel166.add(jPanel81, java.awt.BorderLayout.LINE_END);

        jPanel82.setOpaque(false);
        jPanel82.setPreferredSize(new java.awt.Dimension(100, 56));
        jPanel82.setLayout(new java.awt.BorderLayout());

        jPanel83.setOpaque(false);
        jPanel83.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel82.add(jPanel83, java.awt.BorderLayout.PAGE_START);

        jPanel84.setOpaque(false);
        jPanel84.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel82.add(jPanel84, java.awt.BorderLayout.PAGE_END);

        jPanel85.setOpaque(false);
        jPanel85.setLayout(new java.awt.BorderLayout());

        btnNovoAnimal.setBackground(new java.awt.Color(118, 176, 65));
        btnNovoAnimal.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnNovoAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoAnimal.setText("Novo");
        btnNovoAnimal.setBorder(null);
        btnNovoAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoAnimal.setNextFocusableComponent(btnVerAnimal);
        btnNovoAnimal.setPreferredSize(new java.awt.Dimension(90, 32));
        btnNovoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAnimalActionPerformed(evt);
            }
        });
        jPanel85.add(btnNovoAnimal, java.awt.BorderLayout.LINE_START);
        btnNovoAnimal.getAccessibleContext().setAccessibleParent(cardAnimais);

        btnVerAnimal.setBackground(new java.awt.Color(76, 84, 84));
        btnVerAnimal.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnVerAnimal.setForeground(new java.awt.Color(255, 255, 255));
        btnVerAnimal.setText("Ver");
        btnVerAnimal.setBorder(null);
        btnVerAnimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerAnimal.setNextFocusableComponent(btnNovoCliente);
        btnVerAnimal.setPreferredSize(new java.awt.Dimension(90, 32));
        btnVerAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAnimalActionPerformed(evt);
            }
        });
        jPanel85.add(btnVerAnimal, java.awt.BorderLayout.LINE_END);
        btnVerAnimal.getAccessibleContext().setAccessibleParent(cardAnimais);

        jPanel82.add(jPanel85, java.awt.BorderLayout.CENTER);

        jPanel166.add(jPanel82, java.awt.BorderLayout.CENTER);

        jPanel165.add(jPanel166, java.awt.BorderLayout.PAGE_END);

        jPanel78.setOpaque(false);
        jPanel78.setLayout(new javax.swing.BoxLayout(jPanel78, javax.swing.BoxLayout.X_AXIS));

        jPanel80.setMaximumSize(new java.awt.Dimension(49, 32767));
        jPanel80.setOpaque(false);
        jPanel80.setPreferredSize(new java.awt.Dimension(49, 88));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel80);

        jPanel42.setOpaque(false);
        jPanel42.setPreferredSize(new java.awt.Dimension(236, 88));
        jPanel42.setLayout(new java.awt.GridLayout(3, 3));

        jPanel44.setOpaque(false);
        jPanel44.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 84, 84));
        jLabel8.setText("Total");
        jPanel44.add(jLabel8, java.awt.BorderLayout.CENTER);
        jLabel8.getAccessibleContext().setAccessibleParent(cardAnimais);

        jPanel42.add(jPanel44);

        jPanel45.setOpaque(false);
        jPanel45.setLayout(new java.awt.BorderLayout());
        jPanel42.add(jPanel45);

        jPanel71.setOpaque(false);
        jPanel71.setLayout(new java.awt.BorderLayout());

        lblTotalAnimais.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblTotalAnimais.setForeground(new java.awt.Color(76, 84, 84));
        lblTotalAnimais.setText("0");
        jPanel71.add(lblTotalAnimais, java.awt.BorderLayout.CENTER);
        lblTotalAnimais.getAccessibleContext().setAccessibleParent(cardAnimais);

        jPanel42.add(jPanel71);

        jPanel72.setOpaque(false);
        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 84, 84));
        jLabel9.setText("Cães");
        jPanel72.add(jLabel9, java.awt.BorderLayout.CENTER);
        jLabel9.getAccessibleContext().setAccessibleParent(cardAnimais);

        jPanel42.add(jPanel72);

        jPanel73.setOpaque(false);
        jPanel73.setLayout(new java.awt.BorderLayout());
        jPanel42.add(jPanel73);

        panel1212.setOpaque(false);
        panel1212.setLayout(new java.awt.BorderLayout());

        lblCaes.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblCaes.setForeground(new java.awt.Color(76, 84, 84));
        lblCaes.setText("0");
        panel1212.add(lblCaes, java.awt.BorderLayout.LINE_START);
        lblCaes.getAccessibleContext().setAccessibleParent(cardAnimais);

        jPanel42.add(panel1212);

        jPanel75.setOpaque(false);
        jPanel75.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 84, 84));
        jLabel10.setText("Gatos");
        jPanel75.add(jLabel10, java.awt.BorderLayout.CENTER);
        jLabel10.getAccessibleContext().setAccessibleParent(cardAnimais);

        jPanel42.add(jPanel75);

        jPanel76.setOpaque(false);
        jPanel76.setLayout(new java.awt.BorderLayout());
        jPanel42.add(jPanel76);

        panel.setOpaque(false);
        panel.setLayout(new java.awt.BorderLayout());

        lblGatos.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblGatos.setForeground(new java.awt.Color(76, 84, 84));
        lblGatos.setText("0");
        panel.add(lblGatos, java.awt.BorderLayout.LINE_START);
        lblGatos.getAccessibleContext().setAccessibleParent(cardAnimais);

        jPanel42.add(panel);

        jPanel78.add(jPanel42);

        jPanel165.add(jPanel78, java.awt.BorderLayout.CENTER);

        cardAnimais.add(jPanel165, java.awt.BorderLayout.PAGE_END);

        jPanel8.add(cardAnimais, new java.awt.GridBagConstraints());
        cardAnimais.getAccessibleContext().setAccessibleName("Card Animais");
        cardAnimais.getAccessibleContext().setAccessibleDescription("Card de acesso rápido");
        cardAnimais.getAccessibleContext().setAccessibleParent(painel);

        jPanel6.add(jPanel8);

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new java.awt.GridBagLayout());

        cardClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        cardClientes.setOpaque(false);
        cardClientes.setPreferredSize(new java.awt.Dimension(240, 250));
        cardClientes.setLayout(new java.awt.BorderLayout());

        jPanel87.setMaximumSize(new java.awt.Dimension(2147483647, 76));
        jPanel87.setName(""); // NOI18N
        jPanel87.setOpaque(false);
        jPanel87.setPreferredSize(new java.awt.Dimension(236, 76));
        jPanel87.setLayout(new java.awt.GridBagLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_card_clientes.png"))); // NOI18N
        jPanel87.add(jLabel14, new java.awt.GridBagConstraints());
        jLabel14.getAccessibleContext().setAccessibleParent(cardClientes);

        cardClientes.add(jPanel87, java.awt.BorderLayout.PAGE_START);

        jPanel88.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel88.setMinimumSize(new java.awt.Dimension(89, 20));
        jPanel88.setOpaque(false);
        jPanel88.setPreferredSize(new java.awt.Dimension(236, 20));
        jPanel88.setLayout(new java.awt.GridBagLayout());

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(76, 84, 84));
        jLabel15.setText("CLIENTES");
        jLabel15.setMaximumSize(new java.awt.Dimension(110, 25));
        jLabel15.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanel88.add(jLabel15, new java.awt.GridBagConstraints());
        jLabel15.getAccessibleContext().setAccessibleParent(cardClientes);

        cardClientes.add(jPanel88, java.awt.BorderLayout.CENTER);

        jPanel89.setMaximumSize(new java.awt.Dimension(32767, 144));
        jPanel89.setOpaque(false);
        jPanel89.setPreferredSize(new java.awt.Dimension(236, 144));
        jPanel89.setLayout(new java.awt.BorderLayout());

        jPanel90.setOpaque(false);
        jPanel90.setPreferredSize(new java.awt.Dimension(236, 56));
        jPanel90.setLayout(new java.awt.BorderLayout());

        jPanel91.setOpaque(false);
        jPanel91.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel90.add(jPanel91, java.awt.BorderLayout.LINE_START);

        jPanel92.setOpaque(false);
        jPanel92.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel90.add(jPanel92, java.awt.BorderLayout.LINE_END);

        jPanel93.setOpaque(false);
        jPanel93.setPreferredSize(new java.awt.Dimension(100, 56));
        jPanel93.setLayout(new java.awt.BorderLayout());

        jPanel94.setOpaque(false);
        jPanel94.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel93.add(jPanel94, java.awt.BorderLayout.PAGE_START);

        jPanel95.setOpaque(false);
        jPanel95.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel93.add(jPanel95, java.awt.BorderLayout.PAGE_END);

        jPanel96.setOpaque(false);
        jPanel96.setLayout(new java.awt.BorderLayout());

        btnNovoCliente.setBackground(new java.awt.Color(118, 176, 65));
        btnNovoCliente.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoCliente.setText("Novo");
        btnNovoCliente.setBorder(null);
        btnNovoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoCliente.setNextFocusableComponent(btnVerCliente);
        btnNovoCliente.setPreferredSize(new java.awt.Dimension(90, 32));
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });
        jPanel96.add(btnNovoCliente, java.awt.BorderLayout.LINE_START);
        btnNovoCliente.getAccessibleContext().setAccessibleParent(cardClientes);

        btnVerCliente.setBackground(new java.awt.Color(76, 84, 84));
        btnVerCliente.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnVerCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnVerCliente.setText("Ver");
        btnVerCliente.setBorder(null);
        btnVerCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerCliente.setNextFocusableComponent(btnNovoUsuario);
        btnVerCliente.setPreferredSize(new java.awt.Dimension(90, 32));
        btnVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClienteActionPerformed(evt);
            }
        });
        jPanel96.add(btnVerCliente, java.awt.BorderLayout.LINE_END);
        btnVerCliente.getAccessibleContext().setAccessibleParent(cardClientes);

        jPanel93.add(jPanel96, java.awt.BorderLayout.CENTER);

        jPanel90.add(jPanel93, java.awt.BorderLayout.CENTER);

        jPanel89.add(jPanel90, java.awt.BorderLayout.PAGE_END);

        jPanel97.setOpaque(false);
        jPanel97.setLayout(new javax.swing.BoxLayout(jPanel97, javax.swing.BoxLayout.X_AXIS));

        jPanel98.setMinimumSize(new java.awt.Dimension(25, 0));
        jPanel98.setOpaque(false);
        jPanel98.setPreferredSize(new java.awt.Dimension(45, 88));

        javax.swing.GroupLayout jPanel98Layout = new javax.swing.GroupLayout(jPanel98);
        jPanel98.setLayout(jPanel98Layout);
        jPanel98Layout.setHorizontalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
        jPanel98Layout.setVerticalGroup(
            jPanel98Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel97.add(jPanel98);

        jPanel99.setOpaque(false);
        jPanel99.setPreferredSize(new java.awt.Dimension(236, 88));
        jPanel99.setLayout(new java.awt.GridLayout(3, 3));

        jPanel100.setOpaque(false);
        jPanel100.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(76, 84, 84));
        jLabel16.setText("Total");
        jPanel100.add(jLabel16, java.awt.BorderLayout.CENTER);
        jLabel16.getAccessibleContext().setAccessibleParent(cardClientes);

        jPanel99.add(jPanel100);

        jPanel102.setOpaque(false);
        jPanel102.setLayout(new java.awt.BorderLayout());

        lblTotalClientes.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblTotalClientes.setForeground(new java.awt.Color(76, 84, 84));
        lblTotalClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalClientes.setText("0");
        jPanel102.add(lblTotalClientes, java.awt.BorderLayout.CENTER);
        lblTotalClientes.getAccessibleContext().setAccessibleParent(cardClientes);

        jPanel99.add(jPanel102);

        jPanel103.setOpaque(false);
        jPanel103.setLayout(new java.awt.BorderLayout());

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(76, 84, 84));
        jLabel18.setText("Com pets");
        jPanel103.add(jLabel18, java.awt.BorderLayout.CENTER);
        jLabel18.getAccessibleContext().setAccessibleParent(cardClientes);

        jPanel99.add(jPanel103);

        jPanel105.setOpaque(false);
        jPanel105.setLayout(new java.awt.BorderLayout());

        lblCom.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblCom.setForeground(new java.awt.Color(76, 84, 84));
        lblCom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCom.setText("0");
        jPanel105.add(lblCom, java.awt.BorderLayout.CENTER);
        lblCom.getAccessibleContext().setAccessibleParent(cardClientes);

        jPanel99.add(jPanel105);

        jPanel106.setOpaque(false);
        jPanel106.setLayout(new java.awt.BorderLayout());

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(76, 84, 84));
        jLabel20.setText("Sem pets");
        jPanel106.add(jLabel20, java.awt.BorderLayout.CENTER);
        jLabel20.getAccessibleContext().setAccessibleParent(cardClientes);

        jPanel99.add(jPanel106);

        jPanel108.setOpaque(false);
        jPanel108.setLayout(new java.awt.BorderLayout());

        lblSem.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblSem.setForeground(new java.awt.Color(76, 84, 84));
        lblSem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSem.setText("0");
        jPanel108.add(lblSem, java.awt.BorderLayout.CENTER);
        lblSem.getAccessibleContext().setAccessibleParent(cardClientes);

        jPanel99.add(jPanel108);

        jPanel97.add(jPanel99);

        jPanel21.setMinimumSize(new java.awt.Dimension(15, 0));
        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(10, 88));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel97.add(jPanel21);

        jPanel89.add(jPanel97, java.awt.BorderLayout.CENTER);

        cardClientes.add(jPanel89, java.awt.BorderLayout.PAGE_END);

        jPanel9.add(cardClientes, new java.awt.GridBagConstraints());
        cardClientes.getAccessibleContext().setAccessibleName("Card Clientes");
        cardClientes.getAccessibleContext().setAccessibleDescription("Card de acesso rápido");
        cardClientes.getAccessibleContext().setAccessibleParent(painel);

        jPanel6.add(jPanel9);

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridBagLayout());

        cardUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        cardUsuarios.setOpaque(false);
        cardUsuarios.setPreferredSize(new java.awt.Dimension(240, 250));
        cardUsuarios.setLayout(new java.awt.BorderLayout());

        jPanel256.setMaximumSize(new java.awt.Dimension(2147483647, 76));
        jPanel256.setName(""); // NOI18N
        jPanel256.setOpaque(false);
        jPanel256.setPreferredSize(new java.awt.Dimension(236, 76));
        jPanel256.setLayout(new java.awt.GridBagLayout());

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icone_card_usuarios.png"))); // NOI18N
        jPanel256.add(jLabel76, new java.awt.GridBagConstraints());
        jLabel76.getAccessibleContext().setAccessibleParent(cardUsuarios);

        cardUsuarios.add(jPanel256, java.awt.BorderLayout.PAGE_START);

        jPanel257.setMaximumSize(new java.awt.Dimension(32767, 20));
        jPanel257.setMinimumSize(new java.awt.Dimension(89, 20));
        jPanel257.setOpaque(false);
        jPanel257.setPreferredSize(new java.awt.Dimension(236, 20));
        jPanel257.setLayout(new java.awt.GridBagLayout());

        jLabel77.setFont(new java.awt.Font("Montserrat Medium", 0, 20)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(76, 84, 84));
        jLabel77.setText("USUÁRIOS");
        jLabel77.setPreferredSize(new java.awt.Dimension(110, 20));
        jPanel257.add(jLabel77, new java.awt.GridBagConstraints());
        jLabel77.getAccessibleContext().setAccessibleParent(cardUsuarios);

        cardUsuarios.add(jPanel257, java.awt.BorderLayout.CENTER);

        jPanel258.setMaximumSize(new java.awt.Dimension(32767, 144));
        jPanel258.setOpaque(false);
        jPanel258.setPreferredSize(new java.awt.Dimension(236, 144));
        jPanel258.setLayout(new java.awt.BorderLayout());

        jPanel259.setOpaque(false);
        jPanel259.setPreferredSize(new java.awt.Dimension(236, 56));
        jPanel259.setLayout(new java.awt.BorderLayout());

        jPanel260.setOpaque(false);
        jPanel260.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel260Layout = new javax.swing.GroupLayout(jPanel260);
        jPanel260.setLayout(jPanel260Layout);
        jPanel260Layout.setHorizontalGroup(
            jPanel260Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel260Layout.setVerticalGroup(
            jPanel260Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel259.add(jPanel260, java.awt.BorderLayout.LINE_START);

        jPanel261.setOpaque(false);
        jPanel261.setPreferredSize(new java.awt.Dimension(18, 56));

        javax.swing.GroupLayout jPanel261Layout = new javax.swing.GroupLayout(jPanel261);
        jPanel261.setLayout(jPanel261Layout);
        jPanel261Layout.setHorizontalGroup(
            jPanel261Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );
        jPanel261Layout.setVerticalGroup(
            jPanel261Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jPanel259.add(jPanel261, java.awt.BorderLayout.LINE_END);

        jPanel262.setOpaque(false);
        jPanel262.setPreferredSize(new java.awt.Dimension(100, 56));
        jPanel262.setLayout(new java.awt.BorderLayout());

        jPanel263.setOpaque(false);
        jPanel263.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel263Layout = new javax.swing.GroupLayout(jPanel263);
        jPanel263.setLayout(jPanel263Layout);
        jPanel263Layout.setHorizontalGroup(
            jPanel263Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel263Layout.setVerticalGroup(
            jPanel263Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel262.add(jPanel263, java.awt.BorderLayout.PAGE_START);

        jPanel264.setOpaque(false);
        jPanel264.setPreferredSize(new java.awt.Dimension(200, 12));

        javax.swing.GroupLayout jPanel264Layout = new javax.swing.GroupLayout(jPanel264);
        jPanel264.setLayout(jPanel264Layout);
        jPanel264Layout.setHorizontalGroup(
            jPanel264Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel264Layout.setVerticalGroup(
            jPanel264Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel262.add(jPanel264, java.awt.BorderLayout.PAGE_END);

        jPanel265.setOpaque(false);
        jPanel265.setLayout(new java.awt.BorderLayout());

        btnNovoUsuario.setBackground(new java.awt.Color(118, 176, 65));
        btnNovoUsuario.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnNovoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNovoUsuario.setText("Novo");
        btnNovoUsuario.setBorder(null);
        btnNovoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoUsuario.setNextFocusableComponent(btnVerUsuario);
        btnNovoUsuario.setPreferredSize(new java.awt.Dimension(90, 32));
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });
        jPanel265.add(btnNovoUsuario, java.awt.BorderLayout.LINE_START);
        btnNovoUsuario.getAccessibleContext().setAccessibleParent(cardUsuarios);

        btnVerUsuario.setBackground(new java.awt.Color(76, 84, 84));
        btnVerUsuario.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnVerUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnVerUsuario.setText("Ver");
        btnVerUsuario.setBorder(null);
        btnVerUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerUsuario.setNextFocusableComponent(btn1);
        btnVerUsuario.setPreferredSize(new java.awt.Dimension(90, 32));
        btnVerUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerUsuarioActionPerformed(evt);
            }
        });
        jPanel265.add(btnVerUsuario, java.awt.BorderLayout.LINE_END);
        btnVerUsuario.getAccessibleContext().setAccessibleParent(cardUsuarios);

        jPanel262.add(jPanel265, java.awt.BorderLayout.CENTER);

        jPanel259.add(jPanel262, java.awt.BorderLayout.CENTER);

        jPanel258.add(jPanel259, java.awt.BorderLayout.PAGE_END);

        jPanel266.setMaximumSize(new java.awt.Dimension(240, 32767));
        jPanel266.setMinimumSize(new java.awt.Dimension(240, 60));
        jPanel266.setOpaque(false);
        jPanel266.setPreferredSize(new java.awt.Dimension(240, 88));
        jPanel266.setLayout(new java.awt.BorderLayout());

        jPanel267.setOpaque(false);
        jPanel267.setPreferredSize(new java.awt.Dimension(35, 88));

        javax.swing.GroupLayout jPanel267Layout = new javax.swing.GroupLayout(jPanel267);
        jPanel267.setLayout(jPanel267Layout);
        jPanel267Layout.setHorizontalGroup(
            jPanel267Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        jPanel267Layout.setVerticalGroup(
            jPanel267Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel266.add(jPanel267, java.awt.BorderLayout.LINE_START);

        jPanel268.setOpaque(false);
        jPanel268.setPreferredSize(new java.awt.Dimension(10, 88));

        javax.swing.GroupLayout jPanel268Layout = new javax.swing.GroupLayout(jPanel268);
        jPanel268.setLayout(jPanel268Layout);
        jPanel268Layout.setHorizontalGroup(
            jPanel268Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel268Layout.setVerticalGroup(
            jPanel268Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        jPanel266.add(jPanel268, java.awt.BorderLayout.LINE_END);

        jPanel269.setOpaque(false);
        jPanel269.setLayout(new javax.swing.BoxLayout(jPanel269, javax.swing.BoxLayout.LINE_AXIS));

        jPanel270.setMinimumSize(new java.awt.Dimension(100, 60));
        jPanel270.setOpaque(false);
        jPanel270.setPreferredSize(new java.awt.Dimension(100, 88));
        jPanel270.setLayout(new java.awt.GridLayout(3, 3));

        jPanel271.setOpaque(false);
        jPanel271.setLayout(new java.awt.BorderLayout());

        jLabel78.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(76, 84, 84));
        jLabel78.setText("Gerência");
        jPanel271.add(jLabel78, java.awt.BorderLayout.CENTER);
        jLabel78.getAccessibleContext().setAccessibleParent(cardUsuarios);

        jPanel270.add(jPanel271);

        jPanel272.setOpaque(false);
        jPanel272.setLayout(new java.awt.BorderLayout());

        lblGerencia.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblGerencia.setForeground(new java.awt.Color(76, 84, 84));
        lblGerencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGerencia.setText("0");
        jPanel272.add(lblGerencia, java.awt.BorderLayout.CENTER);
        lblGerencia.getAccessibleContext().setAccessibleParent(cardUsuarios);

        jPanel270.add(jPanel272);

        jPanel273.setOpaque(false);
        jPanel273.setLayout(new java.awt.BorderLayout());

        jLabel80.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(76, 84, 84));
        jLabel80.setText("Atend.");
        jLabel80.setMinimumSize(new java.awt.Dimension(150, 20));
        jLabel80.setPreferredSize(new java.awt.Dimension(150, 20));
        jPanel273.add(jLabel80, java.awt.BorderLayout.CENTER);
        jLabel80.getAccessibleContext().setAccessibleParent(cardUsuarios);

        jPanel270.add(jPanel273);

        jPanel274.setOpaque(false);
        jPanel274.setLayout(new java.awt.BorderLayout());

        lblAtendimento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblAtendimento.setForeground(new java.awt.Color(76, 84, 84));
        lblAtendimento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtendimento.setText("0");
        jPanel274.add(lblAtendimento, java.awt.BorderLayout.CENTER);
        lblAtendimento.getAccessibleContext().setAccessibleParent(cardUsuarios);

        jPanel270.add(jPanel274);

        jPanel275.setOpaque(false);
        jPanel275.setLayout(new java.awt.BorderLayout());

        jLabel82.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(76, 84, 84));
        jLabel82.setText("Medicina");
        jPanel275.add(jLabel82, java.awt.BorderLayout.CENTER);
        jLabel82.getAccessibleContext().setAccessibleParent(cardUsuarios);

        jPanel270.add(jPanel275);

        jPanel276.setOpaque(false);
        jPanel276.setLayout(new java.awt.BorderLayout());

        lblMedicina.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblMedicina.setForeground(new java.awt.Color(76, 84, 84));
        lblMedicina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMedicina.setText("0");
        jPanel276.add(lblMedicina, java.awt.BorderLayout.CENTER);
        lblMedicina.getAccessibleContext().setAccessibleParent(cardUsuarios);

        jPanel270.add(jPanel276);

        jPanel269.add(jPanel270);

        jPanel266.add(jPanel269, java.awt.BorderLayout.CENTER);

        jPanel258.add(jPanel266, java.awt.BorderLayout.CENTER);

        cardUsuarios.add(jPanel258, java.awt.BorderLayout.PAGE_END);

        jPanel12.add(cardUsuarios, new java.awt.GridBagConstraints());
        cardUsuarios.getAccessibleContext().setAccessibleName("Card Usuários");
        cardUsuarios.getAccessibleContext().setAccessibleDescription("Card de acesso rápido");
        cardUsuarios.getAccessibleContext().setAccessibleParent(painel);

        jPanel6.add(jPanel12);

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.GridBagLayout());
        jPanel6.add(jPanel14);

        painel.add(jPanel6, java.awt.BorderLayout.CENTER);

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

        painel.add(jPanel24, java.awt.BorderLayout.PAGE_END);

        jPanel4.add(painel, java.awt.BorderLayout.CENTER);
        painel.getAccessibleContext().setAccessibleName("Painel");
        painel.getAccessibleContext().setAccessibleDescription("");
        painel.getAccessibleContext().setAccessibleParent(painel);

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

        getAccessibleContext().setAccessibleDescription("Painel inicial com cards de acesso rápido");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClienteActionPerformed
        new TelaClientes(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerClienteActionPerformed

    private void btnVerAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAgendamentoActionPerformed
        new TelaAgendamentos(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerAgendamentoActionPerformed

    private void btnVerUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerUsuarioActionPerformed
        new TelaUsuarios(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerUsuarioActionPerformed

    private void btn1btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1btn1ActionPerformed
        menuService.abrirTela(btn1);
        this.dispose();
    }//GEN-LAST:event_btn1btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        menuService.abrirTela(btn3);
        this.dispose();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        menuService.abrirTela(btn4);
        this.dispose();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        menuService.abrirTela(btn7);
        this.dispose();
    }//GEN-LAST:event_btn7ActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnVerAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAnimalActionPerformed
        new TelaAnimais(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerAnimalActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        menuService.abrirTela(btn9);
        this.dispose();
    }//GEN-LAST:event_btn9ActionPerformed

    private void lblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUsuarioMouseClicked
        this.dispose();
        new TelaPerfilUsuario(usuario, usuario).setVisible(true);
    }//GEN-LAST:event_lblUsuarioMouseClicked

    private void btnNovoAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAgendamentoActionPerformed
        new TelaNovoAgendamento(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoAgendamentoActionPerformed

    private void btnNovoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAnimalActionPerformed
        new TelaCadastrarAnimal(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoAnimalActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        new TelaCadastrarCliente(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        new TelaCadastrarUsuario(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel b4;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnNovoAgendamento;
    private javax.swing.JButton btnNovoAnimal;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JButton btnVerAgendamento;
    private javax.swing.JButton btnVerAnimal;
    private javax.swing.JButton btnVerCliente;
    private javax.swing.JButton btnVerUsuario;
    private javax.swing.JPanel cardAgendamentos;
    private javax.swing.JPanel cardAnimais;
    private javax.swing.JPanel cardClientes;
    private javax.swing.JPanel cardUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel102;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel105;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel110;
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
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel163;
    private javax.swing.JPanel jPanel164;
    private javax.swing.JPanel jPanel165;
    private javax.swing.JPanel jPanel166;
    private javax.swing.JPanel jPanel167;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel256;
    private javax.swing.JPanel jPanel257;
    private javax.swing.JPanel jPanel258;
    private javax.swing.JPanel jPanel259;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel260;
    private javax.swing.JPanel jPanel261;
    private javax.swing.JPanel jPanel262;
    private javax.swing.JPanel jPanel263;
    private javax.swing.JPanel jPanel264;
    private javax.swing.JPanel jPanel265;
    private javax.swing.JPanel jPanel266;
    private javax.swing.JPanel jPanel267;
    private javax.swing.JPanel jPanel268;
    private javax.swing.JPanel jPanel269;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel270;
    private javax.swing.JPanel jPanel271;
    private javax.swing.JPanel jPanel272;
    private javax.swing.JPanel jPanel273;
    private javax.swing.JPanel jPanel274;
    private javax.swing.JPanel jPanel275;
    private javax.swing.JPanel jPanel276;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
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
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JLabel lblAtendimento;
    private javax.swing.JLabel lblCaes;
    private javax.swing.JLabel lblCom;
    private javax.swing.JLabel lblData1;
    private javax.swing.JLabel lblData2;
    private javax.swing.JLabel lblGatos;
    private javax.swing.JLabel lblGerencia;
    private javax.swing.JLabel lblMedicina;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblProcedimento1;
    private javax.swing.JLabel lblProcedimento2;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSem;
    private javax.swing.JLabel lblTotalAnimais;
    private javax.swing.JLabel lblTotalClientes;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1212;
    // End of variables declaration//GEN-END:variables
}
