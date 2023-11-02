package day05;

public class P12_Devoir5 {

    public static void main(String[] args) {


        /*
    Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
        Sonuç böyle olmalıdır;

               *
              * *
             * * *
            * * * *
           * * * * *
            * * * *
             * * *
              * *
               *


           şeklini konsola yazdiriniz.
 */



        int sayi = 5;

        for (int i = 1; i <= sayi ; i++) {
            for (int j = 1; j <= i ; j++) {

                System.out.print("*"+ " ");

            }

            System.out.println("");
        }

        for (int i = sayi-1; i >= 1 ; i--) {
            for (int j = i; j >=1 ; j--) {

                System.out.print("*"+" ");
            }

            System.out.println("");
        }



    }
}
