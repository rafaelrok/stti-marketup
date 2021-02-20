
package br.com.marketup.views;

import br.com.marketup.recursos.Data;
import java.awt.Graphics;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class frmMenu extends javax.swing.JFrame {

        public String usuarioLogado;
        Data mostra_data;
        
        frmProduto frmP = frmProduto.getInstace();
        frmCliente frmC = frmCliente.getInstace();
        frmFuncionarios frmF = frmFuncionarios.getInstace();
        frmFormaPagamento frmPg = frmFormaPagamento.getInstace();
        frmFornecedor frmFn = frmFornecedor.getInstace();
        frmControleEstoque frmCe = frmControleEstoque.getInstace();
        
         private static frmMenu frmMn;
         
         frmSplash inicio;
        
    
    
    public frmMenu() {
        this.setExtendedState(MAXIMIZED_BOTH);
        initComponents();
        
        
        //initComponents();
        mostra_data = new Data();
        mostra_data.le_data();
        lblSemana.setText(mostra_data.dia_semana);
        //lblSemana.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblData.setText(mostra_data.dia + "/" + mostra_data.mes + "/" + mostra_data.ano);
        //lblData.setFont(new java.awt.Font("Tahoma", 0, 14));
        mostra_data.le_hora();
        //horas.start();
        lblLogou.setText(mostra_data.hora);
        //lblLogou.setFont(new java.awt.Font("Tahoma", 0, 14));
        lblUsuario.setText(lblLogou.getText());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/backuground.png"));

        Image image = icon.getImage();
        panelDesktop = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(),getHeight(),this);
            }

        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblSemana = new javax.swing.JLabel();
        lblLogou = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tabMenu = new javax.swing.JTabbedPane();
        pnCliente = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        btnConsulCliente = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        pnFuncionario = new javax.swing.JPanel();
        btnFuncionario = new javax.swing.JButton();
        btnConsultaFunc = new javax.swing.JButton();
        btnEvoluçãoFunc = new javax.swing.JButton();
        pnProduto = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        btnConsulProduto = new javax.swing.JButton();
        pnVenda = new javax.swing.JPanel();
        btnVendas = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        pnDelivery = new javax.swing.JPanel();
        pnFornecedor = new javax.swing.JPanel();
        btnFornecedor = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btnFornecConsult = new javax.swing.JButton();
        pnEstoque = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        pnCadastro = new javax.swing.JPanel();
        btnFormaPgamento = new javax.swing.JButton();
        btnSair1 = new javax.swing.JButton();
        pnConfig = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        pnSair = new javax.swing.JPanel();
        btnLogof = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/login_user.png"))); // NOI18N
        jLabel1.setText("Usuário Logado:");

        lblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lblUsuario.setText("lblUsuario");

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHora.setForeground(new java.awt.Color(102, 102, 102));
        lblHora.setText("00:00:00");

        lblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblData.setForeground(new java.awt.Color(102, 102, 102));
        lblData.setText("00/00/0000");
        lblData.setToolTipText("");

        lblSemana.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSemana.setForeground(new java.awt.Color(102, 102, 102));
        lblSemana.setText("Semana");

        lblLogou.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLogou.setForeground(new java.awt.Color(102, 102, 102));
        lblLogou.setText("jLabel4");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Dia da semana:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Hora:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Entrou:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Data:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogou)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSemana)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblData)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHora)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addComponent(lblHora)
                .addComponent(lblLogou)
                .addComponent(lblSemana)
                .addComponent(lblData)
                .addComponent(jLabel4)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel5))
        );

        tabMenu.setBackground(new java.awt.Color(255, 255, 255));
        tabMenu.setForeground(new java.awt.Color(153, 153, 153));
        tabMenu.setToolTipText("");
        tabMenu.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnCliente.setPreferredSize(new java.awt.Dimension(1023, 60));

        btnCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lista cliente.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnConsulCliente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsulCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnConsulCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/localiza cliente.png"))); // NOI18N
        btnConsulCliente.setText("Localizar");
        btnConsulCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsulCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsulCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulClienteActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/relatório clientes.png"))); // NOI18N
        jButton3.setText("Evolução");
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsulCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(833, Short.MAX_VALUE))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        tabMenu.addTab("Clientes", pnCliente);

        pnFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        pnFuncionario.setForeground(new java.awt.Color(204, 204, 204));

        btnFuncionario.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/funcionario.png"))); // NOI18N
        btnFuncionario.setText("Funcionario");
        btnFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnConsultaFunc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsultaFunc.setForeground(new java.awt.Color(102, 102, 102));
        btnConsultaFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/consul_funcionario.png"))); // NOI18N
        btnConsultaFunc.setText("Consulta");
        btnConsultaFunc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultaFunc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaFuncActionPerformed(evt);
            }
        });

        btnEvoluçãoFunc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEvoluçãoFunc.setForeground(new java.awt.Color(102, 102, 102));
        btnEvoluçãoFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/evolução funcionario.png"))); // NOI18N
        btnEvoluçãoFunc.setText("Evolução");
        btnEvoluçãoFunc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEvoluçãoFunc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnFuncionarioLayout = new javax.swing.GroupLayout(pnFuncionario);
        pnFuncionario.setLayout(pnFuncionarioLayout);
        pnFuncionarioLayout.setHorizontalGroup(
            pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFuncionarioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultaFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEvoluçãoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(833, Short.MAX_VALUE))
        );
        pnFuncionarioLayout.setVerticalGroup(
            pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFuncionarioLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btnConsultaFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEvoluçãoFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        tabMenu.addTab("Funcionarios", pnFuncionario);

        pnProduto.setBackground(new java.awt.Color(255, 255, 255));

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(102, 102, 102));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/produto.png"))); // NOI18N
        jButton18.setText("Produto");
        jButton18.setToolTipText("");
        jButton18.setAutoscrolls(true);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnConsulProduto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnConsulProduto.setForeground(new java.awt.Color(102, 102, 102));
        btnConsulProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/produto_consulta.png"))); // NOI18N
        btnConsulProduto.setText("Consulta");
        btnConsulProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsulProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsulProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsulProduto)
                .addContainerGap(920, Short.MAX_VALUE))
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsulProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        tabMenu.addTab("Produto", pnProduto);

        pnVenda.setBackground(new java.awt.Color(255, 255, 255));

        btnVendas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(102, 102, 102));
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/venda.png"))); // NOI18N
        btnVendas.setText("Venda");
        btnVendas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVendas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 102, 102));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/evolução financeira.png"))); // NOI18N
        jButton10.setText("Evolução");
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 102, 102));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/carteira.png"))); // NOI18N
        jButton11.setText("Carteira");
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(102, 102, 102));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/titulos.png"))); // NOI18N
        jButton12.setText("Financeiro");
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnVendaLayout = new javax.swing.GroupLayout(pnVenda);
        pnVenda.setLayout(pnVendaLayout);
        pnVendaLayout.setHorizontalGroup(
            pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(750, Short.MAX_VALUE))
        );
        pnVendaLayout.setVerticalGroup(
            pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendaLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVendas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnVendaLayout.createSequentialGroup()
                        .addGroup(pnVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );

        tabMenu.addTab("Vendas", pnVenda);

        pnDelivery.setBackground(new java.awt.Color(255, 255, 255));
        pnDelivery.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnDeliveryLayout = new javax.swing.GroupLayout(pnDelivery);
        pnDelivery.setLayout(pnDeliveryLayout);
        pnDeliveryLayout.setHorizontalGroup(
            pnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
        );
        pnDeliveryLayout.setVerticalGroup(
            pnDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        tabMenu.addTab("Delivery", pnDelivery);

        pnFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        pnFornecedor.setForeground(new java.awt.Color(204, 204, 204));

        btnFornecedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/fornecedores.png"))); // NOI18N
        btnFornecedor.setText("Fornecedor");
        btnFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 102, 102));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/compras.png"))); // NOI18N
        jButton7.setText("Compras");
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        btnFornecConsult.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFornecConsult.setForeground(new java.awt.Color(102, 102, 102));
        btnFornecConsult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/consul_fornec.png"))); // NOI18N
        btnFornecConsult.setText("Consulta");
        btnFornecConsult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFornecConsult.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFornecConsult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecConsultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnFornecedorLayout = new javax.swing.GroupLayout(pnFornecedor);
        pnFornecedor.setLayout(pnFornecedorLayout);
        pnFornecedorLayout.setHorizontalGroup(
            pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFornecedorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFornecConsult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(834, Short.MAX_VALUE))
        );
        pnFornecedorLayout.setVerticalGroup(
            pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFornecedorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecConsult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        tabMenu.addTab("Fornecedores", pnFornecedor);

        pnEstoque.setBackground(new java.awt.Color(255, 255, 255));
        pnEstoque.setForeground(new java.awt.Color(204, 204, 204));

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 102, 102));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/estoque.png"))); // NOI18N
        jButton13.setText("Estoque");
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton14.setForeground(new java.awt.Color(102, 102, 102));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/evolução estoque.png"))); // NOI18N
        jButton14.setText("Evolução");
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton15.setForeground(new java.awt.Color(102, 102, 102));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/graficos.png"))); // NOI18N
        jButton15.setText("Grafico");
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnEstoqueLayout = new javax.swing.GroupLayout(pnEstoque);
        pnEstoque.setLayout(pnEstoqueLayout);
        pnEstoqueLayout.setHorizontalGroup(
            pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstoqueLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(833, Short.MAX_VALUE))
        );
        pnEstoqueLayout.setVerticalGroup(
            pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstoqueLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        tabMenu.addTab("Estoque", pnEstoque);

        pnCadastro.setBackground(new java.awt.Color(255, 255, 255));
        pnCadastro.setForeground(new java.awt.Color(102, 102, 102));
        pnCadastro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnFormaPgamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFormaPgamento.setForeground(new java.awt.Color(102, 102, 102));
        btnFormaPgamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/forma_pagamento.png"))); // NOI18N
        btnFormaPgamento.setText("Pagamento");
        btnFormaPgamento.setActionCommand("");
        btnFormaPgamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFormaPgamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFormaPgamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFormaPgamentoActionPerformed(evt);
            }
        });

        btnSair1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSair1.setForeground(new java.awt.Color(102, 102, 102));
        btnSair1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnCadastroLayout = new javax.swing.GroupLayout(pnCadastro);
        pnCadastro.setLayout(pnCadastroLayout);
        pnCadastroLayout.setHorizontalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFormaPgamento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(911, Short.MAX_VALUE))
        );
        pnCadastroLayout.setVerticalGroup(
            pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFormaPgamento, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        tabMenu.addTab("Cadastros", pnCadastro);

        pnConfig.setBackground(new java.awt.Color(255, 255, 255));
        pnConfig.setForeground(new java.awt.Color(204, 204, 204));

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton16.setForeground(new java.awt.Color(102, 102, 102));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/configuração.png"))); // NOI18N
        jButton16.setText("Opções");
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton17.setForeground(new java.awt.Color(102, 102, 102));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/backup.png"))); // NOI18N
        jButton17.setText("Backup");
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnConfigLayout = new javax.swing.GroupLayout(pnConfig);
        pnConfig.setLayout(pnConfigLayout);
        pnConfigLayout.setHorizontalGroup(
            pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConfigLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(919, Short.MAX_VALUE))
        );
        pnConfigLayout.setVerticalGroup(
            pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnConfigLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        tabMenu.addTab("Configurações", pnConfig);

        pnSair.setBackground(new java.awt.Color(255, 255, 255));
        pnSair.setForeground(new java.awt.Color(102, 102, 102));
        pnSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnLogof.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnLogof.setForeground(new java.awt.Color(102, 102, 102));
        btnLogof.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/logout.png"))); // NOI18N
        btnLogof.setText("Logof");
        btnLogof.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogof.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogofActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSair.setForeground(new java.awt.Color(102, 102, 102));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/Sair_sistema.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnSairLayout = new javax.swing.GroupLayout(pnSair);
        pnSair.setLayout(pnSairLayout);
        pnSairLayout.setHorizontalGroup(
            pnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogof)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair)
                .addContainerGap(924, Short.MAX_VALUE))
        );
        pnSairLayout.setVerticalGroup(
            pnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSairLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogof, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        tabMenu.addTab("Sair", pnSair);

        panelDesktop.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panelDesktop.setLayer(tabMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelDesktopLayout = new javax.swing.GroupLayout(panelDesktop);
        panelDesktop.setLayout(panelDesktopLayout);
        panelDesktopLayout.setHorizontalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        panelDesktopLayout.setVerticalGroup(
            panelDesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDesktopLayout.createSequentialGroup()
                .addComponent(tabMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnForm.setBackground(new java.awt.Color(248, 148, 6));
        pnForm.setPreferredSize(new java.awt.Dimension(253, 62));

        lblFormCadastroCliente.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblFormCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/up.png"))); // NOI18N
        lblFormCadastroCliente.setToolTipText("");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(226, 226, 226));
        jLabel6.setText("KET");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(226, 226, 226));
        jLabel7.setText("MARK");

        javax.swing.GroupLayout pnFormLayout = new javax.swing.GroupLayout(pnForm);
        pnForm.setLayout(pnFormLayout);
        pnFormLayout.setHorizontalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFormLayout.createSequentialGroup()
                .addGap(680, 680, 680)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(lblFormCadastroCliente)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose)
                .addGap(10, 10, 10))
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, 1095, Short.MAX_VALUE)
            .addComponent(panelDesktop, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDesktop))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      public frmMenu(frmSplash inicio){
        this.inicio = inicio;
        setProgress(0, "Carregando componentes do sistema.");
        setProgress(1, "Carregando componentes do sistema..");
        setProgress(2, "Carregando componentes do sistema...");
        setProgress(3, "Carregando componentes do sistema....");
        setProgress(4, "Carregando componentes do sistema.....");
        setProgress(5, "Carregando componentes do sistema......");
        setProgress(6, "Carregando componentes do sistema.......");
        setProgress(7, "Carregando componentes do sistema........");
        setProgress(8, "Carregando componentes do sistema.........");
        setProgress(9, "Carregando componentes do sistema..........");
        setProgress(10, "Carregando componentes do sistema...........");
        initComponents();
        setProgress(11, "Conectando ao banco de dados.");
        setProgress(12, "Conectando ao banco de dados..");
        setProgress(13, "Conectando ao banco de dados...");
        setProgress(14, "Conectando ao banco de dados....");
        setProgress(15, "Conectando ao banco de dados.....");
        setProgress(16, "Conectando ao banco de dados......");
        setProgress(17, "Conectando ao banco de dados.......");
        setProgress(18, "Conectando ao banco de dados........");
        setProgress(19, "Conectando ao banco de dados.........");
        setProgress(20, "Conectando ao banco de dados..........");
        setProgress(30, "Carregando os módulos.");
        setProgress(31, "Carregando os módulos..");
        setProgress(32, "Carregando os módulos...");
        setProgress(33, "Carregando os módulos....");
        setProgress(34, "Carregando os módulos.....");
        setProgress(35, "Carregando os módulos......");
        setProgress(36, "Carregando os módulos.......");
        setProgress(37, "Carregando os módulos........");
        setProgress(38, "Carregando os módulos.........");
        setProgress(39, "Carregando os módulos..........");
        setProgress(40, "Carregando os módulos...........");
        setProgress(41, "Carregamento de módulos concluidos.");
        setProgress(42, "Carregamento de módulos concluidos..");
        setProgress(43, "Carregamento de módulos concluidos...");
        setProgress(44, "Carregamento de módulos concluidos....");
        setProgress(45, "Carregamento de módulos concluidos.....");
        setProgress(46, "Carregamento de módulos concluidos......");
        setProgress(60, "Carregando interfaces.");
        setProgress(61, "Carregando interfaces..");
        setProgress(62, "Carregando interfaces...");
        setProgress(63, "Carregando interfaces....");
        setProgress(64, "Carregando interfaces.....");
        setProgress(65, "Carregando interfaces......");
        setProgress(81, "Interface carregada.");
        setProgress(82, "Interface carregada..");
        setProgress(83, "Interface carregada...");
        setProgress(84, "Interface carregada....");
        setProgress(85, "Interface carregada.....");
        setProgress(86, "Interface carregada......");
        setProgress(87, "Interface carregada......");
        setProgress(88, "Interface carregada......");
        setProgress(89, "Interface carregada......");
        setProgress(90, "Interface carregada......");
        setProgress(91, "Bem vindo ao sistema!! ");
        setProgress(92, "Bem vindo ao sistema!!   ");
        setProgress(93, "Bem vindo ao sistema!!    ");
        setProgress(94, "Bem vindo ao sistema!!     ");
        setProgress(95, "Bem vindo ao sistema!!      ");
        setProgress(96, "Bem vindo ao sistema!!       ");
        setProgress(97, "Bem vindo ao sistema!!        ");
        setProgress(98, "Bem vindo ao sistema!!         ");
        setProgress(99, "Bem vindo ao sistema!!          ");
        setProgress(100, "Bem vindo ao sistema!!           ");
        //this.setSize(410,500);
        
    }
    
    void setProgress(int percent, String informacao){
        inicio.getJLabel().setText(informacao);
        inicio.getJProgressBar().setValue(percent);
        inicio.progresso.setStringPainted(true);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            JOptionPane.showMessageDialog(this, "Não foi possível carregar o sistema");
        }
    }
    
    public static frmMenu getInstace(){
    
        if(frmMn==null){
            frmMn = new frmMenu();
        }
        return frmMn;
    }
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        Date hrAtual = new Date();
        SimpleDateFormat hrFormat = new SimpleDateFormat("HH:mm:ss");
        String hrFormatada = hrFormat.format(hrAtual);
        lblHora.setText(hrFormatada);
        
        lblUsuario.setText(usuarioLogado);
        this.setVisible(true);
    }//GEN-LAST:event_formWindowActivated

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
       
        JFrame form = new frmVenda();
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
        new frmVenda();
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnLogofActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogofActionPerformed
        
        int op;
        op = JOptionPane.showConfirmDialog(null, "Deseja mudar o usuário ?");
        
        if(op == 0){ 
            
            JFrame form = new frmLogin();
            this.dispose();
            form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            form.setLocationRelativeTo(null);
            form.setResizable(false);
            form.setVisible(true);
            new frmLogin();           
        }              
    }//GEN-LAST:event_btnLogofActionPerformed

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        
        int op;
        op = JOptionPane.showConfirmDialog(null, "Deseja realmente sair ?");
        
        if(op == 0){        
            System.exit(0);           
        }
    }//GEN-LAST:event_btnSairMouseClicked

    private void btnConsulProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulProdutoActionPerformed
       
        frmP.pnPrincipal.setSelectedIndex(2);
        frmP.setVisible(true);
    }//GEN-LAST:event_btnConsulProdutoActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        
        frmC.setFocusableWindowState(true);
        frmC.setFocusable(true);
        frmC.setVisible(true);
    }//GEN-LAST:event_btnClienteActionPerformed

    private void btnConsulClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulClienteActionPerformed
        
        frmC.tabPnCadastro.setSelectedIndex(1);
        frmC.setVisible(true);
    }//GEN-LAST:event_btnConsulClienteActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        
        frmF.setVisible(true);
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnConsultaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaFuncActionPerformed
        
        frmF.pnPrincipal.setSelectedIndex(1);
        frmF.setVisible(true);
    }//GEN-LAST:event_btnConsultaFuncActionPerformed

    private void btnFormaPgamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFormaPgamentoActionPerformed
        
        frmPg.setVisible(true);
    }//GEN-LAST:event_btnFormaPgamentoActionPerformed

    private void btnFornecConsultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecConsultActionPerformed
        
        frmFn.tabPnCadastroForn.setSelectedIndex(1);
        frmFn.setVisible(true);
    }//GEN-LAST:event_btnFornecConsultActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        
        frmFn.setLocationRelativeTo(null);
        frmFn.setResizable(false);
        frmFn.setVisible(true);
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        frmCe.setLocationRelativeTo(null);
        frmCe.setResizable(false);
        frmCe.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed
  
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConsulCliente;
    private javax.swing.JButton btnConsulProduto;
    private javax.swing.JButton btnConsultaFunc;
    private javax.swing.JButton btnEvoluçãoFunc;
    private javax.swing.JButton btnFormaPgamento;
    private javax.swing.JButton btnFornecConsult;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnLogof;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSair1;
    private javax.swing.JButton btnVendas;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblFormCadastroCliente;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogou;
    private javax.swing.JLabel lblSemana;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JDesktopPane panelDesktop;
    private javax.swing.JPanel pnCadastro;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnConfig;
    private javax.swing.JPanel pnDelivery;
    private javax.swing.JPanel pnEstoque;
    private javax.swing.JPanel pnForm;
    private javax.swing.JPanel pnFornecedor;
    private javax.swing.JPanel pnFuncionario;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnSair;
    private javax.swing.JPanel pnVenda;
    private javax.swing.JTabbedPane tabMenu;
    // End of variables declaration//GEN-END:variables
}
