/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasyPool;

import static fantasyPool.homePage.TeamsName;
import static fantasyPool.homePage.userTeam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.ArrayList;

/**
 *
 * @author Owner
 */
public class viewTeam extends javax.swing.JFrame {
    String usersTeam = homePage.userTeam;
    static char a = 'a';
    static int i = 0;
    String currentOutput = "";
    int teamScore = 0;
    String currentUser = MySqlConnect.username;
    
    Connection connection = null;
    PreparedStatement ps = null;
    ResultSet rs =null;
    
 
    String TeamsName_ = homePage.TeamsName;
    /**
     * Creates new form viewTeam
     */
    
    
    ArrayList<String> team = new ArrayList<String>();
    ArrayList<String> playersStats = new ArrayList<String>();
    ArrayList<String> hey = new ArrayList<String>();   
    
    public void webImport(){
         
            try{
                
                Document doc = Jsoup.connect("http://www.hoopsstats.com/basketball/fantasy/nba/playerstats/18/1/eff/1-2").userAgent("Mozilla/17.0").get();
                Elements temp = doc.select("table.statscontent");
                int i = 0;     
                int j = 0;
                for(Element movieList:temp){
                    i++;
                    j++;
                    String hey_ = movieList.getElementsByTag("td").text();
                    hey.add(hey_);
                    for (String players : team) {
                    //System.out.println(players);
                }  
                     
		
                }
                
                int x = 0;
                int y = 0;
                for(y = 0; y < team.size() ; y++){
                for(x = 0; x < 440 ; x++){
                String str = hey.get(x);

                if(y < team.size() && str.contains(team.get(y)) ){
                     String playerStats = hey.get(x);
                     String[] items = playerStats.split(" ");
                    for (String part : items) {
                    playersStats.add(part);   
                    
                    }
                    //System.out.print(playerStats);
                    
                }
                
                else{ 
                    //System.out.println("nope\n");
                }
                }
                }
                    int z = 0;
                    while(z < 4){
                    String playersStats_ = playersStats.get(z + 5);
                    String playersStats_2 = playersStats.get((z + 5)+22);
                    String playersStats_3 = playersStats.get((z + 5)+44);
                    String playersStats_4 = playersStats.get((z + 5)+66);
                    String playersStats_5 = playersStats.get((z + 5)+88);
                    int score = Integer.parseInt(playersStats_);
                    int score2 = Integer.parseInt(playersStats_2);
                    int score3 = Integer.parseInt(playersStats_3);
                    int score4 = Integer.parseInt(playersStats_4);
                    int score5 = Integer.parseInt(playersStats_5);
                    z++;
                    teamScore += score;
                    teamScore += score2;
                    teamScore += score3;
                    teamScore += score4;
                    teamScore += score5;
                    output5.setText(output5.getText() + "\n" + score);
                    output5.setText(output5.getText() + "\n" + score2);
                    output5.setText(output5.getText() + "\n" + score3);
                    output5.setText(output5.getText() + "\n" + score4);
                    output5.setText(output5.getText() + "\n" + score5);
                    
                    
                    
                    }
                    output4.setText("" + teamScore);
        }catch(Exception e){
            System.out.println("" + e);
        }
        
        
    }
    
    
    
    
    
    public viewTeam() {
        initComponents();
        
            try{
            
        connection = MySqlConnect.ConnectDB();
        String query = "SELECT TeamsName FROM fantasypooldatabase WHERE Username =?";
        ps = connection.prepareStatement(query);              
        ps.setString(1, currentUser);
        rs = ps.executeQuery();
        if(rs.next()){
            TeamsName = rs.getString("TeamsName");
            output3.setText(TeamsName);
        }
        }catch(Exception e){
            
        }
        
        for(i = 0; i < 20; i += 2){
        currentOutput = output.getText();
        if(i == 0)centres();
        if(i == 2)powerForwards();
        if(i == 4)smallForwards();
        if(i == 6)shootingGuard();
        if(i == 8)pointGuard();
        if(i == 10)centres();
        if(i == 12)powerForwards();
        if(i == 14)smallForwards();
        if(i == 16)shootingGuard();
        if(i == 18)pointGuard();
        }
        webImport();
        System.out.println(team);
        System.out.println(playersStats);        
        
      
        
    }
     public void smallForwards(){
          a = usersTeam.charAt(i);
            if(a == '1'){
                output.setText(currentOutput + "\nLeBron James");
                team.add("L. James");
            }
            
            else if(a == '2'){
                output.setText(currentOutput + "\nKawi Leonard");
                team.add("K. Leonard");
            }
            
            else if(a == '3'){
                output.setText(currentOutput + "\nGiannis Antetokounmpo");
                team.add("G. Antetokounmpo");
            }
            
            else if(a == '4'){
                output.setText(currentOutput + "\nPaul George");
                team.add("P. George");
            }
            
            else if(a == '5'){
                output.setText(currentOutput + "\nGordon Hayward");
                team.add("G. Hayward");
            }
            
            else if(a == '6'){
                output.setText(currentOutput + "\nKris Middleton");
                team.add("K. Middleton");
            }
            
            else if(a == '7'){
                output.setText(currentOutput + "\nOtto Porter jr");
                team.add("O. Porter jr.");
            }
            
            else if(a == '8'){
                output.setText(currentOutput + "\nDanilo Gallinari");
                team.add("D. Gallinari");
            }
            
            else if(a == '9'){
                output.setText(currentOutput + "\nAdre Iguodala");
                team.add("A. Iguodala");
            }
          
         
     }
     
      public void shootingGuard(){
          a = usersTeam.charAt(i);
            if(a == '1'){
                output.setText(currentOutput + "\nJames Harden");
                team.add("J. Harden");
            }
            else if(a == '2'){
                output.setText(currentOutput + "\nJimmy Butler");
                team.add("J. Butler");
            }
            else if(a == '3'){
                output.setText(currentOutput + "\nKlay Thompson");
                team.add("K. Thompson");
            }
            else if(a == '4'){
                output.setText(currentOutput + "\nCJ McCollum");
                team.add("C. McCollum");
            }
            else if(a == '5'){
                output.setText(currentOutput + "\nDeMar DeRozen");
                team.add("D. DeRozan");
            }
            else if(a == '6'){
                output.setText(currentOutput + "\nBradley Beal");
                team.add("B. Beal");
            }
            else if(a == '7'){
                output.setText(currentOutput + "\nGary Harris");
                team.add("G. Harris");
            }
            else if(a == '8'){
                output.setText(currentOutput + "\nAvery Bradley");
                team.add("A. Bradley");
            }
            else if(a == '9'){
                output.setText(currentOutput + "\nKentavious Caldwell-Pope");
                team.add("K. Caldwell-Pope");
            }
          
      }
      
       public void pointGuard(){
        a = usersTeam.charAt(i);
            if(a == '1'){
                output.setText(currentOutput + "\nStephen Curry");
                team.add("S. Curry");
            }
            else if(a == '2'){
                output.setText(currentOutput + "\nRussell Westbrook");
                team.add("R. Westbrook");
            }
            else if(a == '3'){
                output.setText(currentOutput + "\nChris Paul");
                team.add("C. Paul");
            }
            else if(a == '4'){
                output.setText(currentOutput + "\nJohn Wall");
                team.add("J. Wall");
            }
            else if(a == '5'){
                output.setText(currentOutput + "\nKyle Lowry");
                team.add("K. Lowry");
            }
            else if(a == '6'){
                output.setText(currentOutput + "\nMike Conley");
                team.add("M. Conley");
            }
            else if(a == '7'){
                output.setText(currentOutput + "\nDamian Lilard");
                team.add("D. Lilard");
            }
            else if(a == '8'){
                output.setText(currentOutput + "\nKyrie Irving");
                team.add("K. Irving");
            }
            else if(a == '9'){
                output.setText(currentOutput + "\nKemba Walker");
                team.add("K Walker");
            }   
           
       }
    
    
    
    public void centres(){
            a = usersTeam.charAt(i);
            //output.setText("" + a);
            if(a == '1'){
                output.setText(currentOutput + "\nKarl-Anthony Towns");
                team.add("K. Towns");
            }
            else if(a == '2'){
                output.setText(currentOutput + "\nDemarcus Cousins");
                team.add("D. Cousins");
            }
            else if(a == '3'){
                output.setText(currentOutput + "\nNikola Jokic");
                team.add("K. Jokic");
            }
            else if(a == '4'){
                output.setText(currentOutput + "\nRudy Gobert");
                team.add("R. Gobert");
            }
            else if(a == '5'){
                output.setText(currentOutput + "\nMarc Gasol");
                team.add("M. Gasol");
            }
            else if(a == '6'){
                output.setText(currentOutput + "\nJoel Embiid");
                team.add("J. Embiid");
            }
            else if(a == '7'){
                output.setText(currentOutput + "\nHassan Whiteside");
                team.add("H. Whiteside");
            }
            else if(a == '8'){
                output.setText(currentOutput + "\nAl Horford");
                team.add("A. Horford");
            }
            else if(a == '9'){
                output.setText(currentOutput + "\nDeAndre Jordan");
                team.add("D. Jordan");
            }
            
          
    }
    
    public void powerForwards(){
        a = usersTeam.charAt(i);
            if(a == '1'){
                output.setText(currentOutput + "\nKevin Durant");
                team.add("K. Durant");
            }
            else if(a == '2'){
                output.setText(currentOutput + "\nAnthony Davis");
                team.add("A. Davis");
            }
            else if(a == '3'){
                output.setText(currentOutput + "\nDraymond Green");
                team.add("D. Green");
            }
            else if(a == '4'){
                output.setText(currentOutput + "\nBlake Griffin");
                team.add("B. Griffin");
            }
            else if(a == '5'){
                output.setText(currentOutput + "\nPaul Milsap");
                team.add("P. Milsap");
            }
            else if(a == '6'){
                output.setText(currentOutput + "\nKristaps Porzingis");
                team.add("K. Porzingis");
            }
            else if(a == '7'){
                output.setText(currentOutput + "\nJae Crowder");
                team.add("J. Crowder");
            }
            else if(a == '8'){
                output.setText(currentOutput + "\nLaMarcus Aldridge");
                team.add("L. Aldridge");
            }
            else if(a == '9'){
                output.setText(currentOutput + "\nCarmelo Anthony");
                team.add("C.Anthony");
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        output2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        output = new javax.swing.JTextArea();
        output3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        output4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        output5 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        output2.setText("...");

        output.setEditable(false);
        output.setColumns(20);
        output.setRows(5);
        jScrollPane1.setViewportView(output);

        output3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel2.setText("Score:");

        output4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Team Name:");

        output5.setEditable(false);
        output5.setColumns(20);
        output5.setRows(5);
        jScrollPane2.setViewportView(output5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(output3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(output4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(output2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(output3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(output4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(output2))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        new homePage().setVisible(true);
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(viewTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea output;
    private javax.swing.JLabel output2;
    private javax.swing.JLabel output3;
    private javax.swing.JLabel output4;
    private javax.swing.JTextArea output5;
    // End of variables declaration//GEN-END:variables
}
