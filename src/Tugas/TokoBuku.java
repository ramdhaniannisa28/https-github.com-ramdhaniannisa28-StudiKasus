/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author USER
 */
public class TokoBuku {
    private int idBarang;
    private String namaBarang;
    public static int hargaBarang;
    private String merkBarang;
   
    //Konstruktor
    public TokoBuku (int idBrg, String namaBrg, int hargaBrg,
            String merkBrg)
    {
        this.idBarang = idBrg;
        this.namaBarang = namaBrg;
        this.hargaBarang = hargaBrg;
        this.merkBarang = merkBrg;
    }
    //Metode
    public void info()
    {
        System.out.println("Id Barang        : "+this.idBarang);
        System.out.println("Nama Barang      : "+this.namaBarang);
        System.out.println("Harga Barang     : "+this.hargaBarang);
        System.out.println("Merk Barang      : "+this.merkBarang);
    }
}
