/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miler.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Monica
 */
public class Seminar extends Pertemuan{
    String LPJ;

    public Seminar(String jenisPertemuan, String tema, Date tanggal, String ruang, String mulai, String selesai) {
        super(jenisPertemuan, tema, tanggal, ruang, mulai, selesai);
        
    }
    public void tambahPertemuan(){
        List<Pertemuan> pertBaru();
    }
    
}
    

