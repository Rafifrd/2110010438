/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class user {
    private String namaPengguna;
    private String passPengguna;
    
    public user(){}

    public user(String nama,String pass){
        setnamaPengguna(namaPengguna);
        setpassPengguna(passPengguna);
    }
    public void setnamaPengguna(String nama){
        Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        nama = objku.nextLine();
        this.namaPengguna=nama;
    }
    public String getnamaPengguna(){
        return this.namaPengguna;
    }

    public void setpassPengguna(String pass){
        Scanner objku = new Scanner (System.in);
        System.out.println("Masukkan Password : ");
        pass = objku.nextLine();
        this.passPengguna=pass;
    }
    
    public String getpassPengguna(){
        return this.passPengguna;
    }
}