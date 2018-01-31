/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpa1;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Vehrlich22
 */
public class MonoalphabeticEncryptionToolGUI extends javax.swing.JFrame {

    /**
     * Creates new form MonoalphabeticEncryptionToolGUI
     */
    public MonoalphabeticEncryptionToolGUI() {
        initComponents();
        addListeners();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mappingPane = new javax.swing.JScrollPane();
        mappingTable = new javax.swing.JTable();
        plaintextLabel = new javax.swing.JLabel();
        ciphertextLabel = new javax.swing.JLabel();
        plaintextScrollPane = new javax.swing.JScrollPane();
        plaintext = new javax.swing.JTextArea();
        ciphertextScrollPane = new javax.swing.JScrollPane();
        ciphertext = new javax.swing.JTextArea();
        plaintextErrorText = new javax.swing.JLabel();
        ciphertextErrorText = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuBarFile = new javax.swing.JMenu();
        menuBarOpenText = new javax.swing.JMenuItem();
        menuBarSave = new javax.swing.JMenuItem();
        menuBarClose = new javax.swing.JMenuItem();
        MenuBarTools = new javax.swing.JMenu();
        menuBarEncryptWithKey = new javax.swing.JMenuItem();
        menuBarAutoEncrypt = new javax.swing.JMenuItem();
        menuBarAutoDecrypt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(820, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(820, 300));

        mappingPane.setBorder(null);
        mappingPane.setForeground(new java.awt.Color(51, 51, 55));
        mappingPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        mappingPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        mappingTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mappingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"#", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Key", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class, java.lang.Short.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mappingTable.setColumnSelectionAllowed(true);
        mappingTable.getTableHeader().setReorderingAllowed(false);
        mappingPane.setViewportView(mappingTable);
        mappingTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (mappingTable.getColumnModel().getColumnCount() > 0) {
            mappingTable.getColumnModel().getColumn(0).setMinWidth(75);
            mappingTable.getColumnModel().getColumn(0).setPreferredWidth(75);
            mappingTable.getColumnModel().getColumn(0).setMaxWidth(75);
            mappingTable.getColumnModel().getColumn(1).setResizable(false);
            mappingTable.getColumnModel().getColumn(2).setResizable(false);
            mappingTable.getColumnModel().getColumn(3).setResizable(false);
            mappingTable.getColumnModel().getColumn(4).setResizable(false);
            mappingTable.getColumnModel().getColumn(5).setResizable(false);
            mappingTable.getColumnModel().getColumn(6).setResizable(false);
            mappingTable.getColumnModel().getColumn(7).setResizable(false);
            mappingTable.getColumnModel().getColumn(8).setResizable(false);
            mappingTable.getColumnModel().getColumn(9).setResizable(false);
            mappingTable.getColumnModel().getColumn(10).setResizable(false);
            mappingTable.getColumnModel().getColumn(11).setResizable(false);
            mappingTable.getColumnModel().getColumn(12).setResizable(false);
            mappingTable.getColumnModel().getColumn(13).setResizable(false);
            mappingTable.getColumnModel().getColumn(14).setResizable(false);
            mappingTable.getColumnModel().getColumn(15).setResizable(false);
            mappingTable.getColumnModel().getColumn(16).setResizable(false);
            mappingTable.getColumnModel().getColumn(17).setResizable(false);
            mappingTable.getColumnModel().getColumn(18).setResizable(false);
            mappingTable.getColumnModel().getColumn(19).setResizable(false);
            mappingTable.getColumnModel().getColumn(20).setResizable(false);
            mappingTable.getColumnModel().getColumn(21).setResizable(false);
            mappingTable.getColumnModel().getColumn(22).setResizable(false);
            mappingTable.getColumnModel().getColumn(23).setResizable(false);
            mappingTable.getColumnModel().getColumn(24).setResizable(false);
            mappingTable.getColumnModel().getColumn(25).setResizable(false);
            mappingTable.getColumnModel().getColumn(26).setResizable(false);
        }

        plaintextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plaintextLabel.setText("Plaintext");

        ciphertextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ciphertextLabel.setText("Ciphertext");

        plaintext.setColumns(20);
        plaintext.setRows(5);
        plaintext.setToolTipText("Place plaintext for encryption here");
        plaintextScrollPane.setViewportView(plaintext);

        ciphertext.setColumns(20);
        ciphertext.setRows(5);
        ciphertext.setToolTipText("Place ciphertext for decryption here");
        ciphertextScrollPane.setViewportView(ciphertext);

        plaintextErrorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        ciphertextErrorText.setForeground(new java.awt.Color(255, 51, 51));
        ciphertextErrorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        menuBarFile.setText("File");

        menuBarOpenText.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuBarOpenText.setText("Open Text");
        menuBarOpenText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarOpenTextActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBarOpenText);

        menuBarSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        menuBarSave.setText("Save");
        menuBarSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarSaveActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBarSave);

        menuBarClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuBarClose.setText("Close");
        menuBarClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarCloseActionPerformed(evt);
            }
        });
        menuBarFile.add(menuBarClose);

        menuBar.add(menuBarFile);

        MenuBarTools.setText("Tools");
        MenuBarTools.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBarToolsMouseClicked(evt);
            }
        });

        menuBarEncryptWithKey.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        menuBarEncryptWithKey.setText("Encrypt with key");
        menuBarEncryptWithKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarEncryptWithKeyActionPerformed(evt);
            }
        });
        MenuBarTools.add(menuBarEncryptWithKey);

        menuBarAutoEncrypt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        menuBarAutoEncrypt.setText("Auto encrypt");
        menuBarAutoEncrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarAutoEncryptActionPerformed(evt);
            }
        });
        MenuBarTools.add(menuBarAutoEncrypt);

        menuBarAutoDecrypt.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        menuBarAutoDecrypt.setText("Auto Decrypt");
        menuBarAutoDecrypt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarAutoDecryptActionPerformed(evt);
            }
        });
        MenuBarTools.add(menuBarAutoDecrypt);

        menuBar.add(MenuBarTools);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mappingPane, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(plaintextLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ciphertextLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(plaintextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plaintextErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ciphertextErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ciphertextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ciphertextLabel, ciphertextScrollPane, plaintextLabel, plaintextScrollPane});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mappingPane, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plaintextLabel)
                    .addComponent(ciphertextLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(plaintextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciphertextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(plaintextErrorText, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(ciphertextErrorText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ciphertextScrollPane, plaintextScrollPane});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBarOpenTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarOpenTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarOpenTextActionPerformed

    private void menuBarSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarSaveActionPerformed

    private void menuBarCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuBarCloseActionPerformed

    private void MenuBarToolsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBarToolsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBarToolsMouseClicked

    private void menuBarEncryptWithKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarEncryptWithKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarEncryptWithKeyActionPerformed

    private void menuBarAutoEncryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarAutoEncryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarAutoEncryptActionPerformed

    private void menuBarAutoDecryptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarAutoDecryptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarAutoDecryptActionPerformed

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
            java.util.logging.Logger.getLogger(MonoalphabeticEncryptionToolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonoalphabeticEncryptionToolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonoalphabeticEncryptionToolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonoalphabeticEncryptionToolGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonoalphabeticEncryptionToolGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuBarTools;
    private javax.swing.JTextArea ciphertext;
    private javax.swing.JLabel ciphertextErrorText;
    private javax.swing.JLabel ciphertextLabel;
    private javax.swing.JScrollPane ciphertextScrollPane;
    private javax.swing.JScrollPane mappingPane;
    private javax.swing.JTable mappingTable;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuBarAutoDecrypt;
    private javax.swing.JMenuItem menuBarAutoEncrypt;
    private javax.swing.JMenuItem menuBarClose;
    private javax.swing.JMenuItem menuBarEncryptWithKey;
    private javax.swing.JMenu menuBarFile;
    private javax.swing.JMenuItem menuBarOpenText;
    private javax.swing.JMenuItem menuBarSave;
    private javax.swing.JTextArea plaintext;
    private javax.swing.JLabel plaintextErrorText;
    private javax.swing.JLabel plaintextLabel;
    private javax.swing.JScrollPane plaintextScrollPane;
    // End of variables declaration//GEN-END:variables

    private void addListeners() {
        mappingTable.setModel(new MappingTableModel());
        ciphertext.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                update();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                update();
            }
            
            private void update() {
                int counts[] = getLetterCounts(ciphertext.getText());
                for (int i = 0; i < 26; i++) {
                    mappingTable.setValueAt(counts[i], 1, i+1);
                }
            }
        });
    }
    
    private int[] getLetterCounts(String text) {
        int counts[] = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                                 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        
        char cipherText[] = text.toCharArray();
        
        for (int i = 0; i < cipherText.length; i++) {
            int pos = (int)(cipherText[i] - 65);
            if (pos > 26) {
                ciphertextErrorText.setText("Ciphertext should be in all caps");
                return new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                                 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            }
            counts[pos]++;
        }
        ciphertextErrorText.setText("");
        return counts;
    }
}
