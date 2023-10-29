package day09;

import java.util.Arrays;
import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {

        /*
         SORU:
         Kullanicidan bir cumle ve bir harf alin,
         harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
         kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scanner.nextLine();

        System.out.println("Lutfen bir harf giriniz");
        String harf= scanner.next();

        int sayac=0;

        String [] cumleArr=cumle.split("");//cumleyi array'e cevirdik.
        System.out.println(Arrays.toString(cumleArr));

        for (String each: cumleArr   ) {

            if(each.equalsIgnoreCase(harf)){
                sayac ++;
            }

        }
        if(sayac ==0){
            System.out.println("Aradiginiz harf cumlede kullanilmamistir");
        }else{
            System.out.println("Aradiginiz harf cumlede "+sayac +" adet bulunmaktadir.");
        }



    }
}
