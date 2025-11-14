import java.util.Scanner;


public class hitungAscii {

    public static void createArray(int[] n, byte[] arrayKode) {
        Scanner scanner = new Scanner(System.in);
        byte input;
        boolean validasi = true;

        while (validasi) {
            input = scanner.nextByte(); 
            if (input == 0) { 
                validasi = false;
            } else {
            arrayKode[n[0]] = input; 
            n[0]++; 
            }
        }
    }

    public static void printKode(int n, byte[] arrayKode) {
        for (int i = 0; i < n; i++) {
            System.out.printf("%c", arrayKode[i]); 
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        int[] n = {0}; 
        byte[] arrayKode = new byte[100]; 

        createArray(n, arrayKode);

        printKode(n[0], arrayKode);
    }
}