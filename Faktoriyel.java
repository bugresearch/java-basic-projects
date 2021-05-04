package com.company;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int faktoriyel = faktoriyel(sayi);
        System.out.println(sayi+"! = "+faktoriyel);
    }

    public static int faktoriyel(int sayi){
        int carpim =1;
        for(int i = 1; i < sayi+1; i++){
            carpim = carpim*i;
        }
        return carpim;
    }
}
