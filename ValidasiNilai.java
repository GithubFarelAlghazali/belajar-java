import java.util.Scanner;

public class ValidasiNilai{
    public static void  main(String[] args){
       
         // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input 
        int nilai  = scanner.nextInt();
        boolean valid;

        //  Cek validasi nilai
        if(nilai >= 0 && nilai <= 100 ){
        valid = true;
        } else {
        valid = false;
        }

        // Output hasil perhitungan
        System.out.println( valid);
        
        // tutup scanner
        scanner.close();
    }
}