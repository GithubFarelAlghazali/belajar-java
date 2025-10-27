import java.util.Scanner;

public class CekPaket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int berat = scanner.nextInt();
        int panjang = scanner.nextInt();
        int lebar = scanner.nextInt();
        int tinggi = scanner.nextInt();

        // 1. Terlalu berat
        if (berat > 50) {
            System.out.println("Paket tidak dapat dikirimkan karena terlalu berat.");
        }
        // 2. Terlalu besar
        else if (panjang > 100 || lebar > 50 || tinggi > 50) {
            System.out.println("Paket tidak dapat dikirimkan karena ukurannya terlalu besar.");
        }
        // 3. Pengiriman Khusus
        else if (berat > 20 && berat <= 50) {
            System.out.println("Pengiriman Khusus");
        }
        // 4. Pengiriman Reguler Besar
        else if (berat >= 10 && berat <= 20 && (panjang > 80 || lebar > 40 || tinggi > 40)) {
            System.out.println("Pengiriman Reguler Besar");
        }
        // 5. Pengiriman Reguler
        else if (berat >= 10 && berat <= 20 && panjang <= 80 && lebar <= 40 && tinggi <= 40) {
            System.out.println("Pengiriman Reguler");
        }
        // 6. Pengiriman Ekspres
        else if (berat < 10 && panjang < 50 && lebar < 30 && tinggi < 30) {
            System.out.println("Pengiriman Ekspres");
        }
        // 7. Pengiriman Reguler Kecil
        else {
            System.out.println("Pengiriman Reguler Kecil");
        }
    }
}
