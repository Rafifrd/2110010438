/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Penjualan;

/**
 *
 * @author Acer
 */
public class Kategori {
    private String Id_Kategori;
    private String Nama_Kategori;
   
    
    
    public Kategori(){}
    
    public Kategori(String a){
        setId_Kategori(a);
    }
    
    public Kategori(String a, String b){
        setId_Kategori(a);
        setNama_Kategori(b);
    }
    
    public void setId_Kategori (String a){
        this.Id_Kategori=a;
    }
    public String getId_Kategori(){
        return this.Id_Kategori;
    }
    
     public void setNama_Kategori (String b){
        this.Nama_Kategori=b;
    }
    public String getNama_Kategori(){
        return this.Nama_Kategori;
    }
    
    public String dataKategori(){
        return getId_Kategori()+getNama_Kategori(); 
    }
    public String dataKategori(String a,String b){
        setId_Kategori(a);
        setNama_Kategori(b);
        
        return getId_Kategori()+getNama_Kategori();
    }
}
