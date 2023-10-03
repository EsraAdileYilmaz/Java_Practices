package day04;

import java.util.Scanner;

public class P02_NestedIfElse {

    public static void main(String[] args) {

         /*
     SORU:Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
          kullaniciya musteri karti olup olmadigini sorun.
          Musteri karti varsa 10 urunden fazla alirsa %20,
          yoksa %15 indirim yapin,
          Musteri karti yoksa 10 urunden fazla  alirsa %15,
         yoksa %10 indirim yapin
       */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen aldiginiz urun adedini giriniz");
        int urunAdedi=scanner.nextInt();

        System.out.println("Lutfen aldiginiz urunun liste fiyatini giriniz.");
        double urunFiyati=scanner.nextDouble();

        System.out.println("Lutfen musteri kartinizin olup olmadigini giriniz." +
                "\nEvet:E Hayir:H");
        char musteriKart=scanner.next().charAt(0);

        //ANA DEGISKEN musteri karti olsun;

        if( musteriKart=='E'|| musteriKart=='e'){

            if(urunAdedi> 10){
                System.out.println("%20 indirimli urun fiyati: " +(urunAdedi*urunFiyati)*0.8);
            }else{ //urunAdedi<10
                System.out.println("%15 indirimli urun fiyati: " +(urunAdedi*urunFiyati)*0.85);
            }
        } else if ( musteriKart=='H'|| musteriKart=='h' ) {

            if(urunAdedi> 10){
                System.out.println("%15 indirimli urun fiyati: " +(urunAdedi*urunFiyati)*0.85);
            }else { //urunAdedi<10
                System.out.println("%10 indirimli urun fiyati: " +(urunAdedi*urunFiyati)*0.90);
            }
        }
    }
}
