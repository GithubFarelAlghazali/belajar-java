import java.util.Scanner;

public class HitungNilaiSiswa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahSiswa,totalNilai = 0, i = 1;
        double rataRata;
        String kategori = "";

        System.out.print("Masukkan jumlah siswa: ");
        jumlahSiswa = scanner.nextInt();

        while(i <= jumlahSiswa){
            System.out.print("Masukkan nilai siswa ke-" + i + ": ");
            totalNilai += scanner.nextInt();
            i++;
        }

        rataRata = totalNilai / jumlahSiswa;

        if(rataRata >= 85){
            kategori = "Sangat Baik";
        }  else if (rataRata <= 84 && rataRata >= 70){
            kategori = "Baik";
        } else if(rataRata <= 69 && rataRata >= 55){
            kategori = "Cukup";
        } else if(rataRata < 55){
            kategori = "Kurang";
        }

        System.out.println("Rata-rata nilai kelas: " + rataRata);
        System.out.print("Kategori: " + kategori);
    }
}