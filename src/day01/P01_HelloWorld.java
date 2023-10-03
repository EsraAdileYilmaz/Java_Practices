package day01;

public class P01_HelloWorld {
    public static void main(String[] args) {

         //bir satirlik yorumlar basina 2 adet // konularak yapilir
         //ben bu java ile programlamayi en iyi sekilde ogrenecegim
         //ve bununla calismalar yapacagim.

        /*
        bu sekilde yapilan yorumlarda istedigimiz kadar satiri
        yorum olarak ifade edebiliriz.

         */

        /*
        programciligin temeli "Hello World" dur.
         */

        // print fonksiyonu
        //print fonksiyonu metinsel ifadelerin(String) ve diger  veri turlerini
        //(variable) metin olarak yazdirilmasini saglar
        //bu fonksiyonda 2 adet yazdirma olur
        // println:yazdırıp bir sonraki satıra geçer.isleme sonraki satirdan devam eder
        // print: yazdırıp aynı satırda kalıp sonraki işlemi aynı satırdan devam ettirir

        // prinln fonksiyonu
        System.out.println("Hello World");
        System.out.println("Hello Wise");

        // print foksiyonu
        System.out.print("Hello World  ");
        System.out.print("Hello Wise");

        /*
        soru1:Konsola Hello World ve "Hello World" yazdırınız.
         */

        System.out.println("\"Hello World\"");

        /*
        \n   :bir alt satirdan yazmaya baslar
       \t   :1 TAB bosluk birakir
       \”   :” yazar
       \'   :' yazar
       \\   : \ yazar
         */

        System.out.println("Hello World\t\n\"Hello wise\"");

        /*
        ÖDEV - 1
        Konsola
        “Hello  \
        ‘World’ \/”
        yazdırınız
         */

        System.out.println("\"Hello \\\'World\'\\/\"");

        /*
        Aşağıdaki gibi bir ATM karşılama ekranı yazan koda dizisini yazınız.
         **********  WISE BANK   **********
    WISE ATM’YE HOŞGELDİNİZ
    1 – Bakiye Sorgulama
    2 – Para Yatırma
    3 – Para Çekme
    4 – Bilgi Güncelleme
    5 – Kart İade
     **********  WISE BANK   **********
         */

        System.out.println("*********WISE BANK*********"+"\nWISE ATM'YE HOSGELDINIZ" +
                "\n1 - Bakiye Sorgulama "+"\n2 – Para Yatırma" +"\n3 – Para Çekme" +
                "\n4 – Bilgi Güncelleme" +"\n5 – Kart İade" +
                "\n*********WISE BANK*********");




    }
}
