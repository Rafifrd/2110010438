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
 public class dataSetKategori {
    
 private ArrayList<Integer> idkategori;
 private ArrayList<String> nama_kategori;

  public dataSetKategori() {
        idkategori = new ArrayList<Integer> ();
        nama_kategori = new ArrayList<String> ();
    }

 public void insertidkategori(Integer i){
        this.idkategori.add(i);
    }
 public ArrayList<Integer> getRecordidkategori(){
        return this.idkategori;
    }
 public void insertnama_kategori(String i){
        this.nama_kategori.add(i);
    }
 public ArrayList<String> getRecordnama_kategori(){
        return this.nama_kategori;
    }
    
    

 
    }