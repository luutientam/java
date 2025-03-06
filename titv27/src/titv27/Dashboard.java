package titv27;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import cafe.baocaoquanli.km;
import cafe.baocaoquanli.suakm;
import cafe.login;
import cafe.quanlikh.ConnectDB;
import com.mysql.cj.xdevapi.Statement;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author luuti
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        load_hd();
        this.setLocationRelativeTo(null);
    }

    public void user(String tk, String vaitroo) {
        taik.setText(tk);
        vaitro.setText(vaitroo);
    }

    public void load_hd() {
        try {
            Connection con;
            con = ConnectDB.KetnoiDB();
            java.sql.Statement st = con.createStatement();

            // Fixed the SQL query: added a space before "from hoadon hd"
            String sql = "SELECT hd.mahd, kh.tenkhachhang, nv.tennhanvien, hd.ngaylap, hd.tongtien, hd.trangthai "
                    + "FROM hoadon hd "
                    + "JOIN khachhang kh ON hd.makh = kh.makh "
                    + "JOIN nhanvien nv ON hd.manv = nv.manv";

            ResultSet rs = st.executeQuery(sql);

            // Define column names for the JTable
            String[] arr = {"Mã hóa đơn", "Tên khách hàng", "Nhân viên lập hóa đơn", "Ngày lập hóa đơn", "Tổng tiền", "Trạng thái"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);

            // Populate the table model with data from the ResultSet
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("mahd"));         // Invoice ID
                v.add(rs.getString("tenkhachhang")); // Customer Name
                v.add(rs.getString("tennhanvien"));  // Employee Name
                v.add(rs.getString("ngaylap"));      // Date of invoice
                v.add(rs.getString("tongtien"));     // Total amount
                v.add(rs.getString("trangthai"));    // Status of the invoice
                model.addRow(v);
            }

            // Set the model for your JTable
            danhSachHoaDon.setModel(model);

            // Close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        themHoaDon = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtTimKiem = new javax.swing.JTextPane();
        timKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        danhSachHoaDon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        xuatExcel = new javax.swing.JButton();
        nhapExcel = new javax.swing.JButton();
        sapXep = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        so = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        taik = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        vaitro = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        themHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        themHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        themHoaDon.setText("Thêm hóa đơn");
        themHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themHoaDonActionPerformed(evt);
            }
        });

        txtTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimKiemMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(txtTimKiem);

        timKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        timKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search.png"))); // NOI18N
        timKiem.setText("Tìm kiếm");
        timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themHoaDon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timKiem)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(themHoaDon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        danhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        danhSachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                danhSachHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(danhSachHoaDon);

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/campaign.png"))); // NOI18N
        jLabel1.setText("Quản lí hóa đơn");

        xuatExcel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xuatExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excel.jpg"))); // NOI18N
        xuatExcel.setText("Xuất excel");
        xuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xuatExcelActionPerformed(evt);
            }
        });

        nhapExcel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nhapExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/xls.png"))); // NOI18N
        nhapExcel.setText("Nhập File excel");
        nhapExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapExcelActionPerformed(evt);
            }
        });

        sapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sắp xếp", "sắp xếp tăng", "sắp xếp giảm" }));
        sapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sapXepActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(160, 140, 119));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        so.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        so.setForeground(new java.awt.Color(255, 255, 255));
        so.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        so.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        so.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                soMouseClicked(evt);
            }
        });
        jPanel1.add(so, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 210, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-product.png"))); // NOI18N
        jLabel9.setText("Sản phẩm");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, -1));

        taik.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        taik.setForeground(new java.awt.Color(255, 255, 255));
        taik.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        taik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/profile.png"))); // NOI18N
        taik.setText("  ");
        jPanel1.add(taik, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 180, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill.png"))); // NOI18N
        jLabel11.setText("Tạo hóa đơn");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 210, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/shopping-online.png"))); // NOI18N
        jLabel12.setText("Khuyến mãi");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/patient.png"))); // NOI18N
        jLabel13.setText("Khách hàng");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 210, -1));

        vaitro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        vaitro.setForeground(new java.awt.Color(255, 255, 255));
        vaitro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel1.add(vaitro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 150, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        jLabel15.setText("Báo cáo");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, -1));

        nen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/no.png"))); // NOI18N
        jPanel1.add(nen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 210, 830));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nhapExcel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(xuatExcel))
                                .addComponent(jScrollPane1)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(sapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nhapExcel)
                    .addComponent(xuatExcel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themHoaDonActionPerformed
        ThemHoaDon themHoaDon = new ThemHoaDon(this);
        themHoaDon.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        themHoaDon.show();
    }//GEN-LAST:event_themHoaDonActionPerformed

    private void txtTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemMouseClicked

    }//GEN-LAST:event_txtTimKiemMouseClicked

    private void timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timKiemActionPerformed
        String txt = txtTimKiem.getText().trim();
        try {
            Connection con;
            con = ConnectDB.KetnoiDB();
            java.sql.Statement st = con.createStatement();

            // Fixed the SQL query: added a space before "from hoadon hd"
            String sql = "SELECT hd.mahd, kh.tenkhachhang, nv.tennhanvien, hd.ngaylap, hd.tongtien, hd.trangthai  "
                    + "from hoadon hd "
                    + "join nhanvien nv on hd.manv = nv.manv "
                    + "join khachhang kh on hd.makh = kh.makh "
                    + "where mahd like '%" + txt + "%' "
                    + "or tenkhachhang like N'%" + txt + "%' "
                    + "or tennhanvien like '%" + txt + "%' "
                    + "or ngaylap like '%" + txt + "%' "
                    + "or tongtien like '%" + txt + "%' "
                    + "or trangthai like N'%" + txt + "%'";

            ResultSet rs = st.executeQuery(sql);

            // Define column names for the JTable
            String[] arr = {"Mã hóa đơn", "Tên khách hàng", "Nhân viên lập hóa đơn", "Ngày lập hóa đơn", "Tổng tiền", "Trạng thái"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);

            // Populate the table model with data from the ResultSet
            boolean check = true;
            while (rs.next()) {
                check = false;
                Vector v = new Vector();
                v.add(rs.getString("mahd"));         // Invoice ID
                v.add(rs.getString("tenkhachhang")); // Customer Name
                v.add(rs.getString("tennhanvien"));  // Employee Name
                v.add(rs.getString("ngaylap"));      // Date of invoice
                v.add(rs.getString("tongtien"));     // Total amount
                v.add(rs.getString("trangthai"));    // Status of the invoice
                model.addRow(v);
            }
            if (check) {
                Vector v = new Vector();
                v.add("Không có dữ liệuuuuuuu");
                model.addRow(v);
            }
            // Set the model for your JTable
            danhSachHoaDon.setModel(model);

            // Close the connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_timKiemActionPerformed

    private void danhSachHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_danhSachHoaDonMouseClicked
        int i;
        i = danhSachHoaDon.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) danhSachHoaDon.getModel();
//
        String maHoaDon = model.getValueAt(i, 0).toString();
        String tenKhachHang = model.getValueAt(i, 1).toString();
        String tenNhanVien = model.getValueAt(i, 2).toString();
        String ngayLap = model.getValueAt(i, 3).toString();
        String tongTien = model.getValueAt(i, 4).toString();
        String trangThai = model.getValueAt(i, 5).toString();

        ChiTietHoaDon cthd = new ChiTietHoaDon(this);
        cthd.setData(maHoaDon, tenKhachHang, tenNhanVien, ngayLap, tongTien, trangThai);
        cthd.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cthd.setVisible(true);
    }//GEN-LAST:event_danhSachHoaDonMouseClicked

    private void xuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xuatExcelActionPerformed

    }//GEN-LAST:event_xuatExcelActionPerformed

    private void nhapExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapExcelActionPerformed
        try {
            JFileChooser fc = new JFileChooser();
            int lc = fc.showOpenDialog(this);
            if (lc == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                //                txtTenfile.setText(file.getPath());
                String tenfile = file.getName();
                if (tenfile.endsWith(".xlsx")) {    //endsWith chọn file có phần kết thúc ...
                    ReadExcel(file.getPath());
                    JOptionPane.showMessageDialog(this, "Nhập thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Phải chọn file excel");
                }

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_nhapExcelActionPerformed

    private void sapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sapXepActionPerformed
        String tc = sapXep.getSelectedItem().toString();  // Lấy giá trị từ ComboBox
        String txt = txtTimKiem.getText().trim();  // Lấy nội dung tìm kiếm
        try {
            Connection con = ConnectDB.KetnoiDB();
            java.sql.Statement st = con.createStatement();
            String sql;

            // Xây dựng câu truy vấn SQL với điều kiện sắp xếp và tìm kiếm
            if (tc.equals("sắp xếp tăng")) {
                sql = "SELECT hd.mahd, kh.tenkhachhang, nv.tennhanvien, hd.ngaylap, hd.tongtien, hd.trangthai "
                        + "FROM hoadon hd "
                        + "JOIN khachhang kh ON hd.makh = kh.makh "
                        + "JOIN nhanvien nv ON hd.manv = nv.manv "
                        //                        
                        + "ORDER BY hd.tongtien ASC";  // Sắp xếp tăng dần theo tổng tiền
            } else if (tc.equals("sắp xếp giảm")) {
                sql = "SELECT hd.mahd, kh.tenkhachhang, nv.tennhanvien, hd.ngaylap, hd.tongtien, hd.trangthai "
                        + "FROM hoadon hd "
                        + "JOIN khachhang kh ON hd.makh = kh.makh "
                        + "JOIN nhanvien nv ON hd.manv = nv.manv "
                        //                       
                        + "ORDER BY hd.tongtien DESC";  // Sắp xếp giảm dần theo tổng tiền
            } else {
                load_hd();  // Nếu không có giá trị sắp xếp hợp lệ, tải dữ liệu bình thường
                return;
            }

            ResultSet rs = st.executeQuery(sql);

            // Cấu trúc bảng hiển thị
            String[] arr = {"Mã hóa đơn", "Tên khách hàng", "Nhân viên lập hóa đơn", "Ngày lập hóa đơn", "Tổng tiền", "Trạng thái"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);

            // Thêm dữ liệu vào bảng
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString("mahd"));
                v.add(rs.getString("tenkhachhang"));
                v.add(rs.getString("tennhanvien"));
                v.add(rs.getString("ngaylap"));
                v.add(rs.getString("tongtien"));
                v.add(rs.getString("trangthai"));
                model.addRow(v);
            }
            danhSachHoaDon.setModel(model);  // Thiết lập model cho JTable

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_sapXepActionPerformed

    private void soMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_soMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            login gg = new login();
            gg.show();
            dispose();
        }
    }//GEN-LAST:event_soMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable danhSachHoaDon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel nen;
    private javax.swing.JButton nhapExcel;
    private javax.swing.JComboBox<String> sapXep;
    private javax.swing.JLabel so;
    private javax.swing.JLabel taik;
    private javax.swing.JButton themHoaDon;
    private javax.swing.JButton timKiem;
    private javax.swing.JTextPane txtTimKiem;
    private javax.swing.JLabel vaitro;
    private javax.swing.JButton xuatExcel;
    // End of variables declaration//GEN-END:variables

    private void ReadExcel(String path) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
