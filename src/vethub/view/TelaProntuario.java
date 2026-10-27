package vethub.view;

import java.sql.SQLException;
import java.time.LocalDate;
import vethub.model.Animal;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import vethub.model.Cliente;
import vethub.model.Procedimento;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.util.Collections;
import javax.swing.JOptionPane;
import vethub.model.Endereco;
import vethub.model.Usuario;
import vethub.service.AnimalService;
import vethub.service.ProcedimentoService;
import vethub.service.UsuarioService;

/**
 *
 * @author Arthur
 */
public class TelaProntuario extends javax.swing.JFrame {
    
    
    private final Usuario usuario;

    private final Animal animal;
    private List<Procedimento> procedimentos;  
    private List<Usuario> veterinarios;
    private final MenuUtil menuService;
    private final ProcedimentoService procedimentoService;
    private final UsuarioService usuarioService;
    private boolean inicializando;
    
    
    /**
     * Creates new form TelaDashboardGerente
     */
    public TelaProntuario(Usuario usuario, Animal animal) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.usuario = usuario;
        this.animal = animal;
        this.procedimentos = new ArrayList();
        this.veterinarios = new ArrayList();
        this.menuService = new MenuUtil(usuario);
        this.procedimentoService = new ProcedimentoService();
        this.usuarioService = new UsuarioService();
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn7);
        
        boolean inicializando = true;
        
        try{
            this.veterinarios = usuarioService.filtrar("", "VETERINARIO");
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        for(Usuario v : veterinarios){
            cmbResponsavel.addItem(v.getNome());
        }
        
        cmbResponsavel.setSelectedIndex(-1);
        
        inicializando = false;
        
        String raca = "--";
        if(animal.getRaca() != null && !animal.getRaca().isEmpty()){
            raca = animal.getRaca();
        }
        
        String peso = null;
        
        if(animal.getPeso() != null){
            peso = Double.toString(animal.getPeso())+" Kg"; 
        } else {
            peso = "--";
        }
        
        lblNomeGrande.setText(animal.getNome());
        
        
        String idade = "--";
        String data = "--";
        
        if(animal.getDataNascimento() != null){
          AnimalService as = new AnimalService();
          
          DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          data = animal.getDataNascimento().format(formatter);
          
          String palavra = " anos";
          int idadeInt = as.calcularIdade(animal.getDataNascimento());
          
          if(idadeInt == 1) {
              palavra = " ano";
          }
          
          idade = String.valueOf(idadeInt) + palavra;  
        }
        
        lblResumo.setText(animal.getEspecie() + " • " + raca + " • " + idade);
        
        lblNome.setText(animal.getNome());
        lblEspecie.setText(animal.getEspecie());
        lblRaca.setText(raca);
        
        lblNascimento.setText(data);
        lblPeso.setText(peso); 
        
        lblSexo.setText(animal.getSexo());
        lblTutor.setText(animal.getTutor().getNome());
        
        try{
            procedimentos = procedimentoService.buscarPorAnimal(animal);
            procedimentoService.preencherTabela(tbl, procedimentos);
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        
        getRootPane().setDefaultButton(btnNovo);
        
        txtData.requestFocusInWindow();
        
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
        jPanel86 = new javax.swing.JPanel();
        jPanel89 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel58 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        lblNomeGrande = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        lblResumo = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        lblEspecie = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel57 = new javax.swing.JPanel();
        lblRaca = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        lblNascimento = new javax.swing.JLabel();
        jPanel88 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel90 = new javax.swing.JPanel();
        lblPeso = new javax.swing.JLabel();
        jPanel91 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel92 = new javax.swing.JPanel();
        lblSexo = new javax.swing.JLabel();
        jPanel93 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel94 = new javax.swing.JPanel();
        lblTutor = new javax.swing.JLabel();
        jPanel75 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jPanel85 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel78 = new javax.swing.JPanel();
        jPanel87 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel43 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        filtros = new javax.swing.JPanel();
        jPanel72 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jPanel79 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        cmbProcedimento = new javax.swing.JComboBox<>();
        jPanel80 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        jPanel84 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cmbResponsavel = new javax.swing.JComboBox<>();
        jPanel81 = new javax.swing.JPanel();
        jPanel82 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        jPanel83 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Prontuário");
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
        btn9.setForeground(new java.awt.Color(219, 161, 89));
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
        btn3.setForeground(new java.awt.Color(255, 255, 255));
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
        Menu.getAccessibleContext().setAccessibleName("");

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
        jLabel1.setText("PRONTUÁRIO");
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
        jPanel74.setPreferredSize(new java.awt.Dimension(380, 528));
        jPanel74.setLayout(new java.awt.BorderLayout());

        jPanel86.setOpaque(false);
        jPanel86.setPreferredSize(new java.awt.Dimension(424, 40));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel74.add(jPanel86, java.awt.BorderLayout.PAGE_START);

        jPanel89.setOpaque(false);
        jPanel89.setPreferredSize(new java.awt.Dimension(380, 374));
        jPanel89.setLayout(new java.awt.BorderLayout());

        jPanel34.setOpaque(false);
        jPanel34.setPreferredSize(new java.awt.Dimension(25, 493));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jPanel89.add(jPanel34, java.awt.BorderLayout.LINE_END);

        jPanel37.setOpaque(false);
        jPanel37.setPreferredSize(new java.awt.Dimension(25, 493));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );

        jPanel89.add(jPanel37, java.awt.BorderLayout.LINE_START);

        jPanel58.setOpaque(false);
        jPanel58.setPreferredSize(new java.awt.Dimension(380, 60));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel89.add(jPanel58, java.awt.BorderLayout.PAGE_END);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(326, 82));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel14.setOpaque(false);
        jPanel14.setPreferredSize(new java.awt.Dimension(326, 20));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel13.add(jPanel14, java.awt.BorderLayout.PAGE_START);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel17.setMinimumSize(new java.awt.Dimension(102, 45));
        jPanel17.setOpaque(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(326, 40));
        jPanel17.setLayout(new java.awt.GridBagLayout());

        lblNomeGrande.setFont(new java.awt.Font("Montserrat Medium", 0, 28)); // NOI18N
        lblNomeGrande.setForeground(new java.awt.Color(76, 84, 84));
        jPanel17.add(lblNomeGrande, new java.awt.GridBagConstraints());

        jPanel15.add(jPanel17, java.awt.BorderLayout.NORTH);

        jPanel18.setOpaque(false);
        jPanel18.setPreferredSize(new java.awt.Dimension(326, 20));
        jPanel18.setLayout(new java.awt.GridBagLayout());

        lblResumo.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblResumo.setForeground(new java.awt.Color(76, 84, 84));
        jPanel18.add(lblResumo, new java.awt.GridBagConstraints());

        jPanel15.add(jPanel18, java.awt.BorderLayout.SOUTH);

        jPanel13.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel13, java.awt.BorderLayout.PAGE_START);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel20.setOpaque(false);
        jPanel20.setPreferredSize(new java.awt.Dimension(326, 17));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel20, java.awt.BorderLayout.PAGE_START);

        jPanel21.setOpaque(false);
        jPanel21.setLayout(new java.awt.BorderLayout());

        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(36, 17));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel22, java.awt.BorderLayout.LINE_START);

        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(36, 17));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 36, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 325, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel23, java.awt.BorderLayout.LINE_END);

        jPanel36.setOpaque(false);
        jPanel36.setLayout(new java.awt.GridLayout(7, 2));

        jPanel39.setOpaque(false);
        jPanel39.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 84, 84));
        jLabel3.setText("Nome");
        jPanel39.add(jLabel3, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel39);

        jPanel40.setOpaque(false);
        jPanel40.setLayout(new java.awt.BorderLayout());

        lblNome.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblNome.setForeground(new java.awt.Color(76, 84, 84));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel40.add(lblNome, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel40);

        jPanel41.setOpaque(false);
        jPanel41.setLayout(new java.awt.BorderLayout());

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(76, 84, 84));
        jLabel4.setText("Espécie");
        jPanel41.add(jLabel4, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel41);

        jPanel42.setOpaque(false);
        jPanel42.setLayout(new java.awt.BorderLayout());

        lblEspecie.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblEspecie.setForeground(new java.awt.Color(76, 84, 84));
        lblEspecie.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel42.add(lblEspecie, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel42);

        jPanel46.setOpaque(false);
        jPanel46.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 84, 84));
        jLabel6.setText("Raça");
        jPanel46.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel46);

        jPanel57.setOpaque(false);
        jPanel57.setLayout(new java.awt.BorderLayout());

        lblRaca.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblRaca.setForeground(new java.awt.Color(76, 84, 84));
        lblRaca.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel57.add(lblRaca, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel57);

        jPanel68.setOpaque(false);
        jPanel68.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 84, 84));
        jLabel7.setText("Nascimento");
        jPanel68.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel68);

        jPanel71.setOpaque(false);
        jPanel71.setLayout(new java.awt.BorderLayout());

        lblNascimento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblNascimento.setForeground(new java.awt.Color(76, 84, 84));
        lblNascimento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel71.add(lblNascimento, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel71);

        jPanel88.setOpaque(false);
        jPanel88.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 84, 84));
        jLabel8.setText("Peso");
        jPanel88.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel88);

        jPanel90.setOpaque(false);
        jPanel90.setLayout(new java.awt.BorderLayout());

        lblPeso.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblPeso.setForeground(new java.awt.Color(76, 84, 84));
        lblPeso.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel90.add(lblPeso, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel90);

        jPanel91.setOpaque(false);
        jPanel91.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 84, 84));
        jLabel9.setText("Sexo");
        jPanel91.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel91);

        jPanel92.setOpaque(false);
        jPanel92.setLayout(new java.awt.BorderLayout());

        lblSexo.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblSexo.setForeground(new java.awt.Color(76, 84, 84));
        lblSexo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel92.add(lblSexo, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel92);

        jPanel93.setOpaque(false);
        jPanel93.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 84, 84));
        jLabel10.setText("Tutor");
        jPanel93.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel93);

        jPanel94.setOpaque(false);
        jPanel94.setLayout(new java.awt.BorderLayout());

        lblTutor.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lblTutor.setForeground(new java.awt.Color(76, 84, 84));
        lblTutor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel94.add(lblTutor, java.awt.BorderLayout.PAGE_START);

        jPanel36.add(jPanel94);

        jPanel21.add(jPanel36, java.awt.BorderLayout.CENTER);

        jPanel19.add(jPanel21, java.awt.BorderLayout.CENTER);

        jPanel12.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel89.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel74.add(jPanel89, java.awt.BorderLayout.CENTER);

        jPanel73.add(jPanel74, java.awt.BorderLayout.LINE_START);

        jPanel75.setOpaque(false);
        jPanel75.setPreferredSize(new java.awt.Dimension(40, 528));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
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
            .addGap(0, 686, Short.MAX_VALUE)
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

        jButton3.setBackground(new java.awt.Color(118, 176, 65));
        jButton3.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ver");
        jButton3.setBorder(null);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3, java.awt.BorderLayout.PAGE_START);
        jButton3.getAccessibleContext().setAccessibleDescription("Ver dados do procedimento selecionado");

        jPanel7.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(166, 60, 6));
        jButton5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Excluir");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.PAGE_START);
        jButton5.getAccessibleContext().setAccessibleDescription("Excluir o registro do procedimento selecionado");

        jPanel7.add(jPanel9, java.awt.BorderLayout.EAST);

        jPanel45.setOpaque(false);
        jPanel45.setLayout(new java.awt.BorderLayout());

        jPanel85.setOpaque(false);
        jPanel85.setPreferredSize(new java.awt.Dimension(366, 40));
        jPanel85.setLayout(new java.awt.GridBagLayout());

        jButton10.setBackground(new java.awt.Color(74, 86, 86));
        jButton10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Editar");
        jButton10.setBorder(null);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel85.add(jButton10, new java.awt.GridBagConstraints());
        jButton10.getAccessibleContext().setAccessibleDescription("Editar dados do procedimento selecionado");

        jPanel45.add(jPanel85, java.awt.BorderLayout.NORTH);

        jPanel7.add(jPanel45, java.awt.BorderLayout.CENTER);

        jPanel77.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel76.add(jPanel77, java.awt.BorderLayout.PAGE_END);

        jPanel78.setOpaque(false);
        jPanel78.setPreferredSize(new java.awt.Dimension(684, 351));
        jPanel78.setLayout(new java.awt.BorderLayout());

        jPanel87.setOpaque(false);
        jPanel87.setPreferredSize(new java.awt.Dimension(35, 40));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel78.add(jPanel87, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jScrollPane1.setOpaque(false);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(684, 191));

        tbl.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        tbl.setForeground(new java.awt.Color(76, 84, 84));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATA", "PROCEDIMENTO", "STATUS", "RESPONSÁVEL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl.setGridColor(new java.awt.Color(76, 84, 84));
        tbl.setIntercellSpacing(new java.awt.Dimension(0, 10));
        tbl.setRowHeight(30);
        tbl.setSelectionBackground(new java.awt.Color(233, 199, 155));
        tbl.setSelectionForeground(new java.awt.Color(76, 84, 84));
        jScrollPane1.setViewportView(tbl);
        tbl.getAccessibleContext().setAccessibleName("Tabela de listagem de procedimentos");

        jPanel78.add(jScrollPane1, java.awt.BorderLayout.PAGE_END);

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.BorderLayout());

        jPanel44.setOpaque(false);
        jPanel44.setPreferredSize(new java.awt.Dimension(615, 60));
        jPanel44.setLayout(new java.awt.BorderLayout());

        filtros.setOpaque(false);
        filtros.setLayout(new java.awt.GridLayout(1, 4, 55, 0));

        jPanel72.setOpaque(false);
        jPanel72.setLayout(new java.awt.BorderLayout());

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel15.setLabelFor(txtData);
        jLabel15.setText("Data");
        jPanel72.add(jLabel15, java.awt.BorderLayout.PAGE_START);
        jLabel15.getAccessibleContext().setAccessibleParent(filtros);

        txtData.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtData.setToolTipText("Formato DD/MM/AAAA");
        txtData.setPreferredSize(new java.awt.Dimension(135, 30));
        txtData.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtDataCaretUpdate(evt);
            }
        });
        jPanel72.add(txtData, java.awt.BorderLayout.PAGE_END);
        txtData.getAccessibleContext().setAccessibleParent(filtros);

        filtros.add(jPanel72);

        jPanel79.setOpaque(false);
        jPanel79.setLayout(new java.awt.BorderLayout());

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel16.setLabelFor(cmbProcedimento);
        jLabel16.setText("Procedimento");
        jPanel79.add(jLabel16, java.awt.BorderLayout.PAGE_START);
        jLabel16.getAccessibleContext().setAccessibleParent(filtros);

        cmbProcedimento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbProcedimento.setForeground(new java.awt.Color(76, 84, 84));
        cmbProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "consulta", "vacina", "castração" }));
        cmbProcedimento.setSelectedIndex(-1);
        cmbProcedimento.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbProcedimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProcedimentoActionPerformed(evt);
            }
        });
        jPanel79.add(cmbProcedimento, java.awt.BorderLayout.PAGE_END);
        cmbProcedimento.getAccessibleContext().setAccessibleParent(filtros);

        filtros.add(jPanel79);

        jPanel80.setOpaque(false);
        jPanel80.setLayout(new java.awt.BorderLayout());

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel17.setLabelFor(cmbStatus);
        jLabel17.setText("Status");
        jPanel80.add(jLabel17, java.awt.BorderLayout.PAGE_START);
        jLabel17.getAccessibleContext().setAccessibleParent(filtros);

        cmbStatus.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbStatus.setForeground(new java.awt.Color(76, 84, 84));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "realizada", "agendada" }));
        cmbStatus.setSelectedIndex(-1);
        cmbStatus.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });
        jPanel80.add(cmbStatus, java.awt.BorderLayout.PAGE_END);
        cmbStatus.getAccessibleContext().setAccessibleParent(filtros);

        filtros.add(jPanel80);

        jPanel84.setOpaque(false);
        jPanel84.setLayout(new java.awt.BorderLayout());

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel18.setLabelFor(cmbResponsavel);
        jLabel18.setText("Responsável");
        jPanel84.add(jLabel18, java.awt.BorderLayout.PAGE_START);
        jLabel18.getAccessibleContext().setAccessibleParent(filtros);

        cmbResponsavel.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbResponsavel.setForeground(new java.awt.Color(76, 84, 84));
        cmbResponsavel.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbResponsavelActionPerformed(evt);
            }
        });
        jPanel84.add(cmbResponsavel, java.awt.BorderLayout.PAGE_END);
        cmbResponsavel.getAccessibleContext().setAccessibleParent(filtros);

        filtros.add(jPanel84);

        jPanel44.add(filtros, java.awt.BorderLayout.CENTER);
        filtros.getAccessibleContext().setAccessibleName("Filtros");

        jPanel43.add(jPanel44, java.awt.BorderLayout.PAGE_START);

        jPanel81.setOpaque(false);
        jPanel81.setPreferredSize(new java.awt.Dimension(615, 60));
        jPanel81.setLayout(new java.awt.BorderLayout());

        jPanel82.setOpaque(false);
        jPanel82.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel82.setLayout(new java.awt.BorderLayout());

        btnNovo.setBackground(new java.awt.Color(118, 176, 65));
        btnNovo.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(255, 255, 255));
        btnNovo.setText("Novo");
        btnNovo.setBorder(null);
        btnNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovo.setPreferredSize(new java.awt.Dimension(160, 40));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        jPanel82.add(btnNovo, java.awt.BorderLayout.PAGE_START);
        btnNovo.getAccessibleContext().setAccessibleDescription("Registrar novo procedimento");

        jPanel81.add(jPanel82, java.awt.BorderLayout.LINE_START);

        jPanel83.setOpaque(false);
        jPanel83.setPreferredSize(new java.awt.Dimension(160, 160));
        jPanel83.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(new java.awt.Color(74, 86, 86));
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
        jPanel83.add(jButton9, java.awt.BorderLayout.PAGE_START);
        jButton9.getAccessibleContext().setAccessibleDescription("Voltar para a tela Animais");

        jPanel81.add(jPanel83, java.awt.BorderLayout.LINE_END);

        jPanel43.add(jPanel81, java.awt.BorderLayout.PAGE_END);

        jPanel78.add(jPanel43, java.awt.BorderLayout.CENTER);

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

        getAccessibleContext().setAccessibleDescription("Tela de prontuário do animal selecionado. Selecione um procedimento para ver, editar ou excluir, ou registre um novo procedimento");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(tbl.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Você deve selecionar uma linha.");
        
        } else {
            int confirmacao = JOptionPane.showConfirmDialog(null, "Você deseja excluir o registro selecionado?");
            if(confirmacao == 0){
                
                int linha = tbl.getSelectedRow();
                int id = procedimentos.get(linha).getId();
                
                try{
                    procedimentoService.excluir(id);
                    procedimentos.clear();
                    procedimentos = procedimentoService.buscarPorAnimal(animal);
                    procedimentoService.preencherTabela(tbl, procedimentos);
                } catch(ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
                } catch (Exception e){
                    System.out.println(e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new TelaAnimais(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(tbl.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Você deve selecionar uma linha.");
            return;
        }
        int i = tbl.getSelectedRow();
        
        try{
            Procedimento procedimento = procedimentoService.buscarPorId(procedimentos.get(i).getId());
        
            new TelaEditarProcedimento(usuario, procedimento.getAnimal(), procedimento).setVisible(true);
        
            this.dispose();   
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(tbl.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Você deve selecionar uma linha.");
            return;
        }
        int i = tbl.getSelectedRow();
        
        try{
            Procedimento procedimento = procedimentoService.buscarPorId(procedimentos.get(i).getId());
            new TelaVerProcedimento(usuario, procedimento).setVisible(true);
            this.dispose();
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtDataCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtDataCaretUpdate
        if(inicializando == true){
            return;
        }
        
        int i = cmbResponsavel.getSelectedIndex();
        
        int veterinarioId = -1;
        
        if(i != -1)
        {
            veterinarioId = veterinarios.get(i).getId();
        }
        
        String data = txtData.getText();
        
        String tipo = "";  
        if(cmbProcedimento.getSelectedIndex() != -1){
            tipo = (String) cmbProcedimento.getSelectedItem();
        }
        
        String status = "";
        if(cmbStatus.getSelectedIndex() != -1){
            status = (String) cmbStatus.getSelectedItem();
        }
                
        
        procedimentos.clear();
        try{
            procedimentos = procedimentoService.filtrarProntuario(animal.getId(), veterinarioId, data, status, tipo);
            procedimentoService.preencherTabela(tbl, procedimentos);
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_txtDataCaretUpdate

    private void cmbProcedimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProcedimentoActionPerformed
        if(inicializando == true){
            return;
        }
        
        int i = cmbResponsavel.getSelectedIndex();
        
        int veterinarioId = -1;
        
        if(i != -1)
        {
            veterinarioId = veterinarios.get(i).getId();
        }
        
        String tipo = (String) cmbProcedimento.getSelectedItem();
        
        String data = txtData.getText();
        
        String status = "";
        if(cmbStatus.getSelectedIndex() != -1){
            status = (String) cmbStatus.getSelectedItem();
        }
                
        
        procedimentos.clear();
        try{
                procedimentos = procedimentoService.filtrarProntuario(animal.getId(), veterinarioId, data, status, tipo);
                procedimentoService.preencherTabela(tbl, procedimentos);
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_cmbProcedimentoActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        if(inicializando == true){
            return;
        }
        
        int i = cmbResponsavel.getSelectedIndex();
        
        int veterinarioId = -1;
        
        if(i != -1)
        {
            veterinarioId = veterinarios.get(i).getId();
        }
        
        String tipo = "";  
        if(cmbProcedimento.getSelectedIndex() != -1){
            tipo = (String) cmbProcedimento.getSelectedItem();
        }
        
        String data = txtData.getText();
        
        String status = "";
        if(cmbStatus.getSelectedIndex() != -1){
            status = (String) cmbStatus.getSelectedItem();
        }
                
        procedimentos.clear();
        try{
            procedimentos = procedimentoService.filtrarProntuario(animal.getId(), veterinarioId, data, status, tipo);
            procedimentoService.preencherTabela(tbl, procedimentos);   
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void cmbResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbResponsavelActionPerformed
        if(inicializando == true){
            return;
        }
        
        int i = cmbResponsavel.getSelectedIndex();
        
        int veterinarioId = -1;
        
        if(i != -1)
        {
            veterinarioId = veterinarios.get(i).getId();
        }
        
        String tipo = "";  
        if(cmbProcedimento.getSelectedIndex() != -1){
            tipo = (String) cmbProcedimento.getSelectedItem();
        }
        
        String data = txtData.getText();
        
        String status = (String) cmbStatus.getSelectedItem();
                
        
        procedimentos.clear();
        try{
            procedimentos = procedimentoService.filtrarProntuario(animal.getId(), veterinarioId, data, status, tipo);
            procedimentoService.preencherTabela(tbl, procedimentos);   
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
    }//GEN-LAST:event_cmbResponsavelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel b4;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox<String> cmbProcedimento;
    private javax.swing.JComboBox<String> cmbResponsavel;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JPanel filtros;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel104;
    private javax.swing.JPanel jPanel12;
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
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel68;
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
    private javax.swing.JPanel jPanel85;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEspecie;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNomeGrande;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblRaca;
    private javax.swing.JLabel lblResumo;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTutor;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtData;
    // End of variables declaration//GEN-END:variables
}
