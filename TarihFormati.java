package com.company;

import java.util.Scanner;

public class TarihFormati {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Örnek Format: 26/01/2000");
        System.out.print("Tarih Giriniz: ");
        String tarih = scanner.nextLine();
        int cizgisayi = 0;
        for(int i = 0; i < tarih.length(); i++){
            if(tarih.charAt(i) == '/'){
                cizgisayi++;
            }
        }
        if(cizgisayi == 2){
            String[] tarihi = tarih.split("/");
            System.out.println(tarihi[2]+"/"+tarihi[1]+"/"+tarihi[0]);
        }else{
            System.out.println("Tarih Formatı Hatalı");
        }
    }
}
