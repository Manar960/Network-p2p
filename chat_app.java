/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package d1;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class chat_app extends javax.swing.JFrame {

	//String msg1=new String();
	String Lip,Rip ;
	public static int Lport,Rport;
	String MYUserName ; 
        public chat_app() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        text2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lport = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        rip = new javax.swing.JTextField();
        rport = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        test = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        name = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lip = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TCP Server IP");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 120, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wi-Fi:192.168.1.112", "Ethernet:169.254.49.56", " " }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 180, 210, 30));

        text2.setColumns(20);
        text2.setRows(5);
        jScrollPane1.setViewportView(text2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 420, 130));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Available Interfaces");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LIP");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 40, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Remote Port");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 110, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Remote IP");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LPORT");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 130, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TCP Server Port");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 140, -1));
        getContentPane().add(lport, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 130, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 130, -1));
        getContentPane().add(rip, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 310, 130, -1));
        getContentPane().add(rport, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 130, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jButton1.setText("SEND");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 90, 40));

        test.setBackground(new java.awt.Color(255, 255, 153));
        test.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        test.setText("TEST");
        test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testActionPerformed(evt);
            }
        });
        getContentPane().add(test, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 90, 40));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 160, 270));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 340, -1));

        text1.setColumns(20);
        text1.setRows(5);
        jScrollPane4.setViewportView(text1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 420, 220));

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ONLINE USERS");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 130, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("STATUS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 80, -1));
        getContentPane().add(lip, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/d1/network.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testActionPerformed
       
        
         if( !lip.getText().equals("")&&!rip.getText().equals("")&&!rport.getText().equals("")&&!lport.getText().equals(""))
	        { 
	            Lip=lip.getText(); 
	            MYUserName =name.getText();
	            Lport=Integer.parseInt(lport.getText());
	            Rport=Integer.parseInt(rport.getText());
	            Rip=rip.getText();
		    Rport=Integer.parseInt(rport.getText()); 
	            Rclient rclient = new Rclient(Lport,Lip);
	            rclient.start();
	        }
	        else
	        {
	            JOptionPane.showMessageDialog(this,"Enter all information","",JOptionPane.ERROR_MESSAGE);
	            return;

	        }   
    }//GEN-LAST:event_testActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(Rip.equals("")|| Rport==0){
	                JOptionPane.showMessageDialog(this,"Enter all information","",JOptionPane.ERROR_MESSAGE);
	             }
	               String msg=text2.getText();
	               Sclient sender=new Sclient( Rip,Rport,msg,MYUserName);
	               sender.start();
	        
	       
	     
               String msg1="Me:"+msg;
               text1.append(msg1+"\n");
               text1.setForeground(Color.GREEN);
	       text2.setText("");

	        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(chat_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chat_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chat_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chat_app.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new chat_app().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Status;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField lip;
    private javax.swing.JTextField lport;
    private javax.swing.JTextField name;
    private javax.swing.JTextField rip;
    private javax.swing.JTextField rport;
    private javax.swing.JButton test;
    public static javax.swing.JTextArea text1;
    private javax.swing.JTextArea text2;
    // End of variables declaration//GEN-END:variables
}
