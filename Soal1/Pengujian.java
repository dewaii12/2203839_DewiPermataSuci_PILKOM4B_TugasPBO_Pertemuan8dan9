/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;

public class Pengujian {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input sisi 1 : ");
        double side1 = input.nextDouble();
        System.out.println("Input sisi 2 : ");
        double side2 = input.nextDouble();
        System.out.println("Input sisi 3 : ");
        double side3 = input.nextDouble();
        
        System.out.println("Input Warna : ");
        String warna = input.next();
        System.out.println("Terisi atau tidak (true/false) : ");
        boolean isi = input.nextBoolean();
        
        Segitiga segitiga = new Segitiga(side1, side2, side3, warna, isi);
        
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.getIsi());
    }
}
