/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

/**
 *
 * @author LENOVO
 */
public class Produk {
   private int KodeProduk, Harga, Stok;
   private String Kategori, NamaProduk;
   
   public Produk (){} //kontruktor
   
   public void setKodeProduk (int KodeProduk){ // method set
        this.KodeProduk=KodeProduk;
    }
    public int getKodeProduk(){ // method get
        return this.KodeProduk;
    }
    
    public void setKategori (String Kategori){ // method set
        this.Kategori=Kategori;
    }
    public String getKategori(){ // method get
        return this.Kategori;
    }
    
    public void setNamaProduk (String NamaProduk){ // method set
        this.NamaProduk=NamaProduk;
    }
    public String getNamaProduk(){ // method get
        return this.NamaProduk;
    }
    
    public void setHarga (int Harga){ // method set
        this.Harga=Harga;
    }
    public int getHarga(){ // method get
        return this.Harga;
    }
    
    public void setStok (int Stok){ // method set
        this.Stok=Stok;
    }
    public int getStok(){ // method get
        return this.Stok;
    }
}
