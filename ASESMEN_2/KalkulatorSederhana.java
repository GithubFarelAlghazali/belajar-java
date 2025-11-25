// Nama: Muhammad Farel Alghazali
// NIM: 109092500033
import java.util.Scanner;

public class KalkulatorSederhana{

    static void tampilkanMenu(){
    Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Bilangan A: ");
        double a = scan.nextDouble();
        System.out.print("Masukkan Bilangan B: ");
        double b = scan.nextDouble();
        System.out.println("==== MENU OPERASI ====");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilhan = scan.nextInt();
        hitung(a,b, pilhan);
    }

    static void hitung(double a, double b, int pilihan){
        switch (pilihan) {
            case 1:
                System.out.println("Hasil " + a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println("Hasil " + a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("Hasil " + a + " * " + b + " = " + (a * b));
                break;
            case 4:
                if(a == 0 || b == 0){
                System.out.println("Error: Tidak bisa dibagi dengan nol.");
                }else{
                System.out.println("Hasil " + a + " / " + b + " = " + (a / b));}
                break;
            default:
                System.out.println("Input tidak valid");
        }
    }

    public static void main(String[] args){
        tampilkanMenu();
    }
}