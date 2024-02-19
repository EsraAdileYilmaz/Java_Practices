package day02;

import java.util.Scanner;

public class P03_Scanner {
    public static void main(String[] args) {

        //Bazen kod yazarken bazı variablelar için kullanıcıdan değer almak gerekir.
        //Bu gibi durumlarda Scanner classından faydalanılır.

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen Adınızı Giriniz: ");
        String name= scan.nextLine();
        System.out.print("Lütfen Soyadınızı Giriniz: ");
        String surname= scan.next();
        System.out.println("Adınız: "+name+" "+surname+" olarak kaydedildi.");



    }
}
