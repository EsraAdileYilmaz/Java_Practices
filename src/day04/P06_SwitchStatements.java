package day04;

import java.util.Scanner;

public class P06_SwitchStatements {
    public static void main(String[] args) {

        //SORU: Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen iki basamakli bir sayi giriniz.");
        int girilenSayi= scanner.nextInt();

        if(10 <=girilenSayi && girilenSayi<=99){

            int birlerBasamagi=girilenSayi%10;
            int onlarBasamagi=girilenSayi/10;

            switch (onlarBasamagi){
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kirk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmis");
                    break;
                case 7:
                    System.out.print("Yetmis");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;
            }switch (birlerBasamagi){
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }
        }
    }
}
