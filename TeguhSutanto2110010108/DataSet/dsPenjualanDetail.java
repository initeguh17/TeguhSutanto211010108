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
public class dsPenjualanDetail {
    private ArrayList<Integer> NoTransaksi;
    private ArrayList<Integer> KodeProduk;
    private ArrayList<Integer> HargaSatuan;
    private ArrayList<Integer> QTY;
    
public dsPenjualanDetail() {
    NoTransaksi = new ArrayList<Integer>();
    KodeProduk = new ArrayList<Integer>();
    HargaSatuan = new ArrayList<Integer>();
    QTY = new ArrayList<Integer>();
    }
    
    public void NoTransaksi(Integer value){
        NoTransaksi.add(value);
    }
    public ArrayList<Integer> getDataSetNoTransaksi(){
        return this.NoTransaksi;
    }
    public void KodeProduk(Integer value){
        KodeProduk.add(value);
    }
    public ArrayList<Integer> getDataSetKodeProduk(){
        return this.KodeProduk;
    }
    public void HargaSatuan(Integer value){
        HargaSatuan.add(value);
    }
    public ArrayList<Integer> getDataSetHargaSatuan(){
        return this.HargaSatuan;
    }
    public void QTY(Integer value){
        QTY.add(value);
    }
    public ArrayList<Integer> getDataSetQTY(){
        return this.QTY;
    }
    public void tambahData(int notransaksi, int kodeproduk, int hargasatuan, int qty){
        this.NoTransaksi.add(notransaksi);
        this.KodeProduk.add(kodeproduk);
        this.HargaSatuan.add(hargasatuan);
        this.QTY.add(qty);
    }
}
