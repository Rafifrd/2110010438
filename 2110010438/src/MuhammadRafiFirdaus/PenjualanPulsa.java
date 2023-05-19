/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MuhammadRafiFirdaus;

import Penjualan.*;
/**
 *
 * @author Acer
 */
public class PenjualanPulsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    User objku = new User();
    System.out.println("Data User : " + objku.dataUser("Muhammad  ", "Rafi ", "firdaus"));
    
    Orders objku2 = new Orders();
    System.out.println("Data Orders : " + objku2.dataOrders("01 ", "total harga ", "23032003 ","telkomsel ","1000 ","pulsa ","1000 ","BCA ","aktif "));

    Harga objku3 = new Harga();
    System.out.println("Data Harga : " + objku3.dataHarga("","","","",""));
    
    Nominal objku4 = new Nominal();
    System.out.println("Data Nominal : " + objku4.dataNominal("","","",""));
        
    Provider objku5 = new Provider();
    System.out.println("Data Provider : " + objku5.dataProvider("","",""));
     
    Kategori objku6 = new Kategori();
    System.out.println("Data Kategori : " + objku6.dataKategori("",""));
        
        
        
    }
}