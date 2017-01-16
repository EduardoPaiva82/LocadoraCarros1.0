
package locadoracarros;

/**
 *
 * @author Eduardo Paiva
 */
public class telaLogin extends javax.swing.JFrame{

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jb_EntrarGerente = new javax.swing.JButton();
        jBClienteEntrar = new javax.swing.JButton();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login de Entrada");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 36)); // NOI18N
        jLabel1.setText("LocadoraCAR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 250, -1));

        jLabelUsuario.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelUsuario.setText("Usuário: ");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, -1));

        jLabelSenha.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabelSenha.setText("Senha: ");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 70, -1));

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 220, -1));

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 220, -1));

        jb_EntrarGerente.setText("Gerente Entrar");
        jb_EntrarGerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EntrarGerenteActionPerformed(evt);
            }
        });
        getContentPane().add(jb_EntrarGerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 128, 39));

        jBClienteEntrar.setText("Cliente Entrar");
        jBClienteEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBClienteEntrarMouseEntered(evt);
            }
        });
        jBClienteEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBClienteEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBClienteEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 129, 39));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/locadoracarros/Imagens/fundoLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jb_EntrarGerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EntrarGerenteActionPerformed
        if(jTextFieldUsuario.getText().equals("gerente") && jPasswordFieldSenha.getText().equals("admin")){
        locadoracarros.TelaPrincipal tela1 = new locadoracarros.TelaPrincipal();
        tela1.setVisible(true); //abrindo o tela Pricipal
        dispose(); //fechando a janela Login
        }else{
           
        }
    }//GEN-LAST:event_jb_EntrarGerenteActionPerformed

    private void jBClienteEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBClienteEntrarActionPerformed
        TelaTabelaVeiculos tela = new TelaTabelaVeiculos();
       tela.setVisible(true);
      
       
       
       
            
       
    }//GEN-LAST:event_jBClienteEntrarActionPerformed

    private void jBClienteEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBClienteEntrarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBClienteEntrarMouseEntered

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClienteEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JButton jb_EntrarGerente;
    // End of variables declaration//GEN-END:variables
}
