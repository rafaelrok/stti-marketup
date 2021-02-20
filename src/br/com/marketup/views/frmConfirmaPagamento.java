
package br.com.marketup.views;

import br.com.marketup.dao.ItemVendaDAO;
import br.com.marketup.dao.VendaDAO;
import br.com.marketup.nogocio.Funcionario;
import br.com.marketup.nogocio.ItemVenda;
import br.com.marketup.nogocio.Pessoa;
import br.com.marketup.nogocio.Produto;
import br.com.marketup.nogocio.Venda;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class frmConfirmaPagamento extends javax.swing.JFrame {

    Pessoa pessoa = new Pessoa();
    Funcionario funcionario = new Funcionario();
    NumberFormat nFormat = new DecimalFormat("#,###.00");
    
    private static frmConfirmaPagamento frmCp;
    
    double totalVenda, totalTroco, totalDesconto, valorPg, totalAcrescimo;
    int parcelaPg;
    String statusVenda, tpPg, fpg;
    DefaultTableModel carrinho;
   
    public frmConfirmaPagamento() {
        initComponents();
        
        lblDescFinal.setText("0.0");
        lblTrocoFinal.setText("0,00");
        lblValorFinal.setText("0,00");
                   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        btnFilnalizarPagamento = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCancelarPagamento = new javax.swing.JButton();
        lblNomeCliente = new javax.swing.JLabel();
        lblValorFinal = new javax.swing.JLabel();
        lblTrocoFinal = new javax.swing.JLabel();
        lblDescFinal = new javax.swing.JLabel();
        lblFormaPg = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblVendedor = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblValorPago = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblAcresFinal = new javax.swing.JLabel();
        lblTipoPg = new javax.swing.JLabel();
        lblParcelaPg = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        pnForm.setBackground(new java.awt.Color(44, 79, 103));

        lblFormCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFormCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormCadastroCliente.setText("CONFIRMA PAGAMENTO");

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

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormCadastroCliente)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        btnFilnalizarPagamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFilnalizarPagamento.setForeground(new java.awt.Color(102, 102, 102));
        btnFilnalizarPagamento.setText("CONFIRMA PAGAMENTO");
        btnFilnalizarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilnalizarPagamentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Cliente Compra:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Desconto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Troco:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Valor Total:");

        btnCancelarPagamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCancelarPagamento.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelarPagamento.setText("CANCELAR");
        btnCancelarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPagamentoActionPerformed(evt);
            }
        });

        lblNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        lblNomeCliente.setText("Nome");

        lblValorFinal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblValorFinal.setForeground(new java.awt.Color(102, 102, 102));
        lblValorFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValorFinal.setText("0.00");

        lblTrocoFinal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTrocoFinal.setForeground(new java.awt.Color(102, 102, 102));
        lblTrocoFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTrocoFinal.setText("0.00");

        lblDescFinal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDescFinal.setForeground(new java.awt.Color(102, 102, 102));
        lblDescFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescFinal.setText("0.00");

        lblFormaPg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFormaPg.setForeground(new java.awt.Color(102, 102, 102));
        lblFormaPg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFormaPg.setText("Pagamento");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Forma de pagamento:");

        lblVendedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblVendedor.setForeground(new java.awt.Color(102, 102, 102));
        lblVendedor.setText("vendedor");

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(102, 102, 102));
        lblStatus.setText("status");

        lblValorPago.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblValorPago.setForeground(new java.awt.Color(102, 102, 102));
        lblValorPago.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValorPago.setText("0.00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Valor Pago:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Venda:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Vendedor:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Acréscimo:");

        lblAcresFinal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblAcresFinal.setForeground(new java.awt.Color(102, 102, 102));
        lblAcresFinal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAcresFinal.setText("0.00");

        lblTipoPg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTipoPg.setForeground(new java.awt.Color(102, 102, 102));
        lblTipoPg.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTipoPg.setText("Tipo");

        lblParcelaPg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblParcelaPg.setForeground(new java.awt.Color(102, 102, 102));
        lblParcelaPg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblParcelaPg.setText("00");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Tipo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Parcela:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnFilnalizarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTrocoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAcresFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVendedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFormaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(lblTipoPg, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblParcelaPg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendedor)
                    .addComponent(lblStatus)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFormaPg, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTipoPg)
                            .addComponent(lblParcelaPg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, 0)
                        .addComponent(lblValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(lblDescFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(lblAcresFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, 0)
                        .addComponent(lblTrocoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(0, 0, 0)
                        .addComponent(lblValorFinal)
                        .addGap(18, 18, 18)
                        .addComponent(btnFilnalizarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static frmConfirmaPagamento getInstace(){
        if(frmCp==null){
            frmCp = new frmConfirmaPagamento();
        }
        return frmCp;
    
    }
    
    private void btnCancelarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPagamentoActionPerformed
       
            JFrame frmPg = new frmConfirmaPagamento();
            frmPg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frmPg.setLocationRelativeTo(null);
            frmPg.setResizable(false);
            this.dispose();

    }//GEN-LAST:event_btnCancelarPagamentoActionPerformed

    private void btnFilnalizarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilnalizarPagamentoActionPerformed
        
          try {
            totalDesconto = nFormat.parse(lblDescFinal.getText()).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //totalDesconto = Double.parseDouble(lblDescFinal.getText().replaceAll(",", "."));
          try {
            totalAcrescimo = nFormat.parse(lblAcresFinal.getText()).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //totalAcrescimo = Double.parseDouble(lblAcresFinal.getText().replaceAll(",", "."));
          try {
            totalTroco = nFormat.parse(lblTrocoFinal.getText()).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //totalTroco = Double.parseDouble(lblTrocoFinal.getText().replaceAll(",", "."));
        try {
            totalVenda = nFormat.parse(lblValorFinal.getText()).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //totalVenda = Double.parseDouble(lblValorFinal.getText().replaceAll(",", "."));
        try {
            valorPg = nFormat.parse(lblValorPago.getText()).doubleValue();
        } catch (ParseException ex) {
            Logger.getLogger(frmConfirmaPagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        //valorPg = Double.parseDouble(lblValorPago.getText().replaceAll(",", "."));
        statusVenda = String.valueOf(lblStatus.getText());
        fpg = String.valueOf(lblFormaPg.getText());
        tpPg = String.valueOf(lblTipoPg.getText());
        parcelaPg = Integer.parseInt(lblParcelaPg.getText());
        
        try {           
                Venda venda = new Venda();
               
                venda.setPessoa(pessoa);
                venda.setFuncionario(funcionario);

                Date dtAtual = new Date();
                SimpleDateFormat dtFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dtFormatada = dtFormat.format(dtAtual);
                venda.setDatavenda(dtFormatada);

                Date hrAtual = new Date();
                SimpleDateFormat hrFormat = new SimpleDateFormat("HH:mm:ss");
                String hrFormatada = hrFormat.format(hrAtual);
                venda.setHoravenda(hrFormatada);

                venda.setFormadepagamento(fpg);
                venda.setTotalvenda(totalVenda);
                venda.setDescvenda(totalDesconto);
                venda.setAcresvenda(totalAcrescimo);
                venda.setTrocovenda(totalTroco);
                venda.setValorpagamento(valorPg);
                venda.setSituacao(statusVenda);
                venda.setTipo(tpPg);
                venda.setParcela(parcelaPg);                

                VendaDAO dao = new VendaDAO();
                dao.CadastrarVenda(venda);
                
                ///Cadastro de itensVenda (Carrinho)
                venda.setId(dao.retornaUltimaVenda());
                
                for (int i = 0; i < carrinho.getRowCount(); i++) {
                    
                    ItemVenda item =  new ItemVenda();
                    Produto produto = new Produto();
                    
                    item.setVenda(venda);                   
                    produto.setId(Integer.parseInt(carrinho.getValueAt(i, 0).toString()));
                    item.setProduto(produto);
                    item.setQtd(Integer.parseInt(carrinho.getValueAt(i, 2).toString()));
                    item.setPreco(Double.parseDouble(carrinho.getValueAt(i, 3).toString()));
                    item.setSubtotal(Double.parseDouble(carrinho.getValueAt(i, 6).toString()));
                    item.setDescitem(Double.parseDouble(carrinho.getValueAt(i, 4).toString()));
                    item.setAcrescitem(Double.parseDouble(carrinho.getValueAt(i, 5).toString()));
                    
                    ItemVendaDAO daoItem =  new ItemVendaDAO();
                    daoItem.cadastraItens(item);
                
            }
                
                JOptionPane.showMessageDialog(null, " Venda Finalizada com Sucesso! ");
        
            } 
        catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, " Ops, ocorreu um erro!\n " + erro);
        }

    }//GEN-LAST:event_btnFilnalizarPagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(frmConfirmaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConfirmaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConfirmaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConfirmaPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmConfirmaPagamento().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarPagamento;
    private javax.swing.JButton btnFilnalizarPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMin;
    public javax.swing.JLabel lblAcresFinal;
    public javax.swing.JLabel lblDescFinal;
    private javax.swing.JLabel lblFormCadastroCliente;
    public javax.swing.JLabel lblFormaPg;
    public javax.swing.JLabel lblNomeCliente;
    public javax.swing.JLabel lblParcelaPg;
    public javax.swing.JLabel lblStatus;
    public javax.swing.JLabel lblTipoPg;
    public javax.swing.JLabel lblTrocoFinal;
    public javax.swing.JLabel lblValorFinal;
    public javax.swing.JLabel lblValorPago;
    public javax.swing.JLabel lblVendedor;
    private javax.swing.JPanel pnForm;
    // End of variables declaration//GEN-END:variables
}
