package com.company;

import java.util.Scanner;

public class HarfNotu {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Not Giriniz: ");
        int not = scanner.nextInt();
        if(not >= 0 && not <= 100){
            String harfnotu;
            if(not >= 90){
                harfnotu = "A";
            }else if(not >= 80){
                harfnotu = "B";
            }else if(not >= 70){
                harfnotu = "C";
            }else{
                harfnotu = "F";
            }

            System.out.println("Harf Notunuz: "+harfnotu);
        }else{
            System.out.println("Notunuz 0-100 aralığında tam sayı olmalıdır.");
        }
    }
}
