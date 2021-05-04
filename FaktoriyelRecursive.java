package com.company;

import java.util.Scanner;

public class FaktoriyelRecursive {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        int faktoriyel = faktoriyel(sayi);
        System.out.println(sayi+"! = "+faktoriyel);
    }

    public static int faktoriyel(int sayi){
        if(sayi == 1){
            return 1;
        }else{
            return sayi*faktoriyel(sayi-1);
        }
    }
}
