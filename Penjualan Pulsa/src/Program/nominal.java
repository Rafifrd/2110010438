/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

/**
 *
 * @author acer
 */
public class nominal {
    private int id_kategori;
    private int id_provider;
    private int id_nominal;
    private String nama_nominal;
    
    // Konstruktor
    public nominal(int id_kategori, int id_provider, int id_nominal, String nama_nominal) {
        this.id_kategori = id_kategori;
        this.id_provider = id_provider;
        this.id_nominal = id_nominal;
        this.nama_nominal = nama_nominal;
    }
    
    // Getter dan setter
    public int getIdKategori() {
        return id_kategori;
    }
    
    public void setIdKategori(int id_kategori) {
        this.id_kategori = id_kategori;
    }
    
    public int getIdProvider() {
        return id_provider;
    }
    
    public void setIdProvider(int id_provider) {
        this.id_provider = id_provider;
    }
    
    public int getIdNominal() {
        return id_nominal;
    }
    
    public void setIdNominal(int id_nominal) {
        this.id_nominal = id_nominal;
    }
    
    public String getNamaNominal() {
        return nama_nominal;
    }
    
    public void setNamaNominal(String nama_nominal) {
        this.nama_nominal = nama_nominal;
    }
}