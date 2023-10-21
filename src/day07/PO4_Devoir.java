package day07;

import java.util.Arrays;

public class PO4_Devoir {

    public static void main(String[] args) {

        /*

        SORU:Verilen bir int array’in tum elemanlarini 2 artirip,
             bize donduren bir method olusturun.
             Eski array’i yeni haliyle kaydedin.
         */

        int [] arr={12,25,36,48,25};
        int artisMiktari=2;//dinamik yapmak icin yaptim.

        arr=elemanDegerArtirma(arr,artisMiktari);

        System.out.println(Arrays.toString(arr));//[14, 27, 38, 50, 27]




    }

    public static int [] elemanDegerArtirma(int [] arr,int artisMiktari){


        for (int i = 0; i < arr.length ; i++) {

            arr[i] =arr [i] +artisMiktari;
        }

        return arr;
    }
}
