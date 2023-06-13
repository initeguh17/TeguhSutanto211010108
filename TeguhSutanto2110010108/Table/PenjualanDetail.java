/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

/**
 *
 * @author LENOVO
 */
public class PenjualanDetail {
   private Integer NoTransaksi, KodeProduk, HargaSatuan, QTY;

    public PenjualanDetail (){} //kontruktor
   
    public void setNoTransaksi (int NoTransaksi){ //mothod set
        this.NoTransaksi=NoTransaksi;
    }
    public int getNoTransaksi(){ // method get
        return this.NoTransaksi;
    }
    
    public void setKodeProduk (int KodeProduk){ // method set
        this.KodeProduk=KodeProduk;
    }
    public int getKodeProduk(){ // method get
        return this.KodeProduk;
    }
    
    public void setHargaSatuan (int HargaSatuan){ // method set
        this.HargaSatuan=HargaSatuan;
    }
    public int getHargaSatuan(){ // method get
        return this.HargaSatuan;
    }
    
    public void setQTY (int qty){ // method set
        this.QTY=QTY;
    }
    public int getQTY(){ // method get
        return this.QTY;
    }
}
