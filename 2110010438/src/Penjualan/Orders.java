/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Penjualan;

/**
 *
 * @author Acer
 */
public class Orders {
    private String User_Id;
    private String Invoice;
    private String Tanggal;
    private String Id_Provider;
    private String Id_Nominal;
    private String Tujuan;
    private String Id_Harga;
    private String Bank;
    private String Status;
   
    
    
    public Orders(){}
    
    public Orders(String a){
        setUser_Id(a);
    }
    
    public Orders(String a, String b){
        setUser_Id(a);
        setInvoice(b);
    }
    
    public Orders(String a, String b, String c){
        setUser_Id(a);
        setInvoice(b);
        setTanggal(c);
    }
    
    public Orders(String a, String b, String c, String d){
    setUser_Id(a);
    setInvoice(b);
    setTanggal(c);
    setId_Provider(d);
    }
    
        public Orders(String a, String b, String c, String d,String e){
        setUser_Id(a);
        setInvoice(b);
        setTanggal(c);
        setId_Provider(d);
        setId_Nominal(e);
        }
        
        public Orders(String a, String b, String c, String d,String e,String f){
        setUser_Id(a);
        setInvoice(b);
        setTanggal(c);
        setId_Provider(d);
        setId_Nominal(e);
        setTujuan(f);
        }
        public Orders(String a, String b, String c, String d,String e,String f,String g){
        setUser_Id(a);
        setInvoice(b);
        setTanggal(c);
        setId_Provider(d);
        setId_Nominal(e);
        setTujuan(f);
        setId_Harga(g);
        }
        public Orders(String a, String b, String c, String d,String e,String f,String g,String h){
        setUser_Id(a);
        setInvoice(b);
        setTanggal(c);
        setId_Provider(d);
        setId_Nominal(e);
        setTujuan(f);
        setId_Harga(g);
        setBank(h);
        }
        public Orders(String a, String b, String c, String d,String e,String f,String g,String h,String i){
        setUser_Id(a);
        setInvoice(b);
        setTanggal(c);
        setId_Provider(d);
        setId_Nominal(e);
        setTujuan(f);
        setId_Harga(g);
        setBank(h);
        setStatus(i);
        }
        
    public void setUser_Id (String a){
        this.User_Id=a;
    }
    public String getUser_Id(){
        return this.User_Id;
    }
    
     public void setInvoice (String b){
        this.Invoice=b;
    }
    public String getInvoice(){
        return this.Invoice;
    }
    
     public void setTanggal (String c){
        this.Tanggal=c;
    }
    public String getTanggal(){
        return this.Tanggal;
    }
    public void setId_Provider (String d){
        this.Id_Provider=d;
    }
    public String getId_Provider(){
        return this.Id_Provider;
    }
    
        public void setId_Nominal (String e){
        this.Id_Nominal=e;
    }
    public String getId_Nominal(){
        return this.Id_Nominal;
    }
        public void setTujuan (String f){
        this.Tujuan=f;
    }
    public String getTujuan(){
        return this.Tujuan;
    }
        public void setId_Harga (String g){
        this.Id_Harga=g;
    }
    public String getId_Harga(){
        return this.Id_Harga;
    }
        public void setBank (String h){
        this.Bank=h;
    }
    public String getBank(){
        return this.Bank;
    }
        public void setStatus (String i){
        this.Status=i;
    }
    public String getStatus(){
        return this.Status;
    }
    
    public String dataOrders(){
        return getUser_Id()+getInvoice()+getTanggal()+getId_Provider()+getId_Nominal()+getTujuan()+getId_Harga()+getBank()+getStatus(); 
    }
    
    public String dataOrders(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setUser_Id(a);
        setInvoice(b);
        setTanggal(c);
        setId_Provider(d);
        setId_Nominal(e);
        setTujuan(f);
        setId_Harga(g);
        setBank(h);
        setStatus(i);
        
        return getUser_Id()+getInvoice()+getTanggal()+getId_Provider()+getId_Nominal()+getTujuan()+getId_Harga()+getBank()+getStatus();
}
}
