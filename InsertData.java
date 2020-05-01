package calculate;
import java.sql.*;
public class InsertData extends javax.swing.JFrame {
    public int Qoe_get;
    public int Qow_get;
    public String Room_Year2;
    public String Month_Sel_3;
    public InsertData() {initComponents();}
    public InsertData(String r)
    {
        Room_Year2 = r;
        System.out.println("page4");
        System.out.println(Room_Year2);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Insert_Data = new javax.swing.JTextField();
        Admin = new javax.swing.JTextField();
        Insert_BTN = new javax.swing.JButton();
        Month_3 = new javax.swing.JComboBox<>();
        Qoe = new javax.swing.JTextField();
        Qow = new javax.swing.JTextField();
        Qoe_Text = new javax.swing.JTextField();
        Qow_Text = new javax.swing.JTextField();
        Success1 = new javax.swing.JTextField();
        Room_3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Insert page");
        setBackground(new java.awt.Color(153, 153, 153));

        Insert_Data.setEditable(false);
        Insert_Data.setBackground(new java.awt.Color(255, 255, 255));
        Insert_Data.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        Insert_Data.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Insert_Data.setText("Insert data into database");

        Admin.setEditable(false);
        Admin.setBackground(new java.awt.Color(0, 0, 0));
        Admin.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Admin.setForeground(new java.awt.Color(255, 255, 255));
        Admin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Admin.setText("Admin");

        Insert_BTN.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        Insert_BTN.setText("Add");
        Insert_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_BTNActionPerformed(evt);
            }
        });

        Month_3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        Month_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        Qoe.setEditable(false);
        Qoe.setBackground(new java.awt.Color(255, 255, 255));
        Qoe.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Qoe.setText("Quantity of electricity");
        Qoe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QoeActionPerformed(evt);
            }
        });

        Qow.setEditable(false);
        Qow.setBackground(new java.awt.Color(255, 255, 255));
        Qow.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Qow.setText("Quantity of water");

        Qoe_Text.setBackground(new java.awt.Color(240, 240, 240));
        Qoe_Text.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Qoe_Text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Qoe_TextActionPerformed(evt);
            }
        });

        Qow_Text.setBackground(new java.awt.Color(240, 240, 240));
        Qow_Text.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N

        Success1.setEditable(false);
        Success1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Success1.setForeground(new java.awt.Color(255, 255, 255));
        Success1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Room_3.setEditable(false);
        Room_3.setBackground(new java.awt.Color(255, 255, 255));
        Room_3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Room_3.setText(Room_Year2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Insert_Data)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 492, Short.MAX_VALUE)
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Success1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(Insert_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Qoe)
                    .addComponent(Qow)
                    .addComponent(Month_3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Qoe_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(Qow_Text, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(Room_3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Admin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Insert_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Month_3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Room_3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qoe, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qoe_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Qow_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Insert_BTN)
                        .addContainerGap())
                    .addComponent(Success1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_BTNActionPerformed
        Qoe_get = Integer.parseInt(Qoe_Text.getText());
        Qow_get = Integer.parseInt(Qow_Text.getText());
        Month_Sel_3 = (String)Month_3.getSelectedItem();
        //System.out.println(Month_Sel_3);
        if (Month_Sel_3 != "Month" && Qoe_get == (int)Qoe_get && Qow_get == (int)Qow_get)
        {
            System.out.println("Ele bill : " + Qoe_get + " x 7 = " + Qoe_get*7);
            System.out.println("Water bill : " + Qow_get + " x 25 = " + Qow_get*25);
            System.out.println("Sumary : " + ((Qoe_get*7)+(Qow_get*25)));
            //System.out.println(Room_Year2);
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                String dbURL = "jdbc:mysql://localhost/project";
                Connection con = DriverManager.getConnection(dbURL, "root", "");
                PreparedStatement pStatement = con.prepareStatement("UPDATE `"+Room_Year2+"` SET `Quantity_of_electricity` = "+Qoe_get+", `Electricity_bill` = "+(Qoe_get*7)+", `Quantity_of_water` = "+Qow_get+", `Water_bill` = "+(Qow_get*25)+", `Summary` = "+((Qoe_get*7)+(Qow_get*25))+", `Time` = CURRENT_TIMESTAMP WHERE `Month` = \""+Month_Sel_3+"\"");
                pStatement.executeUpdate();
                System.out.println("Success");
                System.out.println(Qoe_get);
                Success1.setText("Add success !!");
                Success1.setBackground(new java.awt.Color(51, 255, 0));
                //Pop Pop1 = new Pop();
                //Pop1.setVisible(true);
                setVisible(false);
                con.close();
            }
            catch (ClassNotFoundException e)
            {
                Success1.setText("Error");
                Success1.setBackground(new java.awt.Color(200, 0, 0));
                System.err.println("Error loading driver: "+ e);
            }
            catch (SQLException e)
            {
                Success1.setText("Error");
                Success1.setBackground(new java.awt.Color(200, 0, 0));
                System.err.println("Error database connection: "+ e);
            }
            catch (NumberFormatException e)
            {
                Success1.setText("Error");
                Success1.setBackground(new java.awt.Color(200, 0, 0));
                System.err.println("Error database connection: "+ e);
            }
        }
        else
        {
            Success1.setText("Something wrong");
            Success1.setBackground(new java.awt.Color(200, 0, 0));
        }
    }//GEN-LAST:event_Insert_BTNActionPerformed

    private void Qoe_TextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Qoe_TextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Qoe_TextActionPerformed

    private void QoeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QoeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QoeActionPerformed

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
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Admin;
    private javax.swing.JButton Insert_BTN;
    private javax.swing.JTextField Insert_Data;
    private javax.swing.JComboBox<String> Month_3;
    private javax.swing.JTextField Qoe;
    private javax.swing.JTextField Qoe_Text;
    private javax.swing.JTextField Qow;
    private javax.swing.JTextField Qow_Text;
    private javax.swing.JTextField Room_3;
    private javax.swing.JTextField Success1;
    // End of variables declaration//GEN-END:variables
}
