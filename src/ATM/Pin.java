/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

/**
 *
 * @author HP
 */
public class Pin extends javax.swing.JFrame {

    /**
     * Creates new form Pin
     */
    public Pin() {
        initComponents();
        pinSalah.setVisible(false);
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
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        btbSubmit = new javax.swing.JButton();
        pinSalah = new javax.swing.JLabel();
        password = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(100, 100));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Masukkan Pin anda");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(340, 90, 180, 22);

        jPasswordField1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(350, 150, 150, 30);

        btbSubmit.setText("Batal");
        btbSubmit.setName(""); // NOI18N
        btbSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btbSubmit);
        btbSubmit.setBounds(0, 20, 110, 40);

        pinSalah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pinSalah.setForeground(new java.awt.Color(255, 0, 0));
        pinSalah.setText("PIN ANDA SALAH!!");
        jPanel1.add(pinSalah);
        pinSalah.setBounds(360, 230, 160, 20);

        password.setText("Lanjutkan");
        password.setName(""); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(730, 20, 120, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btbSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbSubmitActionPerformed
        // TODO add your handling code here:     
    }//GEN-LAST:event_btbSubmitActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
           PinModel pinmodel = new PinModel();
        if(jPasswordField1.getText().equals(pinmodel.getPin())){
        new HalamanUtama().setVisible(true);
        this.setVisible(false);}
        else{
            pinSalah.setVisible(true);
        }
    }//GEN-LAST:event_passwordActionPerformed

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
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JButton password;
    private javax.swing.JLabel pinSalah;
    // End of variables declaration//GEN-END:variables
}
