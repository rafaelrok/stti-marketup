
package br.com.marketup.views;

import javax.swing.JOptionPane;
import br.com.marketup.dao.ClientesDAO;
import br.com.marketup.dao.FormadepagamentoDAO;
import br.com.marketup.dao.FuncionariosDAO;
import br.com.marketup.dao.ProdutoDAO;
import br.com.marketup.nogocio.Formadepagamento;
import br.com.marketup.nogocio.Funcionario;
import br.com.marketup.nogocio.Pessoa;
import br.com.marketup.nogocio.Produto;
import br.com.marketup.recursos.Data;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *v 
 * @author rafae
 */
public class frmVendaRapida extends javax.swing.JFrame {
    
    //Objetos de instancia
            ClientesDAO dao = new ClientesDAO();
            FuncionariosDAO daoF = new FuncionariosDAO();
            Pessoa obj = new Pessoa();
            Funcionario objF = new Funcionario();
            NumberFormat nFormat = new DecimalFormat("#,###.00");
            frmConfirmaPagamento frmCp = frmConfirmaPagamento.getInstace();          
            
    //Variaveis instaciadas de jframe        
            private static frmVendaRapida frmVr;
            
    //Variaveis declaradas
            Data hora;
            String cliente, vendedor, status, formaPgVenda, tipoPagamento;
            double total,preco,descItem,acrescItem,subtotal,result,resultDesc,resultAcres;
            double valorPg,valor,troco,resultItem,vlRecebimento;
            double descGeral, acrescGeral, totalFinal;
            int qtd, parcelaPagamento;
            int qtdItens = 0;
            int qtdParcela = 0;
            DefaultTableModel carrinho;
            DefaultTableModel formadepagamento;
  
    public frmVendaRapida() {
        initComponents();
        
            txtDescItem.setText("0.0");
            txtAcresItem.setText("0.0");
            txtPrecoVenda.setText("0.00");
            txtValorPg.setText("0.00");
            lblVlRecebimento.setText("0.00");
            lblVlTroco.setText("0.00");
            lblValorTotal.setText("0.00");
            txtQtdItem.setText("0");
            lblQtdItens.setText("0");
            txtAcrescGeral.setText("0");
            txtDescGeral.setText("0");          
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtCpfCliente = new javax.swing.JFormattedTextField();
        txtNmCliente = new javax.swing.JTextField();
        btnPsqCliente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnNovoCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        txtCdCliente = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        lblDtVenda = new javax.swing.JLabel();
        lblHrVenda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtCodigoProduto = new javax.swing.JTextField();
        btnPsqProduto = new javax.swing.JButton();
        txtProdutoVenda = new javax.swing.JTextField();
        txtQtdItem = new javax.swing.JTextField();
        txtDescItem = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtAcresItem = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPrecoVenda = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        btnNovoProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItensVenda = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnFVenda = new javax.swing.JButton();
        btnClVenda = new javax.swing.JButton();
        btnAddItem = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtVendedorVenda = new javax.swing.JTextField();
        btnPsVendedor = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAcrescGeral = new javax.swing.JTextField();
        txtDescGeral = new javax.swing.JTextField();
        btnExcluirvendedor = new javax.swing.JButton();
        btnNovoVendedor = new javax.swing.JButton();
        txtCdVendedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabelaPg = new javax.swing.JTable();
        combFormaPg = new javax.swing.JComboBox();
        combTipoPg = new javax.swing.JComboBox<>();
        combParcelaPg = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtValorPg = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        btnAddFormaPg = new javax.swing.JToggleButton();
        btnRemoveFormaPg = new javax.swing.JButton();
        lblQtdItens = new javax.swing.JLabel();
        lblValorTotal = new javax.swing.JLabel();
        lblVlTroco = new javax.swing.JLabel();
        lblVlRecebimento = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblStatusVenda = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblDescontoGeral = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblAcresimoGeral = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblDescGeralVl = new javax.swing.JLabel();
        lblAcresGeralVl = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnRemoverItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(225, 221, 221));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnForm.setBackground(new java.awt.Color(44, 79, 103));

        lblFormCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFormCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFormCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/vendaFacil.png"))); // NOI18N
        lblFormCadastroCliente.setText("VENDA RAPIDA");

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

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblFormCadastroCliente))
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(225, 221, 221));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtCpfCliente.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCpfCliente.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCpfCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCpfClienteKeyPressed(evt);
            }
        });

        txtNmCliente.setEditable(false);
        txtNmCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNmCliente.setForeground(new java.awt.Color(102, 102, 102));
        txtNmCliente.setEnabled(false);

        btnPsqCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPsqCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsqClienteActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Nome:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("CPF:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Data e hora:");

        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/addcinza2.png"))); // NOI18N
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lixeira.png"))); // NOI18N
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        txtCdCliente.setEditable(false);
        txtCdCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCdCliente.setForeground(new java.awt.Color(102, 102, 102));
        txtCdCliente.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCdCliente.setEnabled(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Código:");

        lblDtVenda.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblDtVenda.setForeground(new java.awt.Color(102, 102, 102));
        lblDtVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDtVenda.setText("00/00/0000");

        lblHrVenda.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblHrVenda.setForeground(new java.awt.Color(102, 102, 102));
        lblHrVenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHrVenda.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNmCliente)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnPsqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDtVenda)
                                .addGap(5, 5, 5)
                                .addComponent(lblHrVenda)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnPsqCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDtVenda)
                                .addComponent(lblHrVenda))
                            .addComponent(btnExcluirCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel21))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCdCliente)
                    .addComponent(txtNmCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        txtCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCodigoProduto.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigoProduto.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoProdutoKeyPressed(evt);
            }
        });

        btnPsqProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPsqProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsqProdutoActionPerformed(evt);
            }
        });

        txtProdutoVenda.setEditable(false);
        txtProdutoVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtProdutoVenda.setForeground(new java.awt.Color(102, 102, 102));
        txtProdutoVenda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtProdutoVenda.setEnabled(false);

        txtQtdItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQtdItem.setForeground(new java.awt.Color(102, 102, 102));
        txtQtdItem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtQtdItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtQtdItemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdItemFocusLost(evt);
            }
        });

        txtDescItem.setForeground(new java.awt.Color(102, 102, 102));
        txtDescItem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDescItem.setCaretColor(new java.awt.Color(102, 102, 102));
        txtDescItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDescItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescItemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescItemFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Acrescimo item:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Código:");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Produto:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Quantidade:");

        txtAcresItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAcresItem.setForeground(new java.awt.Color(102, 102, 102));
        txtAcresItem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAcresItem.setEnabled(false);
        txtAcresItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAcresItemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcresItemFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Desconto item:");

        txtPrecoVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrecoVenda.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecoVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusLost(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Preco Venda:");

        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/addcinza2.png"))); // NOI18N
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lixeira.png"))); // NOI18N
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtProdutoVenda)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescItem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAcresItem, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPrecoVenda)
                                .addGap(5, 5, 5))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnPsqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel10)
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPsqProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addGap(0, 0, 0)
                .addComponent(txtProdutoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel9)
                        .addComponent(jLabel19))
                    .addComponent(jLabel12))
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtQtdItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAcresItem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );

        tblItensVenda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tblItensVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblItensVenda.setForeground(new java.awt.Color(102, 102, 102));
        tblItensVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Quantidade", "Preço", "Desconto", "Acrescimo", "Subtotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblItensVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblItensVenda.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tblItensVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblItensVenda);
        if (tblItensVenda.getColumnModel().getColumnCount() > 0) {
            tblItensVenda.getColumnModel().getColumn(0).setResizable(false);
            tblItensVenda.getColumnModel().getColumn(1).setResizable(false);
            tblItensVenda.getColumnModel().getColumn(2).setResizable(false);
            tblItensVenda.getColumnModel().getColumn(3).setResizable(false);
            tblItensVenda.getColumnModel().getColumn(4).setResizable(false);
            tblItensVenda.getColumnModel().getColumn(5).setResizable(false);
            tblItensVenda.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Produto:");

        btnFVenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFVenda.setForeground(new java.awt.Color(102, 102, 102));
        btnFVenda.setText("(F9)-FINALIZAR");
        btnFVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFVendaActionPerformed(evt);
            }
        });

        btnClVenda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClVenda.setForeground(new java.awt.Color(102, 102, 102));
        btnClVenda.setText("(ESC)-CANCELAR");
        btnClVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClVendaActionPerformed(evt);
            }
        });

        btnAddItem.setBackground(new java.awt.Color(255, 255, 255));
        btnAddItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddItem.setForeground(new java.awt.Color(102, 102, 102));
        btnAddItem.setText("ADICIONAR ITEM");
        btnAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddItemActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(84, 122, 141));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Troco:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Valor Recebido:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Valor Total:");

        txtVendedorVenda.setBackground(new java.awt.Color(84, 122, 141));
        txtVendedorVenda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtVendedorVenda.setForeground(new java.awt.Color(255, 255, 255));
        txtVendedorVenda.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtVendedorVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtVendedorVendaKeyPressed(evt);
            }
        });

        btnPsVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPsVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPsVendedorActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Itens:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Desconto Geral:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Acréscimo Geral:");

        txtAcrescGeral.setBackground(new java.awt.Color(84, 122, 141));
        txtAcrescGeral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAcrescGeral.setForeground(new java.awt.Color(255, 255, 255));
        txtAcrescGeral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAcrescGeral.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtAcrescGeral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAcrescGeralFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcrescGeralFocusLost(evt);
            }
        });
        txtAcrescGeral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAcrescGeralKeyReleased(evt);
            }
        });

        txtDescGeral.setBackground(new java.awt.Color(84, 122, 141));
        txtDescGeral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDescGeral.setForeground(new java.awt.Color(255, 255, 255));
        txtDescGeral.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDescGeral.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtDescGeral.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescGeralFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescGeralFocusLost(evt);
            }
        });
        txtDescGeral.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescGeralKeyReleased(evt);
            }
        });

        btnExcluirvendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lixeira.png"))); // NOI18N
        btnExcluirvendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirvendedorActionPerformed(evt);
            }
        });

        btnNovoVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/addcinza2.png"))); // NOI18N

        txtCdVendedor.setBackground(new java.awt.Color(84, 122, 141));
        txtCdVendedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCdVendedor.setForeground(new java.awt.Color(255, 255, 255));
        txtCdVendedor.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtCdVendedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCdVendedorKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vendedor:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Código:");

        tabelaPg.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tabelaPg.setForeground(new java.awt.Color(102, 102, 102));
        tabelaPg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pagamento", "Tipo", "Parcela", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPg.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabelaPg.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tabelaPg.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tabelaPg);
        if (tabelaPg.getColumnModel().getColumnCount() > 0) {
            tabelaPg.getColumnModel().getColumn(0).setResizable(false);
            tabelaPg.getColumnModel().getColumn(1).setResizable(false);
            tabelaPg.getColumnModel().getColumn(2).setResizable(false);
            tabelaPg.getColumnModel().getColumn(3).setResizable(false);
        }

        combFormaPg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combFormaPg.setForeground(new java.awt.Color(102, 102, 102));
        combFormaPg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        combFormaPg.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                combFormaPgAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        combTipoPg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combTipoPg.setForeground(new java.awt.Color(102, 102, 102));
        combTipoPg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Á VISTA", "PARCELADO", "TRANSFERÊNCIA" }));

        combParcelaPg.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        combParcelaPg.setForeground(new java.awt.Color(102, 102, 102));
        combParcelaPg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Forma de pagamento:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tipo:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Parcelas:");

        txtValorPg.setBackground(new java.awt.Color(84, 122, 141));
        txtValorPg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtValorPg.setForeground(new java.awt.Color(255, 255, 255));
        txtValorPg.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorPg.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtValorPg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtValorPgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorPgFocusLost(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Valor:");

        btnAddFormaPg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAddFormaPg.setForeground(new java.awt.Color(102, 102, 102));
        btnAddFormaPg.setText("ADICONAR");
        btnAddFormaPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFormaPgActionPerformed(evt);
            }
        });

        btnRemoveFormaPg.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoveFormaPg.setForeground(new java.awt.Color(102, 102, 102));
        btnRemoveFormaPg.setText("REMOVER");

        lblQtdItens.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblQtdItens.setForeground(new java.awt.Color(255, 255, 255));
        lblQtdItens.setText("0");

        lblValorTotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblValorTotal.setText("0.00");

        lblVlTroco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVlTroco.setForeground(new java.awt.Color(255, 255, 255));
        lblVlTroco.setText("0.00");

        lblVlRecebimento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVlRecebimento.setForeground(new java.awt.Color(255, 255, 255));
        lblVlRecebimento.setText("0.00");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Situação da venda:");

        lblStatusVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatusVenda.setForeground(new java.awt.Color(255, 255, 255));
        lblStatusVenda.setText("ABERTO");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Desconto:");

        lblDescontoGeral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescontoGeral.setForeground(new java.awt.Color(255, 255, 255));
        lblDescontoGeral.setText("0");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Acréscimo:");

        lblAcresimoGeral.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAcresimoGeral.setForeground(new java.awt.Color(255, 255, 255));
        lblAcresimoGeral.setText("0");

        lblA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblA.setForeground(new java.awt.Color(255, 255, 255));
        lblA.setText("Valor Acréscimo:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Valor Desconto:");

        lblDescGeralVl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDescGeralVl.setForeground(new java.awt.Color(255, 255, 255));
        lblDescGeralVl.setText("0.00");

        lblAcresGeralVl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAcresGeralVl.setForeground(new java.awt.Color(255, 255, 255));
        lblAcresGeralVl.setText("0.00");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("%");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("%");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator6)
            .addComponent(jSeparator3)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtAcrescGeral, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(txtDescGeral))
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(lblQtdItens)
                                .addContainerGap())))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(txtCdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(txtVendedorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(btnNovoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnPsVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnExcluirvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatusVenda)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(combFormaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(combTipoPg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(combParcelaPg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel23)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(btnAddFormaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(btnRemoveFormaPg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblValorTotal)
                                .addGap(7, 7, 7))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel25)
                                .addComponent(txtValorPg, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel5)
                                    .addComponent(lblA)
                                    .addComponent(jLabel27))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                            .addComponent(lblAcresimoGeral)
                                            .addGap(0, 0, 0)
                                            .addComponent(jLabel31))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblVlRecebimento, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblVlTroco, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDescGeralVl, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAcresGeralVl, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addComponent(lblDescontoGeral)
                                        .addGap(0, 0, 0)
                                        .addComponent(jLabel32)))
                                .addGap(5, 5, 5)))))
                .addGap(5, 5, 5))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(lblStatusVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel4))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCdVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtVendedorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPsVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lblQtdItens))
                .addGap(8, 8, 8)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(txtAcrescGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(25, 25, 25)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addGap(0, 0, 0)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combFormaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combTipoPg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combParcelaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addGap(0, 0, 0)
                .addComponent(txtValorPg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAddFormaPg)
                    .addComponent(btnRemoveFormaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblVlRecebimento))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescontoGeral)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lblDescGeralVl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblAcresimoGeral)
                    .addComponent(jLabel31))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblA)
                    .addComponent(lblAcresGeralVl))
                .addGap(5, 5, 5)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblVlTroco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorTotal)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRemoverItem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverItem.setForeground(new java.awt.Color(102, 102, 102));
        btnRemoverItem.setText("REMOVER ITEM");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnFVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddItem)
                            .addComponent(btnRemoverItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClVenda, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static frmVendaRapida getInstace(){
    
        if(frmVr==null){
            frmVr = new frmVendaRapida();
        }
        return frmVr;
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        // Carregar data e hora atual do sistema 
            Date dtAtual = new Date();
            SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dtFormatada = dtFormat.format(dtAtual);
            lblDtVenda.setText(dtFormatada);
            
            Date hrAtual = new Date();
            SimpleDateFormat hrFormat = new SimpleDateFormat("HH:mm:ss");
            String hrFormatada = hrFormat.format(hrAtual);
            lblHrVenda.setText(hrFormatada);
        
    }//GEN-LAST:event_formWindowActivated
  
    private void txtCpfClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfClienteKeyPressed
        // Busca cliente por CPF
            if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            obj = dao.consultarPorCpf(txtCpfCliente.getText());
            txtNmCliente.setText(obj.getNome());
            txtCdCliente.setText(String.valueOf(obj.getId()));
            txtCpfCliente.setEnabled(true);
            
             }
    }//GEN-LAST:event_txtCpfClienteKeyPressed

    private void btnPsqClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsqClienteActionPerformed
                   
            obj = dao.consultarPorCpf(txtCpfCliente.getText());
            txtNmCliente.setText(obj.getNome());
            txtCpfCliente.setEnabled(true);
    }//GEN-LAST:event_btnPsqClienteActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        
            frmCliente frmC =  new frmCliente();
            frmC.setVisible(true);
        
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
       
            JOptionPane.showConfirmDialog(null, "Deseja limpar os dados ? \n");
            txtNmCliente.setText(null);
            txtNmCliente.setEditable(false);
            txtNmCliente.setEnabled(false);
            txtCpfCliente.setText(null);
            txtCpfCliente.setEnabled(true);
       
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        
        frmProduto frmP = new frmProduto();
        frmP.setVisible(true);
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        
        JOptionPane.showConfirmDialog(null, "Deseja limpar os dados ? \n");
        txtCodigoProduto.setText(null);
        txtProdutoVenda.setText(null);
        txtQtdItem.setText(null);
        txtDescItem.setText(null);
        txtAcresItem.setText(null);       
        
        txtProdutoVenda.setEnabled(true);
        txtQtdItem.setEnabled(true);
        txtDescItem.setEnabled(true);
        txtAcresItem.setEnabled(true);
        
        
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProdutoKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            Produto objP = new Produto();
            ProdutoDAO daoP = new ProdutoDAO();
            
            objP = daoP.consultaPorCodigo(String.valueOf(txtCodigoProduto.getText()));
            
            txtProdutoVenda.setText(objP.getDescricao());
            txtPrecoVenda.setText(String.valueOf(objP.getPrecovenda()));
            txtPrecoVenda.setEditable(false);
            txtPrecoVenda.setEnabled(false);
            txtProdutoVenda.setEnabled(false);
            txtProdutoVenda.setEditable(false);
        }
    }//GEN-LAST:event_txtCodigoProdutoKeyPressed

    private void btnPsqProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsqProdutoActionPerformed
       Produto objP = new Produto();
            ProdutoDAO daoP = new ProdutoDAO();
            
            objP = daoP.consultaPorCodigo(String.valueOf(txtCodigoProduto.getText()));
            
            txtProdutoVenda.setText(objP.getDescricao());
            txtPrecoVenda.setText(String.valueOf(objP.getPrecovenda()));
            txtPrecoVenda.setEditable(false);
            txtPrecoVenda.setEnabled(false);
            txtProdutoVenda.setEnabled(false);
            txtProdutoVenda.setEditable(false);
        
    }//GEN-LAST:event_btnPsqProdutoActionPerformed

    private void txtCdVendedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCdVendedorKeyPressed
        
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            objF = daoF.consultarPorCodigo(String.valueOf(txtCdVendedor.getText()));
            
            txtVendedorVenda.setText(objF.getNomecurto());
           
            txtVendedorVenda.setEditable(false);
            txtVendedorVenda.setEnabled(false);
            txtCdVendedor.setEnabled(false);
            txtCdVendedor.setEditable(false);
            
        }
    }//GEN-LAST:event_txtCdVendedorKeyPressed

    private void btnExcluirvendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirvendedorActionPerformed
        JOptionPane.showConfirmDialog(null, "Deseja limpar os dados ? \n");
            txtCdVendedor.setText(null);
            txtVendedorVenda.setText(null);
        
            txtVendedorVenda.setEditable(true);
            txtVendedorVenda.setEnabled(true);
            txtCdVendedor.setEnabled(true);
            txtCdVendedor.setEditable(true);     
        
    }//GEN-LAST:event_btnExcluirvendedorActionPerformed

    private void txtVendedorVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVendedorVendaKeyPressed
        if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            
            objF = daoF.consultarPorNomeCurto(txtVendedorVenda.getText());
                  
            txtCdVendedor.setText(String.valueOf(obj.getId()));
           
            txtVendedorVenda.setEditable(false);
            txtVendedorVenda.setEnabled(false);
            txtCdVendedor.setEnabled(false);
            txtCdVendedor.setEditable(false);
            
        }
    }//GEN-LAST:event_txtVendedorVendaKeyPressed

    private void btnPsVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPsVendedorActionPerformed
      
            objF = daoF.consultarPorNomeCurto(txtVendedorVenda.getText());
            objF = daoF.consultarPorCodigo(String.valueOf(txtCdVendedor.getText()));
            
            txtVendedorVenda.setText(obj.getNome());
            txtCdVendedor.setText(String.valueOf(obj.getId()));
           
            txtVendedorVenda.setEditable(false);
            txtVendedorVenda.setEnabled(false);
            txtCdVendedor.setEnabled(false);
            txtCdVendedor.setEditable(false);
    }//GEN-LAST:event_btnPsVendedorActionPerformed

    private void btnAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddItemActionPerformed
       
            qtd = Integer.parseInt(txtQtdItem.getText());
            preco = Double.parseDouble(txtPrecoVenda.getText());
            descItem = Double.parseDouble(txtDescItem.getText());
            //acrescItem = Double.parseDouble(txtAcresItem.getText());
            subtotal = qtd * preco - ((preco*descItem)/100);
            //subtotal = qtd * preco + ((preco*acrescItem)/100);

            qtdItens += qtd;
            total += subtotal;
            lblValorTotal.setText(String.valueOf(total)); 
            lblValorTotal.setText(new DecimalFormat("#,##0.00").format(total)); 
            lblQtdItens.setText(String.valueOf(qtdItens));

            carrinho = (DefaultTableModel)tblItensVenda.getModel();
            carrinho.addRow(new Object[]{
            txtCodigoProduto.getText(),
            txtProdutoVenda.getText(),
            txtQtdItem.getText(),
            txtPrecoVenda.getText(),
            txtDescItem.getText(),
            txtAcresItem.getText(),
            subtotal        
            });
        
            txtCodigoProduto.setText(null);
            txtProdutoVenda.setText(null);
            txtQtdItem.setText(null);
            txtPrecoVenda.setText(null);
            txtDescItem.setText(null);
            txtAcresItem.setText(null);
            txtDescItem.setText("0.00");
            txtAcresItem.setText("0.00");
            txtPrecoVenda.setText("0.00");
            txtQtdItem.setText("0");
    
    }//GEN-LAST:event_btnAddItemActionPerformed

    private void btnFVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFVendaActionPerformed

        cliente = String.valueOf(txtNmCliente.getText());
        vendedor = String.valueOf(txtVendedorVenda.getText());
        status = String.valueOf(lblStatusVenda.getText());
        formaPgVenda = String.valueOf(formadepagamento.getValueAt(0,0));
        tipoPagamento = String.valueOf(formadepagamento.getValueAt(0,1));
        parcelaPagamento = Integer.parseInt(formadepagamento.getValueAt(0,2).toString());
        vlRecebimento = Double.parseDouble(formadepagamento.getValueAt(0,3).toString());
        
        frmCp.lblValorFinal.setText(new DecimalFormat("#,##0.00").format(result));
        frmCp.lblTrocoFinal.setText(new DecimalFormat("#,##0.00").format(troco));
        frmCp.lblDescFinal.setText(new DecimalFormat("#,##0.00").format(resultDesc));
        frmCp.lblAcresFinal.setText(new DecimalFormat("#,##0.00").format(resultAcres));
        frmCp.lblNomeCliente.setText(cliente);
        frmCp.lblVendedor.setText(vendedor);
        frmCp.lblStatus.setText(status);
        frmCp.lblFormaPg.setText(formaPgVenda);
        frmCp.lblTipoPg.setText(tipoPagamento);
        frmCp.lblParcelaPg.setText(String.valueOf(parcelaPagamento));
        frmCp.lblValorPago.setText(new DecimalFormat("#,##0.00").format(vlRecebimento));
        frmCp.pessoa = obj;
        frmCp.funcionario = objF;
        frmCp.carrinho = carrinho;
        frmCp.setVisible(true);
        //this.dispose();
        
    }//GEN-LAST:event_btnFVendaActionPerformed

    private void txtDescGeralKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescGeralKeyReleased
        
        try {
            descGeral = nFormat.parse(txtDescGeral.getText()).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //descGeral = Double.parseDouble(txtDescGeral.getText());
        result = total - (total*descGeral)/100;
        resultDesc = (total*descGeral)/100;
        //troco = result - resultDesc;
        lblDescontoGeral.setText(String.valueOf(descGeral));
        lblDescGeralVl.setText(String.valueOf(resultDesc));
        lblDescGeralVl.setText(new DecimalFormat("#,##0.00").format(resultDesc));
        lblValorTotal.setText(String.valueOf(result));
        lblValorTotal.setText(new DecimalFormat("#,##0.00").format(result));
  
    }//GEN-LAST:event_txtDescGeralKeyReleased

    private void btnAddFormaPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFormaPgActionPerformed
      
            qtdParcela = Integer.parseInt(combParcelaPg.getSelectedItem().toString());
            try {
            totalFinal = nFormat.parse(lblValorTotal.getText()).doubleValue();
            } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
            //totalFinal = Double.parseDouble(lblValorTotal.getText());
            try {
            valorPg = nFormat.parse(txtValorPg.getText()).doubleValue();
            } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
            }
            //valorPg = Double.parseDouble(txtValorPg.getText());
            
            valor += valorPg;
            lblVlRecebimento.setText(String.valueOf(valor));
            lblVlRecebimento.setText(new DecimalFormat("#,##0.00").format(valor));                        
            
            troco = valor - totalFinal;
            lblVlTroco.setText(String.valueOf(troco));
            lblVlTroco.setText(new DecimalFormat("#,##0.00").format(troco));

            formadepagamento = (DefaultTableModel)tabelaPg.getModel();
            formadepagamento.addRow(new Object[]{
            combFormaPg.getSelectedItem().toString(),
            combTipoPg.getSelectedItem().toString(),
            combParcelaPg.getSelectedItem().toString(),
            txtValorPg.getText(),
            valor
            });
            
            combFormaPg.setSelectedItem(null);
            combTipoPg.setSelectedItem(null);
            combParcelaPg.setSelectedItem(null);
            txtValorPg.setText("0,00");
    }//GEN-LAST:event_btnAddFormaPgActionPerformed

    private void txtQtdItemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdItemFocusGained

            txtQtdItem.setText(""); 
    }//GEN-LAST:event_txtQtdItemFocusGained

    private void txtQtdItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdItemFocusLost
        
        if(txtQtdItem.getText().isEmpty()){
            txtQtdItem.setText("0");
        }
    }//GEN-LAST:event_txtQtdItemFocusLost

    private void txtDescItemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescItemFocusGained
        
        txtDescItem.setText("");
    }//GEN-LAST:event_txtDescItemFocusGained

    private void txtDescItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescItemFocusLost
        
         if(txtDescItem.getText().isEmpty()){
             txtDescItem.setText("0.00");
          }
    }//GEN-LAST:event_txtDescItemFocusLost

    private void txtAcresItemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcresItemFocusGained
        
        txtAcresItem.setText("");
    }//GEN-LAST:event_txtAcresItemFocusGained

    private void txtAcresItemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcresItemFocusLost
        
        if(txtAcresItem.getText().isEmpty()){
             txtAcresItem.setText("0.00");
          }
    }//GEN-LAST:event_txtAcresItemFocusLost

    private void txtPrecoVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusGained
        
        txtPrecoVenda.setText("");
    }//GEN-LAST:event_txtPrecoVendaFocusGained

    private void txtPrecoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusLost
        
        if(txtPrecoVenda.getText().isEmpty()){
             txtPrecoVenda.setText("0.00");
          }
    }//GEN-LAST:event_txtPrecoVendaFocusLost

    private void txtValorPgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPgFocusGained
        
        txtValorPg.setText("");
    }//GEN-LAST:event_txtValorPgFocusGained

    private void txtValorPgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorPgFocusLost
        
         if(txtValorPg.getText().isEmpty()){
             txtValorPg.setText("0");
          }
    }//GEN-LAST:event_txtValorPgFocusLost

    private void txtAcrescGeralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcrescGeralFocusGained
        
        txtAcrescGeral.setText("");
    }//GEN-LAST:event_txtAcrescGeralFocusGained

    private void txtAcrescGeralFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcrescGeralFocusLost
        
        if(txtAcrescGeral.getText().isEmpty()){
             txtAcrescGeral.setText("0");
          }else{
            
        }
        
    }//GEN-LAST:event_txtAcrescGeralFocusLost

    private void txtDescGeralFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescGeralFocusGained
        
        txtDescGeral.setText("");
    }//GEN-LAST:event_txtDescGeralFocusGained

    private void txtDescGeralFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescGeralFocusLost
        
         if(txtDescGeral.getText().isEmpty()){
             txtDescGeral.setText("0");
          }
    }//GEN-LAST:event_txtDescGeralFocusLost

    private void txtAcrescGeralKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcrescGeralKeyReleased
        
        try {
            acrescGeral = nFormat.parse(txtAcrescGeral.getText()).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //acrescGeral = Double.parseDouble(txtAcrescGeral.getText());
        result = total + (total*acrescGeral)/100;
        resultAcres = (total*acrescGeral)/100;
        lblAcresimoGeral.setText(String.valueOf(acrescGeral));
        lblAcresGeralVl.setText(String.valueOf(resultAcres));
        lblAcresGeralVl.setText(new DecimalFormat("#,##0.00").format(resultAcres));
        lblValorTotal.setText(String.valueOf(result));
        lblValorTotal.setText(new DecimalFormat("#,##0.00").format(result));

    }//GEN-LAST:event_txtAcrescGeralKeyReleased

    private void combFormaPgAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_combFormaPgAncestorAdded
        
        FormadepagamentoDAO daoP = new FormadepagamentoDAO();
        List<Formadepagamento> lista = daoP.listarFormadepagamento();
        combFormaPg.removeAll();
        
        lista.forEach((f) -> {
            combFormaPg.addItem(f);
        }); 
    }//GEN-LAST:event_combFormaPgAncestorAdded

    private void btnClVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClVendaActionPerformed
        
        frmVr.dispose();
    }//GEN-LAST:event_btnClVendaActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        this.dispose();

    }//GEN-LAST:event_jLabelCloseMouseClicked

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
            java.util.logging.Logger.getLogger(frmVendaRapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVendaRapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVendaRapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVendaRapida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmVendaRapida().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton btnAddFormaPg;
    public javax.swing.JButton btnAddItem;
    private javax.swing.JButton btnClVenda;
    public javax.swing.JButton btnExcluirCliente;
    public javax.swing.JButton btnExcluirProduto;
    public javax.swing.JButton btnExcluirvendedor;
    public javax.swing.JButton btnFVenda;
    public javax.swing.JButton btnNovoCliente;
    public javax.swing.JButton btnNovoProduto;
    public javax.swing.JButton btnNovoVendedor;
    public javax.swing.JButton btnPsVendedor;
    public javax.swing.JButton btnPsqCliente;
    public javax.swing.JButton btnPsqProduto;
    public javax.swing.JButton btnRemoveFormaPg;
    public javax.swing.JButton btnRemoverItem;
    public javax.swing.JComboBox combFormaPg;
    public javax.swing.JComboBox<String> combParcelaPg;
    public javax.swing.JComboBox<String> combTipoPg;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblA;
    public javax.swing.JLabel lblAcresGeralVl;
    public javax.swing.JLabel lblAcresimoGeral;
    public javax.swing.JLabel lblDescGeralVl;
    public javax.swing.JLabel lblDescontoGeral;
    public javax.swing.JLabel lblDtVenda;
    private javax.swing.JLabel lblFormCadastroCliente;
    public javax.swing.JLabel lblHrVenda;
    public javax.swing.JLabel lblQtdItens;
    public javax.swing.JLabel lblStatusVenda;
    public javax.swing.JLabel lblValorTotal;
    public javax.swing.JLabel lblVlRecebimento;
    public javax.swing.JLabel lblVlTroco;
    private javax.swing.JPanel pnForm;
    public javax.swing.JTable tabelaPg;
    public javax.swing.JTable tblItensVenda;
    public javax.swing.JTextField txtAcresItem;
    public javax.swing.JTextField txtAcrescGeral;
    public javax.swing.JTextField txtCdCliente;
    public javax.swing.JTextField txtCdVendedor;
    public javax.swing.JTextField txtCodigoProduto;
    public javax.swing.JFormattedTextField txtCpfCliente;
    public javax.swing.JTextField txtDescGeral;
    public javax.swing.JFormattedTextField txtDescItem;
    public javax.swing.JTextField txtNmCliente;
    public javax.swing.JTextField txtPrecoVenda;
    public javax.swing.JTextField txtProdutoVenda;
    public javax.swing.JTextField txtQtdItem;
    public javax.swing.JTextField txtValorPg;
    public javax.swing.JTextField txtVendedorVenda;
    // End of variables declaration//GEN-END:variables

}
