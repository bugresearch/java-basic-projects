package com.company;

import java.util.Scanner;

public class TersKosegen {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        if(sayi >= 2){
            int[][] dizi = new int[sayi][sayi];
            for(int i = 0; i<sayi; i++){
                dizi[i][sayi-1-i] = 1;
            }

            for(int a = 0; a < sayi; a++){
                for(int b = 0; b < sayi; b++){
                    System.out.print(dizi[a][b]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Sayı 1'den büyük olmalıdır.");
        }
    }
}
