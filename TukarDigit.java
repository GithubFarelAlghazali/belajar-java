import java.util.Scanner;

public class TukarDigit{
    public static void  main(String[] args){        
         // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input 
        int bilangan1  = scanner.nextInt();
        int bilangan2  = scanner.nextInt();
       
        // Proses perhitungan
        int digit_ratusan = bilangan1 / 100;
        int digit_satuan = bilangan2 % 10;
        int hasil1 = digit_satuan * 100 + (bilangan1 % 100);
        int hasil2 = (bilangan2 / 10) * 10 + digit_ratusan;

        // Output hasil perhitungan
        System.out.println( hasil1 + " " + hasil2);
        
        // tutup scanner
        scanner.close();
    }
}