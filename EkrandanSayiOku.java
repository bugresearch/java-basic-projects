package com.company;

import java.util.Scanner;

public class EkrandanSayiOku {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println("Girmiş Olduğunuz Sayı: "+sayi);
    }
}
