import java.time.LocalDateTime;
import java.util.Scanner;

public class Wise_T127_Magasin {

    //Oncelikle tum class'tan rahatlikla kullanilabilecek class levelde bir urun portfoyu olusturduk.
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

        System.out.println("------- Cikis Yapiliyor -------");System.exit(0);//Kodu tamamen durdursun diye yazdik
    }

    public static void fisYazdir() {

        System.out.println("------- WISE T127 MAGASIN -------");
        System.out.println("Alisverisinizde Bizi Tercih Ettiginiz Icin Tesekkur Ederiz" +
                           "\nYine Bekleriz");
        System.out.println(sepet);
        System.out.println(" ");
        System.out.println("Toplam Alisveris Tutari: "+ toplam);
        System.out.println("Musterinin Odeme Miktarini Giriniz: ");
        int odeme= scanner.nextInt();
        if(odeme <toplam){
            System.out.println("Odeme yetersiz. Odemeniz "+(toplam-odeme)+" € kadar eksiktir.");
        }else{
            System.out.println("Odenen Tutar: "+odeme+"\nPara Ustu: "+(odeme-toplam));
        }
        LocalDateTime saat= LocalDateTime.now();
        System.out.println(saat);
        System.out.println(" Iyi Gunler Dileriz - Yine Bekleriz ");
        cikis();


    }

    public static void market() {

        System.out.println("------- Market Reyonuna Hosgeldiniz -------");
        System.out.println("Lutfen almak istediginiz urunun urun kodunu (UK) giriniz");
        System.out.println("Pirinc Fiyati: 5€ UK: 31\nMercimek Fiyati: 3€ UK:32\nZeytin Fiyati:9€ UK:33 " +
                "\nSampuan Fiyati: 7€ UK:34\nDus Jeli Fiyati: 5€ UK:35");

        while ( !ekUrun){//yeni urun almaya devam edildigi muddetce
            urunKodu=scanner.nextInt();
            if(urunKodu >=31 && urunKodu<= 35){
                System.out.println("Aldiginiz urunun miktarini kg/ adet olarak yaziniz: ");
                urunMiktari= scanner.nextInt();
                switch (urunKodu){
                    case 31:
                        urunAdi="Pirinc";
                        urunFiyati=5;
                        System.out.println(urunMiktari +" kg/adet "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 32:
                        urunAdi="Mercimek";
                        urunFiyati=3;
                        System.out.println(urunMiktari +" kg/adet "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 33:
                        urunAdi="Zeytin";
                        urunFiyati=9;
                        System.out.println(urunMiktari +" kg/adet "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 34:
                        urunAdi="Sampuan";
                        urunFiyati=7;
                        System.out.println(urunMiktari +" kg/adet "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 35:
                        urunAdi="Dus Jeli";
                        urunFiyati=5;
                        System.out.println(urunMiktari +" kg/adet "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                }
                urunFiyati=urunFiyati*urunMiktari;
                toplam +=urunFiyati;
                System.out.println("Olusan sepet tutari: "+ toplam);
                sepet +=urunAdi+" fiyati: "+urunFiyati+" €'dur\n";
                System.out.println("Baska bir urun almak istermisiniz? " +
                        "\nEger baska urun almak isterseniz lutfen kodunu giriniz." +
                        "\nAna Menuye donmek icin lutfen 0 (Sifir) tusuna basiniz");

            }else if(urunKodu ==0){//urun almamissa
                girisEkrani();
            }

        }
    }

    public static void sarkuteri() {

        System.out.println("------- Sarkuteri Reyonuna Hosgeldiniz -------");
        System.out.println("Lutfen almak istediginiz urunun urun kodunu (UK) giriniz");
        System.out.println("Kiyma Fiyati: 11€ UK: 21\nYumurta Fiyati: 5€ UK:22\nTavuk Fiyati: 10€ UK:23 " +
                "\nAntrikot Fiyati: 25€ UK:24\nSucuk Fiyati: 5€ UK:25");

        while(!ekUrun){//yeni urun almaya devam edildigi muddetce
            urunKodu= scanner.nextInt();
            if(urunKodu >= 21 && urunKodu <=25){
                System.out.println("Kac kg/koli alacaksiniz: ");
                urunMiktari= scanner.nextInt();
                switch (urunKodu){
                    case 21:
                        urunAdi="Kiyma";
                        urunFiyati=11;
                        System.out.println(urunMiktari +" kg/koli "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 22:
                        urunAdi="Yumurta";
                        urunFiyati=5;
                        System.out.println(urunMiktari +" kg/koli "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 23:
                        urunAdi="Tavuk";
                        urunFiyati=10;
                        System.out.println(urunMiktari +" kg/koli "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 24:
                        urunAdi="Antrikot";
                        urunFiyati=25;
                        System.out.println(urunMiktari +" kg/koli "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                    case 25:
                        urunAdi="Sucuk";
                        urunFiyati=5;
                        System.out.println(urunMiktari +" kg/koli "+urunAdi+" fiyati: "+urunMiktari*urunFiyati+" €'dur");
                        break;
                }
                urunFiyati=urunFiyati*urunMiktari;
                toplam +=urunFiyati;
                System.out.println("Olusan sepet tutari: "+ toplam);
                sepet +=urunAdi+" fiyati: "+urunFiyati+" €'dur\n";
                System.out.println("Baska bir urun almak istermisiniz? " +
                                  "\nEger baska urun almak isterseniz lutfen kodunu giriniz." +
                                   "\nAna Menuye donmek icin lutfen 0 (Sifir) tusuna basiniz");

            }else if(urunKodu ==0){//urun almamissa
                girisEkrani();
            }
        }
    }

    public static void manav() {

        System.out.println("------- Manav Reyonuna Hosgeldiniz -------");
        System.out.println("Lutfen almak istediginiz urunun urun kodunu (UK) giriniz");
        System.out.println("Patates Fiyati: 2€ UK:11 \nMuz Fiyati: 2€ UK:12 \nDomates Fiyati: 2€ UK:13" +
                "\nCilek Fiyati: 3€ UK:14 \nKarnabahar Fiyati: 2€ UK:15");

        while( !ekUrun){//ekUrun true oldugu muddetce(yani yeni urun almaya devam edildigi muddetce)
            urunKodu = scanner.nextInt();
            if(urunKodu >= 11 && urunKodu <=15){
                System.out.println("Kac kg alacaksiniz: ");
                urunMiktari=scanner.nextInt();
                switch (urunKodu){
                    case 11:
                        urunAdi="Patates";
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
                urunFiyati=urunFiyati*urunMiktari;
                toplam +=urunFiyati;
                System.out.println("Olusan Sepet Tutari :"+toplam);
                sepet += urunAdi+ " fiyati: "+urunFiyati+" €'dur\n";
                System.out.println("Baska bir urun almak istermisiniz?" +
                        "\n Eger baska urun almak isterseniz lutfen kodunu giriniz." +
                        "\nAna Menuye donmek icin lutfen 0 (Sifir) tusuna basiniz");

            }else if(urunKodu ==0){//urun almamissa
                girisEkrani();
            }

        }
    }

}
