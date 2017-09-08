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

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.mz.advisell.services.ProfileService;
import org.mz.advisell.services.DocumentService;
import org.mz.advisell.bean.Document;
import org.mz.advisell.bean.Profile;

/**
 *
 * @author Saket
 */
public class ViewProfileDialog extends javax.swing.JDialog {
    
    private final Profile profile;
    private final Frame frame;
    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     */
    public ViewProfileDialog(java.awt.Frame parent, boolean modal, Profile profile) {
        super(parent, modal);
        initComponents();
        frame=parent;
        this.profile=profile;
        //setContent();
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
        nameLbl = new javax.swing.JLabel();
        aadharLbl = new javax.swing.JLabel();
        aadharNo = new javax.swing.JLabel();
        phoneLbl = new javax.swing.JLabel();
        phoneNo = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        investBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        emailIdLbl = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        mobileLbl = new javax.swing.JLabel();
        mobileNo = new javax.swing.JLabel();
        addressLbl = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        panNoLbl = new javax.swing.JLabel();
        panNo = new javax.swing.JLabel();
        investmentLbl = new javax.swing.JLabel();
        investment = new javax.swing.JLabel();
        documentLbl = new javax.swing.JLabel();
        documentsPanel = new javax.swing.JPanel();
        uploadLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(new ImageIcon(getClass().getResource("../images/icon_new_profile.png")).getImage());
        setResizable(false);
        setSize(contentPanel.getPreferredSize());

        contentPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nameLbl.setText("Saket Kumar Malik");

        aadharLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        aadharLbl.setText("Aadhar:");

        aadharNo.setText("7898 7871 3509");

        phoneLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        phoneLbl.setText("Phone:");

        phoneNo.setText("09813076033");

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        investBtn.setText("Invest");
        investBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        emailIdLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailIdLbl.setText("Email:");

        email.setText("saketrtkmalik@gmail.com");

        mobileLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mobileLbl.setText("Mobile:");

        mobileNo.setText("+91-8510080900");

        addressLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addressLbl.setText("Address:");

        address.setText("<html>46, Revenue Colony,Near Agro Mall, Rohtak Haryana-124001hjvhjbhjbhjvhjv jhbvhjvbhj hjkh jkb jkhkj h ljkljkl imkij  klkl  j");
        address.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        panNoLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        panNoLbl.setText("PAN:");

        panNo.setText("DJTMR2346J");

        investmentLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        investmentLbl.setText("Investments:");

        investment.setText("<html>Cheque 42352 HDFC LC 23/07/1997<br>Cheque 42352 HDFC LC 23/07/1997<br>Cheque 42352 HDFC LC 23/07/1997<br>Cheque 42352 HDFC LC 23/07/1997 ");
        investment.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        documentLbl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        documentLbl.setText("Documents:");

        documentsPanel.setLayout(new javax.swing.BoxLayout(documentsPanel, javax.swing.BoxLayout.LINE_AXIS));

        uploadLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/mz/advisell/gui/plus_upload.png"))); // NOI18N
        uploadLbl.setBorder(javax.swing.BorderFactory.createDashedBorder(Color.GRAY));
        documentsPanel.add(uploadLbl);

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(investment)
                    .addComponent(documentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLbl)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(panNoLbl)
                                .addGap(26, 26, 26)
                                .addComponent(panNo))
                            .addComponent(investmentLbl)
                            .addComponent(documentLbl))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(aadharLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aadharNo))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(emailIdLbl)
                                .addGap(18, 18, 18)
                                .addComponent(email))
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(mobileLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mobileNo))
                            .addComponent(nameLbl)
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addComponent(phoneLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phoneNo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(investBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aadharLbl)
                            .addComponent(aadharNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailIdLbl)
                            .addComponent(email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobileLbl)
                            .addComponent(mobileNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLbl)
                            .addComponent(phoneNo)))
                    .addGroup(contentPanelLayout.createSequentialGroup()
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(investBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panNoLbl)
                    .addComponent(panNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addressLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(investmentLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(investment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(documentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 375, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        new FillProfileDialog(frame, true, profile).setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void investBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investBtnActionPerformed
        new RecordInvestmentDialog(frame, true, profile.getAadharCardNumber()).setVisible(true);
    }//GEN-LAST:event_investBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
      int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure want to delete this profile", "Confirmation Dialog", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.OK_OPTION) {
            ProfileBo profileBo = new ProfileService();
            int result = profileBo.deleteProfile(profile.getAadharCardNumber());
            if (result > 0) {
                ClientProfileUploadDocumentBo uploadDocumentBo = new DocumentService();
                uploadDocumentBo.deleteDocuments(profile.getAadharCardNumber());
                //investmentResultLbl.setText("Delete successfully");
            } else {
                //investmentResultLbl.setText("Error");
            }
        }  
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void setContent() {
        nameLbl.setText(profile.getFirstName() + " " + profile.getLastName());
        phoneNo.setText(profile.getContactNumber());
        mobileNo.setText(profile.getPhoneNumber());
        email.setText(profile.getEmailId());
        address.setText(profile.getAddress());
        panNo.setText(profile.getPanNumber());
        aadharNo.setText(profile.getAadharCardNumber());
        if(!(profile.getDocumentList().isEmpty())){
            for (Document document : profile.getDocumentList()) {
                createDocumentThumbnail(document,profile);
            }
        }
    }
    
    private void createDocumentThumbnail(Document document,Profile profile){
        ImageIcon documentThumbnail = getScaledImageIcon(new ImageIcon("documents/"+profile.getAadharCardNumber()+"/"+document.getFileName()), 30,35);
        JLabel thumbnailLbl = new JLabel(documentThumbnail);
        thumbnailLbl.setBorder(BorderFactory.createEtchedBorder());
        documentsPanel.add(thumbnailLbl, 0);
        this.revalidate();
    }
    
    private ImageIcon getScaledImageIcon(ImageIcon icon, int width, int height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bufferedImage.createGraphics();
        g.drawImage(icon.getImage(), 0, 0, width, height, null);
        return new ImageIcon(bufferedImage);
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aadharLbl;
    private javax.swing.JLabel aadharNo;
    private javax.swing.JLabel address;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel documentLbl;
    private javax.swing.JPanel documentsPanel;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailIdLbl;
    private javax.swing.JButton investBtn;
    private javax.swing.JLabel investment;
    private javax.swing.JLabel investmentLbl;
    private javax.swing.JLabel mobileLbl;
    private javax.swing.JLabel mobileNo;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel panNo;
    private javax.swing.JLabel panNoLbl;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JLabel phoneNo;
    private javax.swing.JLabel uploadLbl;
    // End of variables declaration//GEN-END:variables
}
