/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataSet;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class dsKaryawan {
    private ArrayList<Integer> NO;
    private ArrayList<String> Nama;
    private ArrayList<String> Email;
    private ArrayList<String> Alamat;
    private ArrayList<Integer> Telp;
    
public dsKaryawan(){
    NO = new ArrayList<Integer>();
    Nama = new ArrayList<String>();
    Email = new ArrayList<String>();
    Alamat = new ArrayList<String>();
    Telp = new ArrayList<Integer>();
    }
    public void NO(Integer value){
        NO.add(value);
    }
    public ArrayList<Integer> getDataSetNO(){
        return this.NO;
    }
    public void Nama(String value){
        Nama.add(value);
    }
    public ArrayList<String> getDataSetNama(){
        return this.Nama;
    }
    public void Email(String value){
        Email.add(value);
    }
    public ArrayList<String> getDataSetEmail(){
        return this.Email;
    }
    public void Alamat(String value){
        Alamat.add(value);
    }
    public ArrayList<String> getDataSetAlamat(){
        return this.Alamat;
    }
    public void Telp(Integer value){
        Telp.add(value);
    }
    public ArrayList<Integer> getDataSetTelp(){
        return this.Telp;
    }
    
    public void tambahData(int no, String nama, String email, String alamat, int telp){
        this.NO.add(no);
        this.Nama.add(nama);
        this.Email.add(email);
        this.Alamat.add(alamat);
        this.Telp.add(telp);
    }
    
}
