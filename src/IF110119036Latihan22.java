/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alfi Nurizkya
 * Nama  : ALFI NURIZKYA
 * Kelas : IF-1
 * NIM   : 10119036
 * Deskripsi Program : Program Menentukan Lingkaran
 */

import java.util.Scanner;
import java.lang.Math;

public class IF110119036Latihan22 {    
    static Scanner scan = new Scanner(System.in);
    static final double pi = Math.PI;    
    double diameter;    
    /**
     * @param args the command line arguments
     */    
    private void validasi(String diameter){
       if(!diameter.matches("^[0-9]*$")){
            System.out.println("Nilai Diameter Tidak Sesuai");
            masukkanDiameterLingkaran();       
       }else{
           this.diameter = Double.parseDouble(diameter);
       }                 
    }   
    
    private void masukkanDiameterLingkaran(){
        System.out.println("=====Perhitungan Lingkaran=====");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        validasi(scan.next());                          
    }
        
    private double hitungLuasLingkaran(){                
        return pi * Math.pow(diameter, 2);
    }
    
    private double hitungJariJariLingkaran(double luas){        
        return Math.sqrt(luas / pi);
    }
    
    private double kelilingLingkaran(double jariJari){
        return 2 * pi * jariJari;
    }
    
    private static void tampilHasil(double luas, double jariJari, double keliling){   
        System.out.println("\n====Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = "+jariJari+" cm");
        System.out.println("Luas Lingkaran = "+luas+" cm");
        System.out.println("Keliling Lingkaran = "+keliling+" cm");
    }
    
    
    public static void main(String[] args) {
        IF110119036Latihan22 data = new IF110119036Latihan22();
        data.masukkanDiameterLingkaran();            
        double luas = data.hitungLuasLingkaran();
        double jariJari = data.hitungJariJariLingkaran(luas);
        double keliling = data.kelilingLingkaran(jariJari);
        tampilHasil(luas,jariJari,keliling);
        System.out.println("Developed by : Alfi Nurizkya");
        
    }
    }
    

