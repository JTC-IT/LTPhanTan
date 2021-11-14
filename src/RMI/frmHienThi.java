/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Naming;

/**
 *
 * @author trung
 */
public class frmHienThi extends javax.swing.JFrame {

    ITinhToan tt;
    /**
     * Creates new form frmHienThi
     */
    public frmHienThi() {
        initComponents();
        try {
            tt = (ITinhToan)Naming.lookup("rmi://localhost/TinhToan");
        } catch (Exception e) {
            e.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKQ = new javax.swing.JTextField();
        txtA = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        btnCong = new javax.swing.JButton();
        btnChia = new javax.swing.JButton();
        btnTru = new javax.swing.JButton();
        btnNhan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("b = ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("a = ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        txtKQ.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtKQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 120, -1));

        txtA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtA, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Ket qua = ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtB.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtB, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 120, -1));

        btnCong.setText("+");
        btnCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCongActionPerformed(evt);
            }
        });
        getContentPane().add(btnCong, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, -1, -1));

        btnChia.setText("/");
        btnChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnChia, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        btnTru.setText("-");
        btnTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTruActionPerformed(evt);
            }
        });
        getContentPane().add(btnTru, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        btnNhan.setText("x");
        btnNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnNhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCongActionPerformed
        String ta = txtA.getText();
        String tb = txtB.getName();
        if(!ta.isEmpty() && ! tb.isEmpty()){
            try {
                int kq = tt.Tong(Integer.parseInt(ta),Integer.parseInt(tb));
                txtKQ.setText(kq+"");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCongActionPerformed

    private void btnChiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiaActionPerformed
        String ta = txtA.getText();
        String tb = txtB.getName();
        if(!ta.isEmpty() && ! tb.isEmpty()){
            try {
                float kq = (float) tt.Chia(Integer.parseInt(ta),Integer.parseInt(tb));
                txtKQ.setText(kq+"");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnChiaActionPerformed

    private void btnTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTruActionPerformed
        String ta = txtA.getText();
        String tb = txtB.getName();
        if(!ta.isEmpty() && ! tb.isEmpty()){
            try {
                int kq = tt.Hieu(Integer.parseInt(ta),Integer.parseInt(tb));
                txtKQ.setText(kq+"");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnTruActionPerformed

    private void btnNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanActionPerformed
        String ta = txtA.getText();
        String tb = txtB.getName();
        if(!ta.isEmpty() && ! tb.isEmpty()){
            try {
                int kq =  tt.Nhan(Integer.parseInt(ta),Integer.parseInt(tb));
                txtKQ.setText(kq+"");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnNhanActionPerformed

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
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHienThi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHienThi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChia;
    private javax.swing.JButton btnCong;
    private javax.swing.JButton btnNhan;
    private javax.swing.JButton btnTru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtKQ;
    // End of variables declaration//GEN-END:variables
}
