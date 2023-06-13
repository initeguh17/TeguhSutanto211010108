/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

/**
 *
 * @author LENOVO
 */
public class DataAkun {
    
    private String KodeAkun;
    private String NamaAkun;
    private String JenisAkun;
    private Integer SaldoNormal;
    
    public DataAkun (){} //kontruktor

    public void setKodeAkun (String NOP){ // method set
        this.KodeAkun=KodeAkun;
    }
    public String getKodeAkun(){ // method get
        return this.KodeAkun;
    }
    
    public void setNamaAkun (String NOP){ // method set
        this.NamaAkun=NamaAkun;
    }
    public String getNamaAkun(){ // method get
        return this.NamaAkun;
    }
    
    public void setJeniAkun (String NOP){ // method set
        this.JenisAkun=JenisAkun;
    }
    public String getJenisAkun(){ // method get
        return this.JenisAkun;
    }
    
    public void setSaldoNormal (Integer NOP){ // method set
        this.SaldoNormal=SaldoNormal;
    }
    public Integer getSaldoNormal(){ // method get
        return this.SaldoNormal;
    }
}
