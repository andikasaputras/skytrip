package view;

import com.formdev.flatlaf.FlatClientProperties;

public class FormPembelianTiket extends javax.swing.JPanel {

    public FormPembelianTiket() {
	initComponents();
	init();
    }

    private void init() {
	panel_jadwal_penerbangan.putClientProperty(FlatClientProperties.STYLE, "" +
		"background:$Table.background;");
	txt_no_transaksi.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
	txt_qty.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
	txt_pencarian.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
	txt_harga.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
	txt_diskon.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
	txt_total_harga.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
	txt_pembayaran.putClientProperty(FlatClientProperties.STYLE, "" +
		"arc:10;");
	txt_sisa_kembalian.putClientProperty(FlatClientProperties.STYLE, "" +
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
        breadcrumb_kasir_tiketing = new javax.swing.JLabel();
        lbl_no_transaksi = new javax.swing.JLabel();
        txt_no_transaksi = new javax.swing.JTextField();
        lbl_kode_tiket = new javax.swing.JLabel();
        cbx_kode_tiket = new javax.swing.JComboBox<>();
        lbl_penumpang = new javax.swing.JLabel();
        cbx_penumpang = new javax.swing.JComboBox<>();
        lbl_qty = new javax.swing.JLabel();
        txt_qty = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        txt_pencarian = new javax.swing.JTextField();
        Scroll_pembelian_tiket = new javax.swing.JScrollPane();
        tbl_pembelian_tiket = new javax.swing.JTable();
        lbl_jumlah_tiket = new javax.swing.JLabel();
        lbl_tiket = new javax.swing.JLabel();
        lbl_harga = new javax.swing.JLabel();
        lbl_rp1 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        lbl_diskon = new javax.swing.JLabel();
        txt_diskon = new javax.swing.JTextField();
        lbl_persen = new javax.swing.JLabel();
        lbl_ppn = new javax.swing.JLabel();
        cbx_ppn = new javax.swing.JCheckBox();
        lbl_total_harga = new javax.swing.JLabel();
        lbl_rp2 = new javax.swing.JLabel();
        txt_total_harga = new javax.swing.JTextField();
        lbl_pembayaran = new javax.swing.JLabel();
        lbl_rp3 = new javax.swing.JLabel();
        txt_pembayaran = new javax.swing.JTextField();
        lbl_sisa_kembalian = new javax.swing.JLabel();
        lbl_rp4 = new javax.swing.JLabel();
        txt_sisa_kembalian = new javax.swing.JTextField();
        btn_bayar = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        panel_main.setPreferredSize(new java.awt.Dimension(798, 645));
        panel_main.setLayout(new java.awt.CardLayout());

        panel_jadwal_penerbangan.setPreferredSize(new java.awt.Dimension(798, 645));

        breadcrumb_kasir_tiketing.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        breadcrumb_kasir_tiketing.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ticket.png"))); // NOI18N
        breadcrumb_kasir_tiketing.setText("App > Pembelian Tiket");

        lbl_no_transaksi.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_no_transaksi.setText("No Transaksi");

        txt_no_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_no_transaksiActionPerformed(evt);
            }
        });

        lbl_kode_tiket.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_kode_tiket.setText("Kode Tiket");

        cbx_kode_tiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_kode_tiketActionPerformed(evt);
            }
        });

        lbl_penumpang.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_penumpang.setText("Penumpang");

        lbl_qty.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_qty.setText("Qty");

        txt_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qtyActionPerformed(evt);
            }
        });

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/plus.png"))); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pencil.png"))); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/trash.png"))); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel.png"))); // NOI18N
        btn_batal.setText("Batal");
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        txt_pencarian.setForeground(new java.awt.Color(204, 204, 204));
        txt_pencarian.setText("Pencarian");

        tbl_pembelian_tiket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "No Transaksi", "Kode Tiket", "Penumpang"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Scroll_pembelian_tiket.setViewportView(tbl_pembelian_tiket);
        if (tbl_pembelian_tiket.getColumnModel().getColumnCount() > 0) {
            tbl_pembelian_tiket.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        lbl_jumlah_tiket.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_jumlah_tiket.setText("Jumlah Tiket Yang Dipesan :");

        lbl_tiket.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_tiket.setText("0");

        lbl_harga.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_harga.setText("Harga");

        lbl_rp1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbl_rp1.setText("Rp.");

        lbl_diskon.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_diskon.setText("Diskon");

        lbl_persen.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbl_persen.setText("%");

        lbl_ppn.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_ppn.setText("PPN");

        cbx_ppn.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        cbx_ppn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_total_harga.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_total_harga.setText("Total Harga");

        lbl_rp2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbl_rp2.setText("Rp.");

        lbl_pembayaran.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_pembayaran.setText("Pembayaran");

        lbl_rp3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbl_rp3.setText("Rp.");

        lbl_sisa_kembalian.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        lbl_sisa_kembalian.setText("Sisa Kembalian");

        lbl_rp4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lbl_rp4.setText("Rp.");

        btn_bayar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_bayar.setText("Bayar");

        javax.swing.GroupLayout panel_jadwal_penerbanganLayout = new javax.swing.GroupLayout(panel_jadwal_penerbangan);
        panel_jadwal_penerbangan.setLayout(panel_jadwal_penerbanganLayout);
        panel_jadwal_penerbanganLayout.setHorizontalGroup(
            panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                        .addComponent(breadcrumb_kasir_tiketing)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                        .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                                        .addComponent(lbl_no_transaksi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_no_transaksi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_kode_tiket)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_kode_tiket, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_penumpang)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbx_penumpang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_qty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_edit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_hapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_pencarian))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                                .addComponent(lbl_jumlah_tiket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_tiket)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(lbl_harga))
                                            .addComponent(lbl_total_harga)
                                            .addComponent(lbl_diskon)
                                            .addComponent(lbl_ppn)))
                                    .addComponent(lbl_pembayaran, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_sisa_kembalian, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(28, 28, 28)
                                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                                        .addComponent(lbl_rp1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                                                .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_persen))
                                            .addComponent(cbx_ppn)
                                            .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                                        .addComponent(lbl_rp2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                                        .addComponent(lbl_rp3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_jadwal_penerbanganLayout.createSequentialGroup()
                                        .addComponent(lbl_rp4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btn_bayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txt_sisa_kembalian, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))))
                            .addComponent(Scroll_pembelian_tiket, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(15, 15, 15))))
        );
        panel_jadwal_penerbanganLayout.setVerticalGroup(
            panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jadwal_penerbanganLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(breadcrumb_kasir_tiketing, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_no_transaksi)
                    .addComponent(lbl_qty)
                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_penumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_penumpang)
                    .addComponent(cbx_kode_tiket, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_kode_tiket)
                    .addComponent(txt_no_transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus)
                    .addComponent(btn_batal)
                    .addComponent(txt_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Scroll_pembelian_tiket, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_harga)
                    .addComponent(lbl_rp1)
                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_jumlah_tiket)
                    .addComponent(lbl_tiket))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_diskon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_persen)
                    .addComponent(lbl_diskon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_ppn)
                    .addComponent(cbx_ppn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rp2)
                    .addComponent(txt_total_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_total_harga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rp3)
                    .addComponent(txt_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pembayaran))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jadwal_penerbanganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rp4)
                    .addComponent(txt_sisa_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_sisa_kembalian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        panel_main.add(panel_jadwal_penerbangan, "card2");

        add(panel_main, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void cbx_kode_tiketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_kode_tiketActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_cbx_kode_tiketActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txt_no_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_no_transaksiActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_txt_no_transaksiActionPerformed

    private void txt_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qtyActionPerformed
	// TODO add your handling code here:
    }//GEN-LAST:event_txt_qtyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Scroll_pembelian_tiket;
    private javax.swing.JLabel breadcrumb_kasir_tiketing;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_bayar;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JComboBox<String> cbx_kode_tiket;
    private javax.swing.JComboBox<String> cbx_penumpang;
    private javax.swing.JCheckBox cbx_ppn;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_diskon;
    private javax.swing.JLabel lbl_harga;
    private javax.swing.JLabel lbl_jumlah_tiket;
    private javax.swing.JLabel lbl_kode_tiket;
    private javax.swing.JLabel lbl_no_transaksi;
    private javax.swing.JLabel lbl_pembayaran;
    private javax.swing.JLabel lbl_penumpang;
    private javax.swing.JLabel lbl_persen;
    private javax.swing.JLabel lbl_ppn;
    private javax.swing.JLabel lbl_qty;
    private javax.swing.JLabel lbl_rp1;
    private javax.swing.JLabel lbl_rp2;
    private javax.swing.JLabel lbl_rp3;
    private javax.swing.JLabel lbl_rp4;
    private javax.swing.JLabel lbl_sisa_kembalian;
    private javax.swing.JLabel lbl_tiket;
    private javax.swing.JLabel lbl_total_harga;
    private javax.swing.JPanel panel_jadwal_penerbangan;
    private javax.swing.JPanel panel_main;
    private javax.swing.JTable tbl_pembelian_tiket;
    private javax.swing.JTextField txt_diskon;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_no_transaksi;
    private javax.swing.JTextField txt_pembayaran;
    private javax.swing.JTextField txt_pencarian;
    private javax.swing.JTextField txt_qty;
    private javax.swing.JTextField txt_sisa_kembalian;
    private javax.swing.JTextField txt_total_harga;
    // End of variables declaration//GEN-END:variables
}