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
public class Pembeli extends TokoBuku {
    private String namaPembeli,alamat,noTelp;
    private int idPembeli,total;
    
    // Konstruktor
    public Pembeli (String namaPem, String almt, int idPem, String noTelp,
    int idBrg,String namaBrg, int hargaBrg,String merkBrg)
    {
        super(idBrg,namaBrg,hargaBrg,merkBrg);
        this.idPembeli = idPem;
        this.namaPembeli = namaPem;
        this.noTelp = noTelp;
        this.alamat = almt;
        this.total = total;
    }
    //Metode
    public void info ()
    {
        System.out.println("ID Pembeli       : "+ this.idPembeli);
        System.out.println("Nama Pembeli     : "+ this.namaPembeli);
        System.out.println("Alamat           : "+ this.alamat);
        System.out.println("No Telp          : "+ this.noTelp);
        super.info();
    }
}
