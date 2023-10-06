package day05;

import java.util.Scanner;

public class P02_forLoop {

    public static void main(String[] args) {

         /*
    SORU:Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri  baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

     */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri olacak pozitif bir tamsayi giriniz");
        int basDeger= scanner.nextInt();

        System.out.println("Lutfen bitis degeri olacak pozitif bir tamsayi giriniz");
        int bitDeger= scanner.nextInt();

        int toplam=0;
        if(bitDeger < basDeger ){
            System.out.println("Bitis degeri baslangic degerinden kucuk olamaz");
        }else{

            for (int i = basDeger; i <=bitDeger; i++) {

                toplam += i;
            }

            System.out.println("Girilen araliktaki sayilarin toplami: "+ toplam);
        }


    }
}
