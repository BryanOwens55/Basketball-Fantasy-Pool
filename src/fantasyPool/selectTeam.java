/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasyPool;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Owner
 */
public class selectTeam extends javax.swing.JFrame {
    String currentUser = MySqlConnect.username; 
    static String line1;
    static String line2;
    static int Player1_;
    static int Player2_;
    static int Player3_;
    static int Player4_;
    static int Player5_;
    static int Player6_;
    static int Player7_;
    static int Player8_;
    static int Player9_;
    static int Player10_;
    
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs =null;
    /**
     * Creates new form selectTeam
     */
    public selectTeam() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        dropDown1 = new javax.swing.JComboBox<>();
        dropDown2 = new javax.swing.JComboBox<>();
        dropDown3 = new javax.swing.JComboBox<>();
        dropDown4 = new javax.swing.JComboBox<>();
        dropDown5 = new javax.swing.JComboBox<>();
        output = new javax.swing.JLabel();
        dropDown6 = new javax.swing.JComboBox<>();
        dropDown7 = new javax.swing.JComboBox<>();
        dropDown8 = new javax.swing.JComboBox<>();
        dropDown9 = new javax.swing.JComboBox<>();
        dropDown10 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Select Your Team");

        jLabel2.setText("Center");

        jLabel3.setText("Power forward");

        jLabel4.setText("Small forward");

        jLabel5.setText("Shooting guard");

        jLabel6.setText("Point guard");

        jButton1.setText("Continue");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dropDown1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Karl-Anthony Towns", "DeMarcus Cousins", "Nikola Jokic", "Rudy Gobert", "Marc Gasol", "Joel Embiid", "Hassan Whiteside", "Al Horford", "DeAndre Jordan" }));

        dropDown2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Kevin Durant", "Anthony Davis", "Draymond Green", "Blake Griffin", "Paul Milsap", "Kristaps Porzingis", "Jae Crowder", "LaMarcus Aldridge", "Carmelo Anthony" }));

        dropDown3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LeBron James", "Kawi Leonard", "Giannis Antetokounmpo", "Paul George", "Gordon Hayward", "Khris Middleton", "Otto Porter jr", "Danilo Gallinari", "Adre Iguodala" }));

        dropDown4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "James Harden", "Jimmy Butler", "Klay Thompson", "CJ McCollum", "DeMar DeRozen", "Bradley Beal", "Gary Harris", "Avery Bradley", "Kentavious Caldwell-Pope" }));

        dropDown5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Stephen Curry", "Russell Westbrook", "Chris Paul", "John Wall", "Kyle Lowry", "Mike Conley", "Damian Lillard", "Kyrie Irving", "Kemba Walker" }));

        dropDown6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Kevin Durant", "Anthony Davis", "Draymond Green", "Blake Griffin", "Paul Milsap", "Kristaps Porzingis", "Jae Crowder", "LaMarcus Aldridge", "Carmelo Anthony" }));

        dropDown7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Karl-Anthony Towns", "DeMarcus Cousins", "Nikola Jokic", "Rudy Gobert", "Marc Gasol", "Joel Embiid", "Hassan Whiteside", "Al Horford", "DeAndre Jordan" }));

        dropDown8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "LeBron James", "Kawi Leonard", "Giannis Antetokounmpo", "Paul George", "Gordon Hayward", "Khris Middleton", "Otto Porter jr", "Danilo Gallinari", "Adre Iguodala" }));

        dropDown9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "James Harden", "Jimmy Butler", "Klay Thompson", "CJ McCollum", "DeMar DeRozen", "Bradley Beal", "Gary Harris", "Avery Bradley", "Kentavious Caldwell-Pope" }));

        dropDown10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Stephen Curry", "Russell Westbrook", "Chris Paul", "John Wall", "Kyle Lowry", "Mike Conley", "Damian Lillard", "Kyrie Irving", "Kemba Walker" }));

        jLabel7.setText("1");

        jLabel8.setText("2");

        jLabel9.setText("1");

        jLabel10.setText("2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(337, 337, 337)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropDown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropDown6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropDown7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropDown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropDown8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(211, 211, 211)
                .addComponent(jLabel4)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(dropDown4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(dropDown9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dropDown10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dropDown5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropDown6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDown7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDown8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropDown4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDown5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dropDown9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropDown10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(output, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connection = MySqlConnect.ConnectDB();
        
        Player1_ = dropDown1.getSelectedIndex();
        Player2_ = dropDown2.getSelectedIndex();
        Player3_ = dropDown3.getSelectedIndex();
        Player4_ = dropDown4.getSelectedIndex();
        Player5_ = dropDown5.getSelectedIndex();
        
        Player6_ = dropDown6.getSelectedIndex();
        Player7_ = dropDown7.getSelectedIndex();
        Player8_ = dropDown8.getSelectedIndex();
        Player9_ = dropDown9.getSelectedIndex();
        Player10_ = dropDown10.getSelectedIndex();
        
        if(Player1_ != Player7_ && Player2_ != Player6_ && Player3_ != Player8_ && Player4_ != Player9_ && Player5_ != Player10_)
        {
            if(Player1_ != 0 && Player2_ != 0 && Player3_ != 0 && Player4_ != 0 && Player5_ != 0)
            {
                line1 = Player1_ + "0" + Player2_ + "0" + Player3_ + "0" + Player4_ + "0" + Player5_ + "0";
                
                
                
                if(Player6_ != 0 && Player7_ != 0 && Player8_ != 0 && Player9_ != 0 && Player10_ != 0)
                {
                    line2 = Player6_ + "0" + Player7_ + "0" + Player8_ + "0" + Player9_ + "0" + Player10_;
                    String team = line1 + line2;
                    try{
                    String query2 = "UPDATE fantasypooldatabase SET usersTeam =?  WHERE Username=?;";
                    ps = connection.prepareStatement(query2);              
                    ps.setString(1, team);
                    ps.setString(2, currentUser);
                    ps.execute();
                    
                    new homePage().setVisible(true);
                    this.setVisible(false);                
                    }
                    catch(Exception e){
                        System.out.print("" + e);
                    }
                }else
                {
                    output.setText("Select Is An Invalid Choice");
                }
                       
            }else
            {
                output.setText("Select Is An Invalid Choice");
            }   
            
            
        }else
        {
          output.setText("A Player Was Chosen Twice");
        }
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
            java.util.logging.Logger.getLogger(selectTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(selectTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(selectTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(selectTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new selectTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dropDown1;
    private javax.swing.JComboBox<String> dropDown10;
    private javax.swing.JComboBox<String> dropDown2;
    private javax.swing.JComboBox<String> dropDown3;
    private javax.swing.JComboBox<String> dropDown4;
    private javax.swing.JComboBox<String> dropDown5;
    private javax.swing.JComboBox<String> dropDown6;
    private javax.swing.JComboBox<String> dropDown7;
    private javax.swing.JComboBox<String> dropDown8;
    private javax.swing.JComboBox<String> dropDown9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel output;
    // End of variables declaration//GEN-END:variables
}
