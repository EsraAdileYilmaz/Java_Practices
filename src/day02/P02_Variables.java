package day02;

public class P02_Variables {
    public static void main(String[] args) {


        int a = 12;
        int b = 23;
        int c = 65;
        int d; //int variable değer atamadan oluşturulur fakat değer atamadan kullanılmaz
        d = 100; //deger atama isini herhangi bir islemde kullanmadan once yapmaliyiz.
        System.out.println("Toplam = " + (a+b+c+d));
        //d için değer atamazsak bu satr Compile Time Error verir
        // CTE: Kodu yazarken henüz çalıştırılmadan farkedilen hatadır.Compile Time Error
        // RTE: Kodu çalıştırınca ortaya çıkan hatadir. Run Time Error
        String isim = "murat";
        String soyisim = "görgülü";
        System.out.println("İsim Soyisim = " + isim + " " + soyisim);
        System.out.println("");
        System.out.println("İsim Soyisim: "
                + isim.toUpperCase().charAt(0) + "."
                + soyisim.toUpperCase());
        System.out.println("İsim Soyisim: "+isim.toUpperCase()+" "+soyisim.toUpperCase());
        String isim2="ESRA";
        String soyisim2="YILMAZ";
        System.out.println("İsim: "+isim2.toLowerCase()+" "+soyisim2.toLowerCase());

    }
}
