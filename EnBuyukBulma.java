package com.company;

import java.util.Scanner;

public class EnBuyukBulma {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç Tane Sayıyı Karşılaştıracaksınız: ");
        int kactane = scanner.nextInt();
        if(kactane > 0){
            int[] dizi = new int[kactane];
            for(int i = 0; i < dizi.length; i++){
                System.out.print("Sayı Girin: ");
                int sayi = scanner.nextInt();
                dizi[i] = sayi;
            }

            int enbuyuk = dizi[1];
            int enkucuk = dizi[1];

            for(int i = 0; i < dizi.length; i++){
                if(i > enbuyuk){
                    enbuyuk = i;
                }
                if(i < enkucuk){
                    enkucuk = i;
                }
            }

            System.out.println("En Büyük Sayı: "+enbuyuk);
            System.out.println("En Küçük Sayı: "+enkucuk);
        }else{
            System.out.println("0'dan büyük bir değer giriniz.");
        }
    }
}
