package com.company;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();
        int kombinasyon = kombinasyon(sayi1,sayi2);
        System.out.println("C("+sayi1+","+sayi2+") = "+kombinasyon);
    }
    public static int kombinasyon(int sayi1, int sayi2){
        int kombinasyon = faktoriyel(sayi1) / (faktoriyel(sayi2)*faktoriyel(sayi1-sayi2));
        return kombinasyon;
    }
    public static int faktoriyel(int sayi){
        if(sayi == 1){
            return 1;
        }else{
            return sayi*faktoriyel(sayi-1);
        }
    }
}
