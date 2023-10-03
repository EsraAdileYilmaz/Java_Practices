package day03;

import java.util.Scanner;

public class P01_DataCasting {
    public static void main(String[] args) {

          /*
      1-Double olarak verilen 3 sayının toplamını int olarak yazdırın
      ipucu: double>float>long>int>short>byte
      */

        double a=3, b=7, c=3.12;
        int toplam=0;
        toplam=(int)(a+b+c);
        System.out.println(toplam);

        /*
        2- Kullanıcidan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
            Girdiğiniz harf :
            Girdiğiniz harften sonraki  3 harf :
        şeklinde yazdırın.
        ipucu: char
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char girilenHarf=scanner.next().charAt(0);
        System.out.println("Girilen harf : " + girilenHarf);
        System.out.println("Girilen harften sonraki uc harf: " +(char)(girilenHarf+1)+" "+
                (char)(girilenHarf+2)+" " +(char)(girilenHarf+3));








    }
}
