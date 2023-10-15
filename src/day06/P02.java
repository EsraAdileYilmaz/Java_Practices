package day06;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {

        //SORU: Kullanıcıdan bir sayı alıp sayinin rakamları toplamını while loop ile bulunuz.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        int toplam=0;
        while(girilenSayi != 0){//girilenSayi 0'a esit olmadigi muddetce

            toplam += girilenSayi %10;
            girilenSayi /=10;
        }

        System.out.println("Girilen sayinin rakamlari toplami: "+ toplam);


    }
}
