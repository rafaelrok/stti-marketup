package br.com.marketup.views;

import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class frmSplash extends javax.swing.JFrame {

    frmSplash spl = this; 
    
    //frmMenu frmMn = null;
 
    public frmSplash() {
        initComponents();
        startThread();
    }

    @SuppressWarnings("unchecked")   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/splash_test.png"));

        Image image = icon.getImage();
        JDesktopPane = new javax.swing.JPanel(){

            public void paintComponent(Graphics g){
                g.drawImage(image, 0,0, getWidth(),getHeight(),this);
            }

        };
        progresso = new javax.swing.JProgressBar();
        lblText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        JDesktopPane.setBackground(new java.awt.Color(44, 62, 80));

        progresso.setForeground(new java.awt.Color(248, 148, 6));
        progresso.setPreferredSize(new java.awt.Dimension(146, 6));

        lblText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblText.setForeground(new java.awt.Color(255, 255, 255));
        lblText.setText("jLabel1");
        lblText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTextMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout JDesktopPaneLayout = new javax.swing.GroupLayout(JDesktopPane);
        JDesktopPane.setLayout(JDesktopPaneLayout);
        JDesktopPaneLayout.setHorizontalGroup(
            JDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progresso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
            .addGroup(JDesktopPaneLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(lblText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JDesktopPaneLayout.setVerticalGroup(
            JDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JDesktopPaneLayout.createSequentialGroup()
                .addContainerGap(293, Short.MAX_VALUE)
                .addComponent(lblText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(progresso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDesktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JDesktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void lblTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTextMouseClicked

        frmMenu frmMn = new frmMenu();
        frmMn.setLocationRelativeTo(null);
        frmMn.setVisible(true);
    }//GEN-LAST:event_lblTextMouseClicked
    
    void startThread(){
        Thread hi = new Thread(() -> {
            frmMenu frmMn = new frmMenu(spl);
            frmMn.setLocationRelativeTo(null);
            frmMn.setExtendedState(MAXIMIZED_BOTH);
            frmMn.setVisible(true);
            dispose();
        });

        hi.start();
    
    }   
    
    public JProgressBar getJProgressBar(){
        return progresso;
    }
    
     public JLabel getJLabel(){
        return lblText;
    }
        
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
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSplash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new frmSplash().setVisible(true);
                frmSplash splash = new frmSplash();
                splash.setLocationRelativeTo(null);
                splash.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JDesktopPane;
    public javax.swing.JLabel lblText;
    public javax.swing.JProgressBar progresso;
    // End of variables declaration//GEN-END:variables
}
