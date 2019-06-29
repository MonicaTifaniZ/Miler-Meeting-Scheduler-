/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miler.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import koneksi.koneksi;

/**
 *
 * @author Monica
 */
public class Pertemuan {

    Connection konek = koneksi.getConnection();
    Statement stment;

    private String jenisPertemuan;
    private String temaKegiatan;
    private Date tanggalPertemuan;
    private String ruangan;
    private String jamMulai, jamSelesai;

    public Pertemuan(String jenisPertemuan, String tema, Date tanggal, String ruang, String mulai, String selesai) {
        this.jenisPertemuan = jenisPertemuan;
        this.temaKegiatan = tema;
        this.tanggalPertemuan = tanggal;
        this.ruangan = ruang;
        this.jamMulai = mulai;
        this.jamSelesai = selesai;
    }

    public String getJenisPertemuan() {
        return jenisPertemuan;
    }

    public void setJenisPertemuan(String jenisPertemuan) throws Exception {

    }

    public String getTemaKegiatan() {
        return temaKegiatan;
    }

    public void setTemaKegiatan(String temaKegiatan) {
        this.temaKegiatan = temaKegiatan;
    }

    public Date getTanggalPertemuan() {
        return tanggalPertemuan;
    }

    public void setTanggalPertemuan(Date tanggalPertemuan) {
        this.tanggalPertemuan = tanggalPertemuan;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }

    public String getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(String jamMulai) {
        this.jamMulai = jamMulai;
    }

    public String getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(String jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    public void tambahPertemuan() {
        try {
            Connection conn = koneksi.getConnection();
            Statement s = conn.createStatement();
            String sql = "INSERT INTO peminjaman (`kode_pinjam`, `username`, `kode_ruang`, `jenis_kegiatan`, `tanggal`, `jam_mulai`, `jam_berakhir`, `status` ) "
                    + "VALUES (?, ?, ?, ?, ?, ?,?,?);";
            
            ResultSet r = s.executeQuery(sql);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error : " + e.getMessage());
        }
    }
}
