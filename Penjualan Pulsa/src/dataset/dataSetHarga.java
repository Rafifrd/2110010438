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

public class dataSetHarga {
    
    private ArrayList<Integer> idkategori;
    private ArrayList<Integer> id_provider;
    private ArrayList<Integer> id_nominal;
    private ArrayList<Integer> id_harga;
    private ArrayList<String> nama_harga;

    public dataSetHarga() {
        idkategori = new ArrayList<Integer> ();
        id_provider = new ArrayList<Integer> ();
        id_nominal = new ArrayList<Integer>();
        id_harga = new ArrayList<Integer> ();
        nama_harga = new ArrayList<String> ();
        
    
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
    public void insertid_harga(Integer i){
        this.id_harga.add(i);
    }
    public ArrayList<Integer> getRecordid_harga(){
        return this.id_harga;
    }
    public void insertnama_harga(String i){
        this.nama_harga.add(i);
    }
    public ArrayList<String> getRecordnama_harga(){
        return this.nama_harga;
    }
    

    

    
    
    
    
}
