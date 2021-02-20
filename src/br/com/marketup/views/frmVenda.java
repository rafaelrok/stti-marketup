
package br.com.marketup.views;

import br.com.marketup.dao.ItemVendaDAO;
import br.com.marketup.dao.VendaDAO;
import br.com.marketup.nogocio.ItemVenda;
import br.com.marketup.nogocio.Venda;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class frmVenda extends javax.swing.JFrame {
    
    private static frmVenda frmV;
    
    frmVendaRapida frmVr = frmVendaRapida.getInstace();
    frmTotalPorData frmTpData = frmTotalPorData.getInstace();
    
    public void listar(){
        
        VendaDAO dao = new VendaDAO();
        List<Venda> lista =  dao.listarVendas();
        DefaultTableModel dados = (DefaultTableModel) tblVendas.getModel();
        dados.setNumRows(0);
        
        lista.forEach((venda) -> {
            dados.addRow(new Object[]{
                
                venda.getId(),
                venda.getSituacao(),
                venda.getPessoa().getNome(),               
                venda.getDatavenda(),
                venda.getHoravenda(),
                venda.getTotalvenda(),
                venda.getTrocovenda(),
                venda.getDescvenda(),
                venda.getAcresvenda(),
                venda.getFuncionario().getNomecurto(),
                venda.getFormadepagamento(),
                venda.getTipo(),
                venda.getParcela(),
                venda.getValorpagamento()
                
            });
        });
        
    }
   
    public frmVenda() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnNovaVenda = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnFinalizarVenda = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnVendaDt = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtFiltrarVenda = new javax.swing.JTextField();
        btnFiltrarConteudo = new javax.swing.JButton();
        txtDtFinal = new javax.swing.JFormattedTextField();
        txtDtInicial = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnFiltrarDt = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        combFiltrarSituacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVendas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        lblFormCadastroCliente.setText("PAINEL DE VENDAS");

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
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblFormCadastroCliente))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));
        jPanel1.setPreferredSize(new java.awt.Dimension(0, 90));

        btnNovaVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNovaVenda.setForeground(new java.awt.Color(102, 102, 102));
        btnNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/analise.png"))); // NOI18N
        btnNovaVenda.setText("Novo");
        btnNovaVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovaVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVendaActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(102, 102, 102));
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFinalizarVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFinalizarVenda.setForeground(new java.awt.Color(102, 102, 102));
        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/confirmavenda.png"))); // NOI18N
        btnFinalizarVenda.setText("Finalizar");
        btnFinalizarVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFinalizarVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/cancel .png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnRemover.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRemover.setForeground(new java.awt.Color(102, 102, 102));
        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/excluir - .png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRemover.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

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

        btnVendaDt.setForeground(new java.awt.Color(102, 102, 102));
        btnVendaDt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/consult_data.png"))); // NOI18N
        btnVendaDt.setText("Total/Data");
        btnVendaDt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVendaDt.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVendaDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendaDtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnNovaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVendaDt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVendaDt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnNovaVenda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinalizarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRemover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        jPanel3.setBackground(new java.awt.Color(221, 221, 221));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pesquisa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        txtFiltrarVenda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFiltrarVenda.setForeground(new java.awt.Color(102, 102, 102));
        txtFiltrarVenda.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        btnFiltrarConteudo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFiltrarConteudo.setForeground(new java.awt.Color(102, 102, 102));
        btnFiltrarConteudo.setText("FILTRAR");
        btnFiltrarConteudo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarConteudoActionPerformed(evt);
            }
        });

        txtDtFinal.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtDtFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtFinal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtDtInicial.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtDtInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDtInicial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Data inicial");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Data final");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Conteudo da pesquisa");

        btnFiltrarDt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFiltrarDt.setForeground(new java.awt.Color(102, 102, 102));
        btnFiltrarDt.setText("FILTRAR");
        btnFiltrarDt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarDtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarDt)))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtFiltrarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFiltrarConteudo))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarConteudo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDtInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFiltrarDt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(221, 221, 221));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        combFiltrarSituacao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combFiltrarSituacao.setForeground(new java.awt.Color(102, 102, 102));
        combFiltrarSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "ABERTO", "FINALIZADO", "CANCELADO" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Situação");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combFiltrarSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(0, 0, 0)
                .addComponent(combFiltrarSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        tblVendas.setBackground(new java.awt.Color(221, 221, 221));
        tblVendas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblVendas.setForeground(new java.awt.Color(102, 102, 102));
        tblVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Status", "Cliente", "Data", "Hora", "Total Venda", "Troco", "Desconto", "Acrescimo", "Funcionario", "Pagamento", "Tipo", "Parcela", "Valor Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVendas.setSelectionBackground(new java.awt.Color(0, 153, 204));
        tblVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVendasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblVendas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static frmVenda getInstace(){
    
        if(frmV==null){
            frmV = new frmVenda();
        }
        return frmV;
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
       listar();
    }//GEN-LAST:event_formWindowActivated

    private void btnNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVendaActionPerformed

       frmVr.setVisible(true);
    }//GEN-LAST:event_btnNovaVendaActionPerformed

    private void btnFiltrarConteudoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarConteudoActionPerformed
        
        try {
             String nome ="%" + txtFiltrarVenda.getText() + "%";
        
            VendaDAO dao = new VendaDAO();
            List<Venda> lista =  dao.buscarVendaPorNomeCliente(nome);
            DefaultTableModel dados = (DefaultTableModel) tblVendas.getModel();
            dados.setNumRows(0);

            lista.forEach((venda) -> {
                dados.addRow(new Object[]{

                    venda.getId(),
                    venda.getSituacao(),
                    venda.getPessoa().getNome(),                               
                    venda.getDatavenda(),
                    venda.getHoravenda(),
                    venda.getTotalvenda(),
                    venda.getTrocovenda(),
                    venda.getDescvenda(),
                    venda.getAcresvenda(),
                    venda.getFuncionario().getNomecurto(),
                    venda.getFormadepagamento(),
                    venda.getTipo(),
                    venda.getParcela(),
                    venda.getValorpagamento()
                });
            });
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Venda não localizada!");
            }
    }//GEN-LAST:event_btnFiltrarConteudoActionPerformed

    private void tblVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVendasMouseClicked
       
        if (evt.getClickCount() == 2) {
            
            frmVr.lblStatusVenda.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 1).toString());
            frmVr.txtNmCliente.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 2).toString());
            frmVr.lblDtVenda.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 3).toString());
            frmVr.lblDtVenda.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 4).toString());//hora
            frmVr.lblValorTotal.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 5).toString());
            frmVr.lblVlTroco.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 6).toString());
            frmVr.lblDescGeralVl.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 7).toString());
            frmVr.lblAcresGeralVl.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 8).toString());
            frmVr.txtVendedorVenda.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 9).toString());
            /*frmVr.txtNmCliente.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 10).toString());*/
            /*frmVr.txtNmCliente.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 11).toString());*/
            frmVr.lblVlRecebimento.setText(tblVendas.getValueAt(tblVendas.getSelectedRow(), 13).toString()); 
 
            int id_venda = Integer.parseInt(tblVendas.getValueAt(tblVendas.getSelectedRow(), 0).toString());
            
            /*
            Venda venda = new Venda();
            VendaDAO dao = new VendaDAO();
            venda = dao.consultarClientePorCodigo(id_venda); 
            frmVr.txtCdCliente.setText(String.valueOf(venda.getPessoa().getId()));
            frmVr.txtCpfCliente.setText(String.valueOf(venda.getPessoa().getCpf())); 
            */            

            
            // forma de pagamento venda
            int id = Integer.parseInt(tblVendas.getValueAt(tblVendas.getSelectedRow(), 0).toString());
                       
            VendaDAO dao_v = new VendaDAO();
            List<Venda> vendaPg = dao_v.listaPagamentoVenda(id);
            
                DefaultTableModel dadosPg = (DefaultTableModel) frmVr.tabelaPg.getModel();
                 dadosPg.setNumRows(0);

                 vendaPg.forEach((v) -> {
                     dadosPg.addRow(new Object[]{
                         
                         //v.getId(),
                         v.getFormadepagamento(),
                         v.getTipo(),
                         v.getParcela(),
                         v.getValorpagamento()
                        
                     });
            });
            
            /// itens da venda
            int venda_id = Integer.parseInt(tblVendas.getValueAt(tblVendas.getSelectedRow(), 0).toString());
                       
            ItemVendaDAO dao_item = new ItemVendaDAO();
            List<ItemVenda> listaItem = dao_item.listaItensVenda(venda_id);
            
                DefaultTableModel dadosIt = (DefaultTableModel) frmVr.tblItensVenda.getModel();
                 dadosIt.setNumRows(0);

                 listaItem.forEach((iv) -> {
                     dadosIt.addRow(new Object[]{
                         
                         iv.getId(),
                         iv.getProduto().getDescricao(),
                         iv.getQtd(),
                         iv.getProduto().getPrecovenda(),
                         iv.getDescitem(),
                         iv.getAcrescitem(),
                         iv.getSubtotal()
                     });
            });

            frmVr.setVisible(true);
            
            //Desabilitar JtextFiel
            frmVr.txtAcresItem.setEnabled(false);
            frmVr.txtAcrescGeral.setEnabled(false);
            frmVr.txtCdCliente.setEnabled(false);
            frmVr.txtCdVendedor.setEnabled(false);
            frmVr.txtCodigoProduto.setEnabled(false);
            frmVr.txtCpfCliente.setEnabled(false);
            frmVr.txtNmCliente.setEnabled(false);
            frmVr.txtPrecoVenda.setEnabled(false);
            frmVr.txtProdutoVenda.setEnabled(false);
            frmVr.txtQtdItem.setEnabled(false);
            frmVr.txtValorPg.setEnabled(false);
            frmVr.txtVendedorVenda.setEnabled(false);
            frmVr.txtDescGeral.setEnabled(false);
            frmVr.txtDescItem.setEnabled(false);
            
            //Desabilitar combox
            frmVr.combFormaPg.setEnabled(false);
            frmVr.combTipoPg.setEnabled(false);
            frmVr.combParcelaPg.setEnabled(false);
            
            //Desabilitar Jbutton
            frmVr.btnAddFormaPg.setEnabled(false);
            frmVr.btnAddItem.setEnabled(false);
            frmVr.btnExcluirCliente.setEnabled(false);
            frmVr.btnExcluirProduto.setEnabled(false);
            frmVr.btnExcluirvendedor.setEnabled(false);
            frmVr.btnFVenda.setEnabled(false);
            frmVr.btnNovoCliente.setEnabled(false);
            frmVr.btnNovoProduto.setEnabled(false);
            frmVr.btnNovoVendedor.setEnabled(false);
            frmVr.btnPsVendedor.setEnabled(false);
            frmVr.btnPsqCliente.setEnabled(false);
            frmVr.btnPsqProduto.setEnabled(false);
            frmVr.btnRemoveFormaPg.setEnabled(false);
            frmVr.btnRemoverItem.setEnabled(false);
            
        
        } 
    }//GEN-LAST:event_tblVendasMouseClicked

    private void btnFiltrarDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarDtActionPerformed
        
        try {
            DateTimeFormatter formatDt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate dtInicial = LocalDate.parse(txtDtInicial.getText(),formatDt);
        LocalDate dtFinal = LocalDate.parse(txtDtFinal.getText(),formatDt);
        
        VendaDAO dao = new VendaDAO();
        List<Venda> lista = dao.listarVendasPorPeriodo(dtInicial, dtFinal);
        
        DefaultTableModel dados = (DefaultTableModel)tblVendas.getModel();
        
        lista.forEach((venda) -> {
            dados.addRow(new Object[]{
                
                venda.getId(),
                venda.getSituacao(),
                venda.getPessoa().getNome(),               
                venda.getDatavenda(),
                venda.getHoravenda(),
                venda.getTotalvenda(),
                venda.getTrocovenda(),
                venda.getDescvenda(),
                venda.getAcresvenda(),
                venda.getFuncionario().getNomecurto(),
                venda.getFormadepagamento(),
                venda.getTipo(),
                venda.getParcela(),
                venda.getValorpagamento()
                
            });
        });
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "Não contem vendas no periodo informado!");
            
        }
        
    }//GEN-LAST:event_btnFiltrarDtActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        frmV.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnVendaDtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendaDtActionPerformed
        
        frmTpData.setVisible(true);
    }//GEN-LAST:event_btnVendaDtActionPerformed

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
            java.util.logging.Logger.getLogger(frmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmVenda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFiltrarConteudo;
    private javax.swing.JButton btnFiltrarDt;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnNovaVenda;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnVendaDt;
    private javax.swing.JComboBox<String> combFiltrarSituacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFormCadastroCliente;
    private javax.swing.JPanel pnForm;
    public javax.swing.JTable tblVendas;
    private javax.swing.JFormattedTextField txtDtFinal;
    private javax.swing.JFormattedTextField txtDtInicial;
    private javax.swing.JTextField txtFiltrarVenda;
    // End of variables declaration//GEN-END:variables
}
