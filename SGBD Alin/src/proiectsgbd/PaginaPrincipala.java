/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectsgbd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author Alin
 */
public class PaginaPrincipala extends javax.swing.JFrame {

    /**
     * Creates new form PaginaPrincipala
     */
    public PaginaPrincipala() {
        initComponents();
        GolireCB();
    }
    private Connection connect = null;
    private Statement statement = null;
    ArrayList<String> coloana = new ArrayList<String>();
    String AT1;
    String AT2;
    String AT3;
    String AT4;
    String AT5;
    String AT6;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLogare = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFUser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFHost = new javax.swing.JTextField();
        JButonConectare = new javax.swing.JButton();
        jTFPassword = new javax.swing.JTextField();
        jPSelecteaza = new javax.swing.JPanel();
        jCBSelecteaza = new javax.swing.JComboBox();
        jButonIncarcaBaza = new javax.swing.JButton();
        jAlegeTabel = new javax.swing.JPanel();
        jCBSelecteazaTabel = new javax.swing.JComboBox();
        jButonSelecteaza = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButonCreaza = new javax.swing.JButton();
        jButonIesire = new javax.swing.JButton();
        jButonAdaugaCS = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelLogare.setBorder(javax.swing.BorderFactory.createTitledBorder("Logare"));
        jPanelLogare.setToolTipText("");
        jPanelLogare.setName(""); // NOI18N

        jLabel1.setText("User:");

        jLabel2.setText("Password:");

        jTFUser.setText("root");

        jLabel3.setText("Host (sau Host:Port):");

        jTFHost.setText("localhost");

        JButonConectare.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JButonConectare.setText("Conectare");
        JButonConectare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButonConectareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLogareLayout = new javax.swing.GroupLayout(jPanelLogare);
        jPanelLogare.setLayout(jPanelLogareLayout);
        jPanelLogareLayout.setHorizontalGroup(
            jPanelLogareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogareLayout.createSequentialGroup()
                .addGroup(jPanelLogareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLogareLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFHost)
                        .addGap(10, 10, 10))
                    .addGroup(jPanelLogareLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)))
                .addComponent(JButonConectare, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLogareLayout.setVerticalGroup(
            jPanelLogareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLogareLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLogareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JButonConectare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelLogareLayout.createSequentialGroup()
                        .addGroup(jPanelLogareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelLogareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTFUser)
                                .addComponent(jLabel2)
                                .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanelLogareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTFHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTFUser.getAccessibleContext().setAccessibleName("");

        jPSelecteaza.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecteaza baza de date"));

        jCBSelecteaza.setMaximumRowCount(20);

        jButonIncarcaBaza.setText("Incarca");
        jButonIncarcaBaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonIncarcaBazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPSelecteazaLayout = new javax.swing.GroupLayout(jPSelecteaza);
        jPSelecteaza.setLayout(jPSelecteazaLayout);
        jPSelecteazaLayout.setHorizontalGroup(
            jPSelecteazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSelecteazaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBSelecteaza, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButonIncarcaBaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPSelecteazaLayout.setVerticalGroup(
            jPSelecteazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSelecteazaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPSelecteazaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBSelecteaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButonIncarcaBaza))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jAlegeTabel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecteaza tabel"));

        jButonSelecteaza.setText("Selecteaza");
        jButonSelecteaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonSelecteazaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAlegeTabelLayout = new javax.swing.GroupLayout(jAlegeTabel);
        jAlegeTabel.setLayout(jAlegeTabelLayout);
        jAlegeTabelLayout.setHorizontalGroup(
            jAlegeTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAlegeTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCBSelecteazaTabel, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButonSelecteaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jAlegeTabelLayout.setVerticalGroup(
            jAlegeTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jAlegeTabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jAlegeTabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBSelecteazaTabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButonSelecteaza))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable);

        jButonCreaza.setText("Creaza tabel");
        jButonCreaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonCreazaActionPerformed(evt);
            }
        });

        jButonIesire.setText("Iesire");
        jButonIesire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonIesireActionPerformed(evt);
            }
        });

        jButonAdaugaCS.setText("Adauga Cheie Semantica");
        jButonAdaugaCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButonAdaugaCSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanelLogare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPSelecteaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAlegeTabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButonCreaza, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButonIesire, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButonAdaugaCS)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelLogare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPSelecteaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jAlegeTabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox6))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButonAdaugaCS)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButonCreaza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButonIesire, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButonIncarcaBazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonIncarcaBazaActionPerformed
        // TODO add your handling code here:
        try {
            statement = connect.createStatement();
            statement.executeQuery("USE `" + jCBSelecteaza.getSelectedItem().toString() + "`;");
            jCBSelecteazaTabel.removeAllItems();
            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SHOW TABLES;");
            while (rs.next()) {
                jCBSelecteazaTabel.addItem(rs.getString(1));
            }
            statement.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButonIncarcaBazaActionPerformed

    private void GolireCB() {
        jCheckBox1.setVisible(false);
        jCheckBox2.setVisible(false);
        jCheckBox3.setVisible(false);
        jCheckBox4.setVisible(false);
        jCheckBox5.setVisible(false);
        jCheckBox6.setVisible(false);
    }
    private void JButonConectareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButonConectareActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://" + jTFHost.getText();
        String user = jTFUser.getText();
        String password = jTFPassword.getText();
        try {

            connect = DriverManager.getConnection(url, user, password);
            statement = connect.createStatement();
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e);
        }
        jCBSelecteaza.removeAllItems();
        try {
            DatabaseMetaData dbmd = connect.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, "%", types);

            while (rs.next()) {
                jCBSelecteaza.addItem(rs.getString("TABLE_CAT"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_JButonConectareActionPerformed

    private void jButonSelecteazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonSelecteazaActionPerformed
        // TODO add your handling code here:

        try {
            statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM `" + jCBSelecteazaTabel.getSelectedItem());
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            DefaultTableModel tm = (DefaultTableModel) jTable.getModel();
            tm.setColumnCount(0);
            for (int i = 1; i <= columnCount; i++) {
                tm.addColumn(rsmd.getColumnName(i));
                String nume = rsmd.getColumnName(i);
                coloana.add(nume);
            }
            tm.setRowCount(0);
            while (rs.next()) {
                String[] a = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    a[i] = rs.getString(i + 1);
                }
                tm.addRow(a);
            }
            if (columnCount == 1) {
                jCheckBox1.setText(coloana.get(0));
                jCheckBox1.setVisible(true);
                AT1 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(0) + " );";
                jCheckBox2.setVisible(false);
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);

            } else if (columnCount == 2) {
                jCheckBox1.setText(coloana.get(0));
                jCheckBox2.setText(coloana.get(1));
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                AT1 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(0) + " );";
                AT2 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(1) + " );";
                jCheckBox3.setVisible(false);
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);

            } else if (columnCount == 3) {
                jCheckBox1.setText(coloana.get(0));
                jCheckBox2.setText(coloana.get(1));
                jCheckBox3.setText(coloana.get(2));
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                AT1 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(0) + " );";
                AT2 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(1) + " );";
                AT3 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(2) + " );";
                jCheckBox4.setVisible(false);
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);

            } else if (columnCount == 4) {
                jCheckBox1.setText(coloana.get(0));
                jCheckBox2.setText(coloana.get(1));
                jCheckBox3.setText(coloana.get(2));
                jCheckBox4.setText(coloana.get(3));
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                AT1 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(0) + " );";
                AT2 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(1) + " );";
                AT3 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(2) + " );";
                AT4 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(3) + " );";
                jCheckBox5.setVisible(false);
                jCheckBox6.setVisible(false);

            } else if (columnCount == 5) {
                jCheckBox1.setText(coloana.get(0));
                jCheckBox2.setText(coloana.get(1));
                jCheckBox3.setText(coloana.get(2));
                jCheckBox4.setText(coloana.get(3));
                jCheckBox5.setText(coloana.get(4));
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jCheckBox5.setVisible(true);
                AT1 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(0) + " );";
                AT2 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(1) + " );";
                AT3 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(2) + " );";
                AT4 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(3) + " );";
                AT5 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(4) + " );";
                jCheckBox6.setVisible(false);

            } else if (columnCount == 6) {
                jCheckBox1.setText(coloana.get(0));
                jCheckBox2.setText(coloana.get(1));
                jCheckBox3.setText(coloana.get(2));
                jCheckBox4.setText(coloana.get(3));
                jCheckBox5.setText(coloana.get(4));
                jCheckBox6.setText(coloana.get(5));
                jCheckBox1.setVisible(true);
                jCheckBox2.setVisible(true);
                jCheckBox3.setVisible(true);
                jCheckBox4.setVisible(true);
                jCheckBox5.setVisible(true);
                jCheckBox6.setVisible(true);
                AT1 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(0) + " );";
                AT2 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(1) + " );";
                AT3 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(2) + " );";
                AT4 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(3) + " );";
                AT5 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(4) + " );";
                AT6 = "ALTER TABLE " + jCBSelecteazaTabel.getSelectedItem().toString() + " ADD UNIQUE ( " + coloana.get(5) + " );";

            }
            tm.fireTableDataChanged();
            rs.close();
            Golire();
            coloana.clear();
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButonSelecteazaActionPerformed

    private void jButonCreazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonCreazaActionPerformed
        // TODO add your handling code here:
        CreazaTabel ct = new CreazaTabel();
        ct.setVisible(true);
        ct.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButonCreazaActionPerformed


    private void jButonAdaugaCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonAdaugaCSActionPerformed

        try {

            if (jCheckBox1.isSelected() == true) {
                statement.executeUpdate(AT1);
            }
            if (jCheckBox2.isSelected() == true) {
                statement.executeUpdate(AT2);
            }
            if (jCheckBox3.isSelected() == true) {
                statement.executeUpdate(AT3);
            }
            if (jCheckBox4.isSelected() == true) {
                statement.executeUpdate(AT4);
            }
            if (jCheckBox5.isSelected() == true) {
                statement.executeUpdate(AT5);
            }
            if (jCheckBox6.isSelected() == true) {
                statement.executeUpdate(AT6);
            }
            Golire();
         JOptionPane.showMessageDialog(null,"A fost adaugata cheia semantica pe coloanele selectate");   
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButonAdaugaCSActionPerformed

    private void Golire() {
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);

    }
    private void jButonIesireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButonIesireActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButonIesireActionPerformed


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
            java.util.logging.Logger.getLogger(PaginaPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipala.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipala().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButonConectare;
    private javax.swing.JPanel jAlegeTabel;
    private javax.swing.JButton jButonAdaugaCS;
    private javax.swing.JButton jButonCreaza;
    private javax.swing.JButton jButonIesire;
    private javax.swing.JButton jButonIncarcaBaza;
    private javax.swing.JButton jButonSelecteaza;
    private javax.swing.JComboBox jCBSelecteaza;
    private javax.swing.JComboBox jCBSelecteazaTabel;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPSelecteaza;
    private javax.swing.JPanel jPanelLogare;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTFHost;
    private javax.swing.JTextField jTFPassword;
    private javax.swing.JTextField jTFUser;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
