package com.company;

public class CarpimTablosu {
    public static void main(String args[]){
        for(int a = 0; a<10; a++){
            for(int b = 0; b<10; b++){
                int carpim = (a+1) * (b+1);
                System.out.print((a+1)+" x "+(b+1)+" = "+carpim+"   ");
            }
            System.out.println("");
        }
    }
}
