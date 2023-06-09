/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Personal
 */
public class FormPeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form FormPeminjaman
     */
    public FormPeminjaman() {
        initComponents();
    }
    
    public void tampilkan() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judulBuku = new javax.swing.JTextField();
        tombolCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        daftarPinjaman = new javax.swing.JTable();
        tombolPinjam = new javax.swing.JButton();
        tombolBatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        daftarBuku = new javax.swing.JTable();
        tombolKonfirmasi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        judulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                judulBukuActionPerformed(evt);
            }
        });

        tombolCari.setText("Cari");
        tombolCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolCariMouseClicked(evt);
            }
        });

        daftarPinjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Judul"
            }
        ));
        jScrollPane1.setViewportView(daftarPinjaman);

        tombolPinjam.setText("Pinjam");
        tombolPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolPinjamMouseClicked(evt);
            }
        });

        tombolBatal.setText("Batal");
        tombolBatal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolBatalMouseClicked(evt);
            }
        });

        daftarBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(daftarBuku);

        tombolKonfirmasi.setText("Konfirmasi");
        tombolKonfirmasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tombolKonfirmasiMouseClicked(evt);
            }
        });

        jLabel1.setText("Lama : ");

        lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tombolKonfirmasi))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tombolPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tombolBatal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(tombolCari))
                                    .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(280, 280, 280)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lama, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(judulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tombolCari))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tombolPinjam)
                        .addGap(18, 18, 18)
                        .addComponent(tombolBatal))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tombolKonfirmasi)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tombolCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolCariActionPerformed

    private void tombolKonfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolKonfirmasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolKonfirmasiActionPerformed

    private void tombolBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolBatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tombolBatalActionPerformed

    private void tombolCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolCariMouseClicked
        String JudulBuku = judulBuku.getText();
        Perpustakaan.controllerPeminjaman.cariBuku(JudulBuku);
    }//GEN-LAST:event_tombolCariMouseClicked

    private void tombolPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolPinjamMouseClicked
        DefaultTableModel model = (DefaultTableModel) daftarPinjaman.getModel();
        model.addRow(new Object[]{daftarBuku.getValueAt(daftarBuku.getSelectedRow(), daftarBuku.getSelectedColumn())});
    }//GEN-LAST:event_tombolPinjamMouseClicked

    private void tombolBatalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolBatalMouseClicked
        DefaultTableModel model = (DefaultTableModel) daftarPinjaman.getModel();
        model.removeRow(daftarPinjaman.getSelectedRow());
    }//GEN-LAST:event_tombolBatalMouseClicked

    private void tombolKonfirmasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolKonfirmasiMouseClicked
        DefaultTableModel model = (DefaultTableModel) daftarPinjaman.getModel();
        String LamaPinjam = lama.getText();
        
        for (int i=0 ; i<1 ; i++) {
            if(LamaPinjam.equals("3")){
                if(daftarPinjaman.getRowCount() <= 10){
                    JOptionPane.showMessageDialog(this, "Peminjaman telah dikonfirmasi");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
                } break;
            }
            if(LamaPinjam.equals("2")){
                if(daftarPinjaman.getRowCount() <= 10){
                    JOptionPane.showMessageDialog(this, "Peminjaman telah dikonfirmasi");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
                } break;
            }
            if(LamaPinjam.equals("1")){
                if(daftarPinjaman.getRowCount() <= 10){
                    JOptionPane.showMessageDialog(this, "Peminjaman telah dikonfirmasi");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
                } break;
            }
            else{
                JOptionPane.showMessageDialog(this, "Lama waktu peminjaman maksimal adalah 3 hari");
            }
            i++;
        }
//        if(LamaPinjam!=null){
//            if(LamaPinjam.equals("3")){
//                if(daftarPinjaman.getRowCount() <= 10){
//                    JOptionPane.showMessageDialog(this, "Peminjaman telah dikonfirmasi");
//                }
//                else{
//                    JOptionPane.showMessageDialog(this, "Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
//                }
//            }
//            if(LamaPinjam.equals("2")){
//                if(daftarPinjaman.getRowCount() <= 10){
//                    JOptionPane.showMessageDialog(this, "Peminjaman telah dikonfirmasi");
//                }
//                else{
//                    JOptionPane.showMessageDialog(this, "Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
//                }
//            }
//            if(LamaPinjam.equals("1")){
//                if(daftarPinjaman.getRowCount() <= 10){
//                    JOptionPane.showMessageDialog(this, "Peminjaman telah dikonfirmasi");
//                }
//                else{
//                    JOptionPane.showMessageDialog(this, "Jumlah buku yang dipinjam melebihi batas maksimal 10 buku");
//                }
//            }
//            else{
//                JOptionPane.showMessageDialog(this, "Lama waktu peminjaman maksimal adalah 3 hari");
//            }
//        } 
//        else {
//            JOptionPane.showMessageDialog(this, "Harap isi lama peminjaman");
//        }
        
    }//GEN-LAST:event_tombolKonfirmasiMouseClicked

    private void judulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_judulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_judulBukuActionPerformed

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
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPeminjaman().setVisible(true);
            }
        });
    }
    
    public void display(ArrayList<Buku> bukuList) {
        Object[] kolom = { "Judul" };
        DefaultTableModel model = new DefaultTableModel(kolom, 0);
        
        for(Buku buku : bukuList) {
            Object[] baris = { buku.judul };
            model.addRow(baris);
        }
        
        daftarBuku.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable daftarBuku;
    private javax.swing.JTable daftarPinjaman;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField judulBuku;
    private javax.swing.JTextField lama;
    private javax.swing.JButton tombolBatal;
    private javax.swing.JButton tombolCari;
    private javax.swing.JButton tombolKonfirmasi;
    private javax.swing.JButton tombolPinjam;
    // End of variables declaration//GEN-END:variables
}
