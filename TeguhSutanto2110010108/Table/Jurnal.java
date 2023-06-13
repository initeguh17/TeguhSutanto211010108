/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

/**
 *
 * @author LENOVO
 */
public class Jurnal {
   private Integer NoReferensi;
   private Integer NoTransaksi;
   private Integer TanggalTransaksi;
   private String Keterangan;
   
   public Jurnal (){} //kontruktor
    
    public void setNoReferensi (Integer NOP){ //mothod set
        this.NoReferensi=NoReferensi;
    }
    public Integer getNoReferensi(){ // method get
        return this.NoReferensi;
    }
    
    public void setNoTransaksi (Integer NOP){ //mothod set
        this.NoTransaksi=NoTransaksi;
    }
    public Integer getNoTransaksi(){ // method get
        return this.NoTransaksi;
    }
    
    public void setTanggalTransaksi (Integer NOP){ //mothod set
        this.TanggalTransaksi=TanggalTransaksi;
    }
    public Integer getTanggalTransaksi(){ // method get
        return this.TanggalTransaksi;
    }
    
    public void setKeterangan (String NOP){ //mothod set
        this.Keterangan=Keterangan;
    }
    public String getKeterangan(){ // method get
        return this.Keterangan;
    }
}
