/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

/**
 *
 * @author LENOVO
 */
public class Karyawan extends TeguhSutanto2110010108 {
   private Integer NO;
   private String Nama;
   private String Email;
   private String Alamat;
   private Integer Telp;
   
   public Karyawan (){} //kontruktor
   
   public void setNO (Integer NOP){ //mothod set
        this.NO=NO;
    }
    public Integer getNO(){ // method get
        return this.NO;
    }
    
    public void setNama (String NOP){ // method set
        this.Nama=Nama;
    }
    public String getNama(){ // method get
        return this.Nama;
    }
    
    public void setEmail (String NOP){ // method set
        this.Email=Email;
    }
    public String getEmail(){ // method get
        return this.Email;
    }
    
    public void setAlamat (String NOP){ // method set
        this.Alamat=Alamat;
    }
    public String getAlamat(){ // method get
        return this.Alamat;
    }
    
    public void setTelp (Integer NOP){ // method set
        this.Telp=Telp;
    }
    public Integer getTelp(){ // method get
        return this.Telp;
    }
    
}
