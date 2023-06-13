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
public class dsPenjualan {
    private ArrayList<Integer> NO;
    private ArrayList<Integer> Tanggal;
    private ArrayList<Integer> NOKaryawan;
    private ArrayList<Integer> TotalHarga;
    
public dsPenjualan() {
    NO = new ArrayList<Integer>();
    Tanggal = new ArrayList<Integer>();
    NOKaryawan = new ArrayList<Integer>();
    TotalHarga = new ArrayList<Integer>();
    }
    
    public void NO(Integer value){
        NO.add(value);
    }
    public ArrayList<Integer> getDataSetNO(){
        return this.NO;
    }
    public void Tanggal(Integer value){
        Tanggal.add(value);
    }
    public ArrayList<Integer> getDataSetTanggal(){
        return this.Tanggal;
    }
    public void NOKaryawan(Integer value){
        NOKaryawan.add(value);
    }
    public ArrayList<Integer> getDataSetNOKaryawan(){
        return this.NOKaryawan;
    }
    public void TotalHarga(Integer value){
        TotalHarga.add(value);
    }
    public ArrayList<Integer> getDataSetTotalHarga(){
        return this.TotalHarga;
    }
    public void tambahData(int no, int tanggal, int nokaryawan, int totalharga){
        this.NO.add(no);
        this.Tanggal.add(tanggal);
        this.NOKaryawan.add(nokaryawan);
        this.TotalHarga.add(totalharga);
    }
}
