import java.util.Scanner;

public class TukarNilai{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan nilai pertama: ");
    int nilai1= scanner.nextInt();
    System.out.print("Masukkan nilai kedua: ");
    int nilai2= scanner.nextInt();
    

    nilai1 = nilai1 + nilai2;
    nilai2 = nilai1 - nilai2;
    nilai1 = nilai1 - nilai2;

    System.err.println("Nilai pertama setelah ditukar: "+ nilai1);
    System.err.println("Nilai kedua setelah ditukar: "+ nilai2);
    }
}