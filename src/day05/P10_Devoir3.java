package day05;

public class P10_Devoir3 {

    public static void main(String[] args) {

        /*
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
         */

        int satir=10;
        int sutun =1;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <= sutun ; j++) {

                System.out.print(j+" * "+i+" = "+i);
            }
            System.out.println("");
        }


    }
}
