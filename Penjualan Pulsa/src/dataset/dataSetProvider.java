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
public class dataSetProvider {
       
    private ArrayList<Integer> idkategori;
    private ArrayList<Integer> id_provider;
    private ArrayList<String> nama_provider;

    public dataSetProvider() {
        idkategori = new ArrayList<Integer> ();
        id_provider = new ArrayList<Integer> ();
        nama_provider = new ArrayList<String> ();
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
    public void insertnama_provider(String i){
        this.nama_provider.add(i);
    }
    public ArrayList<String> getRecordnama_provider(){
        return this.nama_provider;
    }
   
}
