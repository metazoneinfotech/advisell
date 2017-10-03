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
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.mz.advisell.services.ProfileService;
import org.mz.advisell.bean.Document;
import org.mz.advisell.bean.Profile;
import org.mz.advisell.constant.Constant;

/**
 *
 * @author Saket
 */
public class FillProfileDialog extends javax.swing.JDialog {

    private final Profile profile;

    /**
     * Creates new form NewProfileDialog
     *
     * @param parent
     * @param modal
     * @param profile
     */
    public FillProfileDialog(java.awt.Frame parent, boolean modal, Profile profile) {
        super(parent, modal);
        initComponents();
        if (profile != null) {
            submitProfileBtn.setText("Save Changes");
            submitProfileBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    editProfileBtnActionPerformed(evt);
                }
            });
            setProfileData(profile);
        } else {
            profile = new Profile();
            submitProfileBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent evt) {
                    createProfileBtnActionPerformed(evt);
                }
            });
        }
        this.profile = profile;
    }

    private void setProfileData(Profile profile) {
        firstNameTextField.setText(profile.getFirstName());
        lastNameTextField.setText(profile.getLastName());
        mobileTextField.setText(profile.getMobileNumber());
        phoneTextField.setText(profile.getPhoneNumber());
        emailIdTextField.setText(profile.getEmailId());
        addressTextArea.setText(profile.getAddress());
        aadharTextField.setText(profile.getAadharCardNumber());
        panNoTextField.setText(profile.getPanNumber());
        for (Document document : profile.getDocumentList()) {
            createDocumentThumbnail(document);
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

        documentChooser = new javax.swing.JFileChooser();
        contentPanel = new javax.swing.JPanel();
        msgLbl = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        firstNameLbl = new javax.swing.JLabel();
        lastNameLbl = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        mobilePanel = new javax.swing.JPanel();
        mobileLbl = new javax.swing.JLabel();
        mobileTextField = new javax.swing.JTextField();
        phonePanel = new javax.swing.JPanel();
        phoneLbl = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        emailPanel = new javax.swing.JPanel();
        emailIdLbl = new javax.swing.JLabel();
        emailIdTextField = new javax.swing.JTextField();
        addressPanel = new javax.swing.JPanel();
        addressLbl = new javax.swing.JLabel();
        addressScrollPane = new javax.swing.JScrollPane();
        addressTextArea = new javax.swing.JTextArea();
        aadharPanel = new javax.swing.JPanel();
        aadharLbl = new javax.swing.JLabel();
        aadharTextField = new javax.swing.JTextField();
        panPanel = new javax.swing.JPanel();
        panNoLbl = new javax.swing.JLabel();
        panNoTextField = new javax.swing.JTextField();
        documentsPanel = new javax.swing.JPanel();
        uploadLbl = new javax.swing.JLabel();
        submitProfileBtn = new javax.swing.JButton();

        documentChooser.setAcceptAllFileFilterUsed(false);
        documentChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "tif"));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Profile");
        setIconImage(new ImageIcon(getClass().getResource("/org/mz/advisell/images/icon_new_profile.png")).getImage());
        setResizable(false);

        contentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Profile", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(153, 153, 153))); // NOI18N
        contentPanel.setPreferredSize(new java.awt.Dimension(387, 205));

        msgLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        msgLbl.setForeground(new java.awt.Color(255, 0, 0));

        firstNameLbl.setText("First Name");

        lastNameLbl.setText("Last Name");

        firstNameTextField.setName("firstName"); // NOI18N

        lastNameTextField.setName("lastName"); // NOI18N

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(firstNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(firstNameTextField))
                .addGap(10, 10, 10)
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lastNameLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(lastNameTextField))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        mobilePanel.setLayout(new java.awt.GridLayout(2, 1));

        mobileLbl.setText("Mobile");
        mobilePanel.add(mobileLbl);

        mobileTextField.setName("mobileNumber"); // NOI18N
        mobilePanel.add(mobileTextField);

        phonePanel.setLayout(new java.awt.GridLayout(2, 1));

        phoneLbl.setText("Phone");
        phonePanel.add(phoneLbl);
        phonePanel.add(phoneTextField);

        emailPanel.setLayout(new java.awt.GridLayout(2, 1));

        emailIdLbl.setText("Email");
        emailPanel.add(emailIdLbl);
        emailPanel.add(emailIdTextField);

        addressLbl.setText("Address");

        addressTextArea.setColumns(20);
        addressTextArea.setRows(5);
        addressScrollPane.setViewportView(addressTextArea);

        javax.swing.GroupLayout addressPanelLayout = new javax.swing.GroupLayout(addressPanel);
        addressPanel.setLayout(addressPanelLayout);
        addressPanelLayout.setHorizontalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addressLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(addressScrollPane)
        );
        addressPanelLayout.setVerticalGroup(
            addressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addressPanelLayout.createSequentialGroup()
                .addComponent(addressLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addressScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        aadharPanel.setLayout(new java.awt.GridLayout(2, 1));

        aadharLbl.setText("Aadhar Card No");
        aadharPanel.add(aadharLbl);
        aadharPanel.add(aadharTextField);

        panPanel.setLayout(new java.awt.GridLayout(2, 1));

        panNoLbl.setText("Pan No");
        panPanel.add(panNoLbl);
        panPanel.add(panNoTextField);

        documentsPanel.setLayout(new javax.swing.BoxLayout(documentsPanel, javax.swing.BoxLayout.LINE_AXIS));

        uploadLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/mz/advisell/images/plus_upload.png"))); // NOI18N
        uploadLbl.setBorder(javax.swing.BorderFactory.createDashedBorder(Color.GRAY));
        uploadLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadLblMouseClicked(evt);
            }
        });
        documentsPanel.add(uploadLbl);

        submitProfileBtn.setText("Create Profile");

        javax.swing.GroupLayout contentPanelLayout = new javax.swing.GroupLayout(contentPanel);
        contentPanel.setLayout(contentPanelLayout);
        contentPanelLayout.setHorizontalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(documentsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(aadharPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addressPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(phonePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobilePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentPanelLayout.setVerticalGroup(
            contentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(msgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(namePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mobilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(phonePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(emailPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(addressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(aadharPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(documentsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitProfileBtn)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(contentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void createProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int result = validateProfile();
        if (result < 1) {
            return;
        }

        profile.setFirstName(firstNameTextField.getText());
        profile.setLastName(lastNameTextField.getText());
        profile.setMobileNumber(mobileTextField.getText());
        profile.setPhoneNumber(phoneTextField.getText());
        profile.setEmailId(emailIdTextField.getText());
        profile.setAddress(addressTextArea.getText());
        profile.setAadharCardNumber(aadharTextField.getText());
        profile.setPanNumber(panNoTextField.getText());
        /*Documents have been set already by upload button*/

        ProfileService profileService = new ProfileService();
        result = profileService.addProfile(profile);
        if (result > 0) {
            dispose();
            new InvestOptionDialog((JFrame) this.getParent(), true, aadharTextField.getText())
                    .setVisible(true);
        } else {
            msgLbl.setText("Error! Please check the data.");
        }
    }

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int result = validateProfile();
        if (result < 1) {
            return;
        }

        profile.setFirstName(firstNameTextField.getText());
        profile.setLastName(lastNameTextField.getText());
        profile.setMobileNumber(mobileTextField.getText());
        profile.setPhoneNumber(phoneTextField.getText());
        profile.setEmailId(emailIdTextField.getText());
        profile.setAddress(addressTextArea.getText());
        profile.setAadharCardNumber(aadharTextField.getText());
        profile.setPanNumber(panNoTextField.getText());
        /*Documents have been set already by upload/delete button*/

        ProfileService profileService = new ProfileService();
        result = profileService.updateProfile(profile);
        if (result > 0) {
            dispose();
            new InvestOptionDialog((JFrame) this.getParent(), true, aadharTextField.getText())
                    .setVisible(true);
        } else {
            msgLbl.setText("Error! Please check the data.");
        }
    }

    public int validateProfile() {
        int result = 1;
        
        msgLbl.setText("");
        
        if (!panNoTextField.getText().isEmpty() && !panNoTextField.getText().trim().matches("^([a-zA-Z]{5})([0-9]{4})([a-zA-Z]{1})$")) {
            msgLbl.setText("Invalid Pan Number");
        }

        if (aadharTextField.getText().isEmpty()) {
            msgLbl.setText("AaharCardNumber cannot be empty");
        } else if (!aadharTextField.getText().trim().matches("^[2-9]{1}[0-9]{11}$")) {
            msgLbl.setText("Invalid Aadhar Number...");
        }

        if (addressTextArea.getText().isEmpty()) {
            msgLbl.setText("Address cannot be empty");
        }

        if (emailIdTextField.getText().isEmpty()) {
            msgLbl.setText("Email can't be empty");
        } else if (!emailIdTextField.getText().trim().matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$")) {
            msgLbl.setText("Invalid Email");
        }

        if (!phoneTextField.getText().isEmpty() && !phoneTextField.getText().trim().matches("^[0-9]{10}$")) {
            msgLbl.setText("Invalid Phone Number");
        }

        if (mobileTextField.getText().isEmpty()) {
            msgLbl.setText("Please fill your mobile number");
        } else if (!mobileTextField.getText().trim().matches("^[0-9]{10}$")) {
            msgLbl.setText("Invalid Mobile Number");
        }

        if (lastNameTextField.getText().isEmpty()) {
            msgLbl.setText("Last Name cannot be blank");
        } else if (!lastNameTextField.getText().trim().matches("[A-Za-z]*")) {
            msgLbl.setText("Last Name must contains characters only");
        } else if (lastNameTextField.getText().trim().length() < 2) {
            msgLbl.setText("Last Name can't be less than 2 characters");
        }

        if (firstNameTextField.getText().isEmpty()) {
            msgLbl.setText("First Name cannot be blank");
        } else if (!firstNameTextField.getText().trim().matches("[A-Za-z]*")) {
            msgLbl.setText("First Name must contains characters only");
        } else if (firstNameTextField.getText().trim().length() < 2) {
            msgLbl.setText("First Name can't be less than 2 characters");
        }

        if (!msgLbl.getText().isEmpty()) {
            result = 0;
        }
        return result;
    }

    private void uploadLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadLblMouseClicked
        onUploadLblClicked();
    }//GEN-LAST:event_uploadLblMouseClicked

    private void thumbnailLblMouseClicked(java.awt.event.MouseEvent evt) {
        profile.getDocumentList().remove((Document) ((JLabel) evt.getComponent()).getClientProperty(Constant.DOCUMENT_KEY));
        documentsPanel.remove(evt.getComponent());
        revalidate();
    }

    private void onUploadLblClicked() {
        documentChooser.showOpenDialog(null);
        File file = documentChooser.getSelectedFile();

        /*Save Document to list*/
        if (file != null) {
            Document document = new Document();
            document.setFile(file);
            document.setFileName(file.getName());
            profile.getDocumentList().add(document);

            createDocumentThumbnail(document);
        }
    }

    private void createDocumentThumbnail(Document document) {
        ImageIcon documentThumbnail = getScaledImageIcon(new ImageIcon(document.getFile().getAbsolutePath()), 30, 35);
        JLabel thumbnailLbl = new JLabel(documentThumbnail);
        thumbnailLbl.setBorder(BorderFactory.createEtchedBorder());
        thumbnailLbl.setToolTipText("Click to Remove Document");
        thumbnailLbl.putClientProperty(Constant.DOCUMENT_KEY, document);//Required for Delete later
        documentsPanel.add(thumbnailLbl, 0);
        this.revalidate();

        thumbnailLbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thumbnailLblMouseClicked(evt);
            }
        });
    }

    private ImageIcon getScaledImageIcon(ImageIcon icon, int width, int height) {
        BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics g = bufferedImage.createGraphics();
        g.drawImage(icon.getImage(), 0, 0, width, height, null);
        return new ImageIcon(bufferedImage);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aadharLbl;
    private javax.swing.JPanel aadharPanel;
    private javax.swing.JTextField aadharTextField;
    private javax.swing.JLabel addressLbl;
    private javax.swing.JPanel addressPanel;
    private javax.swing.JScrollPane addressScrollPane;
    private javax.swing.JTextArea addressTextArea;
    private javax.swing.JPanel contentPanel;
    private javax.swing.JFileChooser documentChooser;
    private javax.swing.JPanel documentsPanel;
    private javax.swing.JLabel emailIdLbl;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JPanel emailPanel;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel mobileLbl;
    private javax.swing.JPanel mobilePanel;
    private javax.swing.JTextField mobileTextField;
    private javax.swing.JLabel msgLbl;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel panNoLbl;
    private javax.swing.JTextField panNoTextField;
    private javax.swing.JPanel panPanel;
    private javax.swing.JLabel phoneLbl;
    private javax.swing.JPanel phonePanel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton submitProfileBtn;
    private javax.swing.JLabel uploadLbl;
    // End of variables declaration//GEN-END:variables
}
