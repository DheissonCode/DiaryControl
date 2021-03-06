/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DAO.UsuarioDAO;
import Entity.Users;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Igor
 */
public class LoginForm extends javax.swing.JFrame {
    Users uget = new Users();

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
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

        la_usuario = new javax.swing.JLabel();
        la_senha = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        pf_pass = new javax.swing.JPasswordField();
        jb_entrar = new javax.swing.JButton();
        jb_sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mb_barrademenu = new javax.swing.JMenuBar();
        jm_conexao = new javax.swing.JMenu();
        mi_configConexao = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        la_usuario.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        la_usuario.setForeground(new java.awt.Color(255, 255, 255));
        la_usuario.setText("Usuário:");
        getContentPane().add(la_usuario);
        la_usuario.setBounds(300, 160, 100, 30);

        la_senha.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        la_senha.setForeground(new java.awt.Color(255, 255, 255));
        la_senha.setText("Senha:");
        getContentPane().add(la_senha);
        la_senha.setBounds(300, 230, 100, 30);

        tf_user.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tf_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_userKeyPressed(evt);
            }
        });
        getContentPane().add(tf_user);
        tf_user.setBounds(400, 160, 170, 30);

        pf_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pf_passKeyPressed(evt);
            }
        });
        getContentPane().add(pf_pass);
        pf_pass.setBounds(400, 230, 170, 30);

        jb_entrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jb_entrar.setText("Entrar");
        jb_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entrarActionPerformed(evt);
            }
        });
        jb_entrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jb_entrarKeyPressed(evt);
            }
        });
        getContentPane().add(jb_entrar);
        jb_entrar.setBounds(300, 310, 90, 29);

        jb_sair.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jb_sair.setText("Sair");
        jb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sairActionPerformed(evt);
            }
        });
        getContentPane().add(jb_sair);
        jb_sair.setBounds(480, 310, 80, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/BGLogin.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 660, 410);

        jm_conexao.setText("Conexão");

        mi_configConexao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mi_configConexao.setText("Configurar conexão...");
        mi_configConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_configConexaoActionPerformed(evt);
            }
        });
        jm_conexao.add(mi_configConexao);

        mb_barrademenu.add(jm_conexao);

        setJMenuBar(mb_barrademenu);

        setSize(new java.awt.Dimension(613, 421));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jb_sairActionPerformed

    private void mi_configConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_configConexaoActionPerformed
        // TODO add your handling code here:
        new SetupParForm().show();
    }//GEN-LAST:event_mi_configConexaoActionPerformed

    private void jb_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entrarActionPerformed
        // TODO add your handling code here:
        Users user = new Users();
        user.setLogin(tf_user.getText());
        user.setPassword(pf_pass.getText());
        try {
           user = new UsuarioDAO().logar(user); 
           if(user!=null){
               new MainForm(user).show();
                dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou senha incorreto!!", null , JOptionPane.ERROR_MESSAGE);
                tf_user.grabFocus();
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_entrarActionPerformed

    private void jb_entrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jb_entrarKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jb_entrarKeyPressed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_formKeyPressed

    private void tf_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_userKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jb_entrarActionPerformed(null);
        }else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            jb_sairActionPerformed(null);
        }
    }//GEN-LAST:event_tf_userKeyPressed

    private void pf_passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pf_passKeyPressed
        // TODO add your handling code here:
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jb_entrarActionPerformed(null);
        }else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE){
            jb_sairActionPerformed(null);
        }
    }//GEN-LAST:event_pf_passKeyPressed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jb_entrar;
    private javax.swing.JButton jb_sair;
    private javax.swing.JMenu jm_conexao;
    private javax.swing.JLabel la_senha;
    private javax.swing.JLabel la_usuario;
    private javax.swing.JMenuBar mb_barrademenu;
    private javax.swing.JMenuItem mi_configConexao;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables
}
