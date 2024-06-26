package view;

import com.formdev.flatlaf.FlatClientProperties;
import modal.FormEditTiketPenerbangan;
import modal.FormTambahTiketPenerbangan;

public class FormTiketPenerbangan extends javax.swing.JPanel {

    public FormTiketPenerbangan() {
	initComponents();
	init();
    }

    private void init() {
	panel_jadwal_penerbangan.putClientProperty(FlatClientProperties.STYLE, "" +
		"background:$Table.background;");
	btn_pencarian_tiket_penerbangan.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
    }

    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_main = new javax.swing.JPanel();
        panel_jadwal_penerbangan = new javax.swing.JPanel();
        breadcrumb_tiket_penerbangan = new javax.swing.JLabel();
        scroll_tiket_penerbangan = new javax.swing.JScrollPane();
        tabel_tiket_penerbangan = new javax.swing.JTable();
        btn_tambah_tiket_penerbangan = new javax.swing.JButton();
        btn_edit_tiket_penerbangan = new javax.swing.JButton();
        btn_hapus_tiket_penerbangan = new javax.swing.JButton();
        btn_pencarian_tiket_penerbangan = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        panel_main.setPreferredSize(new java.awt.Dimension(798, 645));
        panel_main.setLayout(new java.awt.CardLayout());

        panel_jadwal_penerbangan.setPreferredSize(new java.awt.Dimension(798, 645));

        breadcrumb_tiket_penerbangan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        breadcrumb_tiket_penerbangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ticket.png"))); // NOI18N
        breadcrumb_tiket_penerbangan.setText("App > Tiket Penerbangan");

        tabel_tiket_penerbangan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Tiket", "Kode Penerbangan", "Kategori", "Harga", "Jumlah Kursi", "Sisa Kursi", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_tiket_penerbangan.setFocusable(false);
        scroll_tiket_penerbangan.setViewportView(tabel_tiket_penerbangan);
        if (tabel_tiket_penerbangan.getColumnModel().getColumnCount() > 0) {
            tabel_tiket_penerbangan.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btn_tambah_tiket_penerbangan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_tambah_tiket_penerbangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btn_tambah_tiket_penerbangan.setText("Tambah");
        btn_tambah_tiket_penerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah_tiket_penerbanganActionPerformed(evt);
            }
        });

        btn_edit_tiket_penerbangan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_edit_tiket_penerbangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pencil.png"))); // NOI18N
        btn_edit_tiket_penerbangan.setText("Edit");
        btn_edit_tiket_penerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_edit_tiket_penerbanganActionPerformed(evt);
            }
        });

        btn_hapus_tiket_penerbangan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_hapus_tiket_penerbangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash.png"))); // NOI18N
        btn_hapus_tiket_penerbangan.setText("Hapus");
        btn_hapus_tiket_penerbangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapus_tiket_penerbanganActionPerformed(evt);
            }
        });

        btn_pencarian_tiket_penerbangan.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        btn_pencarian_tiket_penerbangan.setForeground(new java.awt.Color(204, 204, 204));
        btn_pencarian_tiket_penerbangan.setText("Pencarian");

        javax.swing.GroupLayout panel_jadwal_penerbanganLayout = new javax.swing.GroupLayout(panel_jadwal_penerbangan);
        panel_jadwal_penerbangan.setLayout(panel_jadwal_penerbanganLayout);
        panel_jadwal_penerbanganLayout.setHorizontalGroup(
            panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                        .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scroll_tiket_penerbangan, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                            .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                                .addComponent(btn_tambah_tiket_penerbangan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_edit_tiket_penerbangan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus_tiket_penerbangan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_pencarian_tiket_penerbangan)))
                        .addGap(15, 15, 15))
                    .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                        .addComponent(breadcrumb_tiket_penerbangan)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panel_jadwal_penerbanganLayout.setVerticalGroup(
            panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(breadcrumb_tiket_penerbangan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_pencarian_tiket_penerbangan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_tambah_tiket_penerbangan)
                        .addComponent(btn_edit_tiket_penerbangan)
                        .addComponent(btn_hapus_tiket_penerbangan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll_tiket_penerbangan, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        panel_main.add(panel_jadwal_penerbangan, "card2");

        add(panel_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambah_tiket_penerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah_tiket_penerbanganActionPerformed
	// TODO add your handling code here:
	new FormTambahTiketPenerbangan(null, true).setVisible(true);
    }//GEN-LAST:event_btn_tambah_tiket_penerbanganActionPerformed

    private void btn_edit_tiket_penerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_edit_tiket_penerbanganActionPerformed
	// TODO add your handling code here:
	new FormEditTiketPenerbangan(null, true).setVisible(true);
    }//GEN-LAST:event_btn_edit_tiket_penerbanganActionPerformed

    private void btn_hapus_tiket_penerbanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapus_tiket_penerbanganActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_btn_hapus_tiket_penerbanganActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel breadcrumb_tiket_penerbangan;
    private javax.swing.JButton btn_edit_tiket_penerbangan;
    private javax.swing.JButton btn_hapus_tiket_penerbangan;
    private javax.swing.JTextField btn_pencarian_tiket_penerbangan;
    private javax.swing.JButton btn_tambah_tiket_penerbangan;
    private javax.swing.JPanel panel_jadwal_penerbangan;
    private javax.swing.JPanel panel_main;
    private javax.swing.JScrollPane scroll_tiket_penerbangan;
    private javax.swing.JTable tabel_tiket_penerbangan;
    // End of variables declaration//GEN-END:variables
}
