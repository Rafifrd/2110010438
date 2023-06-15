/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

/**
 *
 * @author acer
 */
public class harga {
    private int id_kategori;
    private int id_provider;
    private int id_nominal;
    private int id_harga;
    private String nama_harga;
    
    // Konstruktor
    public harga(int id_kategori, int id_provider, int id_nominal, int id_harga, String nama_harga) {
        this.id_kategori = id_kategori;
        this.id_provider = id_provider;
        this.id_nominal = id_nominal;
        this.id_harga = id_harga;
        this.nama_harga = nama_harga;
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
    
    public int getIdHarga() {
        return id_harga;
    }
    
    public void setIdHarga(int id_harga) {
        this.id_harga = id_harga;
    }
    
    public String getNamaHarga() {
        return nama_harga;
    }
    
    public void setNamaHarga(String nama_harga) {
        this.nama_harga = nama_harga;
    }
}