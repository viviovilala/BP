/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Angka Ganjil");
        System.out.print("Masukkan Angka = ");   
         int n = s.nextInt();
         int i = 1;
             while (i <= n) {
             System.out.print(" "+i);
             i += 2;
        }
    }
    
}
