/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DAO.EventDAO;
import Entity.Event;
import DAO.ContactsDAO;
import Entity.Contacts;
import Entity.Contacts3;
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
    Contacts3 cont = new Contacts3();
    List<Contacts> contactses;
    List<Contacts3> contactses3;
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
        jp_form = new javax.swing.JPanel();
        jb_new = new javax.swing.JButton();
        jtf_search = new javax.swing.JTextField();
        jb_ok = new javax.swing.JButton();
        jrb_name = new javax.swing.JRadioButton();
        jrb_address = new javax.swing.JRadioButton();
        jb_atualizar = new javax.swing.JButton();
        jl_clientecont = new javax.swing.JLabel();
        jrb_contact = new javax.swing.JRadioButton();
        jrb_month = new javax.swing.JRadioButton();
        jrb_month1 = new javax.swing.JRadioButton();
        jl_qnt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 620));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(38, 40, 43));
        jPanel1.setPreferredSize(new java.awt.Dimension(1272, 628));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.Y_AXIS));

        jp_form.setBackground(new java.awt.Color(38, 40, 43));
        jp_form.setMinimumSize(new java.awt.Dimension(100, 80));
        jp_form.setName(""); // NOI18N
        jp_form.setPreferredSize(new java.awt.Dimension(100, 80));

        jb_new.setText("Novo Cliente");
        jb_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_newActionPerformed(evt);
            }
        });

        jtf_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtf_searchKeyReleased(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_searchKeyPressed(evt);
            }
        });

        jb_ok.setText("Ok !");
        jb_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_okActionPerformed(evt);
            }
        });

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

        jrb_address.setBackground(new java.awt.Color(38, 40, 43));
        bg_search.add(jrb_address);
        jrb_address.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jrb_address.setForeground(new java.awt.Color(255, 255, 255));
        jrb_address.setText("Endereço");
        jrb_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_addressActionPerformed(evt);
            }
        });

        jb_atualizar.setText("Atualizar !");
        jb_atualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_atualizarActionPerformed(evt);
            }
        });

        jl_clientecont.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jl_clientecont.setForeground(new java.awt.Color(255, 255, 255));
        jl_clientecont.setText("Clientes na tabela: ");

        jrb_contact.setBackground(new java.awt.Color(38, 40, 43));
        bg_search.add(jrb_contact);
        jrb_contact.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jrb_contact.setForeground(new java.awt.Color(255, 255, 255));
        jrb_contact.setText("Contato");
        jrb_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_contactActionPerformed(evt);
            }
        });

        jrb_month.setBackground(new java.awt.Color(38, 40, 43));
        bg_search.add(jrb_month);
        jrb_month.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jrb_month.setForeground(new java.awt.Color(255, 255, 255));
        jrb_month.setText("Bairro");
        jrb_month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_monthActionPerformed(evt);
            }
        });

        jrb_month1.setBackground(new java.awt.Color(38, 40, 43));
        bg_search.add(jrb_month1);
        jrb_month1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jrb_month1.setForeground(new java.awt.Color(255, 255, 255));
        jrb_month1.setText("Mês");
        jrb_month1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_month1ActionPerformed(evt);
            }
        });

        jl_qnt.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jl_qnt.setForeground(new java.awt.Color(255, 255, 255));
        jl_qnt.setText("Clientes Cadastrados : X");

        org.jdesktop.layout.GroupLayout jp_formLayout = new org.jdesktop.layout.GroupLayout(jp_form);
        jp_form.setLayout(jp_formLayout);
        jp_formLayout.setHorizontalGroup(
            jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jp_formLayout.createSequentialGroup()
                .add(1060, 1060, 1060)
                .add(jl_clientecont, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(58, 58, 58))
            .add(jp_formLayout.createSequentialGroup()
                .add(30, 30, 30)
                .add(jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jp_formLayout.createSequentialGroup()
                        .add(jtf_search, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 430, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jb_ok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jp_formLayout.createSequentialGroup()
                        .add(jrb_name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jrb_address)
                        .add(18, 18, 18)
                        .add(jrb_contact)
                        .add(18, 18, 18)
                        .add(jrb_month, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 74, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jrb_month1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(45, 45, 45)
                        .add(jb_atualizar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jp_formLayout.createSequentialGroup()
                        .add(112, 112, 112)
                        .add(jb_new, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jp_formLayout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jl_qnt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 250, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
        );
        jp_formLayout.setVerticalGroup(
            jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jp_formLayout.createSequentialGroup()
                .add(jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jp_formLayout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jtf_search, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jb_ok, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jb_new))
                        .add(10, 10, 10)
                        .add(jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jrb_name)
                            .add(jrb_address)
                            .add(jrb_contact)
                            .add(jrb_month1)
                            .add(jrb_month)))
                    .add(jp_formLayout.createSequentialGroup()
                        .add(52, 52, 52)
                        .add(jp_formLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jb_atualizar)
                            .add(jl_qnt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .add(623, 623, 623)
                .add(jl_clientecont, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jp_form);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1);

        getContentPane().add(jPanel1);

        jMenu2.setText("Agenda");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setText("Gerenciar Agenda");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Ver Eventos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Outros");
        jMenu4.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenu4MenuSelected(evt);
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

        setSize(new java.awt.Dimension(1304, 784));
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
 //           jb_okActionPerformed(null);
    }//GEN-LAST:event_jtf_searchKeyReleased

    private void jb_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_okActionPerformed
        // TODO add your handling code here:
        if(filter.equals("NAME"))
        {
            System.out.println("NAME");
        search_jtable2Name(jtf_search.getText());
        } 
        
        else if(filter.equals("ADDRESS"))
        {
                System.out.println("ADDRESS");
                search_jtable2Address(jtf_search.getText());
        }
        else if(filter.equals("MONTH"))
        {
                System.out.println("MONTH");
                search_jtable2Month(Integer.parseInt(jtf_search.getText()));
        }
        
        else if(filter.equals("CONTACT"))
        {
                System.out.println("CONTACT");
                search_jtable2Contact(jtf_search.getText());
        }
        
        else if(filter.equals("ZONE"))
        {
                System.out.println("ZONE");
                search_jtable2Zone(jtf_search.getText());
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Selecione o filtro de pesquisa!!", null, JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jb_okActionPerformed

    private void jrb_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_nameActionPerformed
        // TODO add your handling code here:
        filter = "NAME";
    }//GEN-LAST:event_jrb_nameActionPerformed

    private void jrb_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_addressActionPerformed
        // TODO add your handling code here:
        filter = "ADDRESS";
    }//GEN-LAST:event_jrb_addressActionPerformed

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

    private void jb_atualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_atualizarActionPerformed
        // TODO add your handling code here:
        preencher_jtableTudo();
    }//GEN-LAST:event_jb_atualizarActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        new ShowEventForm(users).show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        if(jTable2.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um Cliente!!", null, JOptionPane.ERROR_MESSAGE);
        }else{
           contacts = contactses.get(jTable2.getSelectedRow());
           new EditContact3Form(users, contacts).show();
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jrb_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_contactActionPerformed
        // TODO add your handling code here:
        filter = "CONTACT";
    }//GEN-LAST:event_jrb_contactActionPerformed

    private void jb_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_newActionPerformed
        // TODO add your handling code here:
        new NewContactForm(users).show();
    }//GEN-LAST:event_jb_newActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new NewQueryDate().show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jrb_monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_monthActionPerformed
        // TODO add your handling code here:
        filter = "ZONE";
    }//GEN-LAST:event_jrb_monthActionPerformed

    private void jrb_month1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_month1ActionPerformed
        // TODO add your handling code here:
        filter = "MONTH";
    }//GEN-LAST:event_jrb_month1ActionPerformed

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_atualizar;
    private javax.swing.JButton jb_new;
    private javax.swing.JButton jb_ok;
    private javax.swing.JLabel jl_clientecont;
    private javax.swing.JLabel jl_qnt;
    private javax.swing.JPanel jp_form;
    private javax.swing.JRadioButton jrb_address;
    private javax.swing.JRadioButton jrb_contact;
    private javax.swing.JRadioButton jrb_month;
    private javax.swing.JRadioButton jrb_month1;
    private javax.swing.JRadioButton jrb_name;
    private javax.swing.JTextField jtf_search;
    // End of variables declaration//GEN-END:variables


    private void search_jtable2Name(String name) {
                try {
            contactses = contactDAO.getAllContactsPerName(name);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
        jl_clientecont.setText("Clientes na tabela: "+jTable2.getRowCount());
                
                int rows = jTable2.getRowCount();
        jl_qnt.setText("Clientes Cadastrados : "+rows+"");
        
        jScrollPane1.createVerticalScrollBar();
    }
        
    private void search_jtable2Address(String name) {
                try {
            contactses = contactDAO.getAllContactsPerAddress(name);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
        jl_clientecont.setText("Clientes na tabela: "+jTable2.getRowCount());
                
                int rows = jTable2.getRowCount();
        jl_qnt.setText("Clientes Cadastrados : "+rows+"");
        
        jScrollPane1.createVerticalScrollBar();
    }
            
    
    private void search_jtable2Contact(String name) {
                try {
            contactses = contactDAO.getAllContactsPerContact(name);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
        jl_clientecont.setText("Clientes na tabela: "+jTable2.getRowCount());
                
                int rows = jTable2.getRowCount();
        jl_qnt.setText("Clientes Cadastrados : "+rows+"");
        
        jScrollPane1.createVerticalScrollBar();
    }
    
    private void search_jtable2Zone(String name) {
                try {
            contactses = contactDAO.getAllContactsPerZone(name);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
        jl_clientecont.setText("Clientes na tabela: "+jTable2.getRowCount());
                
                int rows = jTable2.getRowCount();
        jl_qnt.setText("Clientes Cadastrados : "+rows+"");
        
        jScrollPane1.createVerticalScrollBar();
    }
    
        private void search_jtable2Cpf(String cpf) {
                try {
            contactses = contactDAO.getAllContactsPerCpf(cpf);
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
        jTable2.setModel(m);
        jl_clientecont.setText("Clientes na tabela: "+jTable2.getRowCount());
                
                int rows = jTable2.getRowCount();
        jl_qnt.setText("Clientes Cadastrados : "+rows+"");
        
        jScrollPane1.createVerticalScrollBar();
    }
        
        private void search_jtable2Month(Integer month) 
        {
                
            try 
            {
                contactses = contactDAO.getAllContactsPerMonth(month-1);
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            MyTableModel m = new MyTableModel(Contacts.class, contactses, jTable2);
            jTable2.setModel(m);
            jl_clientecont.setText("Clientes na tabela: "+jTable2.getRowCount());
                    
                int rows = jTable2.getRowCount();
        jl_qnt.setText("Clientes Cadastrados : "+rows+"");
        
        jScrollPane1.createVerticalScrollBar();
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
        
        jl_clientecont.setText("Clientes na tabela: "+jTable2.getRowCount());
        
                int rows = jTable2.getRowCount();
        jl_qnt.setText("Clientes Cadastrados : "+rows+"");
        
        jScrollPane1.createVerticalScrollBar();
        
    }

}

