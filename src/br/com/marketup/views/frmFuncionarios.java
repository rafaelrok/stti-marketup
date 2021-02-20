
package br.com.marketup.views;

import br.com.marketup.dao.FuncionariosDAO;
import br.com.marketup.nogocio.Funcionario;
import br.com.marketup.recursos.EncriptaSenha;
import br.com.marketup.recursos.Utilitarios;
import br.com.marketup.viacep.ViaCEP;
import br.com.marketup.viacep.ViaCEPException;
import java.awt.Color;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafae
 */
public class frmFuncionarios extends javax.swing.JFrame {


    private static frmFuncionarios frmF;
    
    Utilitarios util = new Utilitarios();
    
    String cpf;
    
    public void listar(){
        
        FuncionariosDAO dao = new FuncionariosDAO();
        List<Funcionario> lista =  dao.listarFuncionarios();
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);
        
        lista.forEach((funcionario) -> {
            dados.addRow(new Object[]{
                
                funcionario.getId(),
                funcionario.getStatus(),
                funcionario.getNivelacesso(),          
                funcionario.getNomecurto(),
                funcionario.getSenha(),
                funcionario.getConfirmasenha(),
                funcionario.getNome(),
                funcionario.getCpf(), 
                funcionario.getCargo(),
                funcionario.getEmail(),
                funcionario.getCelular(),
                funcionario.getTelefone(),               
                funcionario.getCep(),
                funcionario.getLogradouro(),
                funcionario.getNumero(),
                funcionario.getUf(),              
                funcionario.getBairro(),
                funcionario.getCidade(),
                funcionario.getIbge(),
                funcionario.getComplemento()
                
            });
        });
        
    }
    
    public frmFuncionarios() {
        initComponents();
        
         //inativos
        btnSalvarF.setEnabled(false);
        btnCancelarF.setEnabled(false);
        btnExcluirF.setEnabled(false);
        btnEditarF.setEnabled(false);
        
        util.DesabilitaEdicao(tabCadastro);
        util.InativaCampos(tabCadastro);
              
        //ativos
        btnNovoF.setEnabled(true);
        btnSair.setEnabled(true);
        btnPesquisarRapidaF.setEnabled(true);
        txtNomeCurto.setEditable(true);
        txtNomeCurto.setEnabled(true);
        
        //Alertas de validação
        alertUser.setVisible(false);
   
        alertSenha.setVisible(false);
        alertConfirmaSenha.setVisible(false);
        alertNivel.setVisible(false);
        alertCpf.setVisible(false);
        alertNome.setVisible(false);
        alertCep.setVisible(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        pnForm = new javax.swing.JPanel();
        lblFormCadastroCliente = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        pnBotoes = new javax.swing.JPanel();
        btnCancelarF = new javax.swing.JButton();
        btnSalvarF = new javax.swing.JButton();
        btnEditarF = new javax.swing.JButton();
        btnNovoF = new javax.swing.JButton();
        btnExcluirF = new javax.swing.JButton();
        pnPrincipal = new javax.swing.JTabbedPane();
        tabCadastro = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        combStatus = new javax.swing.JComboBox<>();
        combNivelAcesso = new javax.swing.JComboBox<>();
        txtNomeCurto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnPesquisarRapidaF = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtConfirmaSenha = new javax.swing.JPasswordField();
        combCargo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtLogradouro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        combUf = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtIbge = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        alertUser = new javax.swing.JLabel();
        alertSenha = new javax.swing.JLabel();
        alertConfirmaSenha = new javax.swing.JLabel();
        alertNivel = new javax.swing.JLabel();
        alertCpf = new javax.swing.JLabel();
        alertNome = new javax.swing.JLabel();
        alertCep = new javax.swing.JLabel();
        tabConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        txtPesquisarF = new javax.swing.JTextField();
        btnPesquisarF = new javax.swing.JToggleButton();
        jLabel21 = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnForm.setBackground(new java.awt.Color(44, 79, 103));

        lblFormCadastroCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblFormCadastroCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCadastroCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFormCadastroCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/funcionario_add .png"))); // NOI18N
        lblFormCadastroCliente.setText("Funcionário");
        lblFormCadastroCliente.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblFormCadastroCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

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
                .addComponent(lblFormCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnFormLayout.setVerticalGroup(
            pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormLayout.createSequentialGroup()
                .addGroup(pnFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnFormLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblFormCadastroCliente))
                    .addGroup(pnFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnBotoes.setBackground(new java.awt.Color(230, 230, 230));

        btnCancelarF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCancelarF.setForeground(new java.awt.Color(102, 102, 102));
        btnCancelarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/cancelar.png"))); // NOI18N
        btnCancelarF.setText("Cancelar");
        btnCancelarF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarFActionPerformed(evt);
            }
        });

        btnSalvarF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalvarF.setForeground(new java.awt.Color(102, 102, 102));
        btnSalvarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/salvar.png"))); // NOI18N
        btnSalvarF.setText("Salvar");
        btnSalvarF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalvarF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalvarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFActionPerformed(evt);
            }
        });

        btnEditarF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditarF.setForeground(new java.awt.Color(102, 102, 102));
        btnEditarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/editar.png"))); // NOI18N
        btnEditarF.setText("Editar");
        btnEditarF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFActionPerformed(evt);
            }
        });

        btnNovoF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNovoF.setForeground(new java.awt.Color(102, 102, 102));
        btnNovoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/add.png"))); // NOI18N
        btnNovoF.setText("Novo");
        btnNovoF.setToolTipText("");
        btnNovoF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFActionPerformed(evt);
            }
        });

        btnExcluirF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExcluirF.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/excluir - .png"))); // NOI18N
        btnExcluirF.setText("Excluir");
        btnExcluirF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirF.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluirF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFActionPerformed(evt);
            }
        });

        pnPrincipal.setBackground(new java.awt.Color(204, 204, 204));
        pnPrincipal.setForeground(new java.awt.Color(102, 102, 102));
        pnPrincipal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tabCadastro.setBackground(new java.awt.Color(230, 230, 230));

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(230, 230, 230));
        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigo.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Código:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Situação:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nivel de Acesso:");

        combStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combStatus.setForeground(new java.awt.Color(102, 102, 102));
        combStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ATIVO", "INATIVO" }));

        combNivelAcesso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combNivelAcesso.setForeground(new java.awt.Color(102, 102, 102));
        combNivelAcesso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "TECNÍCO", "VENDEDOR" }));
        combNivelAcesso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                combNivelAcessoFocusLost(evt);
            }
        });

        txtNomeCurto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNomeCurto.setForeground(new java.awt.Color(102, 102, 102));
        txtNomeCurto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeCurtoFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Usuário:");

        btnPesquisarRapidaF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPesquisarRapidaF.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisarRapidaF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesquisarRapidaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarRapidaFActionPerformed(evt);
            }
        });

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(102, 102, 102));
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nome Completo:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Senha:");

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(102, 102, 102));
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Confirma Senha:");

        txtConfirmaSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtConfirmaSenha.setForeground(new java.awt.Color(102, 102, 102));
        txtConfirmaSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtConfirmaSenhaFocusLost(evt);
            }
        });

        combCargo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combCargo.setForeground(new java.awt.Color(102, 102, 102));
        combCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRATIVO", "GERENTE", "VENDEDOR", "MOTORISTA", "MOTOBOY", "CAIXA" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("CPF:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Cargo:");

        txtCpf.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Email:");

        txtCelular.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTelefone.setForeground(new java.awt.Color(102, 102, 102));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("CEP:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Celular:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Telefone:");

        txtLogradouro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLogradouro.setForeground(new java.awt.Color(102, 102, 102));

        txtNumero.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(102, 102, 102));

        combUf.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combUf.setForeground(new java.awt.Color(102, 102, 102));
        combUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("Logradouro:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Numero:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("UF:");

        txtBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(102, 102, 102));

        txtCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(102, 102, 102));

        txtIbge.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtIbge.setForeground(new java.awt.Color(102, 102, 102));

        txtComplemento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtComplemento.setForeground(new java.awt.Color(102, 102, 102));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Bairro:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText("Cidade:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("IBGE:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Complemento:");

        txtCep.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCep.setForeground(new java.awt.Color(102, 102, 102));
        txtCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCepKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCepKeyTyped(evt);
            }
        });

        alertUser.setForeground(new java.awt.Color(204, 0, 0));
        alertUser.setText(" Obrigátorio!");

        alertSenha.setForeground(new java.awt.Color(204, 0, 0));
        alertSenha.setText("Obrigátorio!");

        alertConfirmaSenha.setForeground(new java.awt.Color(204, 0, 0));
        alertConfirmaSenha.setText("Obrigátorio!");

        alertNivel.setForeground(new java.awt.Color(204, 0, 0));
        alertNivel.setText("Obrigátorio!");

        alertCpf.setForeground(new java.awt.Color(204, 0, 0));
        alertCpf.setText("Obrigátorio!");

        alertNome.setForeground(new java.awt.Color(204, 0, 0));
        alertNome.setText("Obrigátorio!");

        alertCep.setForeground(new java.awt.Color(204, 0, 0));
        alertCep.setText("CEP Invalido!");

        javax.swing.GroupLayout tabCadastroLayout = new javax.swing.GroupLayout(tabCadastro);
        tabCadastro.setLayout(tabCadastroLayout);
        tabCadastroLayout.setHorizontalGroup(
            tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCadastroLayout.createSequentialGroup()
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addGap(506, 506, 506)
                                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpf)
                                    .addComponent(txtCelular)))
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(alertCep))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLogradouro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastroLayout.createSequentialGroup()
                                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumero)
                                    .addGroup(tabCadastroLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(combUf, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(combCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(tabCadastroLayout.createSequentialGroup()
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(10, 10, 10)
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCidade)
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIbge, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(10, 10, 10)
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabCadastroLayout.createSequentialGroup()
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtEmail)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabCadastroLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(alertNome))
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabCadastroLayout.createSequentialGroup()
                                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(tabCadastroLayout.createSequentialGroup()
                                            .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(tabCadastroLayout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(alertUser))
                                                .addComponent(txtNomeCurto, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(10, 10, 10)
                                            .addComponent(btnPesquisarRapidaF, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(tabCadastroLayout.createSequentialGroup()
                                            .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel1))
                                            .addGap(10, 10, 10)
                                            .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(10, 10, 10)
                                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(tabCadastroLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(alertSenha))
                                        .addComponent(txtSenha)
                                        .addComponent(combNivelAcesso, 0, 177, Short.MAX_VALUE)
                                        .addGroup(tabCadastroLayout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(alertNivel)))))
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(135, 135, 135)
                                .addComponent(jLabel14))
                            .addComponent(jLabel10))
                        .addGap(10, 10, 10)
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(alertCpf)
                                .addGap(1, 1, 1))
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(tabCadastroLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                .addComponent(alertConfirmaSenha))
                            .addComponent(txtConfirmaSenha))
                        .addGap(287, 287, 287)))
                .addContainerGap())
        );
        tabCadastroLayout.setVerticalGroup(
            tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(alertNivel))
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisarRapidaF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabCadastroLayout.createSequentialGroup()
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combNivelAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabCadastroLayout.createSequentialGroup()
                                .addComponent(alertUser)
                                .addGap(1, 1, 1))
                            .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addComponent(jLabel4)
                            .addComponent(alertSenha)
                            .addComponent(alertConfirmaSenha))
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeCurto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(alertNome)
                            .addComponent(jLabel8))
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(alertCpf)
                        .addComponent(jLabel9)))
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel12)))
                .addGap(0, 0, 0)
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jLabel14)
                        .addComponent(alertCep))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)))
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(combUf, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCep, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(0, 0, 0)
                .addGroup(tabCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIbge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnPrincipal.addTab("Cadastro", tabCadastro);

        tabConsulta.setBackground(new java.awt.Color(230, 230, 230));

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

        tabelaFuncionario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Status", "Nivel de Acesso", "Usuário", "senha", "Conf.Senha", "Nome", "CPF", "Cargo", "Email", "Celular", "Telefone", "cep", "Logradouro", "Numero", "UF", "Bairro", "Cidade", "IBGE", "Complemento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaFuncionario);
        if (tabelaFuncionario.getColumnModel().getColumnCount() > 0) {
            tabelaFuncionario.getColumnModel().getColumn(0).setPreferredWidth(60);
            tabelaFuncionario.getColumnModel().getColumn(1).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(1).setPreferredWidth(60);
            tabelaFuncionario.getColumnModel().getColumn(2).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabelaFuncionario.getColumnModel().getColumn(3).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(4).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(4).setPreferredWidth(60);
            tabelaFuncionario.getColumnModel().getColumn(5).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(5).setPreferredWidth(70);
            tabelaFuncionario.getColumnModel().getColumn(6).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(6).setPreferredWidth(120);
            tabelaFuncionario.getColumnModel().getColumn(7).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(7).setPreferredWidth(90);
            tabelaFuncionario.getColumnModel().getColumn(8).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(8).setPreferredWidth(100);
            tabelaFuncionario.getColumnModel().getColumn(9).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(9).setPreferredWidth(120);
            tabelaFuncionario.getColumnModel().getColumn(10).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(10).setPreferredWidth(80);
            tabelaFuncionario.getColumnModel().getColumn(11).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(11).setPreferredWidth(80);
            tabelaFuncionario.getColumnModel().getColumn(12).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(12).setPreferredWidth(70);
            tabelaFuncionario.getColumnModel().getColumn(13).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(14).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(14).setPreferredWidth(60);
            tabelaFuncionario.getColumnModel().getColumn(15).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(15).setPreferredWidth(50);
            tabelaFuncionario.getColumnModel().getColumn(16).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(17).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(18).setResizable(false);
            tabelaFuncionario.getColumnModel().getColumn(18).setPreferredWidth(60);
            tabelaFuncionario.getColumnModel().getColumn(19).setResizable(false);
        }

        txtPesquisarF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPesquisarF.setForeground(new java.awt.Color(102, 102, 102));
        txtPesquisarF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarFKeyPressed(evt);
            }
        });

        btnPesquisarF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPesquisarF.setForeground(new java.awt.Color(102, 102, 102));
        btnPesquisarF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/marketup/icones/lupaP_25x25.png"))); // NOI18N
        btnPesquisarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 102));
        jLabel21.setText("Pesquisar");

        javax.swing.GroupLayout tabConsultaLayout = new javax.swing.GroupLayout(tabConsulta);
        tabConsulta.setLayout(tabConsultaLayout);
        tabConsultaLayout.setHorizontalGroup(
            tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 985, Short.MAX_VALUE)
                    .addGroup(tabConsultaLayout.createSequentialGroup()
                        .addGroup(tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtPesquisarF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarF)))
                .addContainerGap())
        );
        tabConsultaLayout.setVerticalGroup(
            tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(2, 2, 2)
                .addGroup(tabConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPrincipal.addTab("Consultar", tabConsulta);

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
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPrincipal)
                    .addGroup(pnBotoesLayout.createSequentialGroup()
                        .addComponent(btnNovoF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelarF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalvarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelarF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluirF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovoF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            txtComplemento.setText(viaCep.getComplemento());
            combUf.setSelectedItem(viaCep.getUf());
            alertCep.setVisible(false);
            txtCep.setBorder(new LineBorder(Color.GRAY));
            
            
        } catch (ViaCEPException erro) {
            JOptionPane.showMessageDialog(null, "Ops, CEP não localizado!\n " 
                    + "\nNão foi possivel localizar o CEP, Verifiquei por favor!.");
            txtCep.setText(null);
            txtLogradouro.setText(null);
            txtNumero.setText(null);
            txtBairro.setText(null);
            txtCidade.setText(null);
            txtComplemento.setText(null);
            txtIbge.setText(null);
            combUf.setSelectedItem(null);
            alertCep.setVisible(true);
            txtCep.setBorder(new LineBorder(Color.RED));
        }
    }  
     
     public static frmFuncionarios getInstace(){
    
        if(frmF==null){
            frmF = new frmFuncionarios();
        }
        return frmF;
    }
     
    private void btnNovoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFActionPerformed
        
        util.LimpaTela(tabCadastro);
        util.HabilitaEdicao(tabCadastro);
        util.AtivaCampos(tabCadastro);
        btnSalvarF.setEnabled(true);
        btnSair.setEnabled(true);
        btnEditarF.setEnabled(false);
        btnNovoF.setEnabled(false);
        btnExcluirF.setEnabled(false);
        btnPesquisarRapidaF.setEnabled(false);
        txtCodigo.setEditable(false);
        txtCodigo.setEnabled(false);
        btnCancelarF.setEnabled(true);
        
    }//GEN-LAST:event_btnNovoFActionPerformed

    private void btnSalvarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFActionPerformed

        
        try {
            
            Funcionario obj = new Funcionario();           
 
            obj.setStatus(combStatus.getSelectedItem().toString());
            obj.setNome(txtNome.getText());
            obj.setNomecurto(txtNomeCurto.getText());
            obj.setCpf(txtCpf.getText());
            obj.setEmail(txtEmail.getText());
            obj.setSenha(EncriptaSenha.encripta(txtSenha.getText()));
            obj.setConfirmasenha(EncriptaSenha.encripta(txtConfirmaSenha.getText()));
            obj.setCargo(combCargo.getSelectedItem().toString());
            obj.setNivelacesso(combNivelAcesso.getSelectedItem().toString());
            obj.setTelefone(txtTelefone.getText());
            obj.setCelular(txtCelular.getText());
            obj.setCep(txtCep.getText());
            obj.setLogradouro(txtLogradouro.getText());
            obj.setNumero(Integer.parseInt(txtNumero.getText()));
            obj.setComplemento(txtComplemento.getText());
            obj.setBairro(txtBairro.getText());
            obj.setCidade(txtCidade.getText());
            obj.setUf(combUf.getSelectedItem().toString());
            obj.setIbge(txtIbge.getText());
                       
            FuncionariosDAO dao = new FuncionariosDAO();
            dao.inserirFuncionario(obj);
            
            util.LimpaTela(tabCadastro);
            util.DesabilitaEdicao(tabCadastro);
            util.InativaCampos(tabCadastro);
            
            btnSalvarF.setEnabled(false);
            btnCancelarF.setEnabled(false);
            btnExcluirF.setEnabled(false);
            btnEditarF.setEnabled(false);
            btnNovoF.setEnabled(true);
            btnSair.setEnabled(true);
            btnPesquisarRapidaF.setEnabled(true);
            txtNome.setEnabled(true);
            
     
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnSalvarFActionPerformed
      
    private void btnEditarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFActionPerformed
   
        try {
            Funcionario obj = new Funcionario();
            
            obj.setStatus(combStatus.getSelectedItem().toString());
            obj.setNivelacesso(combNivelAcesso.getSelectedItem().toString());
            obj.setNomecurto(txtNomeCurto.getText());
            obj.setSenha(EncriptaSenha.encripta(txtSenha.getText()));
            obj.setConfirmasenha(EncriptaSenha.encripta(txtConfirmaSenha.getText()));
            obj.setNome(txtNome.getText());
            obj.setCpf(txtCpf.getText());
            obj.setCargo(combCargo.getSelectedItem().toString());
            obj.setEmail(txtEmail.getText());
            obj.setCelular(txtCelular.getText());
            obj.setTelefone(txtTelefone.getText());
            obj.setCep(txtCep.getText());
            obj.setLogradouro(txtLogradouro.getText());
            obj.setNumero(Integer.parseInt(txtNumero.getText()));
            obj.setUf(combUf.getSelectedItem().toString());
            obj.setBairro(txtBairro.getText());
            obj.setCidade(txtCidade.getText());
            obj.setIbge(txtIbge.getText());
            obj.setComplemento(txtComplemento.getText());
            obj.setId(Integer.parseInt(txtCodigo.getText()));
            
            FuncionariosDAO dao = new FuncionariosDAO();
            dao.alterarFuncionario(obj);
                      
            util.LimpaTela(tabCadastro);
            util.DesabilitaEdicao(tabCadastro);
            util.InativaCampos(tabCadastro);
            
            btnSalvarF.setEnabled(false);
            btnCancelarF.setEnabled(false);
            btnExcluirF.setEnabled(false);
            btnEditarF.setEnabled(false);
            btnNovoF.setEnabled(true);
            btnSair.setEnabled(true);
            btnPesquisarRapidaF.setEnabled(true);
            txtNomeCurto.setEnabled(true);
            txtNomeCurto.setEditable(true);
   
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnEditarFActionPerformed

    private void btnCancelarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarFActionPerformed
        
        int msg = 0;
        
        msg = JOptionPane.showConfirmDialog(null, "Deseja realmente cancelar o registro ?");
        
        if(msg == 0){
        
            util.LimpaTela(tabCadastro);
            util.DesabilitaEdicao(tabCadastro);
            util.InativaCampos(tabCadastro);
            btnSair.setEnabled(true);
            btnPesquisarRapidaF.setEnabled(true);
            btnCancelarF.setEnabled(false);
            btnSalvarF.setEnabled(false);
            btnNovoF.setEnabled(true);
            txtNomeCurto.setEditable(true);
            txtNomeCurto.setEnabled(true);
           
            alertUser.setVisible(false);
            alertSenha.setVisible(false);
            alertConfirmaSenha.setVisible(false);
            alertNivel.setVisible(false);
            alertCpf.setVisible(false);
            alertNome.setVisible(false);
            alertCep.setVisible(false);
            
            txtSenha.setBorder(new LineBorder(Color.GRAY));
            txtConfirmaSenha.setBorder(new LineBorder(Color.GRAY));
            txtNomeCurto.setBorder(new LineBorder(Color.GRAY));
            txtNome.setBorder(new LineBorder(Color.GRAY));
            txtCpf.setBorder(new LineBorder(Color.GRAY));
            combCargo.setBorder(new LineBorder(Color.GRAY));
            combNivelAcesso.setBorder(new LineBorder(Color.GRAY));
            combStatus.setBorder(new LineBorder(Color.GRAY));
            txtCep.setBorder(new LineBorder(Color.GRAY));
        }     
            
    }//GEN-LAST:event_btnCancelarFActionPerformed

    private void tabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaFuncionarioMouseClicked
        
        if (evt.getClickCount() == 2) 
        {
            
        pnPrincipal.setSelectedIndex(0);
        
        txtCodigo.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 0).toString());
        combStatus.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 1).toString());
        combNivelAcesso.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 2).toString());
        txtNomeCurto.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 3).toString());
        txtSenha.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 4).toString());
        txtConfirmaSenha.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 5).toString()); 
        txtNome.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 6).toString());        
        txtCpf.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 7).toString());
        combCargo.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 8).toString());
        txtEmail.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 9).toString());
        txtCelular.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 10).toString());
        txtTelefone.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 11).toString());                             
        txtCep.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 12).toString());
        txtLogradouro.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 13).toString());
        txtNumero.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 14).toString());
        combUf.setSelectedItem(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 15).toString());       
        txtBairro.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 16).toString());
        txtCidade.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 17).toString());    
        txtIbge.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 18).toString()); 
        txtComplemento.setText(tabelaFuncionario.getValueAt(tabelaFuncionario.getSelectedRow(), 19).toString());
           
        tabCadastro.setVisible(true);
        util.AtivaCampos(tabCadastro);
        util.HabilitaEdicao(tabCadastro);
        
        btnEditarF.setEnabled(true);
        btnCancelarF.setEnabled(true);
        btnExcluirF.setEnabled(true);
        btnNovoF.setEnabled(false);
        
        }     
                  
        
 
        
    }//GEN-LAST:event_tabelaFuncionarioMouseClicked

    private void btnPesquisarRapidaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarRapidaFActionPerformed
        
            String nomecurto = txtNomeCurto.getText();
            Funcionario obj = new Funcionario();
            FuncionariosDAO dao = new FuncionariosDAO();
            
            obj = dao.consultarPorNomeCurto(nomecurto);
            
            if(obj.getNome() != null){
            
            txtCodigo.setText(String.valueOf(obj.getId()));
            combStatus.setSelectedItem(obj.getStatus());
            combNivelAcesso.setSelectedItem(obj.getNivelacesso());
            txtNomeCurto.setText(obj.getNomecurto());
            txtSenha.setText(obj.getSenha());
            txtConfirmaSenha.setText(obj.getConfirmasenha());
            txtNome.setText(obj.getNome());
            txtCpf.setText(obj.getCpf());
            combCargo.setSelectedItem(obj.getCargo());
            txtEmail.setText(obj.getEmail());
            txtCelular.setText(obj.getCelular());  
            txtTelefone.setText(obj.getTelefone()); 
            txtCep.setText(obj.getCep());
            txtLogradouro.setText(obj.getLogradouro());
            txtNumero.setText(String.valueOf(obj.getNumero()));
            combUf.setSelectedItem(obj.getUf());
            txtBairro.setText(obj.getBairro());
            txtCidade.setText(obj.getCidade());
            txtIbge.setText(obj.getIbge());
            txtComplemento.setText(obj.getComplemento());
            
            btnEditarF.setEnabled(true);
            btnExcluirF.setEnabled(true);
            btnCancelarF.setEnabled(true);
            txtNomeCurto.setEditable(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Funcionario não encontrado! ");
            }
    }//GEN-LAST:event_btnPesquisarRapidaFActionPerformed

    private void btnPesquisarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFActionPerformed
        
        String nome ="%" + txtPesquisarF.getText() + "%";
        
        FuncionariosDAO dao = new FuncionariosDAO();
        List<Funcionario> lista =  dao.buscarFuncionarioPorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);
        
        lista.forEach((funcionario) -> {
            dados.addRow(new Object[]{
                
                funcionario.getId(),
                funcionario.getStatus(),
                funcionario.getNivelacesso(),          
                funcionario.getNomecurto(),
                funcionario.getSenha(),
                funcionario.getConfirmasenha(),
                funcionario.getNome(),
                funcionario.getCpf(), 
                funcionario.getCargo(),
                funcionario.getEmail(),
                funcionario.getCelular(),
                funcionario.getTelefone(),               
                funcionario.getCep(),
                funcionario.getLogradouro(),
                funcionario.getNumero(),
                funcionario.getUf(),              
                funcionario.getBairro(),
                funcionario.getCidade(),
                funcionario.getIbge(),
                funcionario.getComplemento()
            });
        });
    }//GEN-LAST:event_btnPesquisarFActionPerformed

    private void txtPesquisarFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarFKeyPressed
        
        String nome ="%" + txtPesquisarF.getText() + "%";
        
        FuncionariosDAO dao = new FuncionariosDAO();
        List<Funcionario> lista =  dao.buscarFuncionarioPorNOme(nome);
        DefaultTableModel dados = (DefaultTableModel) tabelaFuncionario.getModel();
        dados.setNumRows(0);
        
        lista.forEach((funcionario) -> {
            dados.addRow(new Object[]{
                
                funcionario.getId(),
                funcionario.getStatus(),
                funcionario.getNivelacesso(),          
                funcionario.getNomecurto(),
                funcionario.getSenha(),
                funcionario.getConfirmasenha(),
                funcionario.getNome(),
                funcionario.getCpf(), 
                funcionario.getCargo(),
                funcionario.getEmail(),
                funcionario.getCelular(),
                funcionario.getTelefone(),               
                funcionario.getCep(),
                funcionario.getLogradouro(),
                funcionario.getNumero(),
                funcionario.getUf(),              
                funcionario.getBairro(),
                funcionario.getCidade(),
                funcionario.getIbge(),
                funcionario.getComplemento()
            });
        });
    }//GEN-LAST:event_txtPesquisarFKeyPressed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked

        this.dispose();
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btnExcluirFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFActionPerformed
       
        int msg = 0;
        
         msg = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o funcionario ?");

         if(msg == 0){
                try {
                Funcionario obj = new Funcionario();

                obj.setId(Integer.parseInt(txtCodigo.getText()));

                FuncionariosDAO dao = new FuncionariosDAO();
                dao.excluirFuncionario(obj);

                util.LimpaTela(tabCadastro);
                util.DesabilitaEdicao(tabCadastro);
                util.InativaCampos(tabCadastro);
                btnSair.setEnabled(true);
                btnPesquisarRapidaF.setEnabled(true);
                txtNomeCurto.setEditable(true);
                txtNomeCurto.setEnabled(true);

            } catch (NumberFormatException e) {
            }
         }else {
             
                util.LimpaTela(tabCadastro);
                util.DesabilitaEdicao(tabCadastro);
                util.InativaCampos(tabCadastro);
                btnSair.setEnabled(true);
                btnPesquisarRapidaF.setEnabled(true);
                txtNomeCurto.setEditable(true);
                txtNomeCurto.setEnabled(true);
         
         }
        
    }//GEN-LAST:event_btnExcluirFActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

        listar();
               
    }//GEN-LAST:event_formWindowActivated

    private void txtCepKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyReleased
        
        txtLogradouro.setText("Localizando Endereço...");
                    if (txtCep.getText().length() <= 8)
                    {
                       buscarCep(txtCep.getText());    
                    }else{
                        txtLogradouro.setText(null);
                    }
    }//GEN-LAST:event_txtCepKeyReleased

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
         if (txtSenha.getText().equals(" ") || txtSenha.getText().isEmpty()) {
            alertSenha.setVisible(true);
            txtSenha.setBorder(new LineBorder(Color.RED));
            //txtSenha.requestFocus();
            //txtNomeCurto.setBackground(Color.red);
        } else {
            alertSenha.setVisible(false);   
            txtSenha.setBorder(new LineBorder(Color.GRAY));

        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtConfirmaSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtConfirmaSenhaFocusLost
         if (txtConfirmaSenha.getText().equals(" ") || txtConfirmaSenha.getText().isEmpty()) {
            alertConfirmaSenha.setVisible(true);
            txtConfirmaSenha.setBorder(new LineBorder(Color.RED));
            //txtConfirmaSenha.requestFocus();
            //txtNomeCurto.setBackground(Color.red);
        } else {
            alertConfirmaSenha.setVisible(false);   
            txtConfirmaSenha.setBorder(new LineBorder(Color.GRAY));

        }
    }//GEN-LAST:event_txtConfirmaSenhaFocusLost

    private void txtNomeCurtoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeCurtoFocusLost
        if (txtNomeCurto.getText().equals(" ") || txtNomeCurto.getText().isEmpty()) {
            alertUser.setVisible(true);
            txtNomeCurto.setBorder(new LineBorder(Color.RED));
            //txtNomeCurto.requestFocus();
            //txtNomeCurto.setBackground(Color.red);
        } else {
            alertUser.setVisible(false);   
            txtNomeCurto.setBorder(new LineBorder(Color.GRAY));

        }
    }//GEN-LAST:event_txtNomeCurtoFocusLost

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
         if (txtNome.getText().equals(" ") || txtNome.getText().isEmpty()) {
            alertNome.setVisible(true);
            txtNome.setBorder(new LineBorder(Color.RED));
            //txtNome.requestFocus();
            //txtNomeCurto.setBackground(Color.red);
        } else {
            alertNome.setVisible(false);   
            txtNome.setBorder(new LineBorder(Color.GRAY));

        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
       
        cpf = txtCpf.getText();
        
        if (Utilitarios.validaCpf(String.valueOf(cpf)) == false) {
            alertCpf.setVisible(true);
            txtCpf.setBorder(new LineBorder(Color.RED));
            txtCpf.setText(null);
            txtCpf.requestFocus();
        } else {
            alertCpf.setVisible(false);   
            txtCpf.setBorder(new LineBorder(Color.GRAY));

        }
    }//GEN-LAST:event_txtCpfFocusLost

    private void combNivelAcessoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combNivelAcessoFocusLost
        if (combNivelAcesso.getSelectedItem().toString().isEmpty()) {
            alertNivel.setVisible(true);
            combNivelAcesso.setBorder(new LineBorder(Color.RED));
            //combNivelAcesso.requestFocus();
            //txtNomeCurto.setBackground(Color.red);
        } else {
            alertNivel.setVisible(false);   
            combNivelAcesso.setBorder(new LineBorder(Color.GRAY));

        }
    }//GEN-LAST:event_combNivelAcessoFocusLost

    private void txtCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCepKeyTyped
        Utilitarios.validaCampoNumericoInteger(evt, 8);
    }//GEN-LAST:event_txtCepKeyTyped

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
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmFuncionarios().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertCep;
    private javax.swing.JLabel alertConfirmaSenha;
    private javax.swing.JLabel alertCpf;
    private javax.swing.JLabel alertNivel;
    private javax.swing.JLabel alertNome;
    private javax.swing.JLabel alertSenha;
    private javax.swing.JLabel alertUser;
    private javax.swing.JButton btnCancelarF;
    private javax.swing.JButton btnEditarF;
    private javax.swing.JButton btnExcluirF;
    private javax.swing.JButton btnNovoF;
    private javax.swing.JToggleButton btnPesquisarF;
    private javax.swing.JButton btnPesquisarRapidaF;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvarF;
    private javax.swing.JComboBox<String> combCargo;
    private javax.swing.JComboBox<String> combNivelAcesso;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFormCadastroCliente;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnForm;
    public javax.swing.JTabbedPane pnPrincipal;
    private javax.swing.JPanel tabCadastro;
    private javax.swing.JPanel tabConsulta;
    private javax.swing.JTable tabelaFuncionario;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JPasswordField txtConfirmaSenha;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIbge;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNomeCurto;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisarF;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
