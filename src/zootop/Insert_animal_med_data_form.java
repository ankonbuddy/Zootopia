package zootop;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Insert_animal_med_data_form extends javax.swing.JFrame {

    
    public Insert_animal_med_data_form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        insert_data_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Anima = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Medicine_Brand_field = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Species_Med_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Med_Quantity_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Received_Date_field = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insert_data_panel.setBackground(new java.awt.Color(0, 153, 153));
        insert_data_panel.setPreferredSize(new java.awt.Dimension(1080, 720));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("Animal Medicine");

        Anima.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Anima.setText("Animal ID : ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Medicine Brand : ");

        Medicine_Brand_field.setBackground(new java.awt.Color(153, 153, 153));
        Medicine_Brand_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Medicine_Brand_field.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setText("Species Medicine : ");

        Species_Med_field.setBackground(new java.awt.Color(153, 153, 153));
        Species_Med_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Species_Med_field.setForeground(new java.awt.Color(0, 0, 0));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel6.setText("Medicine Quantity : ");

        Med_Quantity_field.setBackground(new java.awt.Color(153, 153, 153));
        Med_Quantity_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Med_Quantity_field.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setText("Received Date : ");

        Received_Date_field.setBackground(new java.awt.Color(153, 153, 153));
        Received_Date_field.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        Received_Date_field.setForeground(new java.awt.Color(0, 0, 0));

        insert.setBackground(new java.awt.Color(153, 153, 153));
        insert.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(153, 153, 153));
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton2.setText("Get animal id");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insert_data_panelLayout = new javax.swing.GroupLayout(insert_data_panel);
        insert_data_panel.setLayout(insert_data_panelLayout);
        insert_data_panelLayout.setHorizontalGroup(
            insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_data_panelLayout.createSequentialGroup()
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel1))
                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(insert_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37)
                                .addComponent(Species_Med_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(insert_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addComponent(Med_Quantity_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_data_panelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(Received_Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert_data_panelLayout.createSequentialGroup()
                                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                                        .addComponent(Anima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(74, 74, 74)))
                                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Medicine_Brand_field, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(31, 31, 31)
                        .addComponent(jRadioButton2))
                    .addGroup(insert_data_panelLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(267, 267, 267)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        insert_data_panelLayout.setVerticalGroup(
            insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert_data_panelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Anima)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Medicine_Brand_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Species_Med_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Med_Quantity_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Received_Date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94)
                .addGroup(insert_data_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insert, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insert_data_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(insert_data_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        // TODO add your handling code here:
        /* try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=zoo;selectMethod=cursor", "sa", "123456");
           Statement statement = connection.createStatement();
           statement.executeUpdate("insert into Animal_Medicine(Animal_Id,Medicine_Brand,Species_Med,Med_Quantity,Received_Date) values('"+Integer.parseInt(Animal_Id_field.getText())+"','"+Medicine_Brand_field.getText()+"','"+Species_Med_field.getText()+"','"+Integer.parseInt(Med_Quantity_field.getText())+"','"+Received_Date_field.getText()+"')");
           
            JOptionPane.showMessageDialog(null, "Information Stored!");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        } */
        
        
           try {
             String url="jdbc:sqlserver://localhost:1433;databaseName=zoo";
        String username="sa";
        String password="123456";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement st=con.createStatement();
          
            //String query1="INSERT INTO ANIMALS(ANIMAL_NAME,SPECIES,GENDER,COUNTRY_OF_BIRTH,WEIGHT,CELL_NO) VALUES('"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"','"+(String)jComboBox1.getSelectedItem()+"')";
          String query1="INSERT INTO Animal_Medicine(Animal_Id,Medicine_Brand,Species_Med,Med_Quantity,Received_Date) VALUES(?,?,?,?,?)";
         
       PreparedStatement str=con.prepareStatement(query1);
        
         // st.execute(query2);
      
           //str.setString(1, jTextField1.getText());
            str.setString(2, Medicine_Brand_field.getText());
            str.setString(3, Species_Med_field.getText());
            str.setString(4, Med_Quantity_field.getText());
            str.setString(5, Received_Date_field.getText());
            
             String value= jComboBox1.getSelectedItem().toString();
                
                      str.setString(1,value);
                    str.execute();
                    
                      
             JOptionPane.showMessageDialog(null,"Information Added to Database");
           
                        
                       
                          
                    
                 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString());
          
        }
    }//GEN-LAST:event_insertActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        Animal_med_Window obj = new Animal_med_Window();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        
        
        try{
             String url="jdbc:sqlserver://localhost:1433;databaseName=zoo";
        String username="sa";
        String password="123456";
            Connection con = DriverManager.getConnection(url,username,password);
            
            Statement str=con.createStatement();
            ResultSet rs=str.executeQuery("SELECT  ANIMAL_ID FROM ANIMALS");
            while(rs.next())
            {
                String ANIMAL_ID=rs.getString("ANIMAL_ID");
                 jComboBox1.addItem(ANIMAL_ID);
            }
            con.close();
        }
        catch(Exception ex){
            
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Insert_animal_med_data_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anima;
    private javax.swing.JTextField Med_Quantity_field;
    private javax.swing.JTextField Medicine_Brand_field;
    private javax.swing.JTextField Received_Date_field;
    private javax.swing.JTextField Species_Med_field;
    private javax.swing.JButton back;
    private javax.swing.JButton insert;
    private javax.swing.JPanel insert_data_panel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    // End of variables declaration//GEN-END:variables
}
