/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NGUYENQUOCTRUNG_4426;

/**
 *
 * @author trung
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jMenu3 = new javax.swing.JMenu();
        anh = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        function = new javax.swing.JMenu();
        tong = new javax.swing.JMenuItem();
        hieu = new javax.swing.JMenuItem();
        tich = new javax.swing.JMenuItem();
        thuong = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        anh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/IMG_Nen.jpg"))); // NOI18N
        getContentPane().add(anh, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 280));

        jMenu1.setText("File");

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem2.setText("Cut");
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Copy");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Paste");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Delete");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        function.setText("Function");

        tong.setText("Tinh Tong");
        tong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongActionPerformed(evt);
            }
        });
        function.add(tong);

        hieu.setText("Tinh Hieu");
        hieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hieuActionPerformed(evt);
            }
        });
        function.add(hieu);

        tich.setText("Tinh Tich");
        tich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tichActionPerformed(evt);
            }
        });
        function.add(tich);

        thuong.setText("Tinh Thuong");
        thuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thuongActionPerformed(evt);
            }
        });
        function.add(thuong);

        jMenuBar1.add(function);

        jMenu5.setText("Help");

        jMenuItem6.setText("Sos ");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tichActionPerformed
        //Tich
        TinhTich frm = new TinhTich();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_tichActionPerformed

    private void tongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongActionPerformed
        //Tong
        TinhTong frm = new TinhTong();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_tongActionPerformed

    private void hieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hieuActionPerformed
        // Hieu
        TinhHieu frm = new TinhHieu();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_hieuActionPerformed

    private void thuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thuongActionPerformed
        //Thuong
        TinhThuong frm = new TinhThuong();
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
    }//GEN-LAST:event_thuongActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel anh;
    private javax.swing.JMenu function;
    private javax.swing.JMenuItem hieu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem thuong;
    private javax.swing.JMenuItem tich;
    private javax.swing.JMenuItem tong;
    // End of variables declaration//GEN-END:variables
}
