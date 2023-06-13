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
public class dsJurnal {
    private ArrayList<Integer> NoReferensi;
    private ArrayList<Integer> NoTransaksi;
    private ArrayList<Integer> TanggalTransaksi;
    private ArrayList<String> Keterangan;

public dsJurnal() {
    NoReferensi = new ArrayList<Integer>();
    NoTransaksi = new ArrayList<Integer>();
    TanggalTransaksi = new ArrayList<Integer>();
    Keterangan = new ArrayList<String>();
    }

    public void NoReferensi(Integer value){
        NoReferensi.add(value);
    }
    public ArrayList<Integer> getDataSetNoReferensi(){
        return this.NoReferensi;
    }
    public void NoTransaksi(Integer value){
        NoTransaksi.add(value);
    }
    public ArrayList<Integer> getDataSetNoTransaksi(){
        return this.NoTransaksi;
    }
    public void TanggalTransaksi(Integer value){
        TanggalTransaksi.add(value);
    }
    public ArrayList<Integer> getDataSetTanggalTransaksi(){
        return this.TanggalTransaksi;
    }
    public void Keterangan(String value){
        Keterangan.add(value);
    }
    public ArrayList<String> getDataSetKeterangan(){
        return this.Keterangan;
    }
    public void tambahData(int noreferensi, int notransaksi, int tangaltransaksi, String keterangan){
        this.NoReferensi.add(noreferensi);
        this.NoTransaksi.add(notransaksi);
        this.TanggalTransaksi.add(tangaltransaksi);
        this.Keterangan.add(keterangan);
    }
}
