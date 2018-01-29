/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Chathura
 */
public class GUI extends javax.swing.JFrame {

    ArrayList<Long> dwellSupUser;
    ArrayList<Long> flySupUser;
    
    ArrayList<Long> dwellSupPass1;
    ArrayList<Long> flySupPass1;
    
    ArrayList<Long> dwellSupPass2;
    ArrayList<Long> flySupPass2;
    
    
    ArrayList<Long> dwellLogUser;
    ArrayList<Long> flyLogUser;
    
    ArrayList<Long> dwellLogPass;
    ArrayList<Long> flyLogPass;
    
    private Map<String, Record> mapSupUser = new HashMap<String, Record>();
    private Map<String, Record> mapSupPass1 = new HashMap<String, Record>();
    private Map<String, Record> mapSupPass2 = new HashMap<String, Record>();
    private Map<String, Record> mapLogUser = new HashMap<String, Record>();
    private Map<String, Record> mapLogPass = new HashMap<String, Record>();
    
    private Map<String, User> login = new HashMap<String, User>();
    
    
    private long time;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        dwellSupUser = new ArrayList<Long>();
        flySupUser = new ArrayList<Long>();
        dwellSupPass1 = new ArrayList<Long>();
        flySupPass1 = new ArrayList<Long>();
        dwellSupPass2 = new ArrayList<Long>();
        flySupPass2 = new ArrayList<Long>();
        dwellLogUser = new ArrayList<Long>();
        flyLogUser = new ArrayList<Long>();
        dwellLogPass = new ArrayList<Long>();
        flyLogPass = new ArrayList<Long>();
        time = millis();
        
        supUser.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                Record record = mapSupUser.get(key);
                record.releaseTime = millis();
                mapSupUser.remove(key);
                System.out.println(key + ", time: " + (record.releaseTime - record.pressedTime));
                time = millis();
                dwellSupUser.add(record.releaseTime - record.pressedTime);
            }

            public void keyTyped(KeyEvent e) {
                
            }

            public void keyPressed(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                
                if (!mapSupUser.containsKey(key)) {

                    // create new record with this key and start timestamp
                    Record record = new Record(key, millis());
                    mapSupUser.put(key, record);
                    flySupUser.add(millis()-time);
                }
            }
            
        });
        
        supPass1.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                Record record = mapSupPass1.get(key);
                record.releaseTime = millis();
                mapSupPass1.remove(key);
                System.out.println(key + ", time: " + (record.releaseTime - record.pressedTime));
                time = millis();
                dwellSupPass1.add(record.releaseTime - record.pressedTime);

            }

            public void keyTyped(KeyEvent e) {
                
            }

            public void keyPressed(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                
                if (!mapSupPass1.containsKey(key)) {

                    // create new record with this key and start timestamp
                    Record record = new Record(key, millis());
                    mapSupPass1.put(key, record);
                    flySupPass1.add(millis()-time);
                }
            }
            
        });
        
        supPass2.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                Record record = mapSupPass2.get(key);
                record.releaseTime = millis();
                mapSupPass2.remove(key);
                System.out.println(key + ", time: " + (record.releaseTime - record.pressedTime));
                time = millis();
                dwellSupPass2.add(record.releaseTime - record.pressedTime);

            }

            public void keyTyped(KeyEvent e) {
                
            }

            public void keyPressed(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                
                if (!mapSupPass2.containsKey(key)) {

                    // create new record with this key and start timestamp
                    Record record = new Record(key, millis());
                    mapSupPass2.put(key, record);
                    flySupPass2.add(millis()-time);
                }
            }
            
        });
        
        
        logUser.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                Record record = mapLogUser.get(key);
                record.releaseTime = millis();
                mapLogUser.remove(key);
                System.out.println(key + ", time: " + (record.releaseTime - record.pressedTime));
                time = millis();
                dwellLogUser.add(record.releaseTime - record.pressedTime);

            }

            public void keyTyped(KeyEvent e) {
                
            }

            public void keyPressed(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                
                if (!mapLogUser.containsKey(key)) {

                    // create new record with this key and start timestamp
                    Record record = new Record(key, millis());
                    mapLogUser.put(key, record);
                    flyLogUser.add(millis()-time);
                }
            }
            
        });
        
        logPass.addKeyListener(new KeyAdapter(){
            public void keyReleased(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                Record record = mapLogPass.get(key);
                record.releaseTime = millis();
                mapLogPass.remove(key);
                System.out.println(key + ", time: " + (record.releaseTime - record.pressedTime));
                time = millis();
                dwellLogPass.add(record.releaseTime - record.pressedTime);

            }

            public void keyTyped(KeyEvent e) {
                
            }

            public void keyPressed(KeyEvent e) {
                String key = KeyEvent.getKeyText(e.getKeyCode());
                
                if (!mapSupUser.containsKey(key)) {

                    // create new record with this key and start timestamp
                    Record record = new Record(key, millis());
                    mapLogPass.put(key, record);
                    flyLogPass.add(millis()-time);
                }
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        logUser = new javax.swing.JTextField();
        logPass = new javax.swing.JPasswordField();
        logBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        supBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        supUser = new javax.swing.JTextField();
        supPass2 = new javax.swing.JPasswordField();
        supPass1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Keystroke Authentication");
        setMaximumSize(new java.awt.Dimension(880, 550));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(103, 58, 183));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 193, 7));
        jLabel3.setText("Login");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Password");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 300, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 300, 10));

        logUser.setBackground(new java.awt.Color(103, 58, 183));
        logUser.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        logUser.setForeground(new java.awt.Color(255, 255, 255));
        logUser.setBorder(null);
        jPanel2.add(logUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 280, 30));

        logPass.setBackground(new java.awt.Color(103, 58, 183));
        logPass.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        logPass.setForeground(new java.awt.Color(255, 255, 255));
        logPass.setBorder(null);
        jPanel2.add(logPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 280, 30));

        logBtn.setBackground(new java.awt.Color(0, 150, 136));
        logBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        logBtn.setForeground(new java.awt.Color(255, 255, 255));
        logBtn.setText("Login");
        logBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logBtnActionPerformed(evt);
            }
        });
        jPanel2.add(logBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 90, 50));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon("G:\\Projects\\Java\\KeyBiometric\\src\\GUI\\key.png")); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Username");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 440, 550));

        jPanel1.setBackground(new java.awt.Color(255, 87, 34));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supBtn.setBackground(new java.awt.Color(0, 150, 136));
        supBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        supBtn.setForeground(new java.awt.Color(255, 255, 255));
        supBtn.setText("Sign Up");
        supBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supBtnActionPerformed(evt);
            }
        });
        jPanel1.add(supBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, 100, 50));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Repeat Password");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon("G:\\Projects\\Java\\KeyBiometric\\src\\GUI\\login.png")); // NOI18N
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 250, 500));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sign Up");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 300, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 300, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 300, 10));

        supUser.setBackground(new java.awt.Color(255, 87, 34));
        supUser.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        supUser.setForeground(new java.awt.Color(255, 255, 255));
        supUser.setBorder(null);
        jPanel1.add(supUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 280, 30));

        supPass2.setBackground(new java.awt.Color(255, 87, 34));
        supPass2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        supPass2.setForeground(new java.awt.Color(255, 255, 255));
        supPass2.setBorder(null);
        jPanel1.add(supPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 280, 30));

        supPass1.setBackground(new java.awt.Color(255, 87, 34));
        supPass1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        supPass1.setForeground(new java.awt.Color(255, 255, 255));
        supPass1.setBorder(null);
        jPanel1.add(supPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 280, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void supBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supBtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Message");
        if((supPass1.getText().equals(supPass2.getText()))){
            System.out.println("ok");
            String key = supUser.getText();
                
                if (!login.containsKey(key)) {
                    
                    User user = new User(key, supPass1.getText(), dwellSupPass1, flySupPass1);
                    login.put(key, user);
                    System.out.println("User created");
                    JOptionPane.showMessageDialog(frame, "User created");
                    
                }else{
                    System.out.println("User already exists");
                    JOptionPane.showMessageDialog(frame, "User already exists");
                }
        }else{
            System.out.println("pass dont match");
            JOptionPane.showMessageDialog(frame, "pass dont match");
        }
        
        supUser.setText("");
        supPass1.setText("");
        supPass2.setText("");
        dwellSupUser = new ArrayList<Long>();
        flySupUser = new ArrayList<Long>();
        dwellSupPass1 = new ArrayList<Long>();
        flySupPass1 = new ArrayList<Long>();
        dwellSupPass2 = new ArrayList<Long>();
        flySupPass2 = new ArrayList<Long>();
        
    }//GEN-LAST:event_supBtnActionPerformed

    private void logBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logBtnActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Message");
        String key = logUser.getText();
        float countdwell = 0;
        float countfly = 0;
                
                if (login.containsKey(key)) {
                    User user = login.get(key);
                    for (int i=0;user.dwellTime.size()>i;i++){
                        System.out.println(""+user.dwellTime.get(i)+" "+dwellLogPass.get(i));
                        if(25 > (user.dwellTime.get(i)- dwellLogPass.get(i))){
                            countdwell++;
                        };
                    }
                    
                    for (int i=1;user.flyTime.size()>i;i++){
                        System.out.println(""+user.flyTime.get(i)+" "+flyLogPass.get(i));
                        if(25 > (user.flyTime.get(i)- flyLogPass.get(i))){
                            countfly++;
                        };
                    }
                    
                    if((countdwell > user.dwellTime.size()/1.5) && (countfly > user.flyTime.size()/1.7)){
                        System.out.println("success!"+ countdwell + " " + countfly);
                        JOptionPane.showMessageDialog(frame, "Welcome "+ key);
                    }else{
                        System.out.println("fail" + countdwell + " " + countfly);
                        JOptionPane.showMessageDialog(frame, "Login failed");
                    }
                    
                }else{
                    System.out.println("No user");
                    JOptionPane.showMessageDialog(frame, "No user");
                }
                
        logUser.setText("");
        logPass.setText("");
        dwellLogUser = new ArrayList<Long>();
        flyLogUser = new ArrayList<Long>();
        dwellLogPass = new ArrayList<Long>();
        flyLogPass = new ArrayList<Long>();
    }//GEN-LAST:event_logBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    public long millis(){
        return System.currentTimeMillis();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JButton logBtn;
    private javax.swing.JPasswordField logPass;
    private javax.swing.JTextField logUser;
    private javax.swing.JButton supBtn;
    private javax.swing.JPasswordField supPass1;
    private javax.swing.JPasswordField supPass2;
    private javax.swing.JTextField supUser;
    // End of variables declaration//GEN-END:variables
}
