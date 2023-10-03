package day04;

import java.util.Scanner;

public class P01_NestedIfElse {

    public static void main(String[] args) {

        /*
      SORU: Kullanıcnın EYT li olup olmadığını tespit edin
            ve emekli olup olamayacağını yazdırın.
            Olamıyorsa kaç prim günü eksiği olduğunu yazdırın.
             KURALLAR:
            1: 1999 yılı 9. ay öncesi işe başlamış olmak,
            2: Kadınlar: 5000 prim günü, 20 yıl hizmet süresi.
            3: Erkekler: 5500 prim günü, 25 yıl hizmet süresi.
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen ise giris tarihinizi yil ve ay olarak" +
                "1999.09 seklinde giriniz");
        double girisTarihi= scanner.nextDouble();



        if(girisTarihi> 1999.09){
            System.out.println("EYT Kanun duzenlemesine tabi degilsiniz.");
        }else {

            //ANA DEGISKEN cinsiyet olsun.
            System.out.println("Lutfen cinsiyetinizi giriniz. Erkek:E Kadin:K");
            char cinsiyet=scanner.next().charAt(0);

            System.out.println("Lutfen prim odeme gun sayinizi giriniz");
            int primGun=scanner.nextInt();

            System.out.println("Lutfen hizmet yilinizi giriniz");
            int hizmetYili=scanner.nextInt();

            if (cinsiyet == 'E' || cinsiyet == 'e'){

                if(primGun>=5500 && hizmetYili>= 25){
                    System.out.println("Kanun yururluge girdigi tarihte emekli olabilirsiniz");
                } else if (primGun<5500 && hizmetYili>= 25) {
                    System.out.println("Emekli olabilmek icin " + (5500-primGun) + " gun prim odemelisiniz.");
                } else if (primGun >=5500 && hizmetYili <25) {
                    System.out.println("Emekli olabilmek icin " + (25-hizmetYili) +" yil daha calismalisiniz.");
                }else {
                    System.out.println("Maalesef henuz EYT sartlarinin ikisinide saglamiyorsunuz.");
                    System.out.println("Hizmet suresi eksigi: " +(25-hizmetYili) +" yil");
                    System.out.println("Eksik prim gun sayisi: " +(5500-primGun) +" gun");
                }
            } else if (cinsiyet == 'K' || cinsiyet == 'k') {

                if(primGun>=5000 && hizmetYili>= 20){
                    System.out.println("Kanun yururluge girdigi tarihte emekli olabilirsiniz");
                } else if (primGun<5000 && hizmetYili>= 20) {
                    System.out.println("Emekli olabilmek icin " + (5000-primGun) + " gun prim odemelisiniz.");
                } else if (primGun >=5000 && hizmetYili <20) {
                    System.out.println("Emekli olabilmek icin " + (20-hizmetYili) +" yil daha calismalisiniz.");
                }else {
                    System.out.println("Maalesef henuz EYT sartlarinin ikisinide saglamiyorsunuz.");
                    System.out.println("Hizmet suresi eksigi: " +(20-hizmetYili) +" yil");
                    System.out.println("Eksik prim gun sayisi: " +(5000-primGun) +" gun");
                }
            }else {
                System.out.println("Yanlis bir deger girdiniz.");
            }
        }
















    }
}
