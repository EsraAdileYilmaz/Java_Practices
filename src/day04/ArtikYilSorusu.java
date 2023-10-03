package day04;

import java.util.Scanner;

public class ArtikYilSorusu {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Lutfen bilgi istediginiz yili giriniz: ");
        int year= scanner.nextInt();

        String numdays;
        System.out.println(numdays=(year%4==0 && !(year%100==0) || year%400==0)?"Girdiginiz yil bir Artik Yildir." : "Girdiginiz yil bir Artik Yil degildir.");

    }
}
