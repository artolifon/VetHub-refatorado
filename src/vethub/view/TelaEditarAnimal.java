package vethub.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vethub.model.Animal;
import vethub.model.Cliente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import vethub.model.Endereco;
import vethub.model.Procedimento;
import vethub.model.Usuario;
import vethub.service.AnimalService;
import vethub.service.ClienteService;
import vethub.service.ValidadorService;

/**
 *
 * @author Arthur
 */
public class TelaEditarAnimal extends javax.swing.JFrame {
    
    private final Usuario usuario;
    private final MenuUtil menuService;
    private Animal animal;
    private final AnimalService animalService;
    private final ClienteService clienteService;
    private List<Cliente> clientes;
    
    /**
     * Creates new form TelaDashboardGerente
     */
    public TelaEditarAnimal(Usuario usuario, Animal animal) {
        initComponents();
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        
        this.animal = animal;
        this.usuario = usuario;
        this.menuService = new MenuUtil(usuario);
        this.animalService = new AnimalService();
        this.clienteService = new ClienteService();
        this.clientes = new ArrayList();
        
        lblUsuario.setText(usuario.getNome());
        
        menuService.carregarMenu(btn17);
        
        cmbEspecie.addItem("Cão");
        cmbEspecie.addItem("Gato");
        
        cmbSexo.addItem("Macho");
        cmbSexo.addItem("Fêmea");
        
        try{
            clientes = clienteService.buscarTodos();
            for(Cliente tutor : clientes){
                cmbTutor.addItem(tutor.getNome());
            }
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        
        txtNome.setText(animal.getNome());
        txtRaca.setText(animal.getRaca());
        if(animal.getPeso() != null){
            txtPeso.setText(String.valueOf(animal.getPeso())); 
        }
        cmbEspecie.setSelectedItem(animal.getEspecie());
        if(animal.getDataNascimento() != null){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            txtNascimento.setText(animal.getDataNascimento().format(formatter)); 
        }
        cmbSexo.setSelectedItem(animal.getSexo());
        cmbTutor.setSelectedItem(animal.getTutor().getNome());
        
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
        jPanel115 = new javax.swing.JPanel();
        b6 = new javax.swing.JPanel();
        btn6 = new javax.swing.JButton();
        jPanel61 = new javax.swing.JPanel();
        jPanel67 = new javax.swing.JPanel();
        jPanel97 = new javax.swing.JPanel();
        btn8 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        jPanel98 = new javax.swing.JPanel();
        jPanel116 = new javax.swing.JPanel();
        jPanel117 = new javax.swing.JPanel();
        btn15 = new javax.swing.JButton();
        jPanel118 = new javax.swing.JPanel();
        jPanel119 = new javax.swing.JPanel();
        jPanel120 = new javax.swing.JPanel();
        btn16 = new javax.swing.JButton();
        jPanel121 = new javax.swing.JPanel();
        jPanel122 = new javax.swing.JPanel();
        jPanel123 = new javax.swing.JPanel();
        btn17 = new javax.swing.JButton();
        jPanel124 = new javax.swing.JPanel();
        jPanel125 = new javax.swing.JPanel();
        jPanel126 = new javax.swing.JPanel();
        jPanel127 = new javax.swing.JPanel();
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
        jButton5 = new javax.swing.JButton();
        jPanel78 = new javax.swing.JPanel();
        jPanel79 = new javax.swing.JPanel();
        formulario = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel86 = new javax.swing.JPanel();
        cmbTutor = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel83 = new javax.swing.JPanel();
        cmbEspecie = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel81 = new javax.swing.JPanel();
        txtRaca = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel84 = new javax.swing.JPanel();
        txtNascimento = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel82 = new javax.swing.JPanel();
        txtPeso = new javax.swing.JTextField();
        jPanel20 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel71 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel85 = new javax.swing.JPanel();
        cmbSexo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VetHub - Editar Animal");
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
        lblSair.setText(" | Sair ");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.setPreferredSize(new java.awt.Dimension(60, 24));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });
        jPanel26.add(lblSair, java.awt.BorderLayout.LINE_END);
        lblSair.getAccessibleContext().setAccessibleName("Sair ");
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

        jPanel115.setOpaque(false);
        jPanel115.setLayout(new javax.swing.BoxLayout(jPanel115, javax.swing.BoxLayout.Y_AXIS));

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
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6btn1ActionPerformed(evt);
            }
        });
        b6.add(btn6, java.awt.BorderLayout.LINE_START);
        btn6.getAccessibleContext().setAccessibleParent(Menu);

        jPanel115.add(b6);

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

        jPanel115.add(jPanel61);

        Menu.add(jPanel115);

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

        jPanel116.setOpaque(false);
        jPanel116.setLayout(new javax.swing.BoxLayout(jPanel116, javax.swing.BoxLayout.Y_AXIS));

        jPanel117.setOpaque(false);
        jPanel117.setLayout(new java.awt.BorderLayout());

        btn15.setBackground(new java.awt.Color(76, 84, 84));
        btn15.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn15.setForeground(new java.awt.Color(219, 161, 89));
        btn15.setText("Animais");
        btn15.setBorder(null);
        btn15.setContentAreaFilled(false);
        btn15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn15.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn15.setIconTextGap(0);
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        jPanel117.add(btn15, java.awt.BorderLayout.PAGE_START);
        btn15.getAccessibleContext().setAccessibleParent(Menu);

        jPanel116.add(jPanel117);

        jPanel118.setOpaque(false);

        javax.swing.GroupLayout jPanel118Layout = new javax.swing.GroupLayout(jPanel118);
        jPanel118.setLayout(jPanel118Layout);
        jPanel118Layout.setHorizontalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel118Layout.setVerticalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel116.add(jPanel118);

        Menu.add(jPanel116);

        jPanel119.setOpaque(false);
        jPanel119.setLayout(new javax.swing.BoxLayout(jPanel119, javax.swing.BoxLayout.Y_AXIS));

        jPanel120.setOpaque(false);
        jPanel120.setLayout(new java.awt.BorderLayout());

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
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        jPanel120.add(btn16, java.awt.BorderLayout.PAGE_START);
        btn16.getAccessibleContext().setAccessibleParent(Menu);

        jPanel119.add(jPanel120);

        jPanel121.setOpaque(false);

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel119.add(jPanel121);

        Menu.add(jPanel119);

        jPanel122.setOpaque(false);
        jPanel122.setLayout(new javax.swing.BoxLayout(jPanel122, javax.swing.BoxLayout.Y_AXIS));

        jPanel123.setOpaque(false);
        jPanel123.setLayout(new java.awt.BorderLayout());

        btn17.setBackground(new java.awt.Color(76, 84, 84));
        btn17.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        btn17.setForeground(new java.awt.Color(255, 255, 255));
        btn17.setText("Usuários");
        btn17.setBorder(null);
        btn17.setContentAreaFilled(false);
        btn17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn17.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btn17.setIconTextGap(0);
        btn17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn17ActionPerformed(evt);
            }
        });
        jPanel123.add(btn17, java.awt.BorderLayout.LINE_START);
        btn17.getAccessibleContext().setAccessibleParent(Menu);

        jPanel122.add(jPanel123);

        jPanel124.setOpaque(false);

        javax.swing.GroupLayout jPanel124Layout = new javax.swing.GroupLayout(jPanel124);
        jPanel124.setLayout(jPanel124Layout);
        jPanel124Layout.setHorizontalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel124Layout.setVerticalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel122.add(jPanel124);

        Menu.add(jPanel122);

        jPanel125.setOpaque(false);
        jPanel125.setLayout(new javax.swing.BoxLayout(jPanel125, javax.swing.BoxLayout.Y_AXIS));

        jPanel126.setOpaque(false);
        jPanel126.setLayout(new java.awt.BorderLayout());
        jPanel125.add(jPanel126);

        jPanel127.setOpaque(false);

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel125.add(jPanel127);

        Menu.add(jPanel125);

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
        jLabel1.setText("EDITAR ANIMAL");
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
        btnSalvar.setPreferredSize(new java.awt.Dimension(160, 40));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        jPanel8.add(btnSalvar, java.awt.BorderLayout.PAGE_START);
        btnSalvar.getAccessibleContext().setAccessibleDescription("Salvar alterações");

        jPanel7.add(jPanel8, java.awt.BorderLayout.WEST);

        jPanel9.setOpaque(false);
        jPanel9.setPreferredSize(new java.awt.Dimension(160, 100));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(new java.awt.Color(76, 84, 84));
        jButton5.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cancelar");
        jButton5.setBorder(null);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setPreferredSize(new java.awt.Dimension(160, 40));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.PAGE_START);
        jButton5.getAccessibleContext().setAccessibleDescription("Cancelar edição de cadastro e voltar para a página Animais");

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

        formulario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(76, 84, 84), 2));
        formulario.setOpaque(false);
        formulario.setPreferredSize(new java.awt.Dimension(590, 402));
        formulario.setLayout(new java.awt.BorderLayout());

        jPanel10.setOpaque(false);
        jPanel10.setPreferredSize(new java.awt.Dimension(662, 10));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        formulario.add(jPanel10, java.awt.BorderLayout.PAGE_START);

        jPanel11.setOpaque(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(662, 85));
        jPanel11.setLayout(new java.awt.GridBagLayout());

        jPanel80.setOpaque(false);
        jPanel80.setLayout(new java.awt.BorderLayout());

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(76, 84, 84));
        jLabel12.setText("Tutor*:");
        jPanel80.add(jLabel12, java.awt.BorderLayout.PAGE_START);

        jPanel86.setOpaque(false);
        jPanel86.setPreferredSize(new java.awt.Dimension(201, 48));
        jPanel86.setLayout(new java.awt.BorderLayout());

        cmbTutor.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbTutor.setForeground(new java.awt.Color(76, 85, 85));
        cmbTutor.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTutorActionPerformed(evt);
            }
        });
        jPanel86.add(cmbTutor, java.awt.BorderLayout.PAGE_START);

        jPanel80.add(jPanel86, java.awt.BorderLayout.PAGE_END);

        jPanel11.add(jPanel80, new java.awt.GridBagConstraints());

        formulario.add(jPanel11, java.awt.BorderLayout.PAGE_END);

        jPanel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jPanel12.setOpaque(false);
        jPanel12.setLayout(new java.awt.GridBagLayout());

        jPanel13.setOpaque(false);
        jPanel13.setPreferredSize(new java.awt.Dimension(510, 234));
        jPanel13.setLayout(new java.awt.GridLayout(3, 2));

        jPanel14.setOpaque(false);
        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel21.setOpaque(false);
        jPanel21.setPreferredSize(new java.awt.Dimension(47, 78));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel14.add(jPanel21, java.awt.BorderLayout.LINE_END);

        jPanel41.setOpaque(false);
        jPanel41.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(76, 84, 84));
        jLabel6.setText("Nome*:");
        jPanel41.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jPanel72.setOpaque(false);
        jPanel72.setPreferredSize(new java.awt.Dimension(201, 48));
        jPanel72.setLayout(new java.awt.BorderLayout());

        txtNome.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(76, 84, 84));
        txtNome.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel72.add(txtNome, java.awt.BorderLayout.PAGE_START);

        jPanel41.add(jPanel72, java.awt.BorderLayout.PAGE_END);

        jPanel14.add(jPanel41, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel14);

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel22.setOpaque(false);
        jPanel22.setPreferredSize(new java.awt.Dimension(47, 78));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel15.add(jPanel22, java.awt.BorderLayout.LINE_START);

        jPanel44.setForeground(new java.awt.Color(76, 84, 84));
        jPanel44.setOpaque(false);
        jPanel44.setLayout(new java.awt.BorderLayout());

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 84, 84));
        jLabel9.setText("Espécie*:");
        jPanel44.add(jLabel9, java.awt.BorderLayout.PAGE_START);

        jPanel83.setOpaque(false);
        jPanel83.setPreferredSize(new java.awt.Dimension(201, 48));
        jPanel83.setLayout(new java.awt.BorderLayout());

        cmbEspecie.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbEspecie.setForeground(new java.awt.Color(76, 85, 85));
        cmbEspecie.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEspecieActionPerformed(evt);
            }
        });
        jPanel83.add(cmbEspecie, java.awt.BorderLayout.PAGE_START);

        jPanel44.add(jPanel83, java.awt.BorderLayout.PAGE_END);

        jPanel15.add(jPanel44, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel15);

        jPanel17.setOpaque(false);
        jPanel17.setLayout(new java.awt.BorderLayout());

        jPanel23.setOpaque(false);
        jPanel23.setPreferredSize(new java.awt.Dimension(47, 78));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel17.add(jPanel23, java.awt.BorderLayout.LINE_END);

        jPanel42.setOpaque(false);
        jPanel42.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(76, 84, 84));
        jLabel7.setText("Raça:");
        jPanel42.add(jLabel7, java.awt.BorderLayout.PAGE_START);

        jPanel81.setOpaque(false);
        jPanel81.setPreferredSize(new java.awt.Dimension(201, 48));
        jPanel81.setLayout(new java.awt.BorderLayout());

        txtRaca.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtRaca.setForeground(new java.awt.Color(76, 84, 84));
        txtRaca.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel81.add(txtRaca, java.awt.BorderLayout.PAGE_START);

        jPanel42.add(jPanel81, java.awt.BorderLayout.PAGE_END);

        jPanel17.add(jPanel42, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel17);

        jPanel18.setOpaque(false);
        jPanel18.setLayout(new java.awt.BorderLayout());

        jPanel39.setOpaque(false);
        jPanel39.setPreferredSize(new java.awt.Dimension(47, 78));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel39, java.awt.BorderLayout.LINE_START);

        jPanel45.setOpaque(false);
        jPanel45.setLayout(new java.awt.BorderLayout());

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 84, 84));
        jLabel10.setText("Nascimento:");
        jPanel45.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        jPanel84.setOpaque(false);
        jPanel84.setPreferredSize(new java.awt.Dimension(201, 48));
        jPanel84.setLayout(new java.awt.BorderLayout());

        txtNascimento.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtNascimento.setForeground(new java.awt.Color(76, 84, 84));
        txtNascimento.setToolTipText("Formato DD/MM/AAAA");
        txtNascimento.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel84.add(txtNascimento, java.awt.BorderLayout.PAGE_START);

        jPanel45.add(jPanel84, java.awt.BorderLayout.PAGE_END);

        jPanel18.add(jPanel45, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel18);

        jPanel19.setOpaque(false);
        jPanel19.setLayout(new java.awt.BorderLayout());

        jPanel36.setOpaque(false);
        jPanel36.setPreferredSize(new java.awt.Dimension(47, 78));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel19.add(jPanel36, java.awt.BorderLayout.LINE_END);

        jPanel43.setOpaque(false);
        jPanel43.setLayout(new java.awt.BorderLayout());

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 84, 84));
        jLabel8.setText("Peso:");
        jPanel43.add(jLabel8, java.awt.BorderLayout.PAGE_START);

        jPanel82.setOpaque(false);
        jPanel82.setPreferredSize(new java.awt.Dimension(201, 48));
        jPanel82.setLayout(new java.awt.BorderLayout());

        txtPeso.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(76, 84, 84));
        txtPeso.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanel82.add(txtPeso, java.awt.BorderLayout.PAGE_START);

        jPanel43.add(jPanel82, java.awt.BorderLayout.PAGE_END);

        jPanel19.add(jPanel43, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel19);

        jPanel20.setOpaque(false);
        jPanel20.setLayout(new java.awt.BorderLayout());

        jPanel40.setOpaque(false);
        jPanel40.setPreferredSize(new java.awt.Dimension(47, 78));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel40, java.awt.BorderLayout.LINE_START);

        jPanel71.setOpaque(false);
        jPanel71.setLayout(new java.awt.BorderLayout());

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 84, 84));
        jLabel11.setText("Sexo*:");
        jPanel71.add(jLabel11, java.awt.BorderLayout.PAGE_START);

        jPanel85.setOpaque(false);
        jPanel85.setPreferredSize(new java.awt.Dimension(201, 48));
        jPanel85.setLayout(new java.awt.BorderLayout());

        cmbSexo.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        cmbSexo.setForeground(new java.awt.Color(76, 85, 85));
        cmbSexo.setPreferredSize(new java.awt.Dimension(200, 30));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });
        jPanel85.add(cmbSexo, java.awt.BorderLayout.PAGE_START);

        jPanel71.add(jPanel85, java.awt.BorderLayout.PAGE_END);

        jPanel20.add(jPanel71, java.awt.BorderLayout.CENTER);

        jPanel13.add(jPanel20);

        jPanel12.add(jPanel13, new java.awt.GridBagConstraints());

        formulario.add(jPanel12, java.awt.BorderLayout.CENTER);

        jPanel78.add(formulario, java.awt.BorderLayout.CENTER);

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

        getAccessibleContext().setAccessibleDescription("Tela com formulário para editar o animal selecionado");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        this.dispose();
        new TelaLogin().setVisible(true);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            String nome = txtNome.getText().trim();
            String especie = (String) cmbEspecie.getSelectedItem();
            String raca = txtRaca.getText().trim();
            String nascimento = txtNascimento.getText().trim().replace(".","/").replace("-","/");
            String sexo = (String) cmbSexo.getSelectedItem();
            String peso = txtPeso.getText().trim().replace(",",".");
            
            if(nome.isEmpty() || cmbEspecie.getSelectedIndex() == -1 || cmbTutor.getSelectedIndex() == -1 || cmbSexo.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(null, "Os campos com asterisco são obrigatórios.");
                return;
            } else {
                
                ValidadorService validador = new ValidadorService();
                if((txtNascimento.getText().isEmpty() || validador.validarData(nascimento)) && (txtPeso.getText().isEmpty() || validador.validarPeso(peso))){
                    
                    int i = cmbTutor.getSelectedIndex();
                    
                    Cliente tutor = clienteService.buscarPorId(clientes.get(i).getId());
                    
                    LocalDate data = null;
                    
                    if(!nascimento.isEmpty()){
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        data = LocalDate.parse(nascimento, formatter); 
                    }
                    
                    
                    Double pesoDouble = null;
                    
                    if(!peso.isEmpty()){
                        pesoDouble = Double.valueOf(peso);
                    }
                    
                    animal.setNome(nome);
                    animal.setEspecie(especie);
                    animal.setRaca(raca);
                    animal.setDataNascimento(data);
                    animal.setPeso(pesoDouble);
                    animal.setSexo(sexo);
                    animal.setTutor(tutor);    
                    
                    animalService.editar(animal);
                    JOptionPane.showMessageDialog(null, "Animal editado com sucesso.");
                } else {
                    return;
                }
            }
            
        } catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro na conexão com o banco de dados.");
        } catch (Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro interno no sistema.");
        }
        
        new TelaAnimais(usuario).setVisible(true);
        this.dispose();
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
        
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        
    }//GEN-LAST:event_btn7ActionPerformed

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
        
    }//GEN-LAST:event_btn16ActionPerformed

    private void btn17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn17ActionPerformed
        menuService.abrirTela(btn17);
        this.dispose();
    }//GEN-LAST:event_btn17ActionPerformed

    private void cmbTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTutorActionPerformed

    private void cmbEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEspecieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEspecieActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed

    }//GEN-LAST:event_cmbSexoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new TelaAnimais(usuario).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel b6;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbEspecie;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JComboBox<String> cmbTutor;
    private javax.swing.JPanel formulario;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
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
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
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
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel97;
    private javax.swing.JPanel jPanel98;
    private javax.swing.JLabel lblSair;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtRaca;
    // End of variables declaration//GEN-END:variables
}
