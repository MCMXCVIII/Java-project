package calculate;
import java.sql.*;
public class CalculateSW2 extends javax.swing.JFrame {
    public String Y;
    public String R;
    public String Y_R;
    public String Get_Month;
    public String Month;
    public int Quantity_of_electricity;
    public int Electricity_bill;
    public int Quantity_of_water;
    public int Water_bill;
    public int Summary;
    public CalculateSW2(){initComponents();}
    public CalculateSW2(String Room, String Year)
    {
        System.out.println("page2");
        Y = Year;
        R = Room;
        Y_R = Y+"_"+R;
        //System.out.println(Y_R);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        YearPg2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        Water_Table = new javax.swing.JTable();
        Add_dataPg2 = new javax.swing.JButton();
        Sum_box = new javax.swing.JTextField();
        Title = new javax.swing.JTextField();
        Month_Sel_2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Room_Number_2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        Electric_Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Show data");

        jPanel1.setBackground(new java.awt.Color(48, 74, 120));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        YearPg2.setEditable(false);
        YearPg2.setBackground(new java.awt.Color(204, 204, 204));
        YearPg2.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        YearPg2.setText(Y);
        YearPg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearPg2ActionPerformed(evt);
            }
        });

        Water_Table.setBackground(new java.awt.Color(0, 0, 0));
        Water_Table.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        Water_Table.setForeground(new java.awt.Color(255, 255, 255));
        Water_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Month", "Quantity of water", "Water bill  "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Water_Table);

        Add_dataPg2.setBackground(new java.awt.Color(0, 51, 153));
        Add_dataPg2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Add_dataPg2.setForeground(new java.awt.Color(255, 255, 255));
        Add_dataPg2.setText("Add new water bill and electric bill");
        Add_dataPg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_dataPg2ActionPerformed(evt);
            }
        });

        Sum_box.setEditable(false);
        Sum_box.setBackground(new java.awt.Color(0, 153, 255));
        Sum_box.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        Sum_box.setForeground(new java.awt.Color(255, 255, 255));
        Sum_box.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Title.setEditable(false);
        Title.setBackground(new java.awt.Color(10, 14, 40));
        Title.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Title.setText("Utility bills");
        Title.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Title.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        Title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitleActionPerformed(evt);
            }
        });

        Month_Sel_2.setBackground(new java.awt.Color(204, 204, 204));
        Month_Sel_2.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        Month_Sel_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        Month_Sel_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Month_Sel_2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(220, 177, 60));
        jButton1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GO !!!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Room_Number_2.setEditable(false);
        Room_Number_2.setBackground(new java.awt.Color(204, 204, 204));
        Room_Number_2.setFont(new java.awt.Font("Dubai", 0, 24)); // NOI18N
        Room_Number_2.setText("Room: " + R);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Water price per unit : 7 THB");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("Electricity price per unit : 25 THB");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        Electric_Table.setBackground(new java.awt.Color(0, 0, 0));
        Electric_Table.setFont(new java.awt.Font("Dubai", 0, 14)); // NOI18N
        Electric_Table.setForeground(new java.awt.Color(255, 255, 255));
        Electric_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Month", "Quantity of water", "Water bill  "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Electric_Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title)
            .addComponent(Add_dataPg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(Room_Number_2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Month_Sel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(YearPg2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sum_box, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Room_Number_2)
                    .addComponent(YearPg2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Month_Sel_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sum_box, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(Add_dataPg2))
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

    private void Add_dataPg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_dataPg2ActionPerformed
        Password Pass = new Password(Y_R);
        Pass.setVisible(true);
    }//GEN-LAST:event_Add_dataPg2ActionPerformed

    private void TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleActionPerformed

    private void Month_Sel_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Month_Sel_2ActionPerformed
        
    }//GEN-LAST:event_Month_Sel_2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Get_Month = (String)Month_Sel_2.getSelectedItem();
//System.out.println(Get_Month);======================================================
//Select * from table Y_R=============================================================
//Electric Bill=======================================================================
//Water Bill==========================================================================
        if (Get_Month != "Month")
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                String dbURL = "jdbc:mysql://localhost/project";
                Connection con = DriverManager.getConnection(dbURL, "root", "");
                PreparedStatement pStatement = con.prepareStatement("SELECT * FROM `"+Y_R+"` WHERE Month = \""+Get_Month+"\"");
                ResultSet resultSet= pStatement.executeQuery();
                while(resultSet.next())
                {
                    Month = resultSet.getString("Month");
                    Quantity_of_electricity = resultSet.getInt("Quantity_of_electricity");
                    Electricity_bill = resultSet.getInt("Electricity_bill");
                    Quantity_of_water = resultSet.getInt("Quantity_of_water");
                    Water_bill = resultSet.getInt("Water_bill");
                    Summary = resultSet.getInt("Summary");
                    //System.out.println(Summary);
                }con.close();
            }
            catch (ClassNotFoundException e)
            {
                System.err.println("Error loading driver: "+ e);
            }
            catch(SQLException e)
            {
                System.err.println("Error database connection: "+ e);
            }
    //Select * from table R_Y================================================================
    //Electric Bill==========================================================================
            Sum_box.setText("Total = "+Summary+" Bath");
            Electric_Table.setModel(new javax.swing.table.DefaultTableModel
            (
                new Object [][] {
                    {Get_Month, Quantity_of_electricity, Electricity_bill}
                },
                new String [] {
                    "Month", "Quantity of electricity", "Electricity bill"
                }
            ));
            Water_Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                    {Get_Month, Quantity_of_water, Water_bill}
                },
                new String []
                {
                    "Month", "Quantity of water", "Water bill"
                }
            ));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void YearPg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearPg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearPg2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateSW2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_dataPg2;
    private javax.swing.JTable Electric_Table;
    private javax.swing.JComboBox<String> Month_Sel_2;
    private javax.swing.JTextField Room_Number_2;
    private javax.swing.JTextField Sum_box;
    private javax.swing.JTextField Title;
    private javax.swing.JTable Water_Table;
    private javax.swing.JTextField YearPg2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
