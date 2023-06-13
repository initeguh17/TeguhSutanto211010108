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
public class dsDataAkun {
    private ArrayList<Integer> KodeAkun;
    private ArrayList<String> NamaAkun;
    private ArrayList<String> JenisAkun;
    private ArrayList<Integer> SaldoNormal;

public dsDataAkun(){
    KodeAkun = new ArrayList<Integer>();
    NamaAkun = new ArrayList<String>();
    JenisAkun = new ArrayList<String>();
    SaldoNormal = new ArrayList<Integer>();
    }

    public void KodeAkun(Integer value){
        KodeAkun.add(value);
    }
    public ArrayList<Integer> getDataSetKodeAkun(){
        return this.KodeAkun;
    }
    public void NamaAkun(String value){
        NamaAkun.add(value);
    }
    public ArrayList<String> getDataSetNamaAkun(){
        return this.NamaAkun;
    }
    public void JenisAkun(String value){
        JenisAkun.add(value);
    }
    public ArrayList<String> getDataSetJenisAkun(){
        return this.JenisAkun;
    }
    public void SaldoNormal(Integer value){
        SaldoNormal.add(value);
    }
    public ArrayList<Integer> getDataSetSaldoNormal(){
        return this.SaldoNormal;
    }
    public void tambahData(int kodeakun, String namaakun, String jenisakun, int saldonormal){
        this.KodeAkun.add(kodeakun);
        this.NamaAkun.add(namaakun);
        this.JenisAkun.add(jenisakun);
        this.SaldoNormal.add(saldonormal);
    }
}
