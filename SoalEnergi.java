import java.util.Scanner;

public class SoalEnergi{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan jumlah sumber energi E0: ");
    int e0 = scanner.nextInt();
    
    System.out.print("Masukkan jumlah kapasitas baterai c: ");
    int c = scanner.nextInt();

    System.out.print("Masukkan jumlah sisa energi E1: ");
    int e1 = scanner.nextInt();

    int cc = (e0 + e1) / c;

    System.out.println("Jumlah cycle count: "+ cc);
    scanner.close();
    }
}