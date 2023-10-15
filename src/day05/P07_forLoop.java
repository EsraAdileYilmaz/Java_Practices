package day05;

public class P07_forLoop {

    public static void main(String[] args) {

        String cumle = "Tahmin edemeyecegim bir sonuc ile karsilasacagimi hic dusunmemistim";
        String tekCumle = cumle.toLowerCase().replaceAll(" ", ""); // Cümleyi küçük harfe çevir
        int toplamHarfSayisi = tekCumle.length();

        String tekKelime = "";

        for (int i = 0; i < tekCumle.length(); i++) {

            char harf = tekCumle.charAt(i);
            if (harf >= 'a' && harf <= 'z') {

                if (tekKelime.indexOf(harf) == -1) {

                    tekKelime += harf;
                    System.out.println(harf + ",");

                }
            }
        }

        System.out.println("");
        System.out.println("Tekrarsiz tek kelime  : " + tekKelime);
        System.out.println("Toplam harf sayisi : " + toplamHarfSayisi);
        System.out.println("Tekrarsiz harf sayısı : " + tekKelime.length());
        System.out.println("Cikartilan harf sayısı : " + (toplamHarfSayisi - tekKelime.length()));

        /*
        //verilen String'deki kullalanilan harfleri
        // kelimeyi ve tekrarsiz halini yazdirip
        // kelimede kullanilan farkli harf sayisini yazdırın
         */
        String input = "Have nice day!";
        String tekrarsizInput = "";
        String islenecekKelime = input.replaceAll("\\W", ""); //Haveaniceday
        System.out.print(input.substring(0, 1));//H
        tekrarsizInput = islenecekKelime.substring(0, 1);//H

        for (int i = 1; i < islenecekKelime.length(); i++) {
            if (!tekrarsizInput.contains((islenecekKelime.substring(i, i + 1)))) {
                System.out.print("," + islenecekKelime.substring(i, i + 1));
                tekrarsizInput+= islenecekKelime.substring(i, i + 1);
            }
        }
        System.out.println(" ");
        System.out.println("input :"+ input);
        System.out.println("tekrarsız input :"+tekrarsizInput);
        System.out.println("tekrarsiz harf sayısı :"+tekrarsizInput.length());



    }
}
