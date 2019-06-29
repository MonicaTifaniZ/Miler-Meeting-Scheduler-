/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miler.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Monica
 */
public class Rapat extends Pertemuan {
    String notulenRapat;

    public Rapat(String jenisPertemuan, String tema, Date tanggal, String ruang, String mulai, String selesai) {
        super(jenisPertemuan, tema, tanggal, ruang, mulai, selesai);
    }

ArrayList<Pertemuan> coba = new ArrayList();

public void simpanKontak(Pertemuan tambah) {
        coba.add(tambah);

    }
    
}
