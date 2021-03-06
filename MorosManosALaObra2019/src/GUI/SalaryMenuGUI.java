/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Steven
 */
public class SalaryMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form SalaryMenuGUI
     */
    public SalaryMenuGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlPrincipal = new javax.swing.JPanel();
        jpnlSecond = new javax.swing.JPanel();
        jbtnJanitor = new javax.swing.JButton();
        jbtnAdministrator = new javax.swing.JButton();
        jbtnDriver = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jlbTittle = new javax.swing.JLabel();
        jlbIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jpnlSecond.setBackground(new java.awt.Color(0, 51, 51));

        jbtnJanitor.setBackground(new java.awt.Color(102, 102, 0));
        jbtnJanitor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnJanitor.setForeground(new java.awt.Color(255, 255, 255));
        jbtnJanitor.setText("Janitor");

        jbtnAdministrator.setBackground(new java.awt.Color(102, 102, 0));
        jbtnAdministrator.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnAdministrator.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAdministrator.setText("Administrator");

        jbtnDriver.setBackground(new java.awt.Color(102, 102, 0));
        jbtnDriver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnDriver.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDriver.setText("Driver");

        jbtnExit.setBackground(new java.awt.Color(153, 0, 0));
        jbtnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit.setText("Exit");

        javax.swing.GroupLayout jpnlSecondLayout = new javax.swing.GroupLayout(jpnlSecond);
        jpnlSecond.setLayout(jpnlSecondLayout);
        jpnlSecondLayout.setHorizontalGroup(
            jpnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlSecondLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jbtnJanitor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jbtnAdministrator)
                .addGap(41, 41, 41)
                .addGroup(jpnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnDriver)
                    .addComponent(jbtnExit))
                .addGap(26, 26, 26))
        );
        jpnlSecondLayout.setVerticalGroup(
            jpnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlSecondLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jpnlSecondLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnJanitor)
                    .addComponent(jbtnAdministrator)
                    .addComponent(jbtnDriver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jbtnExit)
                .addContainerGap())
        );

        jlbTittle.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbTittle.setForeground(new java.awt.Color(0, 0, 0));
        jlbTittle.setText("Choose one");

        jlbIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-money-bag-filled-50.png"))); // NOI18N

        javax.swing.GroupLayout jpnlPrincipalLayout = new javax.swing.GroupLayout(jpnlPrincipal);
        jpnlPrincipal.setLayout(jpnlPrincipalLayout);
        jpnlPrincipalLayout.setHorizontalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlSecond, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(jlbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jlbTittle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlPrincipalLayout.setVerticalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlbTittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jpnlSecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SalaryMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalaryMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalaryMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalaryMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalaryMenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnAdministrator;
    private javax.swing.JButton jbtnDriver;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnJanitor;
    private javax.swing.JLabel jlbIcon;
    private javax.swing.JLabel jlbTittle;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPanel jpnlSecond;
    // End of variables declaration//GEN-END:variables
}
