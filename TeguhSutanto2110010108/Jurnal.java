/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeguhSutanto2110010108;

/**
 *
 * @author LENOVO
 */
public class Jurnal {
   private String NoReferensi;
   private String NoTransaksi;
   private String TanggalTransaksi;
   private String Keterangan;
   
   public Jurnal (){} //kontruktor
    
    public void setNoReferensi (String NOP){ //mothod set
        this.NoReferensi=NoReferensi;
    }
    public String getNoReferensi(){ // method get
        return this.NoReferensi;
    }
    
    public void setNoTransaksi (String NOP){ //mothod set
        this.NoTransaksi=NoTransaksi;
    }
    public String getNoTransaksi(){ // method get
        return this.NoTransaksi;
    }
    
    public void setTanggalTransaksi (String NOP){ //mothod set
        this.TanggalTransaksi=TanggalTransaksi;
    }
    public String getTanggalTransaksi(){ // method get
        return this.TanggalTransaksi;
    }
    
    public void setKeterangan (String NOP){ //mothod set
        this.Keterangan=Keterangan;
    }
    public String getKeterangan(){ // method get
        return this.Keterangan;
    }
}
