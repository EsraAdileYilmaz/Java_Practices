package day03;

import java.util.Scanner;

public class P02_IfStatements {
    public static void main(String[] args) {

        /*
       1- Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       Ornek:  gun=Pazar output = “Hafta sonu”  gun=Sali output = “Hafta ici”
       *** String icin equals method’unu salı kullanin
        */

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen hangi gunde oldugumuzu giriniz:");
        String gun=scanner.nextLine();
        String gun1=gun.toLowerCase();

        switch (gun1){
            case"pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case"cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
        }

        /*
         Scanner scan = new Scanner(System.in);
        System.out.print("Bugün günlerden hangi gün: ");
        String gun = scan.next().toLowerCase();
        /*
        ||: veya (herhangi biri)  or
        &&: ve (her ikisi de)  and
         */
       /* if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")) {
            System.out.println("Bugün Haftaiçi bir gün");
        }
        if (gun.equals("cumartesi") || gun.equals("pazar")) {
            System.out.println("Bugün Haftasonu bir gün");
        }
        if (!(gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma")
                || gun.equals("cumartesi") || gun.equals("pazar"))) {
            System.out.println("O girdiğiniz bir gün değil. Yanlış girdiniz");
        }
         */

    }
}
