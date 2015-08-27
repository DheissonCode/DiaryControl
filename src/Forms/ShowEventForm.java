/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DAO.ContactsDAO;
import DAO.EventDAO;
import Entity.Contacts;
import Entity.Contacts3;
import Entity.Event2;
import Entity.Users;
import java.awt.Component;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author zEveerY
 */
public class ShowEventForm extends javax.swing.JFrame {
    
    EventDAO eventDAO = new EventDAO();
    Event2 event = new Event2();
    Event2 events2 = new Event2();
    List<Event2> eventeses;
    List<Event2> eventList;
    Users users = new Users();
    /**
     * Creates new form ShowContactForm
     */
    
    public ShowEventForm(Users user) {
        initComponents();
        preencher_jtableTudo();
        alinha();
        System.out.println("1 : "+user.getName());
        users = user;
        System.out.println("2"+users.getName());
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jb_new = new javax.swing.JButton();
        jb_edit = new javax.swing.JButton();
        jb_del = new javax.swing.JButton();
        jb_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de Eventos");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(53, 57, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Dia", "Mês", "Ano", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(144, 184, 248));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(200);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 620, 230));

        jPanel2.setOpaque(false);

        jb_new.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_new.setMnemonic('n');
        jb_new.setText("Novo");
        jb_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_newActionPerformed(evt);
            }
        });

        jb_edit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_edit.setMnemonic('e');
        jb_edit.setText("Editar");
        jb_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_editActionPerformed(evt);
            }
        });

        jb_del.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_del.setMnemonic('d');
        jb_del.setText("Deletar");
        jb_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_delActionPerformed(evt);
            }
        });

        jb_back.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jb_back.setMnemonic('v');
        jb_back.setText("Voltar");
        jb_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_new)
                .addGap(18, 18, 18)
                .addComponent(jb_edit)
                .addGap(18, 18, 18)
                .addComponent(jb_del)
                .addGap(18, 18, 18)
                .addComponent(jb_back)
                .addGap(243, 243, 243))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_edit)
                    .addComponent(jb_new)
                    .addComponent(jb_del)
                    .addComponent(jb_back))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 380, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 350));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_backActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jb_backActionPerformed

    private void jb_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_newActionPerformed
        // TODO add your handling code here:
        new NewEventForm().show();
        //dispose();
    }//GEN-LAST:event_jb_newActionPerformed

    private void jb_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_delActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um evento!!", null, JOptionPane.ERROR_MESSAGE);
        }else{
            events2 = eventeses.get(jTable1.getSelectedRow());
            if(JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este evento?") == 0){
            try {
                deletar();
                JOptionPane.showMessageDialog(null, "Evento deletado com sucesso!!");
                preencher_jtableTudo();
                alinha();
            } catch (SQLException ex) {
                Logger.getLogger(ShowEventForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERRO!", null, JOptionPane.ERROR_MESSAGE);
            }
            }
            
        }
    }//GEN-LAST:event_jb_delActionPerformed

    private void jb_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_editActionPerformed
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um Evento!!", null, JOptionPane.ERROR_MESSAGE);
        }else{
           event = eventeses.get(jTable1.getSelectedRow());
           new EditEventForm(event).show();
           dispose();
        }
    }//GEN-LAST:event_jb_editActionPerformed

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
            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Entity.Users user = new Users();
                new ShowEventForm(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_back;
    private javax.swing.JButton jb_del;
    private javax.swing.JButton jb_edit;
    private javax.swing.JButton jb_new;
    // End of variables declaration//GEN-END:variables

private void preencher_jtableTudo() {
         try {
            eventeses =  eventDAO.getAllEventDayB();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(ShowEventForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Event2.class, eventeses, jTable1);
        
        jTable1.setModel(m);
        
    }

public void deletar() throws SQLException{
    eventDAO.deleteEvent(events2);
}

    private void alinha() {
                jTable1.setAutoResizeMode( JTable.AUTO_RESIZE_OFF );
 
        for (int column = 3; column < jTable1.getColumnCount(); column++)
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