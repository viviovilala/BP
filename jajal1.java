
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class jajal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Program Angka Ganjil");
        System.out.print("Masukkan Angka = ");
        int A = s.nextInt();
        for (int i = 0; i <= A; i++) {
            if (i % 2 != 0) {
                System.out.print(" " +i);
            }
        }
    }
}
