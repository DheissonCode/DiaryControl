/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DAO.EventDAO;
import Entity.Event;
import DAO.ContactsDAO;
import Entity.Contacts;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import Res.Data;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author zEveerY
 */
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import Entity.Users;
import java.awt.Color;
import java.lang.String;
public final class MainForm extends javax.swing.JFrame {
    
    EventDAO eventDAO = new EventDAO();
    Event event = new Event();
    List<Event> evento;
    ContactsDAO contactDAO = new ContactsDAO();
    Contacts contacts = new Contacts();
    List<Contacts> contactses;
    Users users = new Users();
    
    Data datm = new Data();
    String filter = "NAME";

    /**
     * Creates new form MainForm
     * @param usa
     */
    public MainForm(Users user) 
    {
        initComponents();
        System.out.println("Teste 1 :"+user.getName());
        //users.setName(usa);
        Integer day = datm.getDay();
        Integer month = datm.getMonth();
        Integer year = datm.getYear();
        preencher_jtable(day, month, year);
        preencher_jtableTudo();
        users = user;
        

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_search = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jc_day = new com.toedter.calendar.JDayChooser();
        jc_month = new com.toedter.calendar.JMonthChooser();
        jc_year = new com.toedter.calendar.JYearChooser();
        jb_consul = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jtf_search = new javax.swing.JTextField();
        jb_ok = new javax.swing.JButton();
        jrb_name = new javax.swing.JRadioButton();
        jrb_cpf = new javax.swing.JRadioButton();
        jb_callday = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmi_cli = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(38, 40, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(1272, 628));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identificador", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(610);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 610, 230));

        jPanel2.setBackground(new java.awt.Color(53, 57, 65));

        jc_month.setDayChooser(jc_day);

        jc_year.setDayChooser(jc_day);

        jb_consul.setText("Realizar Consulta !");
        jb_consul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_consulActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jc_day, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jc_month, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(129, 129, 129)
                        .add(jb_consul)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jc_year, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 75, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jc_month, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jb_consul)
                    .add(jc_year, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jc_day, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 610, 240));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Endereço", "Telefone 1", "Celular 1", "e-Mail", "CPF/CNPJ", "Anotações"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 540, 500));

        jtf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_searchKeyPressed(evt);
            }
        });
        jPanel1.add(jtf_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 430, 30));

        jb_ok.setText("Ok !");
        jb_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_okActionPerformed(evt);
            }
        });
        jPanel1.add(jb_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 20, 90, 30));

        jrb_name.setBackground(new java.awt.Color(38, 40, 43));
        bg_search.add(jrb_name);
        jrb_name.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jrb_name.setForeground(new java.awt.Color(255, 255, 255));
        jrb_name.setSelected(true);
        jrb_name.setText("Nome Cliente");
        jrb_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_nameActionPerformed(evt);
            }
        });
        jPanel1.add(jrb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 130, -1));

        jrb_cpf.setBackground(new java.awt.Color(38, 40, 43));
        bg_search.add(jrb_cpf);
        jrb_cpf.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jrb_cpf.setForeground(new java.awt.Color(255, 255, 255));
        jrb_cpf.setText("CPF/CNPJ");
        jrb_cpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_cpfActionPerformed(evt);
            }
        });
        jPanel1.add(jrb_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, 120, -1));

        jb_callday.setText("Ligações para o dia !");
        jb_callday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_calldayActionPerformed(evt);
            }
        });
        jPanel1.add(jb_callday, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 40));

        jButton1.setText("Atualizar !");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 60, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1290, -1));

        jMenu1.setText("Clientes");

        jmi_cli.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jmi_cli.setText("Gerenciar Clientes");
        jmi_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_cliActionPerformed(evt);
            }
        });
        jMenu1.add(jmi_cli);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agenda");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Gerenciar Agenda");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Outros");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
        });

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Gerenciar Usuários");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem9.setText("Sair");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1304, 667));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jc_dayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jc_dayPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jc_dayPropertyChange

    private void jc_monthPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jc_monthPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_jc_monthPropertyChange

    private void jc_yearPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jc_yearPropertyChange
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jc_yearPropertyChange

    private void jtf_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_searchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            jb_okActionPerformed(null);
        }
    }//GEN-LAST:event_jtf_searchKeyPressed

    private void jtf_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_searchKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_searchKeyReleased

    private void jb_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_okActionPerformed
        // TODO add your handling code here:
        if(filter.equals("NAME"))
        {
            System.out.println("NAME");
        search_jtable2Name(jtf_search.getText());
        } 
        
        else if(filter.equals("CPF"))
            {
                System.out.println("CPF");
                search_jtable2Cpf(jtf_search.getText());
            }
        else{
            JOptionPane.showMessageDialog(null, "Selecione o filtro de pesquisa!!", null, JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jb_okActionPerformed

    private void jb_consulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_consulActionPerformed
        // TODO add your handling code here:
        preencher_jtable(jc_day.getDay(), jc_month.getMonth()+1, jc_year.getYear());
    }//GEN-LAST:event_jb_consulActionPerformed

    private void jb_calldayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_calldayActionPerformed
        // TODO add your handling code here:
        new CallDayForm().show();
    }//GEN-LAST:event_jb_calldayActionPerformed

    private void jmi_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_cliActionPerformed
        // TODO add your handling code here:
        new ShowContactForm(users).show();
    }//GEN-LAST:event_jmi_cliActionPerformed

    private void jrb_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_nameActionPerformed
        // TODO add your handling code here:
        filter = "NAME";
    }//GEN-LAST:event_jrb_nameActionPerformed

    private void jrb_cpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_cpfActionPerformed
        // TODO add your handling code here:
        filter = "CPF";
    }//GEN-LAST:event_jrb_cpfActionPerformed

    private void jMenu4MenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenu4MenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4MenuSelected

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        new LoginForm().show();
        dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        new UsersForm().show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        preencher_jtableTudo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new ShowEventForm(users).show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Entity.Users user = new Users();
                new MainForm(user).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_callday;
    private javax.swing.JButton jb_consul;
    private javax.swing.JButton jb_ok;
    private com.toedter.calendar.JDayChooser jc_day;
    private com.toedter.calendar.JMonthChooser jc_month;
    private com.toedter.calendar.JYearChooser jc_year;
    private javax.swing.JMenuItem jmi_cli;
    private javax.swing.JRadioButton jrb_cpf;
    private javax.swing.JRadioButton jrb_name;
    private javax.swing.JTextField jtf_search;
    // End of variables declaration//GEN-END:variables

    public void preencher_jtable(Integer day, Integer month, Integer year) 
    {
        try {
            evento = eventDAO.getEventList(day, month, year);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Event.class, evento, jTable1);
        jTable1.setModel(m);
    }

    private void search_jtable2Name(String name) {
                try {
            contactses = contactDAO.getAllContactsPerName(name);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
    }
    
        private void search_jtable2Cpf(String cpf) {
                try {
            contactses = contactDAO.getAllContactsPerCpf(cpf);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
    }

    private void preencher_jtableTudo() {
         try {
            contactses = contactDAO.getAllContacts();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
    }

}

