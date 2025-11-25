// Nama: Muhammad Farel Alghazali
// NIM: 109092500033

import java.util.Scanner;
public class RataRata {

    static double hitungRataRata(int[] array) {
        int jumlahData = array.length;
        int total = 0;

        for(int i = 0; i < array.length; i++){
            total += array[i];
        }

        return total / jumlahData;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data (N): ");
        int N = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }

        System.out.print("Data array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if(i != array.length - 1){
                System.out.print(",");
            } else {
                System.out.println("]");
            }
        } 

        double rataRata = hitungRataRata(array);
        System.out.println("Nilai rata-rata: " + rataRata );
      
    }
}