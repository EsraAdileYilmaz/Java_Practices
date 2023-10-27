package day08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06 {

    public static void main(String[] args) {

        /*
        Soru-2:
        Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
        tamsayilari bir liste olarak bize donduren bir method olusturun.

         */

        //method call yapalim

        System.out.println(tamBolenlerListesi());


    }

    public static List<Integer> tamBolenlerListesi(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen tam bolenlerini bulmak istediginiz pozitif bir tamsayi giriniz");
        int girilenSayi= scanner.nextInt();

        List<Integer> tamBolenlerListesi=new ArrayList<>();
        for (int i = 1; i <= girilenSayi ; i++) {

            if(girilenSayi %i ==0){
                tamBolenlerListesi.add(i);
            }
        }

        return tamBolenlerListesi;
    }
}
