package com.company;

import java.util.Scanner;

public class ArkadasSayi {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int sayi2 = scanner.nextInt();
        if(Arkadasmi(sayi1,sayi2)){
            System.out.println("Bu iki sayı arkadaştır");
        }else{
            System.out.println("Bu iki sayı arkadaş değildir.");
        }
    }
    public static boolean Arkadasmi(int sayi1, int sayi2){
        if(sayi1 == BolenToplami(sayi2) && sayi2 == BolenToplami(sayi1)){
            return true;
        }else{
            return false;
        }
    }

    public static int BolenToplami(int sayi){
        int bolentoplami = 0;
        for(int i = 1; i < sayi; i++){
            if(sayi%i == 0){
                bolentoplami = bolentoplami+i;
            }
        }
        return bolentoplami;
    }
}
