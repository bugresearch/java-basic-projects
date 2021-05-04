package com.company;

import java.util.Scanner;

public class DortIslem {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.print("Sayı Giriniz: ");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;
        int carpim = sayi1 * sayi2;
        double bolme = (double)sayi1 / sayi2;

        System.out.println(sayi1+" + "+sayi2+" = "+toplam);
        System.out.println(sayi1+" - "+sayi2+" = "+fark);
        System.out.println(sayi1+" x "+sayi2+" = "+carpim);
        System.out.println(sayi1+" / "+sayi2+" = "+bolme);

    }
}
