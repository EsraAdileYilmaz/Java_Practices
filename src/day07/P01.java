package day07;

public class P01 {

    String isim="Esra";
    String soyisim="Yilmaz";
    static int yas=41;
    static double kutle=58;

    public static void main(String[] args) {

        System.out.println(kutle);//bu variable static oldugu icin tum class'tan direk ulasilabilir.
        System.out.println(yas);//bu variable static oldugu icin tum class'tan direk ulasilabilir.
        //System.out.println(isim); method static oldugu icin instance variable'lara direk ulasilamaz
        //System.out.println(soyisim); method static oldugu icin instance variable'lara direk ulasilamaz
    }

    public void staticOlmayanMethod(){

        System.out.println(kutle);
        System.out.println(yas);
        System.out.println(isim);//method static olmadigi icin instance variable'lara direk ulasilabilir.
        System.out.println(soyisim);//method static olmadigi icin instance variable'lara direk ulasilabilir.
    }
}
