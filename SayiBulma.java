package com.company;

public class SayiBulma {
    public static void main(String args[]){
        int[] dizi = new int[]{1,3,4,5,6,7,8,9};
        int aranacak = 0;
        if(SayiBul(dizi,aranacak)){
            System.out.println("Sayı Dizide Bulundu");
        }else{
            System.out.println("Sayı Dizide Bulunamadı");
        }
    }
    public static boolean SayiBul(int[] dizi, int aranacak){
        boolean varmi = false;
        for(int i = 0; i < dizi.length; i++){
            if(dizi[i] == aranacak){
                varmi = true;
                break;
            }
        }
        return varmi;
    }
}
