import java.util.Scanner;

public class Hitung{
    public static void  main(String[] args){
        // Deklarasi variabel 
        int jumlah_penduduk_sekarang, jumlah_kelahiran,jumlah_imigrasi, jumlah_kematian, jumlah_emigrasi, total_penduduk_baru;

         // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input 
        jumlah_penduduk_sekarang  = scanner.nextInt();
        jumlah_kelahiran  = scanner.nextInt();
        jumlah_imigrasi  = scanner.nextInt();
        jumlah_kematian  = scanner.nextInt();
        jumlah_emigrasi  = scanner.nextInt();

        // Proses perhitungan
        total_penduduk_baru = jumlah_penduduk_sekarang + jumlah_kelahiran + jumlah_imigrasi - jumlah_kematian - jumlah_emigrasi;

        // Output hasil perhitungan
        System.out.println( total_penduduk_baru);
        
        // tutup scanner
        scanner.close();
    }
}