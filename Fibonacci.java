package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        if(sayi > 2){
            int[] dizi = new int[sayi];
            dizi[0] = 1;
            dizi[1] = 1;
            for(int i = 2; i<dizi.length; i++){
                dizi[i] = dizi[i-1] + dizi[i-2];
            }

            for(int i = 0; i<dizi.length; i++){
                System.out.println(dizi[i]);
            }
        }else{
            System.out.println("Fibonacci Dizisinin İlk İki Elemanı 1'dir.");
        }
    }
}
