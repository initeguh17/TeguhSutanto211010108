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
public class dsJurnalDetail {
    private ArrayList<Integer> NoReferensi;
    private ArrayList<Integer> KodeAkun;
    private ArrayList<Integer> Debet;
    private ArrayList<Integer> Kredit;

public dsJurnalDetail() {
    NoReferensi = new ArrayList<Integer>();
    KodeAkun = new ArrayList<Integer>();
    Debet = new ArrayList<Integer>();
    Kredit = new ArrayList<Integer>();
    }

    public void NoReferensi(Integer value){
        NoReferensi.add(value);
    }
    public ArrayList<Integer> getDataSetNoReferensi(){
        return this.NoReferensi;
    }
    public void KodeAkun(Integer value){
        KodeAkun.add(value);
    }
    public ArrayList<Integer> getDataSetKodeAkun(){
        return this.KodeAkun;
    }
    public void Debet(Integer value){
        Debet.add(value);
    }
    public ArrayList<Integer> getDataSetDebet(){
        return this.Debet;
    }
    public void Kredit(Integer value){
        Kredit.add(value);
    }
    public ArrayList<Integer> getDataSetKredit(){
        return this.Kredit;
    }
    public void tambahData(int noreferensi, int kodeakun, int debet, int kredit){
        this.NoReferensi.add(noreferensi);
        this.KodeAkun.add(kodeakun);
        this.Debet.add(debet);
        this.Kredit.add(kredit);
    }
}

