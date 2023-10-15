import java.util.Scanner;

public class Wise_T127_Magasin {

    //Oncelikle tum class'tan rahatlikla kullanilabilecek class levelde bir urun portfoyu cikardik.
    //Her methodda farkli degerler atanacagi icin bunlara deger atamadik.
    //Ancak java bunlara default degerler atayacaktir.

    static Scanner scanner=new Scanner(System.in);
    static String urunAdi="";
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;
    static double toplam;
    static String sepet="";
    static boolean ekUrun=false;

    public static void main(String[] args) {

        /*
         ==================== WISE T127 MARKET ===================================
        ilk programa girildiginde bizi bir menu karsilasin bu secenekler
        1 ŞARKÜTERİ ÜRÜNLERİ
        2 MANAV ÜRÜNLERİ
        3 MARKET ÜRÜNLERİ
       secime gore ,
       4-urunleri listele ve
       5-fiyatlari gelsin
       6-sonunda fis yazdırsın
         */

        girisEkrani();
    }

    public static void girisEkrani() {

        System.out.println("==================== WISE T127 MAGASIN====================");
        System.out.println("==================== H O S G E L D I N I Z ==================== ");
        System.out.println("Lutfen yapmak istediginiz islemi seciniz");
        System.out.println("Manav urunleri icin 1\nSarkuteri urunleri icin 2 \nMarket urunleri icin 3" +
                "\nFis Yazdirmak icin 4 \nCikis islemi icin 5 i tuslayin");

        int secim= scanner.nextInt();
        if(!(1<=secim && secim<= 5)){
            System.out.println("Hatali bir giris yaptiniz.Lutfen tekrar deneyiniz");
            girisEkrani();//giris ekranina geri don.
        }else{
            switch (secim){
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }


    }

    public static void cikis() {

        System.out.println("------- Cikis Yapiliyor -------");
    }

    public static void fisYazdir() {

        System.out.println("------- Fis Yazdiriliyor -------");
    }

    public static void market() {

        System.out.println("------- Market Reyonuna Hosgeldiniz -------");
    }

    public static void sarkuteri() {

        System.out.println("------- Sarkuteri Reyonuna Hosgeldiniz -------");
    }

    public static void manav() {

        System.out.println("------- Manav Reyonuna Hosgeldiniz -------");
        System.out.println("Lutfen almak istediginiz urunun urun kodunu (UK) giriniz");
        System.out.println("Elma Fiyati: 2€ UK:11 \nMuz Fiyati: 2€ UK:12 \nDomates Fiyati: 2€ UK:13" +
                "\nCilek Fiyati: 3€ UK:14 \nKarnabahar Fiyati: 2€ UK:15");

        while( !ekUrun){
            urunKodu = scanner.nextInt();
            if(urunKodu>= 11 && urunKodu <=15){
                System.out.println("Kac kg alacaksiniz: ");

                urunMiktari=scanner.nextInt();
                switch (urunKodu){
                    case 11:
                        urunAdi="Elma";
                        urunFiyati= 2;
                        System.out.println(urunMiktari + "kg "+ urunAdi+ " fiyati: "+urunFiyati*urunMiktari +" € 'dur");
                        break;
                    case 12:
                        urunAdi="Muz";
                        urunFiyati=2;
                        System.out.println(urunMiktari + "kg "+ urunAdi+ " fiyati: "+urunFiyati*urunMiktari +" € 'dur");
                        break;
                    case 13:
                        urunAdi="Domates";
                        urunFiyati=2;
                        System.out.println(urunMiktari + "kg "+ urunAdi+ " fiyati: "+urunFiyati*urunMiktari +" € 'dur");
                        break;
                    case 14:
                        urunAdi="Cilek";
                        urunFiyati=3;
                        System.out.println(urunMiktari + "kg "+ urunAdi+ " fiyati: "+urunFiyati*urunMiktari +" € 'dur");
                        break;
                    case 15:
                        urunAdi="Karnabahar";
                        urunFiyati=2;
                        System.out.println(urunMiktari + "kg "+ urunAdi+ " fiyati: "+urunFiyati*urunMiktari +" € 'dur");
                        break;

                }
            }

        }





    }

}
