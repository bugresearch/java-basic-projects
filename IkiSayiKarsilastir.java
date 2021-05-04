package com.company;

import java.util.Scanner;

public class IkıSayiKarsilastir {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();

        if(sayi1 > sayi2){
            System.out.println("Birinci Sayı İkinci Sayıdan Büyüktür");
        }else if(sayi2 > sayi1){
            System.out.println("İkinci Sayı Birinci Sayıdan Büyüktür");
        }else{
            System.out.println("İki Sayı Birbirine Eşittir");
        }
    }
}
