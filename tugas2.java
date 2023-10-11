/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class tugas2 {
     public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Angka Ganjil");
        System.out.print("Masukkan Angka = ");   
         int n = s.nextInt();
      if (n < 1) return;
    int i = 1;
    do {
        System.out.print(" "+i);
        i += 2;
    } while (i <= n);
}
}
