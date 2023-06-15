/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class dataSetOrder {
       
    private ArrayList<Integer> user_id;
    private ArrayList<String> invoice;
    private ArrayList<String> tanggal;
    private ArrayList<Integer> id_provider;
    private ArrayList<Integer> id_nominal;
    private ArrayList<String> tujuan;
    private ArrayList<Integer> id_harga;
    private ArrayList<String> bank;
    private ArrayList<String> status;

    public dataSetOrder() {
        user_id = new ArrayList<Integer> ();
        invoice = new ArrayList<String> ();
        tanggal = new ArrayList<String> ();
        id_provider = new ArrayList<Integer> ();
        id_nominal = new ArrayList<Integer> ();
        tujuan = new ArrayList<String> ();
        id_harga = new ArrayList<Integer> ();
        bank = new ArrayList<String> ();
        status = new ArrayList<String> ();
    }

    public void insertuser_id(Integer i){
        this.user_id.add(i);
    }
    public ArrayList<Integer> getRecorduser_id(){
        return this.user_id;
    }
    public void insertinvoice(String i){
        this.invoice.add(i);
    }
    public ArrayList<String> getRecordinvoice(){
        return this.invoice;
    }
    public void inserttanggal(String i){
        this.tanggal.add(i);
    }
    public ArrayList<String> getRecordtanggal(){
        return this.tanggal;
    }
    public void insertid_provider(Integer i){
        this.id_provider.add(i);
    }
    public ArrayList<Integer> getRecordid_provider(){
        return this.id_provider;
    }
    public void insertid_nominal(Integer i){
        this.id_nominal.add(i);
    }
    public ArrayList<Integer> getRecordid_nominal(){
        return this.id_nominal;
    }
    public void inserttujuan(String i){
        this.tujuan.add(i);
    }
    public ArrayList<String> getRecordtujuan(){
        return this.tujuan;
    }
    public void insertid_harga(Integer i){
        this.id_harga.add(i);
    }
    public ArrayList<Integer> getRecordid_harga(){
        return this.id_harga;
    }
    public void insertbank(String i){
        this.bank.add(i);
    }
    public ArrayList<String> getRecordbank(){
        return this.bank;
    }
    public void insertstatus(String i){
        this.status.add(i);
    }
    public ArrayList<String> getRecordstatus(){
        return this.status;
    }
}
