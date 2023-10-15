package day06;

public class P03 {

    public static void main(String[] args) {

        // SORU:2 basamaklı 7 ile bölünebilen pozitif tam sayıları while Loop ile yazdırınız.

        int sayi=10;
        while(sayi<100){//sayi 100'den kucuk oldugu muddetce

            if(sayi %7 ==0){

                System.out.print(sayi +" ");
            }
            sayi ++;
        }


        /*
        int sayi=10;
        String sayilar="";

        while(sayi<100){
            if (sayi%7==0){
                sayilar+=sayi+",";
            }
            sayi++;

        }
        System.out.println(sayilar.substring(0,sayilar.length()-1));//sondaki virgulu almiyoruz

         */

    }




}
