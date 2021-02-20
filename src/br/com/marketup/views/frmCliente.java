
package br.com.marketup.views;

import br.com.marketup.dao.ClientesDAO;
import br.com.marketup.nogocio.Pessoa;
import br.com.marketup.recursos.Utilitarios;
import br.com.marketup.viacep.ViaCEP;
import br.com.marketup.viacep.ViaCEPException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class frmCliente extends javax.swing.JFrame {

     private static frmCliente frmC;

    public void listar(){
        
        ClientesDAO dao = new ClientesDAO();
        List<Pessoa> lista =  dao.listarClientes();
        DefaultTableModel dados = (DefaultTableModel) tabelaClientes.getModel();
        dados.setNumRows(0);
        
        lista.forEach((pessoa) -> {
            dados.addRow(new Object[]{
                
                pessoa.getId(),
                pessoa.getStatus(),
                pessoa.getPessoa(),
                pessoa.getNome(),
                pessoa.getNomefantasia(),
                pessoa.getCpf(),
                pessoa.getCnpj(),
                pessoa.getEmail(),
                pessoa.getLogradouro(),
                pessoa.getBairro(),
                pessoa.getCidade(),
                pessoa.getUf(),
                pessoa.getComplemento(),
                pessoa.getNumero(),
                pessoa.getReferencia(),
                pessoa.getTelefone(),
                pessoa.getCelular(),
                pessoa.getCep(),
                pessoa.getIbge()
            });
        });
        
    }
    
    public frmCliente() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnBotoes = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        tabPnCadastro = new javax.swing.JTabbedPane();
        pnPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNomeFantasia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        combUf = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        combPessoa = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        combStatus = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtReferencia = new javax.swing.JTextField();
        txtIbge = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnPesquisaRapida = new javax.swing.JButton();
        txtCep = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        pnComplemento = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                ListarClientes(evt);
            }
        });

        pnForm.setBackground(new java.awt.Color(44, 79, 103));

        lblFormCadastroCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFormCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFormCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/cliente_add.png"))); // NOI18N
        lblFormCadastroCliente.setText("Clientes");

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFormCadastroCliente))
                .addGap(11, 11, 11))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnBotoes.setBackground(new java.awt.Color(230, 230, 230));

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/excluir - .png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(102, 102, 102));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(102, 102, 102));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNovo.setForeground(new java.awt.Color(102, 102, 102));
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/add.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnConsultar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/analise.png"))); // NOI18N
        btnConsultar.setText("Analise");
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(102, 102, 102));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnBotoesLayout = new javax.swing.GroupLayout(pnBotoes);
        pnBotoes.setLayout(pnBotoesLayout);
        pnBotoesLayout.setHorizontalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabPnCadastro.setBackground(new java.awt.Color(230, 230, 230));
        tabPnCadastro.setForeground(new java.awt.Color(102, 102, 102));
        tabPnCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pnPrincipal.setBackground(new java.awt.Color(230, 230, 230));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Nome/Razão social:");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(102, 102, 102));

        txtNomeFantasia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNomeFantasia.setForeground(new java.awt.Color(102, 102, 102));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Numero:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CEP:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Logradouro:");

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(102, 102, 102));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Celular:");

        txtLogradouro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLogradouro.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Código:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Telefone:");

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Bairro:");

        txtBairro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(102, 102, 102));
        txtBairro.setMinimumSize(new java.awt.Dimension(6, 21));

        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Cidade:");

        txtCidade.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(102, 102, 102));

        combUf.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        combUf.setForeground(new java.awt.Color(102, 102, 102));
        combUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("UF:");

        txtComplemento.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtComplemento.setForeground(new java.awt.Color(102, 102, 102));

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Complemento:");

        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("CPF:");

        combPessoa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        combPessoa.setForeground(new java.awt.Color(102, 102, 102));
        combPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Fisíca", "Juridíca" }));

        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Pessoa:");

        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Situação:");

        combStatus.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        combStatus.setForeground(new java.awt.Color(102, 102, 102));
        combStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Ativo", "Inativo" }));

        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Referência:");

        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Nome Fantasia:");

        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(102, 102, 102));

        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("CNPJ:");

        txtCpf.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCnpj.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtCelular.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTelefone.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtReferencia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtReferencia.setForeground(new java.awt.Color(102, 102, 102));
        txtReferencia.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtIbge.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtIbge.setForeground(new java.awt.Color(102, 102, 102));

        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Código IBGE:");

        btnPesquisaRapida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPesquisaRapida.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisaRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesquisaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaRapidaActionPerformed(evt);
            }
        });

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCep.setForeground(new java.awt.Color(102, 102, 102));
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCepKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Data Cadastro:");

        jDateChooser1.setBackground(new java.awt.Color(108, 122, 137));
        jDateChooser1.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReferencia)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10)
                            .addComponent(txtBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                            .addComponent(txtCep))
                        .addGap(10, 10, 10)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(txtIbge))))
                        .addGap(10, 10, 10)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(63, 63, 63)
                                        .addComponent(jLabel12)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(combUf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18)
                            .addComponent(jLabel3)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                            .addComponent(txtNomeFantasia)
                            .addComponent(txtNome))
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14)
                                    .addComponent(txtCelular))
                                .addGap(10, 10, 10)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCnpj)
                                    .addComponent(txtTelefone)
                                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel9))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnPesquisaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(10, 10, 10)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addComponent(combPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(336, 336, 336))
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(456, 456, 456)))
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(110, 110, 110))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel15)
                        .addComponent(jLabel2))
                    .addComponent(jLabel8))
                .addGap(0, 0, 0)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo)
                    .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18)
                        .addGap(0, 0, 0)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(0, 0, 0)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addGap(0, 0, 0)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addGap(0, 0, 0)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(0, 0, 0)
                        .addComponent(txtIbge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addGap(0, 0, 0)
                .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        tabPnCadastro.addTab("Principal", pnPrincipal);

        pnComplemento.setBackground(new java.awt.Color(230, 230, 230));

        txtPesquisar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisar.setText("Localizar");
        btnPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Nome:");

        tabelaClientes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(102, 102, 102));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Status", "Pessoa", "Nome/Razão Social", "Nome Fantazia", "CPF", "CNPJ", "Email", "Logradouro", "Bairro", "Cidade", "UF", "Complemento", "Numero", "Referência", "Telefone", "Celular", "CEP", "IBGE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);
        if (tabelaClientes.getColumnModel().getColumnCount() > 0) {
            tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(1).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(2).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(3).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(4).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(5).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(6).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(7).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(8).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(9).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(10).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(11).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(12).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(13).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(14).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(15).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(16).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(17).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(18).setResizable(false);
        }

        javax.swing.GroupLayout pnComplementoLayout = new javax.swing.GroupLayout(pnComplemento);
        pnComplemento.setLayout(pnComplementoLayout);
        pnComplementoLayout.setHorizontalGroup(
            pnComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComplementoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(btnPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnComplementoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnComplementoLayout.setVerticalGroup(
            pnComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComplementoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(0, 0, 0)
                .addGroup(pnComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(pnComplementoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComplementoLayout.createSequentialGroup()
                    .addContainerGap(71, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        tabPnCadastro.addTab("Consulta", pnComplemento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tabPnCadastro)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
     public void buscarCep(String cep) 
    {
        ViaCEP viaCep = new ViaCEP();

        try {
            viaCep.buscar(txtCep.getText());
            txtLogradouro.setText(viaCep.getLogradouro());
            txtBairro.setText(viaCep.getBairro());
            txtCidade.setText(viaCep.getLocalidade());
            txtIbge.setText(viaCep.getIbge());
            txtComplemento.setText(viaCep.getComplemento());
            combUf.setSelectedItem(viaCep.getUf());
            
            
        } catch (ViaCEPException erro) {
            JOptionPane.showMessageDialog(null, " Ops, CEP não localizado!\n " + erro);
        }
    }
     
     public static frmCliente getInstace(){
    
        if(frmC==null){
            frmC = new frmCliente();
        }
        return frmC;
    }
    
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        
        new Utilitarios().LimpaTela(pnPrincipal);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        
        try {
            Pessoa obj = new Pessoa();
            
            obj.setStatus(combStatus.getSelectedItem().toString());
            obj.setPessoa(combPessoa.getSelectedItem().toString());
            obj.setNome(txtNomeFantasia.getText());
            obj.setNomefantasia(txtNome.getText());
            obj.setCpf(txtCpf.getText());
            obj.setCnpj(txtCnpj.getText());
            obj.setEmail(txtEmail.getText());
            obj.setLogradouro(txtLogradouro.getText());
            obj.setBairro(txtBairro.getText());
            obj.setCidade(txtCidade.getText());
            obj.setUf(combUf.getSelectedItem().toString());
            obj.setComplemento(txtComplemento.getText());
            obj.setNumero(Integer.parseInt(txtNumero.getText()));
            obj.setReferencia(txtReferencia.getText());
            obj.setTelefone(txtTelefone.getText());
            obj.setCelular(txtCelular.getText());
            obj.setCep(txtCep.getText());
            obj.setIbge(txtIbge.getText());
            
            ClientesDAO dao = new ClientesDAO();
            dao.inserirCliente(obj);
            
            new Utilitarios().LimpaTela(pnPrincipal);
            
            
            
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void ListarClientes(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ListarClientes
        
        listar();
    }//GEN-LAST:event_ListarClientes

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
        
        if (evt.getClickCount() == 2) {
        
            tabPnCadastro.setSelectedIndex(0);
        
        txtCodigo.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 0).toString());
        combStatus.setSelectedItem(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 1).toString());
        combPessoa.setSelectedItem(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 2).toString());
        txtNomeFantasia.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 3).toString());
        txtNome.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 4).toString());
        txtCpf.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 5).toString());
        txtCnpj.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 6).toString());
        txtEmail.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 7).toString());
        txtLogradouro.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 8).toString());
        txtBairro.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 9).toString());
        txtCidade.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 10).toString());
        combUf.setSelectedItem(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 11).toString());
        txtComplemento.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 12).toString());
        txtNumero.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 13).toString());
        txtReferencia.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 14).toString());
        txtTelefone.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 15).toString());
        txtCelular.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 16).toString());
        txtCep.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 17).toString());
        txtIbge.setText(tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 18).toString());
            
        }     
       
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        
        try {
            Pessoa obj = new Pessoa();
            
            obj.setStatus(combStatus.getSelectedItem().toString());
            obj.setPessoa(combPessoa.getSelectedItem().toString());
            obj.setNome(txtNomeFantasia.getText());
            obj.setNomefantasia(txtNome.getText());
            obj.setCpf(txtCpf.getText());
            obj.setCnpj(txtCnpj.getText());
            obj.setEmail(txtEmail.getText());
            obj.setLogradouro(txtLogradouro.getText());
            obj.setBairro(txtBairro.getText());
            obj.setCidade(txtCidade.getText());
            obj.setUf(combUf.getSelectedItem().toString());
            obj.setComplemento(txtComplemento.getText());
            obj.setNumero(Integer.parseInt(txtNumero.getText()));
            obj.setReferencia(txtReferencia.getText());
            obj.setTelefone(txtTelefone.getText());
            obj.setCelular(txtCelular.getText());
            obj.setCep(txtCep.getText());
            obj.setIbge(txtIbge.getText());
            
            obj.setId(Integer.parseInt(txtCodigo.getText()));
            
            ClientesDAO dao = new ClientesDAO();
            dao.alterarCliente(obj);
            
            new Utilitarios().LimpaTela(pnPrincipal);
            
            
            
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        try {
            Pessoa obj = new Pessoa();
            
            obj.setId(Integer.parseInt(txtCodigo.getText()));
            
            ClientesDAO dao = new ClientesDAO();
            dao.excluirCliente(obj);
            
            new Utilitarios().LimpaTela(pnPrincipal);
  
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        String nome ="%" + txtPesquisar.getText() + "%";
        
        ClientesDAO dao = new ClientesDAO();
        List<Pessoa> lista =  dao.buscarClientePorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaClientes.getModel();
        dados.setNumRows(0);
        
        lista.forEach((pessoa) -> {
            dados.addRow(new Object[]{
                
                pessoa.getId(),
                pessoa.getStatus(),
                pessoa.getPessoa(),
                pessoa.getNome(),
                pessoa.getNomefantasia(),
                pessoa.getCpf(),
                pessoa.getCnpj(),
                pessoa.getEmail(),
                pessoa.getLogradouro(),
                pessoa.getBairro(),
                pessoa.getCidade(),
                pessoa.getUf(),
                pessoa.getComplemento(),
                pessoa.getNumero(),
                pessoa.getReferencia(),
                pessoa.getTelefone(),
                pessoa.getCelular(),
                pessoa.getCep(),
                pessoa.getIbge()
            });
        });
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        // TODO add your handling code here:
        String nome ="%" + txtPesquisar.getText() + "%";
        
        ClientesDAO dao = new ClientesDAO();
        List<Pessoa> lista =  dao.buscarClientePorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaClientes.getModel();
        dados.setNumRows(0);
        
        lista.forEach((pessoa) -> {
            dados.addRow(new Object[]{
                
                pessoa.getId(),
                pessoa.getStatus(),
                pessoa.getPessoa(),
                pessoa.getNome(),
                pessoa.getNomefantasia(),
                pessoa.getCpf(),
                pessoa.getCnpj(),
                pessoa.getEmail(),
                pessoa.getLogradouro(),
                pessoa.getBairro(),
                pessoa.getCidade(),
                pessoa.getUf(),
                pessoa.getComplemento(),
                pessoa.getNumero(),
                pessoa.getReferencia(),
                pessoa.getTelefone(),
                pessoa.getCelular(),
                pessoa.getCep(),
                pessoa.getIbge()
            });
        });
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void btnPesquisaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaRapidaActionPerformed
        // TODO add your handling code here:
        
            
            String nome = txtNomeFantasia.getText();
            Pessoa obj = new Pessoa();
            ClientesDAO dao = new ClientesDAO();
            
            obj = dao.consultarPorNome(nome);
            
            if(obj.getNome() != null){
            
            txtCodigo.setText(String.valueOf(obj.getId()));
            combStatus.setSelectedItem(obj.getStatus());
            combPessoa.setSelectedItem(obj.getPessoa());
            txtNomeFantasia.setText(obj.getNome());
            txtNome.setText(obj.getNomefantasia());
            txtCpf.setText(obj.getCpf());
            txtCnpj.setText(obj.getCnpj());
            txtEmail.setText(obj.getEmail());
            txtLogradouro.setText(obj.getLogradouro());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            combUf.setSelectedItem(obj.getUf());
            txtComplemento.setText(obj.getComplemento());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            txtReferencia.setText(obj.getReferencia());
            txtTelefone.setText(obj.getTelefone());
            txtCelular.setText(obj.getCelular());
            txtCep.setText(obj.getCep());
            txtIbge.setText(obj.getIbge());
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado! ");
            }
            
       
    }//GEN-LAST:event_btnPesquisaRapidaActionPerformed

    private void txtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyReleased
      
           txtLogradouro.setText("Localizando Endereço...");
           if (txtCep.getText().length() == 8)
            {
                buscarCep(txtCep.getText());    
            }
    }//GEN-LAST:event_txtCepKeyReleased

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmCliente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisaRapida;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> combPessoa;
    private javax.swing.JComboBox<String> combStatus;
    private javax.swing.JComboBox<String> combUf;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFormCadastroCliente;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnComplemento;
    private javax.swing.JPanel pnForm;
    private javax.swing.JPanel pnPrincipal;
    public javax.swing.JTabbedPane tabPnCadastro;
    public javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIbge;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisar;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
