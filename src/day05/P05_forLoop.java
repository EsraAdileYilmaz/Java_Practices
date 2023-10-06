package day05;

import java.util.Scanner;

public class P05_forLoop {

    public static void main(String[] args) {


        // Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen toplanmak uzere 5 adet pozitif tamsayi giriniz");
        /*
        BENIM COZUMUM=

        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();
        int sayi4= scanner.nextInt();
        int sayi5= scanner.nextInt();

        int toplam=0;
       for (int i = sayi1; i < sayi5 ; i++) {

            if(!(5<= i && i<= 10)){

                toplam+=i;
            }
        }
        System.out.println("Girilen sayilarin toplami: "+ toplam);
      */

        //continue;==>kullanilirsa (birsey yapmadan isleme devam et) demektir.
        //continue'den sonraki islemler direk atlanir.Donguye devam edilir.
        //if (sayi >= 5 && sayi <= 10){
        //                continue; Bu sarti gorunce hicbisey yapmada isleme devam et demek.

        int sayi = 0;
        int toplam = 0;

        for (int i = 1; i < 5; i++) {
            System.out.print(i + ".sayiyi giriniz : ");
            sayi = scanner.nextInt();
            if (sayi >= 5 && sayi <= 10){
                continue;
            }
            toplam += sayi;
        }
        System.out.println("Toplam : " + toplam);



    }
}
