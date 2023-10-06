package day05;

public class P03_forLoop {

    public static void main(String[] args) {

        // SORU:0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız

        for (int i = 0; i <= 255 ; i++) {

            System.out.println(i + " =" +(char) i); // burada char ile casting yaptik
                                                    //harf degerini yazdirmak icin.
        }
    }
}
