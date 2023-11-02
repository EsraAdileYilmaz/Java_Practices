package day10;

import java.util.Scanner;

public class P02 {

    public static void main(String[] args) {
        /*

    MOUNTAIN ARRAY: Verilen herhangi bir arrayin Mountanin Array olup olmadığını kontrol ediniz.

    Mountain array ==> [0,2,5,6,3,2,1]

    Bir array elemanları en büyük değerine kadar sürekli artan,
    en büyük değerden sonra sürekli azalan değer alıyorsa "Mountain Array" dir.

    Mountain array değildir ==>[5,2,7,1,4]

         */


        System.out.print("Mountain Array Kontrolü için array elemanı sayıları arlarındavirgül koyarak giriniz: ");
        Scanner scan=new Scanner(System.in);
        String str= scan.next();
        String strArr[]=str.split(",");
        int Arr[]=new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            Arr[i]=Integer.parseInt(strArr[i]);
        }
        boolean isMoutain=MountainArrayControl(Arr);
        if (isMoutain){
            System.out.println("Array mountain array'dir");
        }else{
            System.out.println("Array mountain array değildir");
        }


    }

    private static boolean MountainArrayControl(int[] Arr) {
        if (Arr.length<3){
            return false;
        }
        int enBuyuk=0;

        //Array'in zirve noktasını bulalım
        for (int i = 0; i < Arr.length-1; i++) {
            if (Arr[i]<Arr[i+1]){
                enBuyuk=Arr[i+1];
            }else{
                break;
            }
        }
        if (enBuyuk==Arr[0] || enBuyuk== Arr[Arr.length-1]){
            return false;
        }

        //Zirveden sonra azalma kontrol edilmeli
        for (int i = enBuyuk; i < Arr.length-1; i++) {
            if (Arr[i]>Arr[i+1]){
                enBuyuk=Arr[i];
            }else{
                break;
            }

        }
        return true ;

        /*
         int[] dizi1 = {0, 2, 5, 3, 2, 1, 0};
        int[] dizi2 = {5, 2, 7, 1, 4};
        System.out.println("Dizi 1 bir Mountain Array mi? " + isMountainArray(dizi1));
        System.out.println("Dizi 2 bir Mountain Array mi? " + isMountainArray(dizi2));
    }
    public static boolean isMountainArray(int[] dizi) {
        int n = dizi.length;
        int zirveIndeks = -1;
        // Zirve elemanın index'ini bul
        for (int i = 1; i < n - 1; i++) {
            if (dizi[i] > dizi[i - 1] && dizi[i] > dizi[i + 1]) {
                zirveIndeks = i;
                break;
            }
        }
        // Zirve eleman var mı kontrol et
        if (zirveIndeks == -1 || zirveIndeks == 0 || zirveIndeks == n - 1) {
            return false;
        }
        // Sol kısımda artan düzeni kontrol et
        for (int i = 0; i < zirveIndeks; i++) {
            if (dizi[i] >= dizi[i + 1]) {
                return false;
            }
        }
        // Sağ kısımda azalan düzeni kontrol et
        for (int i = zirveIndeks; i < n - 1; i++) {
            if (dizi[i] <= dizi[i + 1]) {
                return false;
            }
        }
        return true;

         */

    }
}
