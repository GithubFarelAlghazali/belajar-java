import java.util.Scanner;

public class CekSegitiga{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int totalSudut = 0;

        for (int i = 0; i  < 3; i++){
            int sudut = scanner.nextInt();
            totalSudut += sudut;
        }

        System.out.println(totalSudut == 180);
        scanner.close();
    }
}