/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DAO.ContactsDAO;
import Entity.Contacts;
import Entity.Contacts3;
import Entity.Users;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author zEveerY
 */
public class ShowContactForm extends javax.swing.JFrame {
    
    ContactsDAO contactDAO = new ContactsDAO();
    Contacts3 contacts = new Contacts3();
    Contacts3 contacts2 = new Contacts3();
    List<Contacts3> contactses;
    List<Contacts> contactList;
    Users users = new Users();
    /**
     * Creates new form ShowContactForm
     */
    
    public ShowContactForm(Users user) {
        initComponents();
        preencher_jtableTudo();
    
        jtablewi();
        System.out.println("1 : "+user.getName());
        users = user;
        System.out.println("2"+users.getName());
        //getContentPane().setLayout(new java.awt.GridLayout(1, 1));
        //JPanel panel = new JPanel();
       // jPanel1.setLayout(new BoxLayout(jPanel1,BoxLayout.Y_AXIS));
        //jPanel2.setLayout(new BoxLayout(jPanel2,BoxLayout.X_AXIS));
        //jPanel1.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jb_new = new javax.swing.JButton();
        jb_edit = new javax.swing.JButton();
        jb_del = new javax.swing.JButton();
        jb_reload = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Clientes");
        setMinimumSize(new java.awt.Dimension(781, 845));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel1.setBackground(new java.awt.Color(53, 57, 65));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jb_new.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_new.setMnemonic('n');
        jb_new.setText("Novo");
        jb_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_newActionPerformed(evt);
            }
        });
        jPanel2.add(jb_new);

        jb_edit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_edit.setMnemonic('e');
        jb_edit.setText("Editar");
        jb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editActionPerformed(evt);
            }
        });
        jPanel2.add(jb_edit);

        jb_del.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_del.setMnemonic('d');
        jb_del.setText("Deletar");
        jb_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_delActionPerformed(evt);
            }
        });
        jPanel2.add(jb_del);

        jb_reload.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_reload.setMnemonic('v');
        jb_reload.setText("Atualizar");
        jb_reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_reloadActionPerformed(evt);
            }
        });
        jPanel2.add(jb_reload);

        jPanel1.add(jPanel2);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Endereço", "Bairro", "Contato", "Telefone 1", "Telefone 2", "Celular 1", "Celular 2", "e-Mail", "Origem", "CPF/CNPJ", "CEP", "Anotação", "Modificado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(144, 184, 248));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(7).setResizable(false);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(8).setResizable(false);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(9).setResizable(false);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(10).setResizable(false);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(11).setResizable(false);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(12).setResizable(false);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(300);
            jTable1.getColumnModel().getColumn(13).setResizable(false);
        }

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_newActionPerformed
        // TODO add your handling code here:
        new NewContactForm(users).show();
    }//GEN-LAST:event_jb_newActionPerformed

    private void jb_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_delActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um cliente!!", null, JOptionPane.ERROR_MESSAGE);
        }else{
            contacts2 = contactses.get(jTable1.getSelectedRow());
            if(JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este cliente?") == 0){
            try {
                deletar();
                JOptionPane.showMessageDialog(null, "Cliente deletado com sucesso!!");
                preencher_jtableTudo();
            } catch (SQLException ex) {
                Logger.getLogger(ShowContactForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.ERROR_MESSAGE);
            }
            }
            
        }
    }//GEN-LAST:event_jb_delActionPerformed

    private void jb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!!", null, JOptionPane.ERROR_MESSAGE);
        }else{
           contacts = contactses.get(jTable1.getSelectedRow());
           new EditContactForm(users, contacts).show();
        }
    }//GEN-LAST:event_jb_editActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
      /*  if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!!", null, JOptionPane.ERROR_MESSAGE);
        }else{
           contacts = contactses.get(jTable1.getSelectedRow());
           new EditContactForm(users, contacts).show();
           dispose();
        }*/
    }//GEN-LAST:event_jTable1MouseClicked

    private void jb_reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_reloadActionPerformed
        // TODO add your handling code here:
        preencher_jtableTudo();
        jtablewi();
    }//GEN-LAST:event_jb_reloadActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ShowContactForm(us).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_del;
    private javax.swing.JButton jb_edit;
    private javax.swing.JButton jb_new;
    private javax.swing.JButton jb_reload;
    // End of variables declaration//GEN-END:variables

private void preencher_jtableTudo() {
         try {
            contactses =  contactDAO.getAllContactsS();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ShowContactForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts3.class, contactses, jTable1);
        
        jTable1.setModel(m);
    }

public void deletar() throws SQLException{
   // contactDAO.deleteContacts(contacts2);
}

    private void jtablewi() {
        jTable1.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
 
        for (int column = 0; column < jTable1.getColumnCount(); column++)
        {
            TableColumn tableColumn = jTable1.getColumnModel().getColumn(column);
            int preferredWidth = tableColumn.getMinWidth();
            int maxWidth = tableColumn.getMaxWidth();
 
            for (int row = 0; row < jTable1.getRowCount(); row++)
            {
                TableCellRenderer cellRenderer = jTable1.getCellRenderer(row, column);
                Component c = jTable1.prepareRenderer(cellRenderer, row, column);
                int width = c.getPreferredSize().width + jTable1.getIntercellSpacing().width;
                preferredWidth = Math.max(preferredWidth, width);
 
 
                    if (preferredWidth >= maxWidth)
                    {
                    preferredWidth = maxWidth;
                    break;
                    }
            }
 
            tableColumn.setPreferredWidth( preferredWidth );
        }
    }

   

}


