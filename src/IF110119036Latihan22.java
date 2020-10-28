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

public class IF110119036Latihan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int Diameter;
        double Jari,Luas,Keliling;
        
        System.out.println("======== Perhitungan Lingkara n========");
        System.out.println("Masukkan Nilai Diameter Lingkaran :  ");
        Diameter = input.nextInt();
        input.nextLine();
        
        Jari = Diameter * 1/2;
        Luas = Diameter * Diameter * 1/4 * 3.14;
        Keliling = Diameter * 3.14;
        
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-Jari Lingkaran = " + Jari + " cm");
        System.out.println("Luas Lingkaran = " + Luas + " cm");
        System.out.println("Keliling Lingkaran = " + Keliling + " cm");
    }
    
}
