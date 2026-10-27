package vethub.view;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import vethub.model.Animal;
import vethub.model.Cliente;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import vethub.model.Procedimento;
import vethub.model.Usuario;
import vethub.service.ProcedimentoService;
import vethub.service.ValidadorService;
import vethub.service.AnimalService;
import vethub.service.ClienteService;

/**
 *
 * @author Arthur
 */
public class TelaNovoAgendamento extends javax.swing.JFrame {
    
    private final Usuario usuario;
    private Animal animal = null;
    private Cliente cliente = null;
    private List<Animal> animais;
    private List<Cliente> clientes;
    private boolean inicializando;
    private final MenuUtil menuService;
    private final ClienteService clienteService;
    private final AnimalService animalService;
    private final ProcedimentoService procedimentoService;
    
    public TelaNovoAgendamento(Usuario usuario) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.menuService = new MenuUtil(usuario);
        this.clienteService = new ClienteService();
        this.animalService = new AnimalService();
        this.procedimentoService = new ProcedimentoService();
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn7);
        
        inicializando = true;
        
        try{
            animais = animalService.buscarTodos();
            clientes = clienteService.buscarTodos();
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        for(Cliente tutor : clientes){
            cmbTutor.addItem(tutor.getNome());
        }
        
        for(Animal a : animais){
            cmbAnimal.addItem(a.getNome() + " (" + a.getTutor().getNome() + ")");
        }
        
        cmbAnimal.setSelectedIndex(-1);
        cmbTutor.setSelectedIndex(-1);
        
        inicializando = false;
        
        getRootPane().setDefaultButton(btnSalvar);
        
        cmbAnimal.requestFocusInWindow();
        
    }
    
    public TelaNovoAgendamento(Usuario usuario, Animal animal) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.animal = animal;
        this.menuService = new MenuUtil(usuario);
        this.clienteService = new ClienteService();
        this.animalService = new AnimalService();
        this.procedimentoService = new ProcedimentoService();
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn7);
        
        inicializando = true;
        
        try{
            animais = animalService.buscarTodos();
            clientes = clienteService.buscarTodos(); 
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        for(Cliente tutor : clientes){
            cmbTutor.addItem(tutor.getNome());
        }
        
        for(Animal a : animais){
            cmbAnimal.addItem(a.getNome() + " (" + a.getTutor().getNome() + ")");
        }
        
        cmbAnimal.setSelectedIndex(-1);
        cmbTutor.setSelectedIndex(-1);
        
        inicializando = false;
        
        cmbAnimal.setSelectedItem(animal.getNome() + " (" + animal.getTutor().getNome() + ")");
        
        getRootPane().setDefaultButton(btnSalvar);
        
        txtData.requestFocusInWindow();
    }
    
    public TelaNovoAgendamento(Usuario usuario, Cliente cliente) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.cliente = cliente;
        this.menuService = new MenuUtil(usuario);
        this.clienteService = new ClienteService();
        this.animalService = new AnimalService();
        this.procedimentoService = new ProcedimentoService();
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn7);
        
        try{
            animais = animalService.buscarTodos();
            clientes = clienteService.buscarTodos();
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        boolean inicializando = true;
        
        for(Cliente tutor : clientes){
            cmbTutor.addItem(tutor.getNome());
        }
        
        for(Animal a : animais){
            cmbAnimal.addItem(a.getNome() + " (" + a.getTutor().getNome() + ")");
        }
        
        cmbAnimal.setSelectedIndex(-1);
        cmbTutor.setSelectedIndex(-1);
        
        cmbTutor.setSelectedItem(cliente.getNome());
        
        inicializando = false;
        
        getRootPane().setDefaultButton(btnSalvar);
        
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
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        formulario = new javax.swing.JPanel();
        jPanel86 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        cmbAnimal = new javax.swing.JComboBox<>();
        jPanel89 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        cmbTutor = new javax.swing.JComboBox<>();
        jPanel91 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        txtData = new javax.swing.JTextField();
        jPanel93 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jPanel95 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel96 = new javax.swing.JPanel();
        cmbProcedimento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Novo Agendamento");
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
        lblSair.setNextFocusableComponent(cmbAnimal);
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
        btn4.setForeground(new java.awt.Color(219, 161, 89));
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(1206, 640));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(1660, 80));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 84, 84));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NOVO AGENDAMENTO");
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
        jPanel74.setPreferredSize(new java.awt.Dimension(220, 528));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jPanel73.add(jPanel74, java.awt.BorderLayout.LINE_START);

        jPanel75.setOpaque(false);
        jPanel75.setPreferredSize(new java.awt.Dimension(220, 528));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
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
            .addGap(0, 666, Short.MAX_VALUE)
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
        btnSalvar.setNextFocusableComponent(btnCancelar);
        btnSalvar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel8.add(btnSalvar, java.awt.BorderLayout.PAGE_START);
        btnSalvar.getAccessibleContext().setAccessibleDescription("Salvar agendamento");

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
        btnCancelar.setNextFocusableComponent(btn1);
        btnCancelar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel9.add(btnCancelar, java.awt.BorderLayout.PAGE_START);
        btnCancelar.getAccessibleContext().setAccessibleDescription("Cancelar agendamento e voltar para a tela Agendamentos");

        jPanel7.add(jPanel9, java.awt.BorderLayout.EAST);

        jPanel77.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel76.add(jPanel77, java.awt.BorderLayout.PAGE_END);

        jPanel78.setOpaque(false);
        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel79.setOpaque(false);
        jPanel79.setPreferredSize(new java.awt.Dimension(906, 20));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 666, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel79, java.awt.BorderLayout.PAGE_START);

        jPanel80.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        jPanel80.setOpaque(false);
        jPanel80.setPreferredSize(new java.awt.Dimension(590, 340));
        jPanel80.setLayout(new java.awt.BorderLayout());

        formulario.setOpaque(false);
        formulario.setPreferredSize(new java.awt.Dimension(377, 265));
        formulario.setLayout(new java.awt.GridBagLayout());

        jPanel86.setOpaque(false);
        jPanel86.setPreferredSize(new java.awt.Dimension(377, 265));
        jPanel86.setLayout(new java.awt.GridLayout(5, 2));

        jPanel87.setOpaque(false);
        jPanel87.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel12.setLabelFor(cmbAnimal);
        jLabel12.setText("Animal");
        jLabel12.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel87.add(jLabel12, java.awt.BorderLayout.PAGE_START);
        jLabel12.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel87);

        jPanel88.setOpaque(false);
        jPanel88.setLayout(new java.awt.BorderLayout());

        cmbAnimal.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbAnimal.setForeground(new java.awt.Color(76, 84, 84));
        cmbAnimal.setBorder(null);
        cmbAnimal.setNextFocusableComponent(cmbTutor);
        cmbAnimal.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAnimalActionPerformed(evt);
            }
        });
        jPanel88.add(cmbAnimal, java.awt.BorderLayout.PAGE_START);
        cmbAnimal.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel88);

        jPanel89.setOpaque(false);
        jPanel89.setLayout(new java.awt.BorderLayout());

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel13.setLabelFor(cmbTutor);
        jLabel13.setText("Tutor");
        jLabel13.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel89.add(jLabel13, java.awt.BorderLayout.PAGE_START);
        jLabel13.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel89);

        jPanel90.setOpaque(false);
        jPanel90.setLayout(new java.awt.BorderLayout());

        cmbTutor.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbTutor.setForeground(new java.awt.Color(76, 84, 84));
        cmbTutor.setNextFocusableComponent(txtData);
        cmbTutor.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTutorActionPerformed(evt);
            }
        });
        jPanel90.add(cmbTutor, java.awt.BorderLayout.PAGE_START);
        cmbTutor.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel90);

        jPanel91.setOpaque(false);
        jPanel91.setLayout(new java.awt.BorderLayout());

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel14.setLabelFor(txtData);
        jLabel14.setText("Data");
        jLabel14.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel91.add(jLabel14, java.awt.BorderLayout.PAGE_START);
        jLabel14.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel91);

        jPanel92.setOpaque(false);
        jPanel92.setLayout(new java.awt.BorderLayout());

        txtData.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtData.setToolTipText("Formato DD/MM/AAAA");
        txtData.setNextFocusableComponent(txtHora);
        txtData.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel92.add(txtData, java.awt.BorderLayout.PAGE_START);
        txtData.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel92);

        jPanel93.setOpaque(false);
        jPanel93.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel15.setLabelFor(txtHora);
        jLabel15.setText("Hora");
        jLabel15.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel93.add(jLabel15, java.awt.BorderLayout.PAGE_START);
        jLabel15.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel93);

        jPanel94.setOpaque(false);
        jPanel94.setLayout(new java.awt.BorderLayout());

        jTextField10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jTextField10.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel94.add(jTextField10, java.awt.BorderLayout.PAGE_START);

        txtHora.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtHora.setToolTipText("Formato HH:MM");
        txtHora.setNextFocusableComponent(cmbProcedimento);
        txtHora.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel94.add(txtHora, java.awt.BorderLayout.PAGE_START);
        txtHora.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel94);

        jPanel95.setOpaque(false);
        jPanel95.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel16.setLabelFor(cmbProcedimento);
        jLabel16.setText("Procedimento");
        jLabel16.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel95.add(jLabel16, java.awt.BorderLayout.PAGE_START);
        jLabel16.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel95);

        jPanel96.setOpaque(false);
        jPanel96.setLayout(new java.awt.BorderLayout());

        cmbProcedimento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbProcedimento.setForeground(new java.awt.Color(76, 84, 84));
        cmbProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "consulta", "vacina", "castração" }));
        cmbProcedimento.setSelectedIndex(-1);
        cmbProcedimento.setNextFocusableComponent(btnSalvar);
        cmbProcedimento.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel96.add(cmbProcedimento, java.awt.BorderLayout.PAGE_START);
        cmbProcedimento.getAccessibleContext().setAccessibleParent(formulario);

        jPanel86.add(jPanel96);

        formulario.add(jPanel86, new java.awt.GridBagConstraints());

        jPanel80.add(formulario, java.awt.BorderLayout.CENTER);
        formulario.getAccessibleContext().setAccessibleName("Formulário");
        formulario.getAccessibleContext().setAccessibleDescription("Insira os dados do novo agendamento");

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

        getAccessibleContext().setAccessibleDescription("Tela com formulário para fazer novo agendamento");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAnimalActionPerformed
        if(inicializando == true){
            return;
        }
        int i = cmbAnimal.getSelectedIndex();
        
        if(cmbTutor.getSelectedIndex() == -1){
            try{
                Cliente tutor = animalService.selecionarTutor(animais.get(i).getTutor().getId());
                inicializando = true;
                cmbTutor.setSelectedItem(tutor.getNome());
                inicializando = false;
            } catch(ClassNotFoundException | SQLException e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
            } catch (Exception e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
            }
            
        }
     
        
    }//GEN-LAST:event_cmbAnimalActionPerformed

    private void cmbTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTutorActionPerformed
        if(inicializando == true){
            return;
        }
        
        int i = cmbTutor.getSelectedIndex();
        
        List<Animal> animaisDoTutor = new ArrayList();
        
        try{
            animaisDoTutor = clienteService.filtrarAnimais(clientes.get(i));
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        inicializando = true;
        
        cmbAnimal.removeAllItems();
        
        for (Animal a : animaisDoTutor){
            cmbAnimal.addItem(a.getNome());
        }
        
        cmbAnimal.setSelectedIndex(-1);
        
        inicializando = false;      
        
        
    }//GEN-LAST:event_cmbTutorActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        ValidadorService validador = new ValidadorService();
        
        if(cmbAnimal.getSelectedIndex() == -1 || txtData.getText().isEmpty() || txtHora.getText().isEmpty() || cmbProcedimento.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(null, "Todos os campos devem estar preenchidos.");
            return;
        }
        
        try{
            int i = cmbAnimal.getSelectedIndex();
            
            Animal animal = animalService.buscarPorId(animais.get(i).getId());
            String data = txtData.getText().trim().replace(".","/").replace("-","/");
            String hora = txtHora.getText().trim().replace("h", ":");
            String tipo = (String) cmbProcedimento.getSelectedItem();
            String status = "agendada";
            String anotacoes = null;
            

            
            if(validador.validarData(data) && validador.validarHora(hora)){

                DateTimeFormatter formatterDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                LocalDateTime dataHora = LocalDateTime.parse(data + " " + hora, formatterDataHora);
                    
                if(!procedimentoService.verificarDisponibilidade(dataHora)){
                    JOptionPane.showMessageDialog(null, "Já existe um agendamento para esta data e horário.");
                    return;
                }
                    
                Procedimento p = new Procedimento();
                p.setDataHora(dataHora);
                p.setTipo(tipo);
                p.setStatus(status);
                p.setAnotacoes(anotacoes);
                p.setAnimal(animal);
                p.setVeterinario(usuario);
                    
                procedimentoService.salvar(p);
                JOptionPane.showMessageDialog(null, "Agendamento realizado com sucesso.");
                    
                new TelaAgendamentos(usuario).setVisible(true);
                this.dispose();
            }
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        new TelaAgendamentos(usuario).setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

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
    private javax.swing.JComboBox<String> cmbAnimal;
    private javax.swing.JComboBox<String> cmbProcedimento;
    private javax.swing.JComboBox<String> cmbTutor;
    private javax.swing.JPanel formulario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
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
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel86;
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
    private javax.swing.JTextField jTextField10;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
