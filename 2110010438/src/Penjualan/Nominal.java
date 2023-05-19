/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Penjualan;

/**
 *
 * @author Acer
 */
public class Nominal {
    private String Id_Kategori;
    private String Id_Provider;
    private String Id_Nominal;
    private String Nama_Nominal;
    
    
    public Nominal(){}
    
    public Nominal(String a){
        setId_Kategori(a);
    }
    
    public Nominal(String a, String b){
        setId_Kategori(a);
        setId_Provider(b);
    }
    
    public Nominal(String a, String b, String c){
        setId_Kategori(a);
        setId_Provider(b);
        setId_Nominal(c);
    }
    
        public Nominal(String a, String b, String c, String d){
        setId_Kategori(a);
        setId_Provider(b);
        setId_Nominal(c);
        setNama_Nominal(d);
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
    public void setNama_Nominal (String d){
        this.Nama_Nominal=d;
    }
    public String getNama_Nominal(){
        return this.Nama_Nominal;
    }
    
    public String dataNominal(){
        return getId_Kategori()+getId_Provider()+getId_Nominal()+getNama_Nominal(); 
    }
    
    public String dataNominal(String a,String b,String c,String d){
        setId_Kategori(a);
        setId_Provider(b);
        setId_Nominal(c);
        setNama_Nominal(d);
        
        return getId_Kategori()+getId_Provider()+getId_Nominal()+getNama_Nominal();
    }
}
