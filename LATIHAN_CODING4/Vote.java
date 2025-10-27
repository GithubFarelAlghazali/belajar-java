import java.util.Scanner;

public class Vote{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int siswa, voteA, voteB;

        System.out.print("Masukkan jumlah siswa: ");
        siswa = scanner.nextInt();
        System.out.print("Masukkan jumlah pemilih kandidat A: ");
        voteA = scanner.nextInt();
        System.out.print("Masukkan jumlah pemilih kandidat B: ");
        voteB = scanner.nextInt();

        if(voteA > voteB && voteA + voteB >= siswa * 0.6){
            System.out.println("Kandidat A menang");
        } else if(voteB > voteA && voteA + voteB >= siswa * 0.6){
            System.out.println("Kandidat B menang");
        } else {
            System.out.println("Tidak ada pemenang");
        }
    }
}