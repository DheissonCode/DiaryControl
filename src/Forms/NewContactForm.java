/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DAO.ContactsDAO;
import Entity.Contacts;
import Entity.Users;
import com.toedter.calendar.JCalendar;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Entity.Users;

/**
 *
 * @author Igor
 */
public class NewContactForm extends javax.swing.JFrame {
    Contacts contacts = new Contacts();
    ContactsDAO contactsDAO = new ContactsDAO();
<<<<<<< HEAD
    Users users = new Users();

    /**
     * Creates new form NewContactForm
     */
    public NewContactForm(String txt) {
        initComponents();
        users.setName(txt);
        //jl_res.setText(users.getName());
=======
    Users sessao = new Users();
    /**
     * Creates new form NewContactForm
     */
    public NewContactForm(Users user) {
        initComponents();
        this.sessao = user;
>>>>>>> 1d3b41bcee3ebc538680e7228338a33e56dafdda
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jtf_client = new javax.swing.JTextField();
        jtf_address = new javax.swing.JTextField();
        jtf_zone = new javax.swing.JTextField();
        jtf_contact = new javax.swing.JTextField();
        jft_phone1 = new javax.swing.JFormattedTextField();
        jft_phone2 = new javax.swing.JFormattedTextField();
        jft_cel1 = new javax.swing.JFormattedTextField();
        jft_cel2 = new javax.swing.JFormattedTextField();
        jtf_email = new javax.swing.JTextField();
        jtf_origin = new javax.swing.JTextField();
        jtf_cpf = new javax.swing.JTextField();
        jft_zip = new javax.swing.JFormattedTextField();
        jdc_pick = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_notes = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jb_cadastrar = new javax.swing.JButton();
        jb_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Cadastro Clientes"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(38, 40, 43));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Cliente:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 27, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Endereço:");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 66, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Bairro:");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 105, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("Contato:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 105, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("Telefone 1:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 145, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Telefone 2:");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 145, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Celular 1:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 191, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Celular 2:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 191, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Email:");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 233, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Ligar em:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 282, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("Origem:");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 327, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("CPF/CNPJ:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 372, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel14.setText("CEP:");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 417, -1, -1));
        jPanel5.add(jtf_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 23, 442, 28));
        jPanel5.add(jtf_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 62, 442, 28));
        jPanel5.add(jtf_zone, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 101, 190, 28));
        jPanel5.add(jtf_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 101, 150, 28));

        try {
            jft_phone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel5.add(jft_phone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 141, 140, 28));

        try {
            jft_phone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel5.add(jft_phone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 141, 150, 28));

        try {
            jft_cel1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel5.add(jft_cel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 187, 138, 28));

        try {
            jft_cel2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel5.add(jft_cel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 187, 150, 28));
        jPanel5.add(jtf_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 233, 270, 28));
        jPanel5.add(jtf_origin, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 323, 270, 28));
        jPanel5.add(jtf_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 368, 270, 28));

        try {
            jft_zip.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel5.add(jft_zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 413, 140, 28));
        jPanel5.add(jdc_pick, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 282, 180, 26));

        jTabbedPane1.addTab("Dados", jPanel5);

        jta_notes.setColumns(20);
        jta_notes.setLineWrap(true);
        jta_notes.setRows(5);
        jScrollPane1.setViewportView(jta_notes);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel13.setText("Notas:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anotações", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 630, 480));

        jb_cadastrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jb_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/save.png"))); // NOI18N
        jb_cadastrar.setToolTipText("Cadastrar");
        jb_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 110, 50));

        jb_voltar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jb_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Res/stop.png"))); // NOI18N
        jb_voltar.setToolTipText("Cancelar");
        jb_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_voltarActionPerformed(evt);
            }
        });
        jPanel1.add(jb_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 110, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cadastrarActionPerformed
        try {
            save();
        } catch (SQLException ex) {
            Logger.getLogger(NewContactForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jb_cadastrarActionPerformed

    private void jb_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_voltarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jb_voltarActionPerformed

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
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
            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String String = null;
                new NewContactForm(String).setVisible(true);
            }
        });
    }
=======
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
//            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewContactForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewContactForm().setVisible(true);
//            }
//        });
//    }
>>>>>>> 1d3b41bcee3ebc538680e7228338a33e56dafdda

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_cadastrar;
    private javax.swing.JButton jb_voltar;
    private com.toedter.calendar.JDateChooser jdc_pick;
    private javax.swing.JFormattedTextField jft_cel1;
    private javax.swing.JFormattedTextField jft_cel2;
    private javax.swing.JFormattedTextField jft_phone1;
    private javax.swing.JFormattedTextField jft_phone2;
    private javax.swing.JFormattedTextField jft_zip;
    private javax.swing.JTextArea jta_notes;
    private javax.swing.JTextField jtf_address;
    private javax.swing.JTextField jtf_client;
    private javax.swing.JTextField jtf_contact;
    private javax.swing.JTextField jtf_cpf;
    private javax.swing.JTextField jtf_email;
    private javax.swing.JTextField jtf_origin;
    private javax.swing.JTextField jtf_zone;
    // End of variables declaration//GEN-END:variables

    private void save() throws SQLException 
    {
                
        contacts.setClient(jtf_client.getText());
        contacts.setAddress(jtf_address.getText());
        contacts.setZone(jtf_zone.getText());
        contacts.setContact(jtf_contact.getText());
        contacts.setPhone1(jft_phone1.getText());
        contacts.setPhone2(jft_phone2.getText());
        contacts.setCellphone1(jft_cel1.getText());
        contacts.setCellphone2(jft_cel2.getText());
        contacts.setEmail(jtf_email.getText());
        contacts.setCreatedby(sessao.getName());
        contacts.setEditedby(sessao.getName());
        
        //Here begins the best 'gambiarra' you've ever seen
        //PLEASE DON'T CHANGE NOTHING BELOW THIS COMMENT
        
        Date dataTeste = jdc_pick.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String datr = formato.format(dataTeste);  
        char d1 = datr.charAt(0);
        char d2 = datr.charAt(1);
        char m1 = datr.charAt(3);
        char m2 = datr.charAt(4);
        char y1 = datr.charAt(6);
        char y2 = datr.charAt(7);
        char y3 = datr.charAt(8);
        char y4 = datr.charAt(9);
        String day = ""+d1+""+d2;
        String month = ""+m1+""+m2;
        String year = ""+y1+""+y2+""+y3+""+y4;
               
        //END 'gambiarra'
        
        contacts.setDay(Integer.parseInt(day));
        contacts.setMonth(Integer.parseInt(month));
        contacts.setYear(Integer.parseInt(year));
        contacts.setOrigin(jtf_origin.getText());
        contacts.setCpf(jtf_cpf.getText());
        contacts.setZipcode(jft_zip.getText());
        contacts.setText(jta_notes.getText());
        contacts.setModified(users.getLogin());
        
        contactsDAO.getConnection();
        contactsDAO.addContacts(contacts);
        
        JOptionPane.showMessageDialog(null, "Cliente Cadastrado com sucesso !");
      
        
    }

}
