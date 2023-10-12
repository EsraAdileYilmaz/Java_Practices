package day05;



public class BaklavaDeseni {
    public static void main(String[] args) {
        int n = 5; // Baklava desenin yarı çapını belirleyin

        // Üst yarı
        for (int i = 0; i < n; i++) {
            // Boşlukları bas
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları bas
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Her satırın sonunda bir satır atla
        }

        // Alt yarı
        for (int i = n - 2; i >= 0; i--) {
            // Boşlukları bas
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Yıldızları bas
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Her satırın sonunda bir satır atla
        }
    }
}
