import java.util.Arrays;
import java.util.Scanner;

public class CekMedian{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numArray[] = new int[3];

        for (int i = 0; i < 3; i++){
            int num = scanner.nextInt();
            numArray[i] = num;
        }

        Arrays.sort(numArray);
        System.out.println(numArray[1]);

        scanner.close();
    }
}