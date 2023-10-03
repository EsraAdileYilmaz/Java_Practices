package day04;

import java.util.Scanner;

public class P05_SwitchStatements {

    public static void main(String[] args) {
        //SORU: Kullanicidan bir rakam alip, rakami yaziyla yazdirin.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 0 ile 9 arasinda bir rakam giriniz");
        int rakam= scanner.nextInt();

        switch (rakam){
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dort");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yedi");
                break;
            case 8:
                System.out.println("Sekiz");
                break;
            case 9:
                System.out.println("Dokuz");
                break;
            default:
                System.out.println("Yanlis bir deger girdiniz");
        }
    }
}
