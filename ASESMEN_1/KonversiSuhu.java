import java.util.Scanner;

public class KonversiSuhu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu, celcius, fahrenheit;
        double hasilKonversi;
        boolean isLoop = true;

        do { 
            
        System.out.println("==== KONVERSI SUHU ====");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Fahrenheit ke Celcius");
        System.out.print("3. Keluar Pilih menu: ");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.print("Masukkan suhu dalam Celcius: ");
                celcius = scanner.nextInt();
                hasilKonversi = ((celcius * 9/5)+32);
                System.out.println("Hasil konversi: " + hasilKonversi + "°F");
                break;
            case 2:
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                fahrenheit = scanner.nextInt();
                hasilKonversi = ((fahrenheit - 32) * 5/9);
                System.out.println("Hasil konversi: " + hasilKonversi + "°C");
                break;
            case 3:
                System.out.println("Program selesai.");
                isLoop = false;
                break;
            default:
               System.out.println("Menu tidak valid, coba lagi");;
            }
        } while (isLoop);
       
    }
}