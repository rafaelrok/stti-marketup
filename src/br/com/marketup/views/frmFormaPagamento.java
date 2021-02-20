
package br.com.marketup.views;

import br.com.marketup.dao.FormadepagamentoDAO;
import br.com.marketup.nogocio.Formadepagamento;
import br.com.marketup.recursos.Utilitarios;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class frmFormaPagamento extends javax.swing.JFrame {
    
    private static frmFormaPagamento frmPg;
    
    Utilitarios util =  new Utilitarios();
    
    String pst, rs;
    
    public void listar(){
        
        FormadepagamentoDAO dao = new FormadepagamentoDAO();
        List<Formadepagamento> lista =  dao.listarFormadepagamento();
        DefaultTableModel dados = (DefaultTableModel) tblFormaPg.getModel();
        dados.setNumRows(0);
        
        lista.forEach((formaPg) -> {
            dados.addRow(new Object[]{
                
                formaPg.getId(),
                formaPg.getDescricao()
            });
        });
        
    }

    public frmFormaPagamento() {
        initComponents(); 
        
        btnEditarPg.setEnabled(false);
        btnSalvarPg.setEnabled(false);
        btnCancelarPg.setEnabled(false);
        btnExcluirPg.setEnabled(false);
        txtCodigoPg.setEditable(false);
        txtFormaPg.setEditable(false);
        btnPesquisa.setEnabled(true);
        txtPesquisaPg.setEnabled(true);
        txtPesquisaPg.setEditable(true);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtPesquisaPg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblFormaPg = new javax.swing.JTable();
        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnNovoPg = new javax.swing.JButton();
        btnCancelarPg = new javax.swing.JButton();
        btnEditarPg = new javax.swing.JButton();
        btnExcluirPg = new javax.swing.JButton();
        btnSairPg = new javax.swing.JButton();
        btnSalvarPg = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtFormaPg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoPg = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisar formas de pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtPesquisaPg.setBackground(new java.awt.Color(230, 230, 230));
        txtPesquisaPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesquisaPg.setForeground(new java.awt.Color(102, 102, 102));
        txtPesquisaPg.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtPesquisaPg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisaPgKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Pesquisa:");

        btnPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        tblFormaPg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblFormaPg.setForeground(new java.awt.Color(102, 102, 102));
        tblFormaPg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblFormaPg.getTableHeader().setReorderingAllowed(false);
        tblFormaPg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFormaPgMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblFormaPg);
        if (tblFormaPg.getColumnModel().getColumnCount() > 0) {
            tblFormaPg.getColumnModel().getColumn(0).setMinWidth(70);
            tblFormaPg.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblFormaPg.getColumnModel().getColumn(0).setMaxWidth(70);
            tblFormaPg.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtPesquisaPg)
                .addGap(0, 0, 0)
                .addComponent(btnPesquisa))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnForm.setBackground(new java.awt.Color(44, 79, 103));

        lblFormCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFormCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormCadastroCliente.setText("FORMA DE PAGAMENTO");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
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
                .addGap(137, 137, 137)
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jLabelClose))
                    .addComponent(lblFormCadastroCliente))
                .addGap(10, 10, 10))
        );

        jPanel2.setBackground(new java.awt.Color(221, 221, 221));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        btnNovoPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNovoPg.setForeground(new java.awt.Color(102, 102, 102));
        btnNovoPg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/add.png"))); // NOI18N
        btnNovoPg.setText("Novo");
        btnNovoPg.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnNovoPg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoPg.setVerifyInputWhenFocusTarget(false);
        btnNovoPg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoPgActionPerformed(evt);
            }
        });

        btnCancelarPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelarPg.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelarPg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/cancelar.png"))); // NOI18N
        btnCancelarPg.setText("Cancelar");
        btnCancelarPg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarPg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPgActionPerformed(evt);
            }
        });

        btnEditarPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditarPg.setForeground(new java.awt.Color(102, 102, 102));
        btnEditarPg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/editar.png"))); // NOI18N
        btnEditarPg.setText("Editar");
        btnEditarPg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarPg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPgActionPerformed(evt);
            }
        });

        btnExcluirPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcluirPg.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirPg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/excluir - .png"))); // NOI18N
        btnExcluirPg.setText("Excluir");
        btnExcluirPg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirPg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluirPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPgActionPerformed(evt);
            }
        });

        btnSairPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSairPg.setForeground(new java.awt.Color(102, 102, 102));
        btnSairPg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/sair.png"))); // NOI18N
        btnSairPg.setText("Sair");
        btnSairPg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSairPg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSairPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairPgActionPerformed(evt);
            }
        });

        btnSalvarPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvarPg.setForeground(new java.awt.Color(102, 102, 102));
        btnSalvarPg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/salvar.png"))); // NOI18N
        btnSalvarPg.setText("Salvar");
        btnSalvarPg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarPg.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarPg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarPgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNovoPg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvarPg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelarPg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarPg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirPg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSairPg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarPg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSairPg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirPg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarPg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnNovoPg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnEditarPg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(221, 221, 221));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro forma de pagamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));

        txtFormaPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFormaPg.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Descrição:");

        txtCodigoPg.setEditable(false);
        txtCodigoPg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigoPg.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigoPg.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Código:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigoPg, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtFormaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFormaPg, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtCodigoPg))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ListarFormaPg(java.awt.event.WindowEvent evt) {                                
        
        listar();
    }
    
    public static frmFormaPagamento getInstace(){
        if(frmPg==null){
               frmPg = new frmFormaPagamento();
        }
        return frmPg;
        
    }
    
    private void tblFormaPgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFormaPgMouseClicked
       
        if (evt.getClickCount() == 2) {
            
        txtCodigoPg.setText(tblFormaPg.getValueAt(tblFormaPg.getSelectedRow(), 0).toString());
        txtFormaPg.setText(tblFormaPg.getValueAt(tblFormaPg.getSelectedRow(), 1).toString());
        btnEditarPg.setEnabled(true);
        btnSalvarPg.setEnabled(false);
        btnCancelarPg.setEnabled(true);
        btnExcluirPg.setEnabled(true);
        txtPesquisaPg.setText(null);
        txtFormaPg.setEditable(true);
        
        }      
        
    }//GEN-LAST:event_tblFormaPgMouseClicked

    private void btnSalvarPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarPgActionPerformed
        
        try {
            Formadepagamento obj = new Formadepagamento();
            
            obj.setDescricao(txtFormaPg.getText());
            
            FormadepagamentoDAO dao = new FormadepagamentoDAO();
            dao.inserirFormadepagamento(obj);
            
            txtFormaPg.setText(null);                      
            
        } catch (NumberFormatException e) {
        }
        btnEditarPg.setEnabled(false);
        btnSalvarPg.setEnabled(false);
        btnCancelarPg.setEnabled(false);
        btnExcluirPg.setEnabled(false);
        txtPesquisaPg.setText(null);
        txtFormaPg.setEnabled(false);
    }//GEN-LAST:event_btnSalvarPgActionPerformed

    private void btnEditarPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPgActionPerformed
        
        try {
            Formadepagamento obj = new Formadepagamento();
            
            obj.setDescricao(txtFormaPg.getText());
            
            obj.setId(Integer.parseInt(txtCodigoPg.getText()));
            
            FormadepagamentoDAO dao = new FormadepagamentoDAO();
            dao.alterarFormadepagamento(obj);
            
            txtFormaPg.setText(null);
            txtCodigoPg.setText(null);           
            
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnEditarPgActionPerformed

    private void btnExcluirPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPgActionPerformed
        
        try {
            Formadepagamento obj = new Formadepagamento();
            
            obj.setId(Integer.parseInt(txtCodigoPg.getText()));
            
            FormadepagamentoDAO dao = new FormadepagamentoDAO();
            dao.excluirFormadepagamento(obj);
  
        } catch (NumberFormatException e) {
        }
                    
            txtFormaPg.setText(null);
            txtCodigoPg.setText(null);
            btnEditarPg.setEnabled(false);
            btnExcluirPg.setEnabled(false);
    }//GEN-LAST:event_btnExcluirPgActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        
        String descricao ="%" + txtPesquisaPg.getText() + "%";
        
        FormadepagamentoDAO dao = new FormadepagamentoDAO();
        List<Formadepagamento> lista =  dao.buscarFormadepagamentoPorDescricao(descricao);
        DefaultTableModel dados = (DefaultTableModel) tblFormaPg.getModel();
        dados.setNumRows(0);
        
        lista.forEach((formapg) -> {
            dados.addRow(new Object[]{
                
                formapg.getId(),
                formapg.getDescricao()
            });
        });
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private void txtPesquisaPgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaPgKeyPressed
        
        String descricao ="%" + txtPesquisaPg.getText() + "%";
        
        FormadepagamentoDAO dao = new FormadepagamentoDAO();
        List<Formadepagamento> lista =  dao.buscarFormadepagamentoPorDescricao(descricao);
        DefaultTableModel dados = (DefaultTableModel) tblFormaPg.getModel();
        dados.setNumRows(0);
        
        lista.forEach((formapg) -> {
            dados.addRow(new Object[]{
                
                formapg.getId(),
                formapg.getDescricao()
            });
        });
    }//GEN-LAST:event_txtPesquisaPgKeyPressed

    private void btnNovoPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoPgActionPerformed
        
        btnNovoPg.setEnabled(false);
        btnEditarPg.setEnabled(false);
        btnSalvarPg.setEnabled(true);
        btnCancelarPg.setEnabled(true);
        btnExcluirPg.setEnabled(false);
        txtFormaPg.setEditable(true);
        txtPesquisaPg.setEditable(false);
        btnPesquisa.setEnabled(false);
        txtCodigoPg.setText(null);
        txtFormaPg.setText(null);
        txtPesquisaPg.setText(null);
    }//GEN-LAST:event_btnNovoPgActionPerformed

    private void btnCancelarPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPgActionPerformed

        int op;
        op = JOptionPane.showConfirmDialog(null, "Deseja cancelar a operação ?");
        
        if(op == 0){ 
        
            btnNovoPg.setEnabled(true);
            btnEditarPg.setEnabled(false);
            btnSalvarPg.setEnabled(false);
            btnCancelarPg.setEnabled(false);
            btnExcluirPg.setEnabled(false);
            txtCodigoPg.setEditable(false);
            txtCodigoPg.setText(null);
            txtFormaPg.setEditable(false);
            txtFormaPg.setText(null);
            txtPesquisaPg.setEditable(true);
            txtPesquisaPg.setText(null);
            btnPesquisa.setEnabled(true);
            btnPesquisa.setText(null);
        }              
        
    }//GEN-LAST:event_btnCancelarPgActionPerformed

    private void btnSairPgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPgActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairPgActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        listar();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(frmFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFormaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFormaPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPg;
    private javax.swing.JButton btnEditarPg;
    private javax.swing.JButton btnExcluirPg;
    private javax.swing.JButton btnNovoPg;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSairPg;
    private javax.swing.JButton btnSalvarPg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblFormCadastroCliente;
    private javax.swing.JPanel pnForm;
    private javax.swing.JTable tblFormaPg;
    private javax.swing.JTextField txtCodigoPg;
    private javax.swing.JTextField txtFormaPg;
    public javax.swing.JTextField txtPesquisaPg;
    // End of variables declaration//GEN-END:variables
}
