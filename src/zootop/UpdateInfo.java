/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zootop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class UpdateInfo extends javax.swing.JFrame {

    /**
     * Creates new form UpdateInfo
     */
    PreparedStatement st=null;
    ResultSet rs=null;
    int q,i;
    public UpdateInfo() {
        initComponents();
    }
    public void upDateDB()
    {
        try {
            String url="jdbc:sqlserver://localhost:1433;databaseName=zoo";
            String username="sa";
            String password="123456";
            Connection con = DriverManager.getConnection(url,username,password);
             st=con.prepareStatement("select  *from  ANIMALS");
            rs=st.executeQuery();
            ResultSetMetaData std=rs.getMetaData();
            q=std.getColumnCount();
            DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
            tblmodel.setRowCount(0);
            while(rs.next())
            {
                Vector columnData=new Vector();
                for(i=1;i<=q;i++)
                {
                    columnData.add(rs.getString("animal_id"));
                    columnData.add(rs.getString("animal_name"));
                    columnData.add(rs.getString("species"));
                    columnData.add(rs.getString("gender"));
                    columnData.add(rs.getString("country_of_birth"));
                    columnData.add(rs.getString("weight"));
                            columnData.add(rs.getString("cell_no"));
                }
                tblmodel.addRow(columnData);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateInfo.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ShowDatabtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 46, 573, 30));

        jTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setPreferredSize(new java.awt.Dimension(84, 50));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 94, 573, 30));

        jTextField3.setBackground(new java.awt.Color(153, 153, 153));
        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 142, 573, 30));

        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(84, 50));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 190, 573, 30));

        jTextField5.setBackground(new java.awt.Color(153, 153, 153));
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 238, 573, 30));

        jTextField6.setBackground(new java.awt.Color(153, 153, 153));
        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 286, 573, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Animal Id");

        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Animal Name");

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Species");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Animal Id", "Animal Name", "Species", "Gender", "Country of Birth", "Weight", "Cell No"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Weight");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Country of Birth");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Deletebtn.setBackground(new java.awt.Color(153, 153, 153));
        Deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Deletebtn.setForeground(new java.awt.Color(51, 51, 51));
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(153, 153, 153));
        UpdateBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(51, 51, 51));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        ShowDatabtn.setBackground(new java.awt.Color(153, 153, 153));
        ShowDatabtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ShowDatabtn.setForeground(new java.awt.Color(51, 51, 51));
        ShowDatabtn.setText("Show Data");
        ShowDatabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDatabtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(ShowDatabtn)
                        .addGap(74, 74, 74)
                        .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(383, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowDatabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
        
        String tblAnimal_id=tblmodel.getValueAt(jTable1.getSelectedRow(),0).toString();
          String tblAnimalName=tblmodel.getValueAt(jTable1.getSelectedRow(),1).toString();
            String tblSpecies=tblmodel.getValueAt(jTable1.getSelectedRow(),2).toString();
              String tblGender=tblmodel.getValueAt(jTable1.getSelectedRow(),3).toString();
                String tblCountryOfBirth=tblmodel.getValueAt(jTable1.getSelectedRow(),4).toString();
                  String tblWeight=tblmodel.getValueAt(jTable1.getSelectedRow(),5).toString();
                  String tblCellNo=tblmodel.getValueAt(jTable1.getSelectedRow(),6).toString();
                  
                  jTextField1.setText(tblAnimal_id);
                   jTextField2.setText(tblAnimalName);
                    jTextField3.setText(tblSpecies);
                     jTextField4.setText(tblGender);
                      jTextField5.setText(tblCountryOfBirth);
                       jTextField6.setText(tblWeight);
                        //jTextField7.setText(tblCellNo);
                        
                        
                        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void ShowDatabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDatabtnActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try {
              // jScrollPane1.setVisible(true);
             String url="jdbc:sqlserver://localhost:1433;databaseName=zoo";
        String username="sa";
        String password="123456";
            Connection con = DriverManager.getConnection(url,username,password);
            
            Statement st=con.createStatement();
            String sql="SELECT  *FROM  ANIMALS  ";
             ResultSet rs=st.executeQuery(sql);
             
             while(rs.next())
             {
                 String animal_id=String.valueOf(rs.getInt("animal_id"));
                 String animal_name=rs.getString("animal_name");
                  String species=rs.getString("species");
                   String gender=rs.getString("gender");
                    String country_of_birth=rs.getString("country_of_birth");
                    String weight=String.valueOf(rs.getInt("weight"));
                    String cell_no=String.valueOf(rs.getInt("cell_no"));
                    
 
                     
                     String tbData[]={animal_id,animal_name,species,gender,country_of_birth,weight,cell_no};
                     DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();
                 tblmodel.addRow(tbData);
             }
        

            
        } catch (SQLException ex) {
            Logger.getLogger(AnimalTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ShowDatabtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
         
        try {
            String url="jdbc:sqlserver://localhost:1433;databaseName=zoo";
        String username="sa";
        String password="123456";
            Connection con = DriverManager.getConnection(url,username,password);
            String query1="UPDATE ANIMALS SET ANIMAL_NAME=?,SPECIES=?,GENDER=?,COUNTRY_OF_BIRTH=?,WEIGHT=? WHERE  ANIMAL_ID=?";
           PreparedStatement st=con.prepareStatement(query1);
           st.setString(1,jTextField2.getText());
             st.setString(2,jTextField3.getText());
               st.setString(3,jTextField4.getText());
                 st.setString(4,jTextField5.getText());
                   st.setString(5,jTextField6.getText());
                    // st.setString(6,jTextField7.getText());
                       st.setInt(6,Integer.parseInt(jTextField1.getText()));
           st.executeUpdate();
           
                                         //upDateDB();
           
           DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
         if(jTable1.getSelectedRowCount()==1)
         {
              String animal_id=jTextField1.getText();
                 String animal_name=jTextField2.getText();
                  String species=jTextField3.getText();
                   String gender=jTextField4.getText();
                    String country_of_birth=jTextField5.getText();
                    String weight=jTextField6.getText();
                   // String cell_no=jTextField7.getText();
                    
                    tblmodel.setValueAt(animal_id, jTable1.getSelectedRow(), 0);
                    tblmodel.setValueAt(animal_name, jTable1.getSelectedRow(), 1);
                    tblmodel.setValueAt(species, jTable1.getSelectedRow(), 2);
                    tblmodel.setValueAt(gender, jTable1.getSelectedRow(), 3);
                    tblmodel.setValueAt(country_of_birth, jTable1.getSelectedRow(), 4);
                    tblmodel.setValueAt(weight, jTable1.getSelectedRow(), 5);
                   // tblmodel.setValueAt(cell_no, jTable1.getSelectedRow(), 6);
                    //upDateDB();
                    JOptionPane.showMessageDialog(this,"Updated Successfully");
         }else{
             if(jTable1.getSelectedRowCount()==0)
             {
                  JOptionPane.showMessageDialog(this,"Updated Successfully");
             }
             else{
                 JOptionPane.showMessageDialog(this,"Please Select Single Row");
             }
         }
           
        } catch (SQLException ex) {
            Logger.getLogger(UpdateInfo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String url="jdbc:sqlserver://localhost:1433;databaseName=zoo";
            String username="sa";
            String password="123456";
            Connection con = DriverManager.getConnection(url,username,password);
            String sql="DELETE  FROM  ANIMALS WHERE ANIMAL_ID=? ";
            PreparedStatement st=con.prepareStatement(sql);
            
            st.setInt(1,Integer.parseInt(jTextField1.getText()));
          
                  st.executeUpdate();
                  
                  con.close();
                  
                      JOptionPane.showMessageDialog(this,"Record is Deleted");  
                       DefaultTableModel tblmodel=(DefaultTableModel)jTable1.getModel();
         if(jTable1.getSelectedRowCount()==1)
         {
             tblmodel.removeRow(jTable1.getSelectedRow());
              
                    JOptionPane.showMessageDialog(this,"Deleted Successfully");
         }else{
             if(jTable1.getSelectedRowCount()==0)
             {
                  JOptionPane.showMessageDialog(this,"Table is empty");
             }
             else{
                 JOptionPane.showMessageDialog(this,"Please Select Single Row");
             }
         }
           
                      
                      
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UpdateEnclosure.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          new AnimalTable().setVisible(true);
        this.setVisible(false);         // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebtn;
    private javax.swing.JButton ShowDatabtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
