package day06;

import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {

        //SORU: Bir kelime isteyip indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String girilenKelime= scanner.next();

        int index=0;
        while(index < girilenKelime.length()){//index kelimenin uzunlugundan kucuk oldugu muddetce

            if(index % 2 ==1){
                System.out.println(index +". index :"+girilenKelime.charAt(index));
            }
            index ++;
        }


        /* HOCANIN YOLU
        int sayac=0;
        while(sayac<=kelime.length()-1){
            if (sayac%2==1){
                System.out.println(sayac+".index: "+kelime.charAt(sayac));
            }
            sayac++;


        }
         */



    }
}
