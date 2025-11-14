import java.util.Scanner;

public class contohVoid{
    void Siswa(String nama, String nomorMatkul, int nilaiBhs, int nilaiBing, int nilaiMtk){
        double rataRata = (nilaiBhs + nilaiBing + nilaiMtk) / 3;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        contohVoid obj = new contohVoid();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nomor mata kuliah: ");
        String noMatkul = input.nextLine();

        System.out.print("Masukkan nilai Bahasa: ");
        int nilaiBhs = input.nextInt();

        System.out.print("Masukkan nilai Bahasa Inggris: ");
        int nilaiBing = input.nextInt();

        System.out.print("Masukkan nilai Matematika: ");
        int nilaiMtk = input.nextInt();

        obj.Siswa(nama, noMatkul, nilaiBhs, nilaiBing, nilaiMtk);
    }
}