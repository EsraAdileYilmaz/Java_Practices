package day04;

import java.util.Scanner;

public class P08_StringManipulations {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz.");
        String name= scanner.nextLine();
        String surname= scanner.nextLine();

        String name2="TARIK YIGIT";

        //   if (name==name2){
        //       System.out.println("Doğru giriş yapıldı");
        //   }else{
        //       System.out.println("Yanlış giriş yapıldı");
        //   }

        //  if (name.equals(name2)){
        //      System.out.println("Doğru giriş yapıldı");
        //  }else{
        //      System.out.println("Yanlış giriş yapıldı");
        //  }
            /*
            equals ile == arasındaki fark equals'ın girilen değerin referansına bakmasıdır.
             */

        //  if (name.equalsIgnoreCase(name2)){
        //      System.out.println("Doğru giriş yapıldı");
        //  }else{
        //      System.out.println("Yanlış giriş yapıldı");
        //  }

        //String name3=new String("Tarık Yıgıt");

        //if (name.equals(name3)){
        //    System.out.println("Doğru giriş yapıldı");
        //}else{
        //    System.out.println("Yanlış giriş yapıldı");
        //}

        System.out.println("Girilen ismin uzunluğu: "+name.length());
        System.out.println(name.substring(5));
        System.out.println(name.substring(5,7));

    }
}
