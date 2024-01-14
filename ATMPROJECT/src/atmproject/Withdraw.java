
package atmproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Withdraw extends javax.swing.JFrame {

    /**
     * Creates new form Withdraw
     */
    public Withdraw() {
        initComponents();
        Connect();
    }
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    public void Connect(){
        try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
                                                                                      
        }
        catch(ClassNotFoundException | SQLException ex){
        Logger.getLogger(History.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        kadh = new javax.swing.JButton();
        kadhnaramount = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("Always at you Service!");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        label4.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 51, 51));
        label4.setText("Enter amount");

        kadh.setBackground(new java.awt.Color(153, 255, 204));
        kadh.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        kadh.setForeground(new java.awt.Color(0, 51, 102));
        kadh.setText("Enter");
        kadh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadhActionPerformed(evt);
            }
        });

        kadhnaramount.setBackground(new java.awt.Color(204, 204, 204));
        kadhnaramount.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        kadhnaramount.setForeground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(kadh, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kadhnaramount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(kadhnaramount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(kadh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Automatic Teller Machine");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        back.setText("Back");
        back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kadhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadhActionPerformed
        // TODO add your handling code here:
              
            int b = 0;
        String paise = kadhnaramount.getText();
       int amm = Integer.parseInt(paise);
        
   
        
         try{
        
       String str;
        
        pst = con.prepareStatement("SELECT balance FROM historytable ORDER BY balance DESC LIMIT 1");
        rs = pst.executeQuery();
         if(rs.next()){
              str = rs.getString("balance");
              b = Integer.parseInt(str);
             if((b - amm) > 0){
             b = b - amm;
             }
             else{
           int yono =   JOptionPane.showConfirmDialog(this, "Not enough Balance! /n Want to deposit amount ?");
             if(yono == JOptionPane.YES_OPTION){
                   deposit t = new deposit();
                   this.hide();
                   t.setVisible(true);
             }
             }
         }
        

      
        }
        catch(SQLException ex){
         Logger.getLogger(deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
       
       
       try{
        
       
       
        
        pst = con.prepareStatement("insert into historytable(Type,ID,amount,acno,balance)values(?,?,?,?,?)");
                 int randomno = (int) (Math.random() * 1000000000 + 1);
         
    
        pst.setString(1, " Withdraw");
        pst.setString(2, Integer.toString(randomno));
        pst.setString(3,  Integer.toString(amm));
        pst.setString(4, "--");
                pst.setString(5, Integer.toString(b));

        int k = pst.executeUpdate();
        if(k == 1){
        JOptionPane.showMessageDialog(this, "Amount Withdraw finished");
        }
        else{
            JOptionPane.showMessageDialog(this, "Withdrawal  failed!");
        }
       kadhnaramount.setText("");
        }
        catch(SQLException ex){
         Logger.getLogger(deposit.class.getName()).log(Level.SEVERE, null, ex);
        }
        

     
    }//GEN-LAST:event_kadhActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Window r = new Window();
        this.hide();
        r.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Withdraw().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kadh;
    private java.awt.TextField kadhnaramount;
    private java.awt.Label label2;
    private java.awt.Label label4;
    // End of variables declaration//GEN-END:variables
}