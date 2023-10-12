package day05;

public class P13_BaklavaDeseni {

    public static void main(String[] args) {
        // deseni satır satır inceleyelim
        // satır başındaki boşluklar ayrı bir desen sonrasındaki yıldızlar kısmı ayrı
        // ilk satırda 4 boşluk sonrasında bir yıldız+boşluk ("* ")
        // satırlar aşağı doğru indikçe baştaki boşluk sayısı bir azalırken sonrasında ("* ") bir artıyor
        // en ortada satır başında hiç boşluk yok ve 5 adet ("* ") yanyana

        int n = 5; // Desen boyutunu en ortada 5 yıldız olacak biçimde ayarlayalım
        // Üst kısmı oluşturalım, en tepeden en ortadaki 5 yıldızlı satır dahil yazdıralım
        for (int i = 1; i <= n; i++) {
            // her satırda başta olması gereken boşlukları ekleyelim
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // her satırda olması gereken yıldız+boşluk desenini ekleyelim
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // şimdi sıra alt kısımda, 5 yıldızlı satırın altında kalan satırları tek tek yazdıralım
        for (int i = n - 1; i >= 1; i--) {
            // önce her satırda olması gereken boşlukları ekleyelim
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            // sonra sıra her satırda olması gereken yıldız+boşluklarda
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
