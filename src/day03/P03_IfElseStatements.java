package day03;

import java.util.Scanner;

public class P03_IfElseStatements {

    public static void main(String[] args) {

           /*
    1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        85-100 -----> AA
        80-85 ------> BA
        75-80 ------> BB
        65-75 ------> CB
        50-65 ------> CC
        50 Altı ise  ------> FF
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not=scanner.nextDouble();

        if(not<0 || not>100 ){
            System.out.println("Hatali bir giris yaptiniz");
        } else if (not >=85) {
            System.out.println("AA");
        } else if (not >=80) {
            System.out.println("BA");
        } else if ( not >=75) {
            System.out.println("BB");
        } else if ( not >= 65) {
            System.out.println("CB");
        } else if ( not >= 50) {
            System.out.println("CC");
        }else {
            System.out.println("FF");
        }


        /* HOCANIN YOLU:

        //  System.out.print("Lütfen Sınav Notunuzu Sayısal Olarak Giriniz: ");
      //  int not = scan.nextInt();

      //  if (not >= 85 && not <= 100) {
      //      System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı AA");
      //  } else if (not >= 80 && not < 85) {
      //      System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı BA");
      //  } else if (not >= 75 && not < 80) {
      //      System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı BB");
      //  } else if (not >= 65 && not < 75) {
      //      System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı CB");
      //  } else if (not >= 50 && not < 65) {
      //      System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı CC");
      //  } else if (not >= 0 && not < 50) {
      //      System.out.println("Girdiğiniz " + not + " değerinin harf karşılığı FF");
      //  } else {
      //      System.out.println("Yanlış bir değer girdiniz. Lütfen 0-100 bir değer giriniz");
      //  }
         */


    }
}
