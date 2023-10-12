package day05;

import java.util.Scanner;

public class P11_Devoir4 {

    public static void main(String[] args) {

       /*
    Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
    Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı,
    kendisine eşitse o sayi mükemmeldir.
    ORNEK:
    INPUT     : 6
    OUTPUT : 1,2,3
                  1+2+3 = 6 = 6 (Mükemmel)

                  mukemmel sayi kontrolu
                  1. kullanicidan sayi alalim
                  2. bir toplam degiskeni olusturuyoruz
                  3. sayinin bolenleri bul
                  4. bolenleri toplamla topla
                  5. sayiyla toplamin esitligini kontrol et

    */

        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz");
        int sayi= scanner.nextInt();

        mukemmelSayi(6);



    }

    public static void mukemmelSayi(int sayi){

        int toplam=0;

        for (int i = 1; i < sayi ; i++) {
             if(sayi % i ==0){
                 toplam +=i;
             }
        }

        if(toplam == sayi){
            System.out.println("Bu sayi mukemmel sayidir");
        }else{
            System.out.println("Bu sayi mukemmel sayi deildir");
        }
    }
}
