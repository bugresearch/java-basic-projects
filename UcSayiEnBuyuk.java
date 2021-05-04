package com.company;

import java.util.Scanner;

public class UcSayiEnBuyuk {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz: ");
        int sayi3 = scanner.nextInt();

        int enbuyuk = sayi1;
        int enkucuk = sayi1;

        if(sayi2 > enbuyuk){
            enbuyuk = sayi2;
        }
        if(sayi2 < enkucuk){
            enkucuk = sayi2;
        }
        if(sayi3 > enbuyuk){
            enbuyuk = sayi3;
        }
        if(sayi3 < enkucuk){
            enkucuk = sayi3;
        }

        System.out.println("En Büyük Sayı: "+enbuyuk);
        System.out.println("En Küçük Sayı: "+enkucuk);
    }
}
