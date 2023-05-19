/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Penjualan;

/**
 *
 * @author Acer
 */
public class User {
    private String Id;
    private String Username;
    private String Password;
    
    
    public User(){}
    
    public User(String a){
        setId(a);
    }
    
    public User(String a, String b){
        setId(a);
        setUsername(b);
    }
    
    public User(String a, String b, String c){
        setId(a);
        setUsername(b);
        setPassword(c);
    }
    
    
    public void setId (String a){
        this.Id=a;
    }
    public String getId(){
        return this.Id;
    }
    
     public void setUsername (String b){
        this.Username=b;
    }
    public String getUsername(){
        return this.Username;
    }
    
     public void setPassword (String c){
        this.Password=c;
    }
    public String getPassword(){
        return this.Password;
    }
    
    public String dataUser(){
        return getId()+getUsername()+getPassword(); 
    }
    
    public String dataUser(String a,String b,String c){
        setId(a);
        setUsername(b);
        setPassword(c);
        
        return getId()+getUsername()+getPassword();
    }
}

