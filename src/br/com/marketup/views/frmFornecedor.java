/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marketup.views;

import br.com.marketup.dao.FornecedorDAO;
import br.com.marketup.nogocio.Fornecedor;
import br.com.marketup.recursos.Utilitarios;
import br.com.marketup.viacep.ViaCEP;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class frmFornecedor extends javax.swing.JFrame {
    
    private static frmFornecedor frmFn;

    public void Listar(){
        
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista =  dao.listarFornecedor();
        DefaultTableModel dados = (DefaultTableModel) tabFornecedor.getModel();
        dados.setNumRows(0);
        
        lista.forEach((fornecedor) -> {
            dados.addRow(new Object[]{
                
                fornecedor.getId(),
                fornecedor.getStatus(),
                fornecedor.getNome(),        
                fornecedor.getCnpj(),
                fornecedor.getEmail(),
                fornecedor.getTelefone(),
                fornecedor.getCelular(),
                fornecedor.getCep(),
                fornecedor.getLogradouro(),
                fornecedor.getNumero(),
                fornecedor.getComplemento(),
                fornecedor.getBairro(),
                fornecedor.getCidade(),
                fornecedor.getUf(),                           
                fornecedor.getIbge(),
                fornecedor.getInscestadual(),
                fornecedor.getCaracteristica(),
                fornecedor.getObservacao()
            });
        });
        
    }
    
    public frmFornecedor() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        tabPnCadastroForn = new javax.swing.JTabbedPane();
        pnCadastroForn = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        combStatus = new javax.swing.JComboBox<>();
        btnPesquisaRapida = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtInscEstadual = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtNumero = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtComp = new javax.swing.JTextField();
        combUf = new javax.swing.JComboBox<>();
        txtIbge = new javax.swing.JTextField();
        txtCaract = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();
        pnConsultaForn = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabFornecedor = new javax.swing.JTable();
        txtPesqTab = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnPesqTab = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNovoFornecedor = new javax.swing.JButton();
        btnSalvarFornecedor = new javax.swing.JButton();
        btEditarFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        btnAnaliseFornecedor = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(44, 79, 103));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/fornecedores_1.png"))); // NOI18N
        jLabel1.setText("Fornecedor");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tabPnCadastroForn.setBackground(new java.awt.Color(230, 230, 230));
        tabPnCadastroForn.setForeground(new java.awt.Color(102, 102, 102));
        tabPnCadastroForn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pnCadastroForn.setBackground(new java.awt.Color(230, 230, 230));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);

        txtCnpj.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        combStatus.setForeground(new java.awt.Color(102, 102, 102));
        combStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "ATIVO", "INATIVO" }));

        btnPesquisaRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesquisaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaRapidaActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(102, 102, 102));

        txtInscEstadual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInscEstadual.setForeground(new java.awt.Color(102, 102, 102));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));

        txtTelefone.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCelular.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(102, 102, 102));

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(102, 102, 102));

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(102, 102, 102));

        txtComp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtComp.setForeground(new java.awt.Color(102, 102, 102));

        combUf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combUf.setForeground(new java.awt.Color(102, 102, 102));
        combUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        txtIbge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIbge.setForeground(new java.awt.Color(102, 102, 102));

        txtCaract.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCaract.setForeground(new java.awt.Color(102, 102, 102));

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtObs.setForeground(new java.awt.Color(102, 102, 102));
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Status:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Razão Social:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CNPJ:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Insc.Estadual:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Email Comercial:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Telefone:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Celular Comercial:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("CEP:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Logradouro:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Numero:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("UF:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Cidade:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Bairro:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Complemento:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("IBGE:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Caracteristica:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Observação:");

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCep.setForeground(new java.awt.Color(102, 102, 102));
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCepKeyReleased(evt);
            }
        });

        txtLogradouro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLogradouro.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnCadastroFornLayout = new javax.swing.GroupLayout(pnCadastroForn);
        pnCadastroForn.setLayout(pnCadastroFornLayout);
        pnCadastroFornLayout.setHorizontalGroup(
            pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroFornLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(154, 154, 154))
                                    .addComponent(txtCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(10, 10, 10)
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5))
                            .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(116, 116, 116)
                                        .addComponent(jLabel11)))
                                .addGap(0, 597, Short.MAX_VALUE))
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel6)
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                                .addComponent(txtIbge, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                        .addGap(590, 593, Short.MAX_VALUE)
                                        .addComponent(btnPesquisaRapida)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnCadastroFornLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtEmail)
                                            .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtLogradouro)))
                                        .addGap(10, 10, 10)))
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))))
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(txtInscEstadual)))
                            .addGroup(pnCadastroFornLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(combUf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))
                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCaract, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        pnCadastroFornLayout.setVerticalGroup(
            pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroFornLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCadastroFornLayout.createSequentialGroup()
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))))
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtInscEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addGap(0, 0, 0)
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(0, 0, 0)
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combUf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)))
                    .addGroup(pnCadastroFornLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)))
                .addGap(0, 0, 0)
                .addGroup(pnCadastroFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIbge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel18)
                .addGap(1, 1, 1)
                .addComponent(txtCaract, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel19)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPnCadastroForn.addTab("Cadastro Fornecedor", pnCadastroForn);

        pnConsultaForn.setBackground(new java.awt.Color(230, 230, 230));

        tabFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        tabFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Status", "Nome", "CNPJ", "Email", "Telefone", "Celular", "CEP", "Logradouro", "Numero", "Complemento", "Bairro", "Cidade", "UF", "IBGE", "Insc.Estadual", "Caracteristica", "Observaçao"
            }
        ));
        tabFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabFornecedorMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabFornecedor);

        txtPesqTab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesqTab.setForeground(new java.awt.Color(102, 102, 102));
        txtPesqTab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesqTabKeyPressed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Pesquisar:");

        btnPesqTab.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPesqTab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesqTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqTabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnConsultaFornLayout = new javax.swing.GroupLayout(pnConsultaForn);
        pnConsultaForn.setLayout(pnConsultaFornLayout);
        pnConsultaFornLayout.setHorizontalGroup(
            pnConsultaFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaFornLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pnConsultaFornLayout.createSequentialGroup()
                        .addGroup(pnConsultaFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnConsultaFornLayout.createSequentialGroup()
                                .addComponent(txtPesqTab, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnPesqTab, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel20))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnConsultaFornLayout.setVerticalGroup(
            pnConsultaFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnConsultaFornLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnConsultaFornLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesqTab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesqTab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabPnCadastroForn.addTab("Pesquisar Fornecedor", pnConsultaForn);

        jPanel3.setBackground(new java.awt.Color(230, 230, 230));

        btnNovoFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNovoFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnNovoFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/add.png"))); // NOI18N
        btnNovoFornecedor.setText("Novo");
        btnNovoFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFornecedorActionPerformed(evt);
            }
        });

        btnSalvarFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvarFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnSalvarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/salvar.png"))); // NOI18N
        btnSalvarFornecedor.setText("Salvar");
        btnSalvarFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFornecedorActionPerformed(evt);
            }
        });

        btEditarFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btEditarFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btEditarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/editar.png"))); // NOI18N
        btEditarFornecedor.setText("Editar");
        btEditarFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEditarFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEditarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFornecedorActionPerformed(evt);
            }
        });

        btnExcluirFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcluirFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/excluir - .png"))); // NOI18N
        btnExcluirFornecedor.setText("Excluir");
        btnExcluirFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornecedorActionPerformed(evt);
            }
        });

        btnAnaliseFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAnaliseFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnAnaliseFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/analise.png"))); // NOI18N
        btnAnaliseFornecedor.setText("Analisar");
        btnAnaliseFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnaliseFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNovoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnSalvarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btEditarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnAnaliseFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovoFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnSalvarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btEditarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnExcluirFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnAnaliseFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabPnCadastroForn)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabPnCadastroForn)
                .addContainerGap())
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
            txtComp.setText(viaCep.getComplemento());
            combUf.setSelectedItem(viaCep.getUf());
            
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, " Ops, CEP não localizado!\n " + erro);
        }
    }
     
     public static frmFornecedor getInstace(){
    
        if(frmFn==null){
            frmFn = new frmFornecedor();
        }
        return frmFn;
    }
    
    private void btnSalvarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFornecedorActionPerformed

        try {
            
            Fornecedor obj = new Fornecedor();
            
            obj.setStatus(combStatus.getSelectedItem().toString());
            obj.setNome(txtNome.getText());
            obj.setCnpj(txtCnpj.getText());
            obj.setEmail(txtEmail.getText());
            obj.setTelefone(txtTelefone.getText());
            obj.setCelular(txtCelular.getText());
            obj.setCep(txtCep.getText());
            obj.setLogradouro(txtLogradouro.getText());
            obj.setNumero(Integer.parseInt(txtNumero.getText()));
            obj.setComplemento(txtComp.getText());
            obj.setBairro(txtBairro.getText());
            obj.setCidade(txtCidade.getText());
            obj.setUf(combUf.getSelectedItem().toString());
            obj.setIbge(txtIbge.getText());
            obj.setInscestadual(txtInscEstadual.getText());
            obj.setCaracteristica(txtCaract.getText());
            obj.setObservacao(txtObs.getText());
 
            FornecedorDAO dao = new FornecedorDAO();
            dao.inserirFornecedor(obj);
            
            new Utilitarios().LimpaTela(pnCadastroForn);
            
        } catch (Exception e) {
        }
 
        
    }//GEN-LAST:event_btnSalvarFornecedorActionPerformed

    private void btnNovoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFornecedorActionPerformed
        
        new Utilitarios().LimpaTela(pnCadastroForn);
    }//GEN-LAST:event_btnNovoFornecedorActionPerformed

    private void txtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyReleased
                txtLogradouro.setText("Localizando Endereço...");
                    if (txtCep.getText().length() == 8)
                    {
                       buscarCep(txtCep.getText());    
                    }
    }//GEN-LAST:event_txtCepKeyReleased

    private void btnExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedorActionPerformed
        try {
            Fornecedor obj = new Fornecedor();
            
            obj.setId(Integer.parseInt(txtCodigo.getText()));
            
            FornecedorDAO dao = new FornecedorDAO();
            dao.excluirFornecedor(obj);
            
            new Utilitarios().LimpaTela(pnCadastroForn);
  
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnExcluirFornecedorActionPerformed

    private void btEditarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFornecedorActionPerformed
        try {
            Fornecedor obj = new Fornecedor();
            
            obj.setStatus(combStatus.getSelectedItem().toString());
            obj.setNome(txtNome.getText());
            obj.setCnpj(txtCnpj.getText());
            obj.setEmail(txtEmail.getText());
            obj.setTelefone(txtTelefone.getText());
            obj.setCelular(txtCelular.getText());
            obj.setCep(txtCep.getText());
            obj.setLogradouro(txtLogradouro.getText());
            obj.setNumero(Integer.parseInt(txtNumero.getText()));
            obj.setComplemento(txtComp.getText());
            obj.setBairro(txtBairro.getText());
            obj.setCidade(txtCidade.getText());
            obj.setUf(combUf.getSelectedItem().toString());
            obj.setIbge(txtIbge.getText());
            obj.setInscestadual(txtInscEstadual.getText());
            obj.setCaracteristica(txtCaract.getText());
            obj.setObservacao(txtObs.getText());
            
            obj.setId(Integer.parseInt(txtCodigo.getText()));
            
            FornecedorDAO dao = new FornecedorDAO();
            dao.alterarFornecedor(obj);
            
            new Utilitarios().LimpaTela(pnCadastroForn);
                
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btEditarFornecedorActionPerformed

    private void tabFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFornecedorMouseClicked
       
        tabPnCadastroForn.setSelectedIndex(0);
        
        txtCodigo.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 0).toString());
        combStatus.setSelectedItem(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 1).toString());
        txtNome.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 2).toString());
        txtCnpj.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 3).toString());
        txtEmail.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 4).toString());
        txtTelefone.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 5).toString());
        txtCelular.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 6).toString());
        txtCep.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 7).toString());
        txtLogradouro.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 8).toString());
        txtNumero.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 9).toString());
        txtComp.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 10).toString());
        txtBairro.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 11).toString());
        txtCidade.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 12).toString());
        combUf.setSelectedItem(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 13).toString());
        txtIbge.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 14).toString());
        txtInscEstadual.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 15).toString());
        txtCaract.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 16).toString());
        txtObs.setText(tabFornecedor.getValueAt(tabFornecedor.getSelectedRow(), 17).toString());
  
    }//GEN-LAST:event_tabFornecedorMouseClicked

    private void btnPesquisaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaRapidaActionPerformed
        
        String nome = txtNome.getText();
            Fornecedor obj = new Fornecedor();
            FornecedorDAO dao = new FornecedorDAO();
            
            obj = dao.consultarPorNome(nome);
            
            if(obj.getNome() != null){
            
            txtCodigo.setText(String.valueOf(obj.getId()));
            combStatus.setSelectedItem(obj.getStatus());
            txtNome.setText(obj.getNomefantasia());
            txtCnpj.setText(obj.getCnpj());
            txtEmail.setText(obj.getEmail());
            txtTelefone.setText(obj.getTelefone());
            txtCelular.setText(obj.getCelular());
            txtCep.setText(obj.getCep());
            txtLogradouro.setText(obj.getLogradouro());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            txtComp.setText(obj.getComplemento());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            combUf.setSelectedItem(obj.getUf());
            txtIbge.setText(obj.getIbge());
            txtInscEstadual.setText(obj.getInscestadual());
            txtCaract.setText(obj.getCaracteristica());
            txtObs.setText(obj.getObservacao());
            
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Fornecedor não encontrado! ");
            }
    }//GEN-LAST:event_btnPesquisaRapidaActionPerformed

    private void txtPesqTabKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqTabKeyPressed
        
        String nome ="%" + txtPesqTab.getText() + "%";
        
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista =  dao.buscarFornecedorPorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabFornecedor.getModel();
        dados.setNumRows(0);
        
        lista.forEach((fornecedor) -> {
            dados.addRow(new Object[]{
                
                fornecedor.getId(),
                fornecedor.getStatus(),
                fornecedor.getNome(),        
                fornecedor.getCnpj(),
                fornecedor.getEmail(),
                fornecedor.getTelefone(),
                fornecedor.getCelular(),
                fornecedor.getCep(),
                fornecedor.getLogradouro(),
                fornecedor.getNumero(),
                fornecedor.getComplemento(),
                fornecedor.getBairro(),
                fornecedor.getCidade(),
                fornecedor.getUf(),                           
                fornecedor.getIbge(),
                fornecedor.getInscestadual(),
                fornecedor.getCaracteristica(),
                fornecedor.getObservacao()
            });
        });
    }//GEN-LAST:event_txtPesqTabKeyPressed

    private void btnPesqTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqTabActionPerformed
        
        String nome ="%" + txtPesqTab.getText() + "%";
        
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista =  dao.buscarFornecedorPorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabFornecedor.getModel();
        dados.setNumRows(0);
        
        lista.forEach((fornecedor) -> {
            dados.addRow(new Object[]{
                
                fornecedor.getId(),
                fornecedor.getStatus(),
                fornecedor.getNome(),        
                fornecedor.getCnpj(),
                fornecedor.getEmail(),
                fornecedor.getTelefone(),
                fornecedor.getCelular(),
                fornecedor.getCep(),
                fornecedor.getLogradouro(),
                fornecedor.getNumero(),
                fornecedor.getComplemento(),
                fornecedor.getBairro(),
                fornecedor.getCidade(),
                fornecedor.getUf(),                           
                fornecedor.getIbge(),
                fornecedor.getInscestadual(),
                fornecedor.getCaracteristica(),
                fornecedor.getObservacao()
            });
        });
    }//GEN-LAST:event_btnPesqTabActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Listar();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarFornecedor;
    private javax.swing.JButton btnAnaliseFornecedor;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JButton btnNovoFornecedor;
    private javax.swing.JButton btnPesqTab;
    private javax.swing.JButton btnPesquisaRapida;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarFornecedor;
    private javax.swing.JComboBox<String> combStatus;
    private javax.swing.JComboBox<String> combUf;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnCadastroForn;
    private javax.swing.JPanel pnConsultaForn;
    private javax.swing.JTable tabFornecedor;
    public javax.swing.JTabbedPane tabPnCadastroForn;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCaract;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIbge;
    private javax.swing.JTextField txtInscEstadual;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPesqTab;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
