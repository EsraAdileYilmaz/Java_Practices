package day05;

import java.util.Scanner;

public class P06_forLoop {

    public static void main(String[] args) {

        //SORU:Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin= scanner.nextLine();

        String tersMetin="";

        for (int i = metin.length()-1; i >= 0 ; i--) {

            tersMetin += metin.substring(i,i+1);
        }

        metin=tersMetin;
        System.out.println(metin);

        /*
          HOCA'NIN COZUMU=
         for (int i = metin.length(); i > 0 ; i--) {

            tersMetin += metin.substring(i-1,i);
            // tersMetin.append(metin.charAt(i - 1)); yapilabilir

        }
        metin = tersMetin;
        System.out.println(metin);
         */

    }
}
