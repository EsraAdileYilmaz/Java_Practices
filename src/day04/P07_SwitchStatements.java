package day04;

import java.util.Scanner;

public class P07_SwitchStatements {

    public static void main(String[] args) {

        //SORU: Kullanicidan yili ve ay numarasini alip ,
        //      o yildaki o ayda kac gun oldugunu yazdirin.


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bilgi istediginiz yili giriniz.");
        int year= scanner.nextInt();

        System.out.println("Gun sayisini aradiginiz ayin numarasini giriniz");
        int month= scanner.nextInt();

        int numDays;

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                 numDays= 31;
                System.out.println("Girdiginiz aydaki gun sayisi :" +numDays);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays=30;
                System.out.println("Girdiginiz aydaki gun sayisi: "+ numDays);
                break;
            case 2:
                numDays=(year % 4== 0 && year % 100 != 0 || year % 400 ==0) ? 29 : 28 ;
                System.out.println("Girdiginiz aydaki gun sayisi: "+numDays);
                break;
            default:
                System.out.println("Gecersiz ay numarasi girdiniz. Miladi takvimde 12 ay vardir.");
        }
    }
}
