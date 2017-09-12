/*
 * Copyright (C) 2017 Metazone Infotech Pvt Ltd
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.mz.advisell.gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import org.mz.advisell.services.SchemeService;
import org.mz.advisell.services.extra.Logging;

/**
 *
 * @author metazone
 */
public class AdvisellGUI extends javax.swing.JFrame {

    /**
     * Creates new AdvisellGUI
     */
    public AdvisellGUI() {
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

        contentPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        newProfileMenuItem = new javax.swing.JMenuItem();
        searchMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        adminMenu = new javax.swing.JMenu();
        settingsMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Advisell");
        setIconImage(new ImageIcon(getClass().getResource("/org/mz/advisell/images/logo_icon.png")).getImage());
        setResizable(false);

        contentPanel.setLayout(new java.awt.BorderLayout());

        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/mz/advisell/images/logo_home.png"))); // NOI18N
        logoLabel.setToolTipText("");
        contentPanel.add(logoLabel, java.awt.BorderLayout.CENTER);

        getContentPane().add(contentPanel, java.awt.BorderLayout.CENTER);

        fileMenu.setText("File");

        newProfileMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newProfileMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/mz/advisell/images/icon_new_profile.png"))); // NOI18N
        newProfileMenuItem.setText("New Profile");
        newProfileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProfileMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(newProfileMenuItem);

        searchMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        searchMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/mz/advisell/images/icon_search.png"))); // NOI18N
        searchMenuItem.setText("Search...");
        searchMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(searchMenuItem);

        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/mz/advisell/images/turn-off.png"))); // NOI18N
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        adminMenu.setText("Admin");

        settingsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        settingsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/mz/advisell/images/icon_settings.png"))); // NOI18N
        settingsMenuItem.setText("Settings");
        settingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsMenuItemActionPerformed(evt);
            }
        });
        adminMenu.add(settingsMenuItem);

        menuBar.add(adminMenu);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newProfileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProfileMenuItemActionPerformed
        new FillProfileDialog(this, true, null).setVisible(true);
    }//GEN-LAST:event_newProfileMenuItemActionPerformed

    private void searchMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMenuItemActionPerformed
        this.add(new SearchPanel(),0);
        this.revalidate();
    }//GEN-LAST:event_searchMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void settingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsMenuItemActionPerformed
        SchemeService schemeService = new SchemeService();
        this.add(new SchemesPanel(schemeService.getSchemes()),0);
        this.revalidate();
    }//GEN-LAST:event_settingsMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Logging().createLogFile(Logger.getLogger(AdvisellGUI.class.getName()));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            Logging.showLogs(Logger.getLogger(AdvisellGUI.class.getName()));
            Logger.getLogger(AdvisellGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdvisellGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminMenu;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem newProfileMenuItem;
    private javax.swing.JMenuItem searchMenuItem;
    private javax.swing.JMenuItem settingsMenuItem;
    // End of variables declaration//GEN-END:variables
}
