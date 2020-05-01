package calculate;

public class CalculateSW extends javax.swing.JFrame {
    public CalculateSW() {
        System.out.println("page1");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JTextField();
        Select_Room = new javax.swing.JComboBox<>();
        Select_Year = new javax.swing.JComboBox<>();
        Search_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Utility bill");

        jPanel1.setBackground(new java.awt.Color(48, 74, 120));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        Select_Room.setBackground(new java.awt.Color(204, 204, 204));
        Select_Room.setFont(new java.awt.Font("Dubai", 0, 30)); // NOI18N
        Select_Room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Room", "001", "002", "003", "004", "005", "006", "007", "008", "009", "010" }));
        Select_Room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_RoomActionPerformed(evt);
            }
        });

        Select_Year.setBackground(new java.awt.Color(204, 204, 204));
        Select_Year.setFont(new java.awt.Font("Dubai", 0, 30)); // NOI18N
        Select_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "2020" }));
        Select_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Select_YearActionPerformed(evt);
            }
        });

        Search_Button.setBackground(new java.awt.Color(220, 177, 60));
        Search_Button.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        Search_Button.setText("Search !!");
        Search_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Search_ButtonMouseClicked(evt);
            }
        });
        Search_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Select_Room, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Select_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)))
                .addGap(215, 215, 215))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(Select_Room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Select_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Search_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
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

    private void Select_RoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_RoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_RoomActionPerformed

    private void TitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TitleActionPerformed

    private void Search_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_ButtonActionPerformed
        String ROOM = (String)Select_Room.getSelectedItem();
        //System.out.println(ROOM);
        String YEAR = (String)Select_Year.getSelectedItem();
        //System.out.println(YEAR);
        if (ROOM != "Select Room" && YEAR != "Select Year")
        {
        CalculateSW2 Page2 = new CalculateSW2(ROOM, YEAR);
        Page2.setVisible(true);
        setVisible(false);
        }
    }//GEN-LAST:event_Search_ButtonActionPerformed

    private void Search_ButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Search_ButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_ButtonMouseClicked

    private void Select_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Select_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Select_YearActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateSW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search_Button;
    private javax.swing.JComboBox<String> Select_Room;
    private javax.swing.JComboBox<String> Select_Year;
    private javax.swing.JTextField Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
