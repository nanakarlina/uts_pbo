
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Iitutsa
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain(String nana) {
        initComponents();
        selectData();
        txtNama.setText(nana);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        txtNO = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rdNovel = new javax.swing.JRadioButton();
        rdBio = new javax.swing.JRadioButton();
        rdKamus = new javax.swing.JRadioButton();
        rdEdu = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jDatePinjam = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jDateKembali = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1Data = new javax.swing.JTable();
        btnSave = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jbPrint = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNO1 = new javax.swing.JTextField();
        txtNama1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        rdNovel1 = new javax.swing.JRadioButton();
        rdEdu1 = new javax.swing.JRadioButton();
        rdBio1 = new javax.swing.JRadioButton();
        rdKamus1 = new javax.swing.JRadioButton();
        txtJudul1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAlamat1 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jDateKembali1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jDatePinjam1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtStatus = new javax.swing.JTextField();
        btncari = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NO. ANGGOTA");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 210, 101, 20);

        txtNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNOActionPerformed(evt);
            }
        });
        getContentPane().add(txtNO);
        txtNO.setBounds(40, 230, 90, 30);

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama);
        txtNama.setBounds(140, 230, 130, 30);

        jLabel6.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NAMA");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(140, 210, 60, 20);

        jLabel7.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JENIS BUKU");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 260, 100, 20);

        buttonGroup2.add(rdNovel);
        rdNovel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdNovel.setForeground(new java.awt.Color(255, 255, 255));
        rdNovel.setText("NOVEL");
        rdNovel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNovelActionPerformed(evt);
            }
        });
        getContentPane().add(rdNovel);
        rdNovel.setBounds(40, 280, 110, 23);

        buttonGroup2.add(rdBio);
        rdBio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdBio.setForeground(new java.awt.Color(255, 255, 255));
        rdBio.setText("BIOGRAFI");
        getContentPane().add(rdBio);
        rdBio.setBounds(40, 320, 110, 23);

        buttonGroup2.add(rdKamus);
        rdKamus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdKamus.setForeground(new java.awt.Color(255, 255, 255));
        rdKamus.setText("KAMUS");
        getContentPane().add(rdKamus);
        rdKamus.setBounds(160, 320, 110, 23);

        buttonGroup2.add(rdEdu);
        rdEdu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdEdu.setForeground(new java.awt.Color(255, 255, 255));
        rdEdu.setText("EDUKASI");
        getContentPane().add(rdEdu);
        rdEdu.setBounds(160, 280, 110, 23);

        jLabel13.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("JUDUL BUKU");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 350, 69, 19);
        getContentPane().add(txtJudul);
        txtJudul.setBounds(40, 370, 230, 30);

        jLabel14.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TGL PINJAM");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(280, 170, 64, 19);
        getContentPane().add(jDatePinjam);
        jDatePinjam.setBounds(290, 190, 170, 30);

        jLabel15.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("TGL KEMBALI");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(280, 230, 72, 19);
        getContentPane().add(jDateKembali);
        jDateKembali.setBounds(290, 250, 166, 30);

        jLabel5.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ALAMAT");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 290, 100, 20);

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(290, 310, 166, 60);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tb1Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "NAMA", "JENIS BUKU", "ALAMAT", "JUDUL BUKU", "TGLPINJAM", "TGLKEMBALI", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb1Data.setToolTipText("");
        tb1Data.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tb1Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1DataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1Data);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 450, 850, 210);

        btnSave.setText("PINJAM");
        btnSave.setActionCommand("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave);
        btnSave.setBounds(290, 380, 90, 30);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(400, 380, 90, 30);

        btnClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear);
        btnClear.setBounds(840, 380, 80, 30);

        jbPrint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbPrint.setText("PRINT");
        jbPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrintActionPerformed(evt);
            }
        });
        getContentPane().add(jbPrint);
        jbPrint.setBounds(950, 460, 90, 30);

        jLabel8.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NO. ANGGOTA");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(590, 210, 101, 20);

        txtNO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNO1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNO1);
        txtNO1.setBounds(590, 230, 90, 30);
        getContentPane().add(txtNama1);
        txtNama1.setBounds(690, 230, 130, 30);

        jLabel9.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("NAMA");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(690, 210, 60, 20);

        jLabel11.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("JENIS BUKU");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(590, 260, 100, 20);

        buttonGroup1.add(rdNovel1);
        rdNovel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdNovel1.setForeground(new java.awt.Color(255, 255, 255));
        rdNovel1.setText("NOVEL");
        rdNovel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNovel1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdNovel1);
        rdNovel1.setBounds(590, 280, 110, 23);

        buttonGroup1.add(rdEdu1);
        rdEdu1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdEdu1.setForeground(new java.awt.Color(255, 255, 255));
        rdEdu1.setText("EDUKASI");
        getContentPane().add(rdEdu1);
        rdEdu1.setBounds(710, 280, 110, 23);

        buttonGroup1.add(rdBio1);
        rdBio1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdBio1.setForeground(new java.awt.Color(255, 255, 255));
        rdBio1.setText("BIOGRAFI");
        getContentPane().add(rdBio1);
        rdBio1.setBounds(590, 320, 110, 23);

        buttonGroup1.add(rdKamus1);
        rdKamus1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rdKamus1.setForeground(new java.awt.Color(255, 255, 255));
        rdKamus1.setText("KAMUS");
        getContentPane().add(rdKamus1);
        rdKamus1.setBounds(710, 320, 110, 23);
        getContentPane().add(txtJudul1);
        txtJudul1.setBounds(590, 370, 230, 30);

        jLabel16.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("JUDUL BUKU");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(590, 350, 69, 19);

        txtAlamat1.setColumns(20);
        txtAlamat1.setRows(5);
        jScrollPane3.setViewportView(txtAlamat1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(840, 310, 166, 60);

        jLabel12.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("ALAMAT");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(830, 290, 100, 20);
        getContentPane().add(jDateKembali1);
        jDateKembali1.setBounds(840, 250, 166, 30);

        jLabel17.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TGL KEMBALI");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(830, 230, 72, 19);
        getContentPane().add(jDatePinjam1);
        jDatePinjam1.setBounds(840, 190, 170, 30);

        jLabel18.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("TGL PINJAM");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(830, 170, 64, 19);

        jButton1.setText("KEMBALIKAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(930, 380, 110, 30);

        txtStatus.setText("cari status ");
        getContentPane().add(txtStatus);
        txtStatus.setBounds(930, 540, 110, 30);

        btncari.setText("cari");
        btncari.setToolTipText("");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });
        getContentPane().add(btncari);
        btncari.setBounds(970, 580, 49, 23);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/FORM.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1090, 690);

        setBounds(0, 0, 1101, 730);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int baris = tb1Data.getSelectedRow();
        if (baris != -1) {
            String no = tb1Data.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_pinjam WHERE no ='"+no+"'";
            int status = KoneksiDB.execute(SQL);
            if (status==1) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih Dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrintActionPerformed
    MessageFormat header = new MessageFormat("Form peminjaman buku Perpustakaan SMK Telkom Malang");
    MessageFormat footer = new MessageFormat("Page {0,number,integer}       ");
    try {
        tb1Data.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
    } catch (java.awt.print.PrinterException e){
        System.err.format("Cannot print %s%n", e.getMessage());
    }
      
    }//GEN-LAST:event_jbPrintActionPerformed

    private void tb1DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1DataMouseClicked
        // TODO add your handling code here:
        int baris = tb1Data.getSelectedRow();
        if (baris !=-1) {
            txtNO1.setText(tb1Data.getValueAt(baris, 0).toString());
            txtNama1.setText(tb1Data.getValueAt(baris, 1).toString());
            if ("Novel".equals(tb1Data.getValueAt(baris, 2).toString())){
                rdNovel1.setSelected(true);
            }else if ("Edukasi".equals(tb1Data.getValueAt(baris, 2).toString())){
                rdEdu1.setSelected(true);
            }else if ("Kamus".equals(tb1Data.getValueAt(baris, 2).toString())){
                rdKamus1.setSelected(true);
            } else {
                rdBio1.setSelected(true);
            }
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date tglPinjam = null;
            try{
                tglPinjam = date.parse(tb1Data.getValueAt(baris, 5).toString());
            } catch (ParseException ex){
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
            }
            jDatePinjam1.setDate(tglPinjam);
            
            Date tglkembali = null;
            try{
                tglkembali = date.parse(tb1Data.getValueAt(baris, 6).toString());
            } catch (ParseException ex){
                Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null,ex);
            }
            jDateKembali1.setDate(tglkembali);
            txtAlamat1.setText(tb1Data.getValueAt(baris, 3).toString());
            txtJudul1.setText(tb1Data.getValueAt(baris, 4).toString());
         
        }
    }//GEN-LAST:event_tb1DataMouseClicked

    private void rdNovelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNovelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNovelActionPerformed

    private void txtNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tglpinjam = dateFormat.format(jDatePinjam.getDate());
        String tglkembali = dateFormat.format(jDateKembali.getDate());
        String stat ="pinjam" ;
        String jenis ="";
        if(rdNovel.isSelected()){
            jenis ="Novel";
        } else if(rdKamus.isSelected()) {
            jenis ="Kamus";
        } else if (rdBio.isSelected()){
            jenis="Biografi";
        }else {
            jenis = "Edukasi";
        }
        if (txtNO.getText().equals("")||txtNama.getText().equals("")||txtAlamat.getText().equals("")||jenis.equals("")||tglpinjam.equals("")||tglkembali.equals("")||txtJudul.getText().equals("")){
        JOptionPane.showMessageDialog(this,"Harap lengkapi data","error",JOptionPane.WARNING_MESSAGE);        
        } else {
            String SQL = "INSERT INTO tb_pinjam VALUES ('"+txtNO.getText()+"', '"+txtNama.getText()+"', '"+jenis+"', '"+txtAlamat.getText()+"', '"+txtJudul.getText()+"', '"+tglpinjam+"', '"+tglkembali+"', '"+stat+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1){
                JOptionPane.showMessageDialog(this,"peminjaman berhasil ditambahkan","sukses",JOptionPane.INFORMATION_MESSAGE);
                 selectData();
            } else {
                JOptionPane.showMessageDialog(this,"peminjaman gagal ditambahkan","error",JOptionPane.WARNING_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtNama1.setText("");
        txtNO1.setText("");
        txtJudul1.setText("");
        buttonGroup1.clearSelection();
        jDatePinjam1.setDate(null);
        jDateKembali1.setDate(null);
        txtAlamat1.setText("");
        txtNama.setText("");
        txtNO.setText("");
        txtJudul.setText("");
        buttonGroup2.clearSelection();
        jDatePinjam.setDate(null);
        jDateKembali.setDate(null);
        txtAlamat.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtNO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNO1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNO1ActionPerformed

    private void rdNovel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNovel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNovel1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tglpinjam = dateFormat.format(jDatePinjam1.getDate());
        String tglkembali = dateFormat.format(jDateKembali1.getDate());
        String stat = "kembali";
        String jenis ="";
        if(rdNovel1.isSelected()){
            jenis ="Novel";
        } else if(rdKamus1.isSelected()) {
            jenis ="Kamus";
        } else if (rdBio1.isSelected()){
            jenis="Biografi";
        }else {
            jenis = "Edukasi";
        }
        String SQL = "UPDATE tb_pinjam SET "
                +"nama='"+txtNama1.getText()+"',"
                +"jenis='"+jenis+"',"
                +"alamat='"+txtAlamat1.getText()+"',"
                +"judul='"+txtJudul1.getText()+"',"
                +"tglpinjam='"+tglpinjam+"',"
                +"tglkembali='"+tglkembali+"',"
                +"status='"+stat+"' "
                + "WHERE no='"+txtNO1.getText()+"'";
         int update = KoneksiDB.execute(SQL);
            if (update == 1){
                JOptionPane.showMessageDialog(this,"buku berhasil dikembalikan","sukses",JOptionPane.INFORMATION_MESSAGE);
                 selectData();
            } else {
                JOptionPane.showMessageDialog(this,"buku gagal dikembalikan","error",JOptionPane.WARNING_MESSAGE);
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        selectstatus();
        
    }//GEN-LAST:event_btncariActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
       
    }//GEN-LAST:event_txtNamaActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btncari;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateKembali;
    private com.toedter.calendar.JDateChooser jDateKembali1;
    private com.toedter.calendar.JDateChooser jDatePinjam;
    private com.toedter.calendar.JDateChooser jDatePinjam1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbPrint;
    private javax.swing.JRadioButton rdBio;
    private javax.swing.JRadioButton rdBio1;
    private javax.swing.JRadioButton rdEdu;
    private javax.swing.JRadioButton rdEdu1;
    private javax.swing.JRadioButton rdKamus;
    private javax.swing.JRadioButton rdKamus1;
    private javax.swing.JRadioButton rdNovel;
    private javax.swing.JRadioButton rdNovel1;
    private javax.swing.JTable tb1Data;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextArea txtAlamat1;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtJudul1;
    private javax.swing.JTextField txtNO;
    private javax.swing.JTextField txtNO1;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNama1;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
         String kolom[] = {"no","nama","jenis","alamat","judul","tglpinjam","tglkembali","status"};
       DefaultTableModel dtm = new DefaultTableModel(null,kolom);
       String SQL = "SELECT * FROM tb_pinjam";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String nama= rs.getString(2);
               String jenis = " ";
               if("Novel".equals(rs.getString(3))){
                   jenis = "Novel";
               }else if ("Biografi".equals(rs.getString(3))){
                   jenis = "Biografi";
               }else if ("Edukasi".equals(rs.getString(3))){
                   jenis = "Edukasi";
               } else{
                   jenis = "Kamus";
               }
               String alamat = rs.getString(4);
               String judul = rs.getString(5);
               String tglpinjam = rs.getString(6);
               String tglkembali = rs.getString(7);
               String status = rs.getString(8);
              
               String data[] = {no,nama,jenis,alamat,judul,tglpinjam,tglkembali,status};
               dtm.addRow(data);
           }
           
       }catch (SQLException ex){
                   Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null, ex);
                   }
       tb1Data.setModel(dtm);
    }

    private void selectstatus() {
           String kolom[] = {"no","nama","jenis","alamat","judul","tglpinjam","tglkembali","status"};
       DefaultTableModel dtm = new DefaultTableModel(null,kolom);
       String SQL = "SELECT * FROM tb_pinjam WHERE status='"+txtStatus.getText()+"'";
       ResultSet rs = KoneksiDB.executeQuery(SQL);
       try{
           while(rs.next()){
               String no = rs.getString(1);
               String nama= rs.getString(2);
               String jenis = " ";
               if("Novel".equals(rs.getString(3))){
                   jenis = "Novel";
               }else if ("Biografi".equals(rs.getString(3))){
                   jenis = "Biografi";
               }else if ("Edukasi".equals(rs.getString(3))){
                   jenis = "Edukasi";
               } else{
                   jenis = "Kamus";
               }
               String alamat = rs.getString(4);
               String judul = rs.getString(5);
               String tglpinjam = rs.getString(6);
               String tglkembali = rs.getString(7);
               String status = rs.getString(8);
              
               String data[] = {no,nama,jenis,alamat,judul,tglpinjam,tglkembali,status};
               dtm.addRow(data);
           }
           
       }catch (SQLException ex){
                   Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE,null, ex);
                   }
       tb1Data.setModel(dtm);
    }
}
