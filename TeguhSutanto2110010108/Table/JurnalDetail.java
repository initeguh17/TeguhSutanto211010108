/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

/**
 *
 * @author LENOVO
 */
public class JurnalDetail {
   private Integer NoReferensi;
   private Integer KodeAkun;
   private Integer Debet;
   private Integer Kredit;
   
   public JurnalDetail (){} //kontruktor
   
   public void setNoReferensi (Integer NOP){ //mothod set
        this.NoReferensi=NoReferensi;
    }
    public Integer getNoReferensi(){ // method get
        return this.NoReferensi;
    }
    
    public void setKodeAkun (Integer NOP){ // method set
        this.KodeAkun=KodeAkun;
    }
    public Integer getKodeAkun(){ // method get
        return this.KodeAkun;
    }
    
    public void setDebet (Integer NOP){ // method set
        this.Debet=Debet;
    }
    public Integer getDebet(){ // method get
        return this.Debet;
    }
    
    public void setKredit (Integer NOP){ // method set
        this.Kredit=Kredit;
    }
    public Integer getKredit(){ // method get
        return this.Kredit;
    }
    
}
