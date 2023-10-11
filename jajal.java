
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class jajal {
     public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       System.out.println("Persegi Angka");
       System.out.print("Masukkan Angka = ");
       int N = s.nextInt();
       for(int i = 0; i <= N; i++) {
           for(int k = 1; k <=i; k++) {
               System.out.print(" "+k);
           } System.out.println(" ");
       }
     } 
}
