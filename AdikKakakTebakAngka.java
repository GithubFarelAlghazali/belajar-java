import java.util.Scanner;

public class AdikKakakTebakAngka{
    public static void  main(String[] args){
        // Deklarasi variabel 
        int jawaban_adik,jawaban_kakak;
        boolean adik_pemenang;

         // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input 
        jawaban_adik  = scanner.nextInt();
        jawaban_kakak  = scanner.nextInt();
      
        int selisih = Math.abs(jawaban_adik - 100);

        // Proses perhitungan
        if(selisih == 0 || selisih == 1 || selisih == 5){
            adik_pemenang = true;
        } else {
            adik_pemenang = false;
        }
        // Output hasil perhitungan
        System.out.println( adik_pemenang);
        
        // tutup scanner
        scanner.close();
    }
}