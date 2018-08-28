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
public class Transaksi extends Pembeli{
    public static int total;
    
    public Transaksi (String namaPem, String almt, int idPem, String noTelp,
    int idBrg,String namaBrg, int hargaBrg,String merkBrg, int total)
    {
        super(namaPem,almt,idPem,noTelp,idBrg,namaBrg,hargaBrg,merkBrg);
        this.total=total;
    }
    public void Cetak()
    {
        super.info();
        System.out.println("Total Barang     : "+ this.total);
    }
    public static void main(String[] args) {
        System.out.println("Daftar Pembelian Barang :");
        Transaksi a = new Transaksi("Annisa Rizky R","Jalan Iswayudi BF3",9,"082229229720",2,"Sepatu",20000,"Vans", 8);
        a.Cetak();
        System.out.println("Harga Total      : "+(hargaBarang * total));
                
    }
    
}
