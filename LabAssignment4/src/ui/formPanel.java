/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.Label;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import model.Patient;

/**
 *
 * @author Wajid
 */
public class formPanel extends javax.swing.JPanel {

    /**
     * Creates new form formPanel
     */
    private JPanel bottomPanel;
    public formPanel(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        titleLabel = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        fnameTextField = new javax.swing.JTextField();
        lnameLabel = new javax.swing.JLabel();
        lnameTextField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        messageScrollPanel = new javax.swing.JScrollPane();
        messageTextBox = new javax.swing.JTextArea();
        photoLabel = new javax.swing.JLabel();
        photoTextField = new javax.swing.JTextField();
        photoUploadButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        genderLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        notSpecifiedGenderRadio = new javax.swing.JRadioButton();
        typeComboBox = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 255, 102));

        titleLabel.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("PATIENT REGISTRATION FORM");

        fnameLabel.setText("First Name:");

        fnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameTextFieldKeyPressed(evt);
            }
        });

        lnameLabel.setText("Last Name:");

        lnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameTextFieldActionPerformed(evt);
            }
        });
        lnameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnameTextFieldKeyPressed(evt);
            }
        });

        ageLabel.setText("Age:");

        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyPressed(evt);
            }
        });

        emailLabel.setText("Email:");

        messageLabel.setText("Message:");

        messageTextBox.setColumns(20);
        messageTextBox.setRows(5);
        messageScrollPanel.setViewportView(messageTextBox);

        photoLabel.setText("Photo:");

        photoUploadButton.setText("Upload Photo");
        photoUploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoUploadButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(153, 204, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        genderLabel.setText("Gender:");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.setActionCommand("Male User");

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");
        femaleRadioButton.setActionCommand("Female User");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(notSpecifiedGenderRadio);
        notSpecifiedGenderRadio.setText("Prefer not to say");
        notSpecifiedGenderRadio.setActionCommand("Not Specified");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New", "Existing" }));
        typeComboBox.setSelectedIndex(-1);
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });

        typeLabel.setText("Type:");

        dateLabel.setText("Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(maleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(femaleRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(notSpecifiedGenderRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(photoUploadButton))
                                            .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(messageScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lnameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maleRadioButton))
                    .addComponent(genderLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notSpecifiedGenderRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateLabel)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(photoUploadButton)
                    .addComponent(photoLabel))
                .addGap(12, 12, 12)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fnameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            fnameTextField.setEditable(true);
        } else{
            fnameTextField.setEditable(false);
        }
    }//GEN-LAST:event_fnameTextFieldKeyPressed

    private void lnameTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c)){
            lnameTextField.setEditable(true);
        } else{
            lnameTextField.setEditable(false);
        }
    }//GEN-LAST:event_lnameTextFieldKeyPressed

    private void ageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || Character.isISOControl(c) ){
            ageTextField.setEditable(true);
        } else{
            ageTextField.setEditable(false);
        }
    }//GEN-LAST:event_ageTextFieldKeyPressed

    private void photoUploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoUploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        photoTextField.setText(filename);
        /* JFileChooser file = new JFileChooser();
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                Image edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
                if (edited_image != null) {
                    // ImaceIcon icon = new ImageIcon(edited_image);
                } else {
                    throw new Exception();
                }
                } catch (Exception ex) {
                }
        }
         */

    }//GEN-LAST:event_photoUploadButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // System.out.println("Hello");
        Patient newPatient = new Patient();
        newPatient.setFname(fnameTextField.getText());
        newPatient.setLname(lnameTextField.getText());
        newPatient.setAge(ageTextField.getText());
        newPatient.setEmail(emailTextField.getText());
        newPatient.setMessage(messageTextBox.getText());
        newPatient.setUploadImage(photoTextField.getText());
        newPatient.setGender(genderButtonGroup.getSelection().getActionCommand());
        newPatient.setType(typeComboBox.getSelectedItem().toString());
        

        viewPanel newViewPanel = new viewPanel(newPatient);
        bottomPanel.add(newViewPanel);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        layout.next(bottomPanel);
        // System.out.println(fname+ " " +lname+ " " +age+ " " +email);
        // System.out.println(message);
        /*ImageIcon icon = new ImageIcon(uploadImage);
        if(!(Pattern.matches("([^\\s]+$)", fnameTextField.getText()))){
            JOptionPane.showMessageDialog(null, "Please enter a valid first name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!(Pattern.matches("([^\\s]+$)", lnameTextField.getText()))){
            JOptionPane.showMessageDialog(null, "Please enter a valid last name", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!(Pattern.matches("([^\\s]+$)", ageTextField.getText()))){
            JOptionPane.showMessageDialog(null, "Please enter a valid number", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", emailTextField.getText()))) {
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else if(!(Pattern.matches("([^\\s]+(\\.(?i)(jpe?g|png|gif|bmp))$)", photoTextField.getText()))){
            JOptionPane.showMessageDialog(null, "Please select a valid photo", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this, "First Name: " +fname+ "\nLast Name: " +lname+ "\nAge: " +age+ "\nEmail: " +email+ "\nMessage: \n" +message,
                "User Data", JOptionPane.INFORMATION_MESSAGE, icon);
        }

        */
        //JOptionPane.showMessageDialog(this, fname+ " " +lname+ " " +age+ " " +email+ " " +message, JOptionPane.INFORMATION_MESSAGE, icon);
        System.out.println("Hello World");
    }//GEN-LAST:event_submitButtonActionPerformed

    private void lnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameTextFieldActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel fnameLabel;
    private javax.swing.JTextField fnameTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel lnameLabel;
    private javax.swing.JTextField lnameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JScrollPane messageScrollPanel;
    private javax.swing.JTextArea messageTextBox;
    private javax.swing.JRadioButton notSpecifiedGenderRadio;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JTextField photoTextField;
    private javax.swing.JButton photoUploadButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables
}
