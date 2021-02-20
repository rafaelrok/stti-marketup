
package br.com.marketup.views;

import br.com.marketup.dao.ProdutoDAO;
import br.com.marketup.nogocio.Produto;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class frmControleEstoque extends javax.swing.JFrame {
    
    private static frmControleEstoque frmCe;
    
    int id_produto, qtde_novo, qtde_atual, qtde_atualizado;
    double valor_novo, valor_atualizado, valor_atual;
    String data;

    public void listar(){
        
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista = dao.listarProduto();
        DefaultTableModel dados = (DefaultTableModel) tblEstoque.getModel();
        dados.setNumRows(0);
        
        lista.forEach((p) -> {
            dados.addRow(new Object[]{
                
                p.getId(),
                //p.getStatus(),
                //p.getDatacadastro(),
                p.getDescricao(),
                //p.getGrupoproduto(),
                p.getUnidadetributada(),
                p.getFornecedor().getNome(),
                //p.getObservacao(),
                p.getPrecocusto(),
                //p.getPrecovenda(),
                p.getQtdestoque(),

            });
        });
    
    }

    public frmControleEstoque() {
        initComponents();
        
        txtPrecoCustoAtual.setEditable(false);
        txtQtdEstoqueAtual.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtPesquisa = new javax.swing.JTextField();
        txtQtdEstoqueAtual = new javax.swing.JTextField();
        txtQtdApurado = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnAdiconar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPrecoCustoAtual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrecCustoNovo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblDataEntrada = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
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
        lblFormCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/controle_estoque.png"))); // NOI18N
        lblFormCadastroCliente.setText("CONTROLE DE ESTOQUE");

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
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel1.setBackground(new java.awt.Color(220, 220, 220));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Produto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesquisa.setForeground(new java.awt.Color(102, 102, 102));

        txtQtdEstoqueAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtQtdEstoqueAtual.setForeground(new java.awt.Color(102, 102, 102));
        txtQtdEstoqueAtual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtQtdApurado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtQtdApurado.setForeground(new java.awt.Color(102, 102, 102));
        txtQtdApurado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAdiconar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdiconar.setForeground(new java.awt.Color(102, 102, 102));
        btnAdiconar.setText("ADICIONAR");
        btnAdiconar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdiconarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Descrição do produto:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Estoque Atual:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Qtd.Apurada:");

        txtPrecoCustoAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecoCustoAtual.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecoCustoAtual.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Prec.Custo Atual:");

        txtPrecCustoNovo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPrecCustoNovo.setForeground(new java.awt.Color(102, 102, 102));
        txtPrecCustoNovo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Prec.Custo Novo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Data:");

        lblDataEntrada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDataEntrada.setForeground(new java.awt.Color(102, 102, 102));
        lblDataEntrada.setText("00/00/0000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtQtdApurado)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoCustoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrecCustoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdiconar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDataEntrada)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(lblDataEntrada))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQtdEstoqueAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdApurado, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdiconar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoCustoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecCustoNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(220, 220, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listagem Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        tblEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblEstoque.setForeground(new java.awt.Color(102, 102, 102));
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Unidade", "Fornecedor", "Prec.Custo", "Qtd.Estoque"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEstoque.setSelectionBackground(new java.awt.Color(90, 133, 167));
        tblEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstoque);
        if (tblEstoque.getColumnModel().getColumnCount() > 0) {
            tblEstoque.getColumnModel().getColumn(0).setResizable(false);
            tblEstoque.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblEstoque.getColumnModel().getColumn(1).setResizable(false);
            tblEstoque.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblEstoque.getColumnModel().getColumn(2).setResizable(false);
            tblEstoque.getColumnModel().getColumn(2).setPreferredWidth(3);
            tblEstoque.getColumnModel().getColumn(3).setResizable(false);
            tblEstoque.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblEstoque.getColumnModel().getColumn(4).setResizable(false);
            tblEstoque.getColumnModel().getColumn(4).setPreferredWidth(5);
            tblEstoque.getColumnModel().getColumn(5).setResizable(false);
            tblEstoque.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static frmControleEstoque getInstace(){
    
        if(frmCe==null){
            frmCe = new frmControleEstoque();
        }
        return frmCe;
    }
    
    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
            listar();
        
            Date dtAtual = new Date();
            SimpleDateFormat dtFormat = new SimpleDateFormat("dd/MM/yyyy");
            String dtFormatada = dtFormat.format(dtAtual);
            lblDataEntrada.setText(dtFormatada);
            
    }//GEN-LAST:event_formWindowActivated

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        
        String nome ="%" + txtPesquisa.getText() + "%";
        
        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> lista =  dao.buscarProdutoPorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tblEstoque.getModel();
        dados.setNumRows(0);
        
        lista.forEach((p) -> {
            dados.addRow(new Object[]{
                
                p.getId(),
                //p.getStatus(),
                //p.getDatacadastro(),
                p.getDescricao(),
                //p.getGrupoproduto(),
                p.getUnidadetributada(),
                p.getFornecedor().getNome(),
                //p.getObservacao(),
                p.getPrecocusto(),
                //p.getPrecovenda(),
                p.getQtdestoque()
            });
        });
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstoqueMouseClicked
        
        if (evt.getClickCount() == 2) {
            
            id_produto=Integer.parseInt(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 0).toString());
            txtQtdEstoqueAtual.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 5).toString());
            txtPrecoCustoAtual.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 4).toString());
            txtPesquisa.setText(tblEstoque.getValueAt(tblEstoque.getSelectedRow(), 1).toString());
        }       
    }//GEN-LAST:event_tblEstoqueMouseClicked

    private void btnAdiconarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdiconarActionPerformed
        
        try {
               
            qtde_novo = Integer.parseInt(txtQtdApurado.getText());
            qtde_atual = Integer.parseInt(txtQtdEstoqueAtual.getText());            
            qtde_atualizado = qtde_novo + qtde_atual;  
            valor_novo = Double.parseDouble(txtPrecCustoNovo.getText());

            ProdutoDAO dao =  new ProdutoDAO();
            dao.entradaEstoqueProduto(id_produto, qtde_atualizado, valor_novo);
            
            txtPesquisa.setText(null);
            txtPrecCustoNovo.setText(null);
            txtPrecoCustoAtual.setText(null);
            txtQtdApurado.setText(null);
            txtQtdEstoqueAtual.setText(null);
            
        } catch (HeadlessException | NumberFormatException erro) {
            
            JOptionPane.showMessageDialog(null, "Selecione o produto ou informe a quantidade! ");
        }
    }//GEN-LAST:event_btnAdiconarActionPerformed

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
            java.util.logging.Logger.getLogger(frmControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmControleEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmControleEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdiconar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataEntrada;
    private javax.swing.JLabel lblFormCadastroCliente;
    private javax.swing.JPanel pnForm;
    private javax.swing.JTable tblEstoque;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtPrecCustoNovo;
    private javax.swing.JTextField txtPrecoCustoAtual;
    private javax.swing.JTextField txtQtdApurado;
    private javax.swing.JTextField txtQtdEstoqueAtual;
    // End of variables declaration//GEN-END:variables
}
