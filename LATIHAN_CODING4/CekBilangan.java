import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positif = 0;
        int negatif = 0;

        // Input 4 bilangan bulat
        for (int i = 0; i < 4; i++) {
            int bilangan = scanner.nextInt();
            
            if (bilangan > 0) {
                positif++;
            } else if (bilangan < 0) {
                negatif++;
            }
        }

        // Output jumlah positif dan negatif
        System.out.println(positif + " " + negatif);

        scanner.close();
    }
}
