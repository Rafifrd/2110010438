/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Penjualan;

/**
 *
 * @author Acer
 */
public class Harga {
    private String Id_Kategori;
    private String Id_Provider;
    private String Id_Nominal;
    private String Id_Harga;
    private String Nama_Harga;
    
    
    public Harga(){}
    
    public Harga(String a){
        setId_Kategori(a);
    }
    
    public Harga(String a, String b){
        setId_Kategori(a);
        setId_Provider(b);
    }
    
    public Harga(String a, String b, String c){
        setId_Kategori(a);
        setId_Provider(b);
        setId_Nominal(c);
    }
    
        public Harga(String a, String b, String c, String d){
        setId_Kategori(a);
        setId_Provider(b);
        setId_Nominal(c);
        setId_Harga(d);
    }
        public Harga(String a, String b, String c, String d,String e){
        setId_Kategori(a);
        setId_Provider(b);
        setId_Nominal(c);
        setId_Harga(d);
        setNama_Harga(e);
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
    
     public void setId_Nominal (String c){
        this.Id_Nominal=c;
    }
    public String getId_Nominal(){
        return this.Id_Nominal;
    }
    public void setId_Harga (String d){
        this.Id_Harga=d;
    }
    public String getId_Harga(){
        return this.Id_Harga;
    }
    public void setNama_Harga (String d){
        this.Nama_Harga=d;
    }
    public String getNama_Harga(){
        return this.Nama_Harga;
    }
    
    public String dataHarga(){
        return getId_Kategori()+getId_Provider()+getId_Nominal()+getId_Harga()+getNama_Harga(); 
    }
    
    public String dataHarga(String a,String b,String c,String d, String e){
        setId_Kategori(a);
        setId_Provider(b);
        setId_Nominal(c);
        setId_Harga(d);
        setNama_Harga(e);
        
        return getId_Kategori()+getId_Provider()+getId_Nominal()+getId_Harga()+getNama_Harga();
    }
}
