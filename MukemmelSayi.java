package com.company;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        if(mukemmelmi(sayi)){
            System.out.println("Sayı Mükemmeldir");
        }else{
            System.out.println("Sayı Mükemmel Değildir");
        }
    }

    public static boolean mukemmelmi(int sayi){
        int bolentoplam = 0;
        for(int i = 1; i < sayi; i++){
            if(sayi%i == 0){
                bolentoplam = bolentoplam+i;
            }
        }

        if(bolentoplam == sayi){
            return true;
        }else{
            return false;
        }
    }
}
