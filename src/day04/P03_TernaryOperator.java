package day04;

import java.util.Scanner;

public class P03_TernaryOperator {

    public static void main(String[] args) {

         /*
        SORU:Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
             “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
       */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini giriniz.");
        double kenar1= scanner.nextDouble();
        double kenar2=scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        // Ternary operator'de if=? ile else=: ile ifade edilir.

        System.out.println(kenar1==kenar2 && kenar1==kenar3&& kenar1>0 ?
                "Ucgen eskenar ucgendir" : "Ucgen eskenar ucgen degildir");

        /*
        2.COZUM YOLU:

         System.out.println(kenar1>0&&kenar2>0&&kenar3>0?
                        kenar1==kenar2 && kenar2==kenar3 ? "Üçgen Eşkenar Üçgendir"
                        :"Üçgen Eşkenar Üçgen Değildir."
                        :"Yanlış değer girdiniz");

         */
    }
}
