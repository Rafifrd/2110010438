/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Penjualan;

/**
 *
 * @author Acer
 */
public class Provider {
    private String Id_Kategori;
    private String Id_Provider;
    private String Nama_Provider;
    
    
    public Provider(){}
    
    public Provider(String a){
        setId_Kategori(a);
    }
    
    public Provider(String a, String b){
        setId_Kategori(a);
        setId_Provider(b);
    }
    
    public Provider(String a, String b, String c){
        setId_Kategori(a);
        setId_Provider(b);
        setNama_Provider(c);
    }
    
    
    public void setId_Kategori (String a){
        this.Id_Kategori=a;
    }
    public String getId_Kategori(){
        return this.Id_Kategori;
    }
    
     public void setId_Provider (String b){
        this.Id_Provider=b;
    }
    public String getId_Provider(){
        return this.Id_Provider;
    }
    
     public void setNama_Provider (String c){
        this.Nama_Provider=c;
    }
    public String getNama_Provider(){
        return this.Nama_Provider;
    }
    
    public String dataProvider(){
        return getId_Kategori()+getId_Provider()+getNama_Provider(); 
    }
    
    public String dataProvider(String a,String b,String c){
        setId_Kategori(a);
        setId_Provider(b);
        setNama_Provider(c);
        
        return getId_Kategori()+getId_Provider()+getNama_Provider();
    }
}
