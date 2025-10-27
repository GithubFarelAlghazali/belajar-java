import java.util.Arrays;
import java.util.Scanner;

public class UrutanAbjad{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char huruf = scanner.next().charAt(0);
        int angka;

        switch (huruf) {
            case 'A':
                angka = 5;
                break;
            case 'B':
                angka = 4;
                break;
            case 'C':
                angka = 3;
                break;
            case 'D':
                angka = 2;
                break;
            case 'E':
                angka = 1;
                break;
            case 'T':
                angka = 0;
                break;
            default:
                throw new AssertionError();
        }
       
        System.out.print(angka);
        scanner.close();
    }
}