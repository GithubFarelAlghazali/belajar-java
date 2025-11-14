import java.util.Scanner;

public class Main {
    
    public static void belajarMain(String x, int[] y, int[] z) {
        /*
        I.S.: Terdefinisi string aktivitas x dan dua counter y dan z
        F.S.: y[0] bertambah 1 jika x adalah "belajar", z[0] bertambah 1 jika x adalah "main"
        */
        if(x.equals("belajar")){
            y[0]++;
        } else if(x.equals("main")){
            z[0]++;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String aktivitas = scanner.next();
        int[] jumAktivitasBelajar = new int[1];
        int[] jumAktivitasMain = new int[1];
        
        while (!aktivitas.equals("tidur")) {
            belajarMain(aktivitas, jumAktivitasBelajar, jumAktivitasMain);
            aktivitas = scanner.next();
        }
        
        System.out.println(jumAktivitasBelajar[0] + " " + jumAktivitasMain[0]);
        scanner.close();
    }
}