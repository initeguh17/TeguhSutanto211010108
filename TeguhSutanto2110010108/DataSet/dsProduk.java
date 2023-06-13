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
public class dsProduk {
    private ArrayList<Integer> KodeProduk;
    private ArrayList<String> Kategori;
    private ArrayList<String> NamaProduk;
    private ArrayList<Integer> Harga;
    private ArrayList<Integer> Stok;
    
public dsProduk() {
    KodeProduk = new ArrayList<Integer>();
    Kategori = new ArrayList<String>();
    NamaProduk = new ArrayList<String>();
    Harga = new ArrayList<Integer>();
    Stok = new ArrayList<Integer>();
    }

    public void KodeProduk(Integer value){
        KodeProduk.add(value);
    }
    public ArrayList<Integer> getDataSetKodeProduk(){
        return this.KodeProduk;
    }
    
    public void Kategori(String value){
        Kategori.add(value);
    }
    public ArrayList<String> getDataSetKategori(){
       return this.Kategori;
    }
    
    public void NamaProduk(String value){
        NamaProduk.add(value);
    }
    public ArrayList<String> getDataSetNamaProduk (){
        return this.NamaProduk;
    }
    
    public void Harga(Integer value){
        Harga.add(value);
    }
    public ArrayList<Integer> getDataSetHarga (){
        return this.Harga;
    }
    
    public void Stok(Integer value){
        Stok.add(value);
    }
    public ArrayList<Integer> getDataSetStok (){
        return this.Stok;
    }
    
    public void dsProduk (int kodeproduk, String kategori, String namaproduk, int harga, int stok){
        this.KodeProduk.add(kodeproduk);
        this.Kategori.add(kategori); 
        this.NamaProduk.add(namaproduk); 
        this.Harga.add(harga); 
        this.Stok.add(stok); 
    }
}
