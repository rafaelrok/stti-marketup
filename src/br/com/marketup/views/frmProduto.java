
package br.com.marketup.views;

import br.com.marketup.dao.FornecedorDAO;
import br.com.marketup.dao.ProdutoDAO;
import br.com.marketup.nogocio.Fornecedor;
import br.com.marketup.nogocio.Produto;
import br.com.marketup.recursos.Utilitarios;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rafae
 */
public class frmProduto extends javax.swing.JFrame {
    
    private static frmProduto frmP;
    String modo;
    
    public void listar(){
        
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listarProduto();
        DefaultTableModel dados = (DefaultTableModel) tabelaProduto.getModel();
        dados.setNumRows(0);
        
        lista.forEach((p) -> {
            dados.addRow(new Object[]{
                
                p.getId(),
                p.getStatus(),
                p.getDatacadastro(),
                p.getDescricao(),
                p.getGrupoproduto(),
                p.getUnidadetributada(),
                p.getFornecedor().getNome(),
                p.getObservacao(),
                p.getPrecocusto(),
                p.getPrecovenda(),
                p.getQtdestoque(),

            });
        });
    
    }
    
    public frmProduto() {
        
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        pnTitulo = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        pnButton = new javax.swing.JPanel();
        btnAnalise = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnPesquisarProdutp = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        pnPrincipal = new javax.swing.JTabbedPane();
        pnProduto = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        combStatus = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        combUnidade = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDtCadastro = new javax.swing.JLabel();
        combFornecedor = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        combGrupo = new javax.swing.JComboBox<>();
        btnPesquisaRapida = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtQtd = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecoUnitario = new javax.swing.JFormattedTextField();
        txtPrecoVenda = new javax.swing.JFormattedTextField();
        pnFiscais = new javax.swing.JPanel();
        pnConsulta = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1012, 687));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnTitulo.setBackground(new java.awt.Color(44, 79, 103));

        lblFormCadastroCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFormCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFormCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/produtoComp.png"))); // NOI18N
        lblFormCadastroCliente.setText("Produto");

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

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFormCadastroCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnButton.setBackground(new java.awt.Color(230, 230, 230));

        btnAnalise.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAnalise.setForeground(new java.awt.Color(102, 102, 102));
        btnAnalise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/analise.png"))); // NOI18N
        btnAnalise.setText("Analise");
        btnAnalise.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAnalise.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancela");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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

        btnPesquisarProdutp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPesquisarProdutp.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisarProdutp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/localizar.png"))); // NOI18N
        btnPesquisarProdutp.setText("Consulta");
        btnPesquisarProdutp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPesquisarProdutp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/excluir - .png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluir.setName(""); // NOI18N
        btnExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout pnButtonLayout = new javax.swing.GroupLayout(pnButton);
        pnButton.setLayout(pnButtonLayout);
        pnButtonLayout.setHorizontalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnalise, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisarProdutp, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnButtonLayout.setVerticalGroup(
            pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAnalise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnPesquisarProdutp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pnPrincipal.setBackground(new java.awt.Color(230, 230, 230));
        pnPrincipal.setForeground(new java.awt.Color(102, 102, 102));
        pnPrincipal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        pnProduto.setBackground(new java.awt.Color(230, 230, 230));

        jPanel7.setBackground(new java.awt.Color(230, 230, 230));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(102, 102, 102));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(102, 102, 102));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigo.setEnabled(false);

        combStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combStatus.setForeground(new java.awt.Color(102, 102, 102));
        combStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "ATIVO", "INATIVO" }));

        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtObs.setForeground(new java.awt.Color(102, 102, 102));
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        combUnidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combUnidade.setForeground(new java.awt.Color(102, 102, 102));
        combUnidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "UND", "CX", "KG", "ML", "MT" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Observação:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Grupo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Unidade:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Descrição do Produto:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Código:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Status:");

        txtDtCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDtCadastro.setForeground(new java.awt.Color(102, 102, 102));
        txtDtCadastro.setText("00/00/0000");

        combFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        combFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "  ", " " }));
        combFornecedor.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                combFornecedorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        combFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combFornecedorMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Fornecedor:");

        combGrupo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combGrupo.setForeground(new java.awt.Color(102, 102, 102));
        combGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "BEBIDAS", "LATICINIOS", "GRÃO", "MATERIA PRIMA", "MASSAS", " ", " " }));

        btnPesquisaRapida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesquisaRapida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaRapidaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Data Cadastro:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtDtCadastro)))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(txtNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnPesquisaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(combGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(combUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(combFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(329, 329, 329))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisaRapida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jPanel6.setBackground(new java.awt.Color(230, 230, 230));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true), "Preços", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(102, 102, 102));

        txtQtd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtQtd.setForeground(new java.awt.Color(102, 102, 102));
        txtQtd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Preço Unitario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Preço Venda:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Qtd.Estoque");

        txtPrecoUnitario.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecoUnitario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtPrecoUnitario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecoUnitario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecoUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoUnitarioFocusLost(evt);
            }
        });

        txtPrecoVenda.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecoVenda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPrecoVenda.setCaretColor(new java.awt.Color(102, 102, 102));
        txtPrecoVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrecoVendaFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnPrincipal.addTab("Principal", pnProduto);

        pnFiscais.setBackground(new java.awt.Color(230, 230, 230));

        javax.swing.GroupLayout pnFiscaisLayout = new javax.swing.GroupLayout(pnFiscais);
        pnFiscais.setLayout(pnFiscaisLayout);
        pnFiscaisLayout.setHorizontalGroup(
            pnFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 977, Short.MAX_VALUE)
        );
        pnFiscaisLayout.setVerticalGroup(
            pnFiscaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        pnPrincipal.addTab("Dados Fiscais", pnFiscais);

        pnConsulta.setBackground(new java.awt.Color(230, 230, 230));

        tabelaProduto.setBackground(new java.awt.Color(230, 230, 230));
        tabelaProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaProduto.setForeground(new java.awt.Color(102, 102, 102));
        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Statusl", "Nome", "Pr.Custo", "Pr.Venda", "Estoque", "Fornecedor", "Grupo", "Observação", "Unidade", "Dt.Cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProduto.setColumnSelectionAllowed(true);
        tabelaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaProdutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaProduto);
        tabelaProduto.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tabelaProduto.getColumnModel().getColumnCount() > 0) {
            tabelaProduto.getColumnModel().getColumn(0).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(1).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(2).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(3).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(4).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(5).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(6).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(7).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(8).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(9).setResizable(false);
            tabelaProduto.getColumnModel().getColumn(10).setResizable(false);
        }

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(102, 102, 102));
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Pesrquisar:");

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnConsultaLayout = new javax.swing.GroupLayout(pnConsulta);
        pnConsulta.setLayout(pnConsultaLayout);
        pnConsultaLayout.setHorizontalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 956, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnConsultaLayout.createSequentialGroup()
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel12)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnConsultaLayout.setVerticalGroup(
            pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConsultaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel12)
                .addGap(0, 0, 0)
                .addGroup(pnConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnPrincipal.addTab("Consulta", pnConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Metodo responsavel por controle da interface de usuário (fase de implementação).
    private void interfaceControl(){
        
    switch(modo){
        case "Novo":
            combStatus.setEnabled(true);
            txtDtCadastro.setEnabled(true);
            txtNome.setEnabled(true);
            combGrupo.setEnabled(true);
            combUnidade.setEnabled(true);
            combFornecedor.setEnabled(true);
            txtObs.setEnabled(true);
            txtPrecoUnitario.setEnabled(true);
            txtPrecoVenda.setEnabled(true);
            txtQtd.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnCancelar.setEnabled(true);
        break;
        
        case "Editar": 
            combStatus.setEnabled(true);
            txtDtCadastro.setEnabled(true);
            txtNome.setEnabled(true);
            combGrupo.setEnabled(true);
            combUnidade.setEnabled(true);
            combFornecedor.setEnabled(true);
            txtObs.setEnabled(true);
            txtPrecoUnitario.setEnabled(true);
            txtPrecoVenda.setEnabled(true);
            txtQtd.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnCancelar.setEnabled(true);
        break;
            
        case "Navegar":
            combStatus.setEnabled(true);
            txtDtCadastro.setEnabled(true);
            txtNome.setEnabled(true);
            combGrupo.setEnabled(true);
            combUnidade.setEnabled(true);
            combFornecedor.setEnabled(true);
            txtObs.setEnabled(true);
            txtPrecoUnitario.setEnabled(true);
            txtPrecoVenda.setEnabled(true);
            txtQtd.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnCancelar.setEnabled(true);
        break;
        
        case "Cancelar":
            combStatus.setEnabled(true);
            txtDtCadastro.setEnabled(true);
            txtNome.setEnabled(true);
            combGrupo.setEnabled(true);
            combUnidade.setEnabled(true);
            combFornecedor.setEnabled(true);
            txtObs.setEnabled(true);
            txtPrecoUnitario.setEnabled(true);
            txtPrecoVenda.setEnabled(true);
            txtQtd.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnCancelar.setEnabled(true);
        break;
            
        case "Excluir":
            combStatus.setEnabled(true);
            txtDtCadastro.setEnabled(true);
            txtNome.setEnabled(true);
            combGrupo.setEnabled(true);
            combUnidade.setEnabled(true);
            combFornecedor.setEnabled(true);
            txtObs.setEnabled(true);
            txtPrecoUnitario.setEnabled(true);
            txtPrecoVenda.setEnabled(true);
            txtQtd.setEnabled(true);
            btnSalvar.setEnabled(true);
            btnNovo.setEnabled(false);
            btnCancelar.setEnabled(true);
        break;
            
            default:
                System.out.println("Opção invalida de navegação!");
    }
            
            
            
    }
    
    private void habilitarCampos(){
         
         combStatus.setEnabled(true);
         txtDtCadastro.setEnabled(true);
         txtNome.setEnabled(true);
         combGrupo.setEnabled(true);
         combUnidade.setEnabled(true);
         combFornecedor.setEnabled(true);
         txtObs.setEnabled(true);
         txtPrecoUnitario.setEnabled(true);
         txtPrecoVenda.setEnabled(true);
         txtQtd.setEnabled(true);
         btnSalvar.setEnabled(true);
         btnNovo.setEnabled(false);
         btnCancelar.setEnabled(true);
         
     }
     
    private void desabilitarCampos(){
         
         combStatus.setEnabled(false);
         txtDtCadastro.setEnabled(false);
         txtNome.setEnabled(false);
         combGrupo.setEnabled(false);
         combUnidade.setEnabled(false);
         combFornecedor.setEnabled(false);
         txtObs.setEnabled(false);
         txtPrecoUnitario.setEnabled(false);
         txtPrecoVenda.setEnabled(false);
         txtQtd.setEnabled(false);
         btnEditar.setEnabled(false);
         btnSalvar.setEnabled(false);
         btnExcluir.setEnabled(false);
         btnCancelar.setEnabled(false);

     }
    
    public static frmProduto getInstace(){
    
        if(frmP==null){
            frmP = new frmProduto();
        }
        return frmP;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        new Utilitarios().LimpaTela(pnProduto);
        desabilitarCampos();
        btnNovo.setEnabled(true);
        combFornecedor.removeAllItems();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

        try {
        
            Produto obj = new Produto();
            
            obj.setStatus(combStatus.getSelectedItem().toString());
            obj.setDatacadastro(txtDtCadastro.getText().replace("##/##/####", "####-##-##"));
            obj.setDescricao(txtNome.getText());
            obj.setGrupoproduto(combGrupo.getSelectedItem().toString());
            obj.setUnidadetributada(combUnidade.getSelectedItem().toString());   

            Fornecedor f = new Fornecedor();
            f = (Fornecedor) combFornecedor.getSelectedItem();
            obj.setFornecedor(f);

            obj.setObservacao(txtObs.getText());
            obj.setPrecocusto(Double.parseDouble(txtPrecoUnitario.getText().replace(",", ".")));
            obj.setPrecovenda(Double.parseDouble(txtPrecoVenda.getText().replace(",", ".")));
            obj.setQtdestoque(Integer.parseInt(txtQtd.getText()));

            ProdutoDAO dao = new ProdutoDAO();
            dao.alterarProduto(obj);

            new Utilitarios().LimpaTela(pnProduto);
            desabilitarCampos();
                
        } catch (NumberFormatException e) {
            
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

            try {

                Produto obj = new Produto();

                obj.setStatus(combStatus.getSelectedItem().toString());
                obj.setDatacadastro(txtDtCadastro.getText().replace("##/##/####", "####-##-##"));
                obj.setDescricao(txtNome.getText());
                obj.setGrupoproduto(combGrupo.getSelectedItem().toString());
                obj.setUnidadetributada(combUnidade.getSelectedItem().toString());   

                Fornecedor f = new Fornecedor();
                f = (Fornecedor) combFornecedor.getSelectedItem();
                obj.setFornecedor(f);

                obj.setObservacao(txtObs.getText());
                obj.setPrecocusto(Double.parseDouble(txtPrecoUnitario.getText().replace("R$", "").replace(",", ".")));
                obj.setPrecovenda(Double.parseDouble(txtPrecoVenda.getText().replace("R$", "").replace(",", ".")));
                obj.setQtdestoque(Integer.parseInt(txtQtd.getText()));

                ProdutoDAO dao = new ProdutoDAO();
                dao.cadastroProduto(obj);

                //new Utilitarios().LimpaTela(jPanel7);
                combStatus.setSelectedItem(null);
                txtDtCadastro.setEnabled(false);
                txtNome.setText(null);
                combGrupo.setSelectedItem(null);
                combUnidade.setSelectedItem(null);
                combFornecedor.setSelectedItem(null);
                txtObs.setText(null);
                txtPrecoUnitario.setText(null);
                txtPrecoVenda.setText(null);
                txtQtd.setText(null);
                desabilitarCampos();

            } catch (NumberFormatException e) {
            } 
                                    
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       
        habilitarCampos();
        new Utilitarios().LimpaTela(pnProduto);
        combFornecedor.removeAllItems();
        
    }//GEN-LAST:event_btnNovoActionPerformed

    private void combFornecedorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_combFornecedorAncestorAdded
        
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista= dao.listarFornecedor();
        combFornecedor.removeAll();
        
        lista.forEach((f) -> {
            combFornecedor.addItem(f);
        });
    }//GEN-LAST:event_combFornecedorAncestorAdded

    private void txtPrecoUnitarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoUnitarioFocusLost
       
        String sv = txtPrecoUnitario.getText();
        String vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal vlUnitario = new BigDecimal(vsf);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String vlFormatado = nf.format(vlUnitario);
        txtPrecoUnitario.setText(vlFormatado);
    }//GEN-LAST:event_txtPrecoUnitarioFocusLost

    private void txtPrecoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrecoVendaFocusLost
        
        String sv = txtPrecoVenda.getText();
        String vsf = sv.replace("R$", "").replace(" ", "").replace(".", "").replace(",", ".");
        BigDecimal vlVenda = new BigDecimal(vsf);
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        String vlFormatado = nf.format(vlVenda);
        txtPrecoVenda.setText(vlFormatado);
    }//GEN-LAST:event_txtPrecoVendaFocusLost

    private void tabelaProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaProdutoMouseClicked

        if (evt.getClickCount() == 2) {
        
        pnPrincipal.setSelectedIndex(0);
        
        txtCodigo.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 0).toString());
        combStatus.setSelectedItem(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 1).toString());
        txtDtCadastro.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 2).toString());
        txtNome.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 3).toString());
        combGrupo.setSelectedItem(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 4).toString());
        combUnidade.setSelectedItem(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 5).toString());
        
        Fornecedor f = new Fornecedor();
        FornecedorDAO dao = new FornecedorDAO();
        f=dao.consultarPorNome(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 6).toString());
        combFornecedor.removeAll();
        combFornecedor.getModel().setSelectedItem(f);
        
        txtObs.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 7).toString());
        txtPrecoUnitario.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 8).toString());
        txtPrecoVenda.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 9).toString());
        txtQtd.setText(tabelaProduto.getValueAt(tabelaProduto.getSelectedRow(), 10).toString());
        
        habilitarCampos();
        btnExcluir.setEnabled(true);
        //desabilitarCampos();
        btnEditar.setEnabled(true);
        
        }       
        
    }//GEN-LAST:event_tabelaProdutoMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
      
        // Carregar data e hora atual do sistema 
            Date dtAtual = new Date();
            SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dtFormatada = dtFormat.format(dtAtual);
            txtDtCadastro.setText(dtFormatada);
        
            desabilitarCampos();
            txtNome.setEnabled(true);
            btnPesquisaRapida.setEnabled(true);
            listar();
    }//GEN-LAST:event_formWindowActivated

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        try {
            Produto obj = new Produto();
            
            obj.setId(Integer.parseInt(txtCodigo.getText()));
            
            ProdutoDAO dao = new ProdutoDAO();
            dao.excluirProduto(obj);
            
            new Utilitarios().LimpaTela(pnProduto);
  
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        
        String nome ="%" + txtPesquisa.getText() + "%";
        
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista =  dao.buscarProdutoPorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProduto.getModel();
        dados.setNumRows(0);
        
        lista.forEach((p) -> {
            dados.addRow(new Object[]{
                
                p.getId(),
                p.getStatus(),
                p.getDatacadastro(),
                p.getDescricao(),
                p.getGrupoproduto(),
                p.getUnidadetributada(),
                p.getFornecedor().getNome(),
                p.getObservacao(),
                p.getPrecocusto(),
                p.getPrecovenda(),
                p.getQtdestoque()
            });
        });
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyPressed
        
         String nome ="%" + txtPesquisa.getText() + "%";
        
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista =  dao.buscarProdutoPorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaProduto.getModel();
        dados.setNumRows(0);
        
        lista.forEach((p) -> {
            dados.addRow(new Object[]{
                
                p.getId(),
                p.getStatus(),
                p.getDatacadastro(),
                p.getDescricao(),
                p.getGrupoproduto(),
                p.getUnidadetributada(),
                p.getFornecedor().getNome(),
                p.getObservacao(),
                p.getPrecocusto(),
                p.getPrecovenda(),
                p.getQtdestoque()
            });
        });
    }//GEN-LAST:event_txtPesquisaKeyPressed

    private void btnPesquisaRapidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaRapidaActionPerformed
        
        String nome = txtNome.getText();
            Produto obj = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            
            obj = dao.consultaPorNome(nome);
            
            combFornecedor.removeAllItems();
            
            if(obj.getDescricao() != null){
            
            txtCodigo.setText(String.valueOf(obj.getId()));
            combStatus.setSelectedItem(obj.getStatus());
            txtDtCadastro.setText(obj.getDatacadastro());
            txtNome.setText(obj.getDescricao());
            combGrupo.setSelectedItem(obj.getGrupoproduto());
            combUnidade.setSelectedItem(obj.getUnidadetributada());
            
            Fornecedor f = new Fornecedor();
            FornecedorDAO fdao = new FornecedorDAO();
            f=fdao.consultarPorNome(obj.getFornecedor().getNome());
            combFornecedor.getModel().setSelectedItem(f);
            
            txtObs.setText(obj.getObservacao());
            txtPrecoUnitario.setText(String.valueOf(obj.getPrecocusto()));
            txtPrecoVenda.setText(String.valueOf(obj.getPrecovenda()));
            txtQtd.setText(String.valueOf(obj.getQtdestoque()));
            
            desabilitarCampos();
            btnEditar.setEnabled(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Produto não encontrado! ");
            }
    }//GEN-LAST:event_btnPesquisaRapidaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
               
        frmProduto.this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void combFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combFornecedorMouseClicked
        
        FornecedorDAO dao = new FornecedorDAO();
        List<Fornecedor> lista= dao.listarFornecedor();
        combFornecedor.removeAll();
        
        lista.forEach((f) -> {
            combFornecedor.addItem(f);
        });
    }//GEN-LAST:event_combFornecedorMouseClicked

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
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmProduto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalise;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnPesquisaRapida;
    private javax.swing.JButton btnPesquisarProdutp;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox combFornecedor;
    private javax.swing.JComboBox<String> combGrupo;
    private javax.swing.JComboBox<String> combStatus;
    private javax.swing.JComboBox<String> combUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblFormCadastroCliente;
    private javax.swing.JPanel pnButton;
    public javax.swing.JPanel pnConsulta;
    private javax.swing.JPanel pnFiscais;
    public javax.swing.JTabbedPane pnPrincipal;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JTable tabelaProduto;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JLabel txtDtCadastro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtPrecoUnitario;
    private javax.swing.JFormattedTextField txtPrecoVenda;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables
}
