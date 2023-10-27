package day08;

import java.util.Arrays;

public class P02 {

    public static void main(String[] args) {

        /*
        SORU:verilen bir array'deki tum elementleri bir saga kaydirip,
             sondaki elementide basa tasiyacak bir method olusturun.
             array'i yeni haliyle  kaydedin.
         */

        int [] arr={1,2,3,4,5};

        //method call yapalim.

        arr=elemanlariSagaKaydir(arr);
        System.out.println(Arrays.toString(arr));




    }

    public static int[] elemanlariSagaKaydir(int[] arr){

        //1.adim:array'in son elementini kaydedelim
        int sonElement=arr[arr.length-1];

        //2.adim:yeni bir array olusturalim.
        int [] yeniArr=new int[arr.length];

        //3.adim:for loop ile tum elementleri atayalim
        for (int i = arr.length-2; i >=0 ; i--) {
            yeniArr[i+1]=arr[i];
        }

        //4.adim:1. adimda kaydettigim sonElementi 0.indexe atayalim
        yeniArr[0]=sonElement;

        return yeniArr;
    }

    /*
     HOCANIN COZUMU

      private static void elementleriSagakaydir(int[] input) {
        int [] yeniArr=new int[input.length];
        yeniArr[0]=input[input.length-1]; //Son indexteki elemanı yeni arrray'in ilk elemanı olarak atadık.
        for (int i = 0; i < input.length-1; i++) { //forLoop'larda i aralığı indexler arası aralıktır.
            yeniArr[i+1]=input[i];
        }
        input=yeniArr;
        System.out.println(Arrays.toString(input));
     */


    }

