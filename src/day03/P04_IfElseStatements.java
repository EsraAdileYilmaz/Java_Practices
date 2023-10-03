package day03;

import java.util.Scanner;

public class P04_IfElseStatements {
    public static void main(String[] args) {

        /*

    SORU:Kullanicidan cinsiyetini ve yasini alin,
         Kadin, 60 yas ve uzeri ,
         Erkek 65 yas ve uzeri emekli olabilir.
         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin"
         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
      */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz.\nErkek : E  Kadin: K");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scanner.nextInt();

        if(!(cinsiyet=='E' || cinsiyet =='K') || yas<10 || yas> 80){
            System.out.println("Hatali giris yaptiniz");
        } else if (cinsiyet=='K' && yas<60) {
            System.out.println("Emekli olmak icin " +(60-yas)+ " yil daha calismaniz gerekir");
        } else if (cinsiyet == 'K'&& yas>60) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet == 'E' && yas <65) {
            System.out.println("Emekli olmak icin " +(65-yas)+ " yil daha calismaniz gerekir");
        }else{
            System.out.println("Emekli olabilirsiniz");
        }


        /*

        char cinsiyet = scan.next().charAt(0);
         if ((cinsiyet == 'K' || cinsiyet == 'k') && yas>=60){
            System.out.println("Emekli olabilirsiniz");
        }  if ((cinsiyet == 'K' || cinsiyet == 'k') && yas<60){
            System.out.println("Emekli olmak için "+ (60-yas)+" yıl daha çalışmalısınız");
        }  if ((cinsiyet == 'E' || cinsiyet == 'e')&& yas>=65){
            System.out.println("Emekli olabilirsiniz");
        } if ((cinsiyet == 'E' || cinsiyet == 'e')&& yas<65){
            System.out.println("Emekli olmak için "+ (65-yas)+" yıl daha çalışmalısınız");
        }else {
           System.out.println("Girdiğiniz değerlerden enaz biri yanlıştır");

        }
         */

         /*
    Not: Birden fazla if,elseif, else durumlarında en son adıma bakılır
    else ile bitiyorsa tüm ihtimaller kapsanır.
    else if ile bitiyorsa kapsanmayan ihtimaller vardır.
     */


    }
}
