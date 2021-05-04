package com.company;

import java.util.Scanner;

public class Salyangoz {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int neredeyiz = 1;
        int[][] tablo = new int[sayi][sayi];
        for(int satir = 0; satir < sayi; satir++){
            if(satir%2 == 0){
                for(int sutun = 0; sutun<sayi; sutun++){
                    tablo[satir][sutun] = neredeyiz;
                    neredeyiz++;
                }
            }else{
                for(int sutun = sayi-1; sutun >= 0; sutun--){
                    tablo[satir][sutun] = neredeyiz;
                    neredeyiz++;
                }
            }
        }

        for(int satir = 0; satir<sayi; satir++){
            for(int sutun = 0; sutun<sayi; sutun++){
                System.out.print(tablo[satir][sutun]+"   ");
            }
            System.out.println("");
        }
    }
}
