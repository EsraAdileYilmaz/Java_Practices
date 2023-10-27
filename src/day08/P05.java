package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05 {

    public static void main(String[] args) {

        /*
         Soru-1:
        Kullanicidan istedigi kadar isim alip,
        Q’ya bastiginda girdigi isimleri
        bize liste olarak dondurecek bir method olusturun.
         */

        //method call yapalim
        System.out.println(isimListesiMethodu());

    }

    public static List<String> isimListesiMethodu(){

        Scanner scanner;
        String girilenIsim;

        List <String> isimListesi=new ArrayList<>();

        //kac isim girilecegi belli deil oyuzden do-while loop yapalim

        do {
            scanner=new Scanner(System.in);
            System.out.println("Lutfen listeye eklemek icin isim giriniz," +
                               "\nIslemi bitirmek icin Q 'ya basiniz");
            girilenIsim=scanner.nextLine();

            if( ! girilenIsim.equalsIgnoreCase("Q")){
                isimListesi.add(girilenIsim);
            }
        }while (! girilenIsim.equalsIgnoreCase("Q"));

        return isimListesi;
    }
}
