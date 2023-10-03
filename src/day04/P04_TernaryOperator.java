package day04;

import java.util.Scanner;

public class P04_TernaryOperator {

    public static void main(String[] args) {

          /*
         SORU: Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
               kucukse "Maalesef kaldin" yazdirin.
         */


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double not= scanner.nextDouble();

        System.out.println(not >=50 ? "Sinifi " +not+" ortalama ile gectiniz" : "Maalesef kaldiniz.");


    }
}
