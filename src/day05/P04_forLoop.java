package day05;

import java.util.Scanner;

public class P04_forLoop {

    public static void main(String[] args) {

        /*
         SORU:Girilen bir stringdeki a harfi sayısını bulunuz ve yazdırınız.
             Ama c harfine gelirse döngüden çıkılsın
             or:Bugün hava oldukca güzel.-> 2
         */


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        int count=0;

        for (int i = 0; i < metin.length() ; i++) {

            if(metin.toLowerCase().charAt(i) == 'a'){
                count ++;
            }
            //burada bagimsiz if'ler kullanilmalidir.
            if(metin.toLowerCase().charAt(i) == 'c'){
                break;
            }
        }

        System.out.println("Girilen metindeki c harfine kadar " + count + " adet a harfi icerir.");


    }
}
