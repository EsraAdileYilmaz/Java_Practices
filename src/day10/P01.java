package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {

        //SORU=Girilen desimal'in(10'luk Tabanda Sayı)  değerini,
        //     binary(2'lik sayı düzeni) değere çeviren metodu oluşturunuz.
        //Örnek: 12 = 1 1 0 0

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir Desimal sayı giriniz: ");
        int sayi= scan.nextInt();

        //method call yapalim
        System.out.println(sayi+" Değerinin Binary Karşılığı: "+binaryDonusum(sayi));


    }

    public static ArrayList<Integer> binaryDonusum(int sayi) {
        ArrayList<Integer> binary=new ArrayList<>();
        while(sayi>=1){//sayi 1 oluncaya kadar isleme devam et
            binary.add(sayi%2); //sayıyı 2'ye bölüp kalanını ekleyecek
            sayi/=2; //sayi=sayi/2
        }
        Collections.reverse(binary);
        //reverse() tersine cevirme methodu ile kalanlari sondan basa yazdirdik.


        return binary;


    }


}

