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
public class dataSetUser {
    
    private ArrayList<Integer> id;
    private ArrayList<String> username;
    private ArrayList<String> password;

    public dataSetUser() {
        id = new ArrayList<Integer> ();
        username = new ArrayList<String> ();
        password = new ArrayList<String> ();
    }

    public void insertid(Integer i){
        this.id.add(i);
    }
    public ArrayList<Integer> getRecordid(){
        return this.id;
    }
    public void insertusername(String i){
        this.username.add(i);
    }
    public ArrayList<String> getRecordusername(){
        return this.username;
    }
    public void insertpassword(String i){
        this.password.add(i);
    }
    public ArrayList<String> getRecordSpassword(){
        return this.password;
    }
    
}