
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import zootop.Vet_Window;


public class Insert_vet_data_form extends javax.swing.JFrame {

    
    public Insert_vet_data_form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        insert_data_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Anima = new javax.swing.JLabel();
        Emplyoee_Id_field = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Vet_Name_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Head_Vet_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Speciality_field = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Veternity_Experience_field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insert_data_panel.setBackground(new java.awt.Color(102, 51, 0));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vet");

        Anima.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Anima.setForeground(new java.awt.Color(255, 255, 255));
        Anima.setText("Employee ID : ");

        Emplyoee_Id_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vet Name : ");

        Vet_Name_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Head Vet :");

        Head_Vet_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Speciality :");
        jLabel6.setToolTipText("");

        Speciality_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        insert.setBackground(new java.awt.Color(255, 255, 102));
        insert.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 255, 102));
        back.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Veternity Experience : ");
        jLabel7.setToolTipText("");

        Veternity_Experience_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        javax.swing.GroupLayout insert_data_panelLayout = new javax.swing.GroupLayout(insert_data_panel);
        insert_data_panel.setLayout(insert_data_panelLayout);
        insert_data_panelLayout.setHorizontalGroup(
            insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_data_panelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                        .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(insert_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Head_Vet_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_data_panelLayout.createSequentialGroup()
                                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                                        .addComponent(Anima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)))
                                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Vet_Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Emplyoee_Id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insert)
                                    .addComponent(Speciality_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Veternity_Experience_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(129, 129, 129))))
            .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_data_panelLayout.createSequentialGroup()
                    .addContainerGap(684, Short.MAX_VALUE)
                    .addComponent(back)
                    .addGap(56, 56, 56)))
        );
        insert_data_panelLayout.setVerticalGroup(
            insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_data_panelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anima)
                    .addComponent(Emplyoee_Id_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Vet_Name_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Head_Vet_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Speciality_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Veternity_Experience_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(insert)
                .addGap(60, 60, 60))
            .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_data_panelLayout.createSequentialGroup()
                    .addContainerGap(571, Short.MAX_VALUE)
                    .addComponent(back)
                    .addGap(31, 31, 31)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insert_data_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(insert_data_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=Zootopia;selectMethod=cursor", "sa", "123456");
           Statement statement = connection.createStatement();
           statement.executeUpdate("insert into Vet(Emplyoee_Id,Vet_Name,Head_Vet,Speciality,Veternity_Experience) values('"+Integer.parseInt(Emplyoee_Id_field.getText())+"','"+Vet_Name_field.getText()+"','"+Head_Vet_field.getText()+"','"+Speciality_field.getText()+"','"+Veternity_Experience_field.getText()+"')");
           
            JOptionPane.showMessageDialog(null, "Information Stored!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_insertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Vet_Window obj = new Vet_Window();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_vet_data_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anima;
    private javax.swing.JTextField Emplyoee_Id_field;
    private javax.swing.JTextField Head_Vet_field;
    private javax.swing.JTextField Speciality_field;
    private javax.swing.JTextField Vet_Name_field;
    private javax.swing.JTextField Veternity_Experience_field;
    private javax.swing.JButton back;
    private javax.swing.JButton insert;
    private javax.swing.JPanel insert_data_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
