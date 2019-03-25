/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Domain.Administrator;
import Domain.Driver;
import Domain.Janitor;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class SalaryGUI extends javax.swing.JFrame {

    
    //variables
    Janitor jan= new Janitor("Steven", "morales", "2344", 4, "ucr",true, 18);
    Driver drive= new Driver("Meilyn", "Garro", 250, "223", 455, "tec", true,"grua" , true);
    Administrator admin= new Administrator((short)2, "Menta","Cartuchera", "1234", 234, "Latina");
    public SalaryGUI() {
        initComponents();
          this.setTitle("GaMo's Enterprise");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
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
        jlbName = new javax.swing.JLabel();
        jtfxName = new javax.swing.JTextField();
        jbtnSearch = new javax.swing.JButton();
        jpnSecond = new javax.swing.JPanel();
        jbtnMenu = new javax.swing.JButton();
        jlblMoneyImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jlbName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbName.setForeground(new java.awt.Color(0, 0, 0));
        jlbName.setText("Write the name to search");

        jbtnSearch.setBackground(new java.awt.Color(102, 255, 102));
        jbtnSearch.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnSearch.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSearch.setText("Search");
        jbtnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchActionPerformed(evt);
            }
        });

        jpnSecond.setBackground(new java.awt.Color(0, 0, 0));

        jbtnMenu.setBackground(new java.awt.Color(204, 0, 0));
        jbtnMenu.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbtnMenu.setText("Exit");
        jbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnSecondLayout = new javax.swing.GroupLayout(jpnSecond);
        jpnSecond.setLayout(jpnSecondLayout);
        jpnSecondLayout.setHorizontalGroup(
            jpnSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSecondLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnMenu)
                .addContainerGap())
        );
        jpnSecondLayout.setVerticalGroup(
            jpnSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSecondLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jbtnMenu)
                .addContainerGap())
        );

        jlblMoneyImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-money-bag-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnSecond, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlbName)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlblMoneyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jbtnSearch))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jtfxName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblMoneyImage, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfxName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
       PrincipalGUI prin= new PrincipalGUI();
       prin.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_jbtnMenuActionPerformed

    private void jbtnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchActionPerformed
        if(jtfxName.getText().equalsIgnoreCase("Steven")){
            JOptionPane.showMessageDialog(null, jan.toString());
            JOptionPane.showMessageDialog(null, jan.estimateSalary());
        }if(jtfxName.getText().equalsIgnoreCase("Meilyn")){
            JOptionPane.showMessageDialog(null, drive.toString());
            JOptionPane.showMessageDialog(null, drive.estimateSalary());
        }if(jtfxName.getText().equalsIgnoreCase("Menta")){
            JOptionPane.showMessageDialog(null, admin.toString());
            JOptionPane.showMessageDialog(null, admin.estimateSalary());
        }
    }//GEN-LAST:event_jbtnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(SalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnSearch;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlblMoneyImage;
    private javax.swing.JPanel jpnSecond;
    private javax.swing.JTextField jtfxName;
    // End of variables declaration//GEN-END:variables
}
