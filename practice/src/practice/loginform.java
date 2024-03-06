package practice;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JTextField;
public class loginform extends javax.swing.JFrame {

    
    public loginform() {
        initComponents();
    }
    public void clear(){
        jTextField1.setText("");
        jTextField2.setText("");
            jTextField3.setText("");
            jDateChooser1.setCalendar(null);
            jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        buttonGroup2.clearSelection();
        jComboBox1.setSelectedIndex(0);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jTextArea1.setText("");
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subject = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("form validation");

        id.setText("enrollment no.");

        name.setText("Name");

        email.setText("email");

        dob.setText("DOB");

        gender.setText("Gender");

        jLabel2.setText("Division");

        subject.setText("Subject");

        jLabel3.setText("Address");

        jRadioButton1.setText("Male");

        jRadioButton2.setText("Female");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "TC1", "TC2", "TC3", "TC4" }));

        jCheckBox1.setText("AJT");

        jCheckBox2.setText("Web Technology");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton1)
                .addGap(119, 119, 119)
                .addComponent(jButton2)
                .addGap(101, 101, 101)
                .addComponent(jButton3)
                .addContainerGap(185, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(49, 49, 49)
                        .addComponent(jRadioButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id)
                        .addGap(18, 18, 18)
                        .addComponent(name)
                        .addGap(18, 18, 18)
                        .addComponent(email)
                        .addGap(18, 18, 18)
                        .addComponent(dob)
                        .addGap(26, 26, 26)
                        .addComponent(gender)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(subject)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 99, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(29, 29, 29)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         
         if(jTextField1.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter ID");
         }
         else if(jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter Name");
         }
         else  if(jTextField3.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Enter Email");
         }
        else  if(jDateChooser1.getDate()==null){
              JOptionPane.showMessageDialog(null, "Enter Date of Birth");
          }
        else  if((jRadioButton1.isSelected()==false) && (jRadioButton2.isSelected()==false)){
              JOptionPane.showMessageDialog(null, "Enter Your Gender");
          }
         else if(jComboBox1.getSelectedItem()=="-select-"){
             JOptionPane.showMessageDialog(null, "Choose Your Class");  
          }
         else if(!jCheckBox1.isSelected() && !jCheckBox2.isSelected()){
            JOptionPane.showMessageDialog(null, "Choose Your Subjects");   
         }
         else if(jTextArea1.getText().equals("")){
              JOptionPane.showMessageDialog(null, "Enter your Address");   
         }
         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/workspace","root","");
             System.out.println("connected");
             PreparedStatement p = c.prepareStatement("INSERT INTO formvalidattion(id, name, email, dob, gender, division, subject, address) VALUES(?,?,?,?,?,?,?,?)");
             p.setInt(1,Integer.parseInt(jTextField1.getText()));
             p.setString(2, jTextField2.getText()); 
             p.setString(3, jTextField3.getText());
             p.setString(4, ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText());
             if(jRadioButton1.isSelected()){
                 p.setString(5, jRadioButton1.getText());
             }
             else{
                  p.setString(5, jRadioButton2.getText());
             }
             String v = jComboBox1.getSelectedItem().toString();
             p.setString(6, v);
             String fav = "";
             if(jCheckBox1.isSelected()){
                 fav += jCheckBox1.getText() +",";
             }
             else if(jCheckBox2.isSelected()){
                 fav += jCheckBox2.getText() +",";
             }
             p.setString(7, fav);
             p.setString(8, jTextArea1.getText());
             int i = p.executeUpdate();
             System.out.println(i+" data uploaded");
             clear();
         }
            
         catch(Exception e){
             e.printStackTrace();
         }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel email;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel name;
    private javax.swing.JLabel subject;
    // End of variables declaration//GEN-END:variables
}
