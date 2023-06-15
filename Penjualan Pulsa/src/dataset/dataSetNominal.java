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
public class dataSetNominal {
    
    private ArrayList<Integer> idkategori;
    private ArrayList<Integer> id_provider;
    private ArrayList<Integer> id_nominal;
    private ArrayList<String> nama_nominal;

    public dataSetNominal() {
        idkategori = new ArrayList<Integer> ();
        id_provider = new ArrayList<Integer> ();
        id_nominal = new ArrayList<Integer> ();
        nama_nominal = new ArrayList<String> ();
    }

    public void insertidkategori(Integer i){
        this.idkategori.add(i);
    }
    public ArrayList<Integer> getRecordidkategori(){
        return this.idkategori;
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
    public void insertnama_nominal(String i){
        this.nama_nominal.add(i);
    }
    public ArrayList<String> getRecordnama_nominal(){
        return this.nama_nominal;
    }
}
