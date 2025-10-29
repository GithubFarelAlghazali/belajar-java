import java.util.Scanner;

public class BarisBilangan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = n; i <= m; i++){
            double hasil;
            if(i % 2 != 0){
               hasil = Math.pow(2, i);
            } else {
               hasil = Math.pow(2, -i);
            }
            System.out.print(hasil + " ");
        }
    }
}