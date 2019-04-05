package GUI;

import Data.VehicleData;
import Domain.Vehicle;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class VehicleCrudGUI extends javax.swing.JFrame {

    //varibles
    VehicleData vehicleData;
    boolean isAmerican = true;
    boolean newIsAmerican = true;
//Constructor

    public VehicleCrudGUI() throws IOException {
        File fileVehicle = new File(Utility.Utilities.PATHTOSAVEVEHICLES);
        vehicleData = new VehicleData(fileVehicle);
        initComponents();
        this.setTitle("GaMo's Enterprise");
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        jlbErrorImageToDelete.setVisible(false);
        jlbErrorToDelete.setVisible(false);
        jlbSuccessToUpdate.setVisible(false);
        jlbSuccessToDelete.setVisible(false);
        jlbErrorUpdateMessage.setVisible(false);
        jbtnDelete.setEnabled(false);
        jbtnUpdate.setEnabled(false);
        jtxfNewName.setEnabled(false);
        jtxfNewYear.setEnabled(false);
        jcbxIsAmerican1.setEnabled(false);
        jtxaVehicleDeleteInfo.setEnabled(false);
        jtxaVehicleInfo.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jtbpAdd = new javax.swing.JTabbedPane();
        jinfAddVehicle = new javax.swing.JInternalFrame();
        jpnlAdd = new javax.swing.JPanel();
        jlbName = new javax.swing.JLabel();
        jlbYear = new javax.swing.JLabel();
        jlbMileage = new javax.swing.JLabel();
        jlbIsAmerican = new javax.swing.JLabel();
        jlbVIN = new javax.swing.JLabel();
        jtxfVin = new javax.swing.JTextField();
        jtxfName = new javax.swing.JTextField();
        jtxfYear = new javax.swing.JTextField();
        jcbxIsAmerican = new javax.swing.JComboBox<>();
        jlbTittle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbCarsImage = new javax.swing.JLabel();
        jbtnExit = new javax.swing.JButton();
        jbtnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxaVehicleInfo = new javax.swing.JTextArea();
        jtxfMileage = new javax.swing.JTextField();
        jinfDelete = new javax.swing.JInternalFrame();
        jpnlPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jlblWrite = new javax.swing.JLabel();
        jtxfSearchToDelete = new javax.swing.JTextField();
        jbtnSearchToDelete = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jlbDeleteIcon = new javax.swing.JLabel();
        jlbSuccessToDelete = new javax.swing.JLabel();
        jlbErrorToDelete = new javax.swing.JLabel();
        jlbErrorImageToDelete = new javax.swing.JLabel();
        jbtnExit2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxaVehicleDeleteInfo = new javax.swing.JTextArea();
        jinfUpdate = new javax.swing.JInternalFrame();
        jpnlPrincipalWindow = new javax.swing.JPanel();
        jlblThirdTittle = new javax.swing.JLabel();
        jtxfSearchToUpdate = new javax.swing.JTextField();
        jpnlThirdPanel = new javax.swing.JPanel();
        jbtnExit3 = new javax.swing.JButton();
        jlbErrorUpdateMessage = new javax.swing.JLabel();
        jlbSuccessToUpdate = new javax.swing.JLabel();
        jbtnSearchToUpdate = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jlbUpdateImage = new javax.swing.JLabel();
        jlblNewName = new javax.swing.JLabel();
        jlbNewYear = new javax.swing.JLabel();
        jlblChangaAmerican = new javax.swing.JLabel();
        jtxfNewYear = new javax.swing.JTextField();
        jtxfNewName = new javax.swing.JTextField();
        jcbxIsAmerican1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxaUpdateInfo = new javax.swing.JTextArea();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jinfAddVehicle.setVisible(true);

        jpnlAdd.setBackground(new java.awt.Color(0, 51, 51));

        jlbName.setForeground(new java.awt.Color(255, 255, 255));
        jlbName.setText("Name:");

        jlbYear.setForeground(new java.awt.Color(255, 255, 255));
        jlbYear.setText("Year:");

        jlbMileage.setForeground(new java.awt.Color(255, 255, 255));
        jlbMileage.setText("Mileage:");

        jlbIsAmerican.setForeground(new java.awt.Color(255, 255, 255));
        jlbIsAmerican.setText("Is American?");

        jlbVIN.setForeground(new java.awt.Color(255, 255, 255));
        jlbVIN.setText("Vehicle Identification Number:");

        jtxfVin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfVinMouseClicked(evt);
            }
        });

        jcbxIsAmerican.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        jcbxIsAmerican.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxIsAmericanActionPerformed(evt);
            }
        });

        jlbTittle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlbTittle.setForeground(new java.awt.Color(255, 255, 255));
        jlbTittle.setText(" Insert a new vehicle");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jlbCarsImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-traffic-jam-64.png"))); // NOI18N

        jbtnExit.setBackground(new java.awt.Color(204, 0, 0));
        jbtnExit.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        jbtnAdd.setBackground(new java.awt.Color(255, 255, 255));
        jbtnAdd.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnAdd.setForeground(new java.awt.Color(0, 0, 0));
        jbtnAdd.setText("Add");
        jbtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAddActionPerformed(evt);
            }
        });

        jtxaVehicleInfo.setBackground(new java.awt.Color(0, 0, 0));
        jtxaVehicleInfo.setColumns(20);
        jtxaVehicleInfo.setRows(5);
        jScrollPane1.setViewportView(jtxaVehicleInfo);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jlbCarsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(27, Short.MAX_VALUE)
                        .addComponent(jbtnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbCarsImage, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExit)
                    .addComponent(jbtnAdd)))
        );

        javax.swing.GroupLayout jpnlAddLayout = new javax.swing.GroupLayout(jpnlAdd);
        jpnlAdd.setLayout(jpnlAddLayout);
        jpnlAddLayout.setHorizontalGroup(
            jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlAddLayout.createSequentialGroup()
                .addComponent(jlbTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnlAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbIsAmerican)
                    .addComponent(jlbMileage)
                    .addComponent(jlbYear)
                    .addComponent(jlbName)
                    .addComponent(jlbVIN))
                .addGap(44, 44, 44)
                .addGroup(jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxfName, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jtxfYear, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jcbxIsAmerican, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfVin, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jtxfMileage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnlAddLayout.setVerticalGroup(
            jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlAddLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTittle, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbVIN)
                    .addComponent(jtxfVin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbName)
                    .addComponent(jtxfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlbYear)
                    .addComponent(jtxfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbMileage)
                    .addComponent(jtxfMileage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbIsAmerican)
                    .addComponent(jcbxIsAmerican, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jinfAddVehicleLayout = new javax.swing.GroupLayout(jinfAddVehicle.getContentPane());
        jinfAddVehicle.getContentPane().setLayout(jinfAddVehicleLayout);
        jinfAddVehicleLayout.setHorizontalGroup(
            jinfAddVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jinfAddVehicleLayout.createSequentialGroup()
                .addComponent(jpnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(144, 144, 144))
        );
        jinfAddVehicleLayout.setVerticalGroup(
            jinfAddVehicleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtbpAdd.addTab("Add", jinfAddVehicle);

        jinfDelete.setVisible(true);

        jpnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jlblWrite.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblWrite.setForeground(new java.awt.Color(0, 51, 51));
        jlblWrite.setText("Write Te Vehicle Identification Number");

        jtxfSearchToDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfSearchToDeleteMouseClicked(evt);
            }
        });

        jbtnSearchToDelete.setBackground(new java.awt.Color(0, 102, 204));
        jbtnSearchToDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnSearchToDelete.setText("Search");
        jbtnSearchToDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchToDeleteActionPerformed(evt);
            }
        });

        jbtnDelete.setBackground(new java.awt.Color(102, 0, 0));
        jbtnDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jlbDeleteIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-trash-filled-50.png"))); // NOI18N

        jlbSuccessToDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbSuccessToDelete.setForeground(new java.awt.Color(0, 0, 0));
        jlbSuccessToDelete.setText("¡Success to delete!");

        jlbErrorToDelete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbErrorToDelete.setForeground(new java.awt.Color(0, 0, 0));
        jlbErrorToDelete.setText("This vehicle does not exist");

        jlbErrorImageToDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-close-window-48.png"))); // NOI18N

        jbtnExit2.setBackground(new java.awt.Color(153, 0, 0));
        jbtnExit2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnExit2.setForeground(new java.awt.Color(255, 255, 255));
        jbtnExit2.setText("Exit");
        jbtnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExit2ActionPerformed(evt);
            }
        });

        jtxaVehicleDeleteInfo.setBackground(new java.awt.Color(0, 0, 0));
        jtxaVehicleDeleteInfo.setColumns(20);
        jtxaVehicleDeleteInfo.setRows(5);
        jScrollPane2.setViewportView(jtxaVehicleDeleteInfo);

        javax.swing.GroupLayout jpnlPrincipalLayout = new javax.swing.GroupLayout(jpnlPrincipal);
        jpnlPrincipal.setLayout(jpnlPrincipalLayout);
        jpnlPrincipalLayout.setHorizontalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnSearchToDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                        .addComponent(jtxfSearchToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbErrorToDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPrincipalLayout.createSequentialGroup()
                                .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlbSuccessToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlbDeleteIcon)))
                                .addGap(23, 23, 23)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbErrorImageToDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnExit2)))
                .addGap(15, 15, 15))
            .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jlblWrite))
                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                        .addGap(327, 327, 327)
                        .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnDelete)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlPrincipalLayout.setVerticalGroup(
            jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlblWrite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfSearchToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnSearchToDelete)
                    .addComponent(jbtnDelete))
                .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtnExit2)
                        .addContainerGap())
                    .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbDeleteIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(jpnlPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlPrincipalLayout.createSequentialGroup()
                                .addComponent(jlbSuccessToDelete)
                                .addGap(18, 18, 18)
                                .addComponent(jlbErrorToDelete))
                            .addComponent(jlbErrorImageToDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 34, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jinfDeleteLayout = new javax.swing.GroupLayout(jinfDelete.getContentPane());
        jinfDelete.getContentPane().setLayout(jinfDeleteLayout);
        jinfDeleteLayout.setHorizontalGroup(
            jinfDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jinfDeleteLayout.setVerticalGroup(
            jinfDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtbpAdd.addTab("Delete ", jinfDelete);

        jinfUpdate.setVisible(true);

        jpnlPrincipalWindow.setBackground(new java.awt.Color(255, 255, 255));

        jlblThirdTittle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlblThirdTittle.setForeground(new java.awt.Color(0, 0, 0));
        jlblThirdTittle.setText("Write the Vehicle Identification  ");

        jtxfSearchToUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxfSearchToUpdateMouseClicked(evt);
            }
        });
        jtxfSearchToUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfSearchToUpdateActionPerformed(evt);
            }
        });

        jpnlThirdPanel.setBackground(new java.awt.Color(0, 51, 51));

        jbtnExit3.setBackground(new java.awt.Color(153, 0, 0));
        jbtnExit3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnExit3.setForeground(new java.awt.Color(0, 0, 0));
        jbtnExit3.setText("Exit");
        jbtnExit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExit3ActionPerformed(evt);
            }
        });

        jlbErrorUpdateMessage.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbErrorUpdateMessage.setForeground(new java.awt.Color(255, 255, 255));
        jlbErrorUpdateMessage.setText("This vehicle does not exist");

        jlbSuccessToUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jlbSuccessToUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jlbSuccessToUpdate.setText("Success to Update!");

        javax.swing.GroupLayout jpnlThirdPanelLayout = new javax.swing.GroupLayout(jpnlThirdPanel);
        jpnlThirdPanel.setLayout(jpnlThirdPanelLayout);
        jpnlThirdPanelLayout.setHorizontalGroup(
            jpnlThirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlThirdPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbSuccessToUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jbtnExit3)
                .addContainerGap())
            .addGroup(jpnlThirdPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jlbErrorUpdateMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlThirdPanelLayout.setVerticalGroup(
            jpnlThirdPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlThirdPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnExit3)
                .addGap(25, 25, 25))
            .addGroup(jpnlThirdPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlbErrorUpdateMessage)
                .addGap(18, 18, 18)
                .addComponent(jlbSuccessToUpdate)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jbtnSearchToUpdate.setBackground(new java.awt.Color(0, 102, 204));
        jbtnSearchToUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnSearchToUpdate.setText("Search");
        jbtnSearchToUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSearchToUpdateActionPerformed(evt);
            }
        });

        jbtnUpdate.setBackground(new java.awt.Color(255, 255, 153));
        jbtnUpdate.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbtnUpdate.setForeground(new java.awt.Color(0, 0, 0));
        jbtnUpdate.setText("Update");
        jbtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnUpdateActionPerformed(evt);
            }
        });

        jlbUpdateImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-downloading-updates-64.png"))); // NOI18N

        jlblNewName.setBackground(new java.awt.Color(0, 0, 0));
        jlblNewName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblNewName.setForeground(new java.awt.Color(0, 0, 0));
        jlblNewName.setText("Name");

        jlbNewYear.setBackground(new java.awt.Color(0, 0, 0));
        jlbNewYear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbNewYear.setForeground(new java.awt.Color(0, 0, 0));
        jlbNewYear.setText("Year");

        jlblChangaAmerican.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblChangaAmerican.setForeground(new java.awt.Color(0, 0, 0));
        jlblChangaAmerican.setText("Is american?");

        jcbxIsAmerican1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        jcbxIsAmerican1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxIsAmerican1ActionPerformed(evt);
            }
        });

        jtxaUpdateInfo.setColumns(20);
        jtxaUpdateInfo.setRows(5);
        jScrollPane3.setViewportView(jtxaUpdateInfo);

        javax.swing.GroupLayout jpnlPrincipalWindowLayout = new javax.swing.GroupLayout(jpnlPrincipalWindow);
        jpnlPrincipalWindow.setLayout(jpnlPrincipalWindowLayout);
        jpnlPrincipalWindowLayout.setHorizontalGroup(
            jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlThirdPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jlblThirdTittle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPrincipalWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxfSearchToUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addComponent(jlbUpdateImage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlPrincipalWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxfNewName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jtxfNewYear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblNewName)
                            .addComponent(jbtnSearchToUpdate))
                        .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jlbNewYear))
                            .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnUpdate)
                    .addComponent(jlblChangaAmerican, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jcbxIsAmerican1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jpnlPrincipalWindowLayout.setVerticalGroup(
            jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbUpdateImage, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlblThirdTittle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbtnSearchToUpdate)
                                    .addComponent(jbtnUpdate)))
                            .addGroup(jpnlPrincipalWindowLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtxfSearchToUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNewName)
                    .addComponent(jlbNewYear, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblChangaAmerican))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnlPrincipalWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfNewYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbxIsAmerican1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jpnlThirdPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jinfUpdateLayout = new javax.swing.GroupLayout(jinfUpdate.getContentPane());
        jinfUpdate.getContentPane().setLayout(jinfUpdateLayout);
        jinfUpdateLayout.setHorizontalGroup(
            jinfUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipalWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jinfUpdateLayout.setVerticalGroup(
            jinfUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlPrincipalWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jtbpAdd.addTab("Update", jinfUpdate);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbpAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbpAdd, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxfSearchToUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfSearchToUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfSearchToUpdateActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        PrincipalGUI prin = new PrincipalGUI();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jcbxIsAmerican1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxIsAmerican1ActionPerformed
        if (jcbxIsAmerican1.getSelectedItem().equals("Yes")) {
            newIsAmerican = true;

        }

        if (jcbxIsAmerican1.getSelectedItem().equals("No")) {
            newIsAmerican = false;

        }
    }//GEN-LAST:event_jcbxIsAmerican1ActionPerformed

    private void jcbxIsAmericanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxIsAmericanActionPerformed
        if (jcbxIsAmerican.getSelectedItem().equals("Yes")) {
            isAmerican = true;
        }
        if (jcbxIsAmerican.getSelectedItem().equals("No")) {
            isAmerican = false;
        }
    }//GEN-LAST:event_jcbxIsAmericanActionPerformed

    private void jbtnExit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExit3ActionPerformed
        PrincipalGUI prin = new PrincipalGUI();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnExit3ActionPerformed

    private void jbtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAddActionPerformed
        if (jtxfName.getText().isEmpty() || jtxfYear.getText().isEmpty() || jtxfMileage.getText().isEmpty() || jtxfVin.getText().isEmpty()) {
            jtxaVehicleInfo.setText("Fill all the requirements");
        } else {
            try {
                Vehicle myVehicle = new Vehicle(jtxfName.getText(), Integer.parseInt(jtxfYear.getText()), Integer.parseInt(jtxfMileage.getText()), isAmerican, Integer.parseInt(jtxfVin.getText()));
                try {
                    if (!vehicleData.Search(Integer.parseInt(jtxfVin.getText()))) {
                        if (vehicleData.addEndRecord(myVehicle)) {
                            jtxaVehicleInfo.setText(myVehicle.toString());
                            jtxfName.setText("");
                            jtxfYear.setText("");
                            jtxfVin.setText("");
                            jtxfMileage.setText("");
                        }
                    } else {
                        jtxaVehicleInfo.setText("Error---This vehicle already exists");
                        jtxfName.setText("");
                        jtxfYear.setText("");
                        jtxfVin.setText("");
                        jtxfMileage.setText("");
                    }//else
                }//Segundo Try
                catch (IOException ex2) {
                    Logger.getLogger(VehicleCrudGUI.class.getName()).log(Level.SEVERE, null, ex2);
                }//catch IOException ex2
            }//primer try
            catch (NumberFormatException ex) {
                jtxaVehicleInfo.setText("ERROR- You're writing words where there should only be numbers");

            }//Catch NumberFormatException
        }//primer if(Comprueba si los jtextFields están llenos)
    }//GEN-LAST:event_jbtnAddActionPerformed

    private void jbtnSearchToDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchToDeleteActionPerformed
        try {
            try {
                if (vehicleData.Search(Integer.parseInt(jtxfSearchToDelete.getText()))) {
                    jtxaVehicleDeleteInfo.setText("" + vehicleData.getVehicleID((Integer.parseInt(jtxfSearchToDelete.getText()))));
                    jbtnDelete.setEnabled(true);
                } else {
                    jlbErrorImageToDelete.setVisible(true);
                    jlbErrorToDelete.setVisible(true);
                    jtxfSearchToDelete.setText("");
                }
            } catch (IOException ex) {
                Logger.getLogger(VehicleCrudGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NumberFormatException ex) {
            jtxaVehicleDeleteInfo.setText("ERROR- You're writing words where there should only be numbers");
        }
    }//GEN-LAST:event_jbtnSearchToDeleteActionPerformed

    private void jbtnSearchToUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSearchToUpdateActionPerformed
        try {
            try {
                if (vehicleData.Search(Integer.parseInt(jtxfSearchToUpdate.getText()))) {
                    jtxaUpdateInfo.setText("" + vehicleData.getVehicleID(Integer.parseInt(jtxfSearchToUpdate.getText())));

                    jlbSuccessToDelete.setVisible(false);
                    jbtnUpdate.setEnabled(true);
                    jtxfNewName.setEnabled(true);
                    jtxfNewYear.setEnabled(true);
                    jcbxIsAmerican1.setEnabled(true);
                } else {
                    jtxfSearchToDelete.setText("");
                    jlbErrorUpdateMessage.setVisible(true);
                }
            } catch (IOException ex) {
                Logger.getLogger(VehicleCrudGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NumberFormatException ex) {
            jtxaUpdateInfo.setText("ERROR- You're writing words where there should only be numbers");
        }
    }//GEN-LAST:event_jbtnSearchToUpdateActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        try {
            //le da opción al usuario de elegir, ya que puede caer en el error de borrarlo por equivocación
            int reply = JOptionPane.showConfirmDialog(null, "Are you sure to delete this vehicle?", "Irreversible action", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if (vehicleData.deleteVehicle(Integer.parseInt(jtxfSearchToDelete.getText()))) {
                    jlbSuccessToDelete.setVisible(true);
                    jbtnDelete.setEnabled(false);
                    jtxfSearchToDelete.setText("");
                    jtxaVehicleDeleteInfo.setText("");
                    jtxaVehicleDeleteInfo.setText("");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(VehicleCrudGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jtxfSearchToDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfSearchToDeleteMouseClicked
        //devuelve las variables a su formato original
        jlbSuccessToDelete.setVisible(false);
        jlbErrorToDelete.setVisible(false);
        jlbErrorImageToDelete.setVisible(false);
        jbtnDelete.setEnabled(false);
        jtxaVehicleDeleteInfo.setText("");
    }//GEN-LAST:event_jtxfSearchToDeleteMouseClicked

    private void jbtnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExit2ActionPerformed
        PrincipalGUI prin = new PrincipalGUI();
        prin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtnExit2ActionPerformed

    private void jbtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnUpdateActionPerformed
        try {
            if (jtxfNewName.getText().isEmpty() || jtxfNewYear.getText().isEmpty()) {
                jtxaUpdateInfo.setText("Fill all the requirements");
            }

            try {
                if (vehicleData.updateVehicle(Integer.parseInt(jtxfSearchToUpdate.getText()), jtxfNewName.getText(), Integer.parseInt(jtxfNewYear.getText()), newIsAmerican)) {
                    jlbSuccessToUpdate.setVisible(true);
                    jtxfSearchToUpdate.setText("");
                    jtxfNewName.setText("");
                    jtxfNewYear.setText("");
                    jbtnUpdate.setEnabled(false);
                    jtxfNewName.setEnabled(false);
                    jtxfNewYear.setEnabled(false);
                    jcbxIsAmerican1.setEnabled(false);

                } else {
                    System.err.println("Error");
                    jbtnUpdate.setEnabled(false);
                    jtxfNewName.setEnabled(false);
                    jtxfNewYear.setEnabled(false);
                    jcbxIsAmerican1.setEnabled(false);
                    jtxfSearchToUpdate.setText("");
                    jtxfNewName.setText("");
                    jtxfNewYear.setText("");
                }
            } catch (IOException ex1) {
                Logger.getLogger(VehicleCrudGUI.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } catch (NumberFormatException ex) {
            jtxaUpdateInfo.setText("ERROR- You're writing words where there should only be numbers");
        }
    }//GEN-LAST:event_jbtnUpdateActionPerformed

    private void jtxfSearchToUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfSearchToUpdateMouseClicked
        //Devolvemos las variables a su formato original,para que el usuario utilice la aplicación cuantas veces quiera
        jtxaUpdateInfo.setText("");
        jbtnUpdate.setEnabled(false);
        jtxfNewName.setEnabled(false);
        jtxfNewYear.setEnabled(false);
        jcbxIsAmerican1.setEnabled(false);
        jlbSuccessToUpdate.setVisible(false);
        jlbErrorUpdateMessage.setVisible(false);
        jtxfSearchToUpdate.setText("");

    }//GEN-LAST:event_jtxfSearchToUpdateMouseClicked

    private void jtxfVinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxfVinMouseClicked
        //limpiamos el jTextArea para empezar de nuevo
        jtxaVehicleInfo.setText("");
    }//GEN-LAST:event_jtxfVinMouseClicked

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
            java.util.logging.Logger.getLogger(VehicleCrudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleCrudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleCrudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleCrudGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VehicleCrudGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(VehicleCrudGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton jbtnAdd;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnExit2;
    private javax.swing.JButton jbtnExit3;
    private javax.swing.JButton jbtnSearchToDelete;
    private javax.swing.JButton jbtnSearchToUpdate;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JComboBox<String> jcbxIsAmerican;
    private javax.swing.JComboBox<String> jcbxIsAmerican1;
    private javax.swing.JInternalFrame jinfAddVehicle;
    private javax.swing.JInternalFrame jinfDelete;
    private javax.swing.JInternalFrame jinfUpdate;
    private javax.swing.JLabel jlbCarsImage;
    private javax.swing.JLabel jlbDeleteIcon;
    private javax.swing.JLabel jlbErrorImageToDelete;
    private javax.swing.JLabel jlbErrorToDelete;
    private javax.swing.JLabel jlbErrorUpdateMessage;
    private javax.swing.JLabel jlbIsAmerican;
    private javax.swing.JLabel jlbMileage;
    private javax.swing.JLabel jlbName;
    private javax.swing.JLabel jlbNewYear;
    private javax.swing.JLabel jlbSuccessToDelete;
    private javax.swing.JLabel jlbSuccessToUpdate;
    private javax.swing.JLabel jlbTittle;
    private javax.swing.JLabel jlbUpdateImage;
    private javax.swing.JLabel jlbVIN;
    private javax.swing.JLabel jlbYear;
    private javax.swing.JLabel jlblChangaAmerican;
    private javax.swing.JLabel jlblNewName;
    private javax.swing.JLabel jlblThirdTittle;
    private javax.swing.JLabel jlblWrite;
    private javax.swing.JPanel jpnlAdd;
    private javax.swing.JPanel jpnlPrincipal;
    private javax.swing.JPanel jpnlPrincipalWindow;
    private javax.swing.JPanel jpnlThirdPanel;
    private javax.swing.JTabbedPane jtbpAdd;
    private javax.swing.JTextArea jtxaUpdateInfo;
    private javax.swing.JTextArea jtxaVehicleDeleteInfo;
    private javax.swing.JTextArea jtxaVehicleInfo;
    private javax.swing.JTextField jtxfMileage;
    private javax.swing.JTextField jtxfName;
    private javax.swing.JTextField jtxfNewName;
    private javax.swing.JTextField jtxfNewYear;
    private javax.swing.JTextField jtxfSearchToDelete;
    private javax.swing.JTextField jtxfSearchToUpdate;
    private javax.swing.JTextField jtxfVin;
    private javax.swing.JTextField jtxfYear;
    // End of variables declaration//GEN-END:variables
}
