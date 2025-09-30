import java.util.Scanner;

public class ApakahNol{
    public static void  main(String[] args){
         // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input 
        int input = scanner.nextInt();
       
        // Output hasil perhitungan
        System.out.println( input == 0);
        
        // tutup scanner
        scanner.close();
    }
}