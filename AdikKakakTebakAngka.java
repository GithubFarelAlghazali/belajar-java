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
      
        int selisih = (jawaban_adik > jawaban_kakak) ? jawaban_adik - jawaban_kakak : jawaban_kakak - jawaban_adik;

        // Proses perhitungan
        if(jawaban_adik == jawaban_kakak || selisih == 1 || selisih == 5){
            adik_pemenang = true;
        } else {
            adik_pemenang = false;
        }
        // Output hasil perhitungan
        System.out.println( adik_pemenang);
        System.out.println( selisih);
        
        // tutup scanner
        scanner.close();
    }
}