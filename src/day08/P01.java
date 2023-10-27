package day08;

public class P01 {

    public static void main(String[] args) {

        /*SORU:
        Verilen bir array’de istenen bir elemanin var olup olmadigini
        ve varsa kac kere kullanildigini
        yazdiran bir method olusturun.
         */

        int [] arr={2,3,6,12,25,36,27,7,6,38,19,102,36};

        //method call
        elemanBulma(arr,12);


    }

    public static void elemanBulma(int [] arr,int istenenEleman){

      int sayac=0;
        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == istenenEleman){
                sayac++;
            }
        }
        if(sayac ==0){
            System.out.println("Aradiginiz eleman arrayde bulunmamaktadir");
        }else{
            System.out.println("Aradiginiz eleman "+ sayac+ " adet bulunmaktadir");
        }




    }
}
