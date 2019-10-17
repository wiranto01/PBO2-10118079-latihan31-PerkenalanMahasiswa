/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118079.latihan31.perkenalanmahasiswa;

/**
 *
 * @author 
 * NAMA     : Wiranto
 * KELAS    : IF-2
 * NIM      : 10118079
 */
public class mainclass {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        
        mhs.nim = "10118079";
        mhs.nama = "Wiranto";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110270";
        mhs.nama = "Indra Tiola";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110271";
        mhs.nama = "Robi Tanzil Ganefi";
        
        mhs.perkenalkanDiri();
        
        mhs.nim = "10110269";
        mhs.nama = "Muhammad Nur Awaludin";
        
        mhs.perkenalkanDiri();
        

    }
    
}
