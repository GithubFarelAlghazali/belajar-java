import java.util.Scanner;

public class Tabungan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int total = 0;
        
        for(int i = 1; i <= z; i++){
            if(i % 2 == 0 || i % 3 == 0){
            total += x;
            x += y;
            }
        }
        System.out.print(total);
    }
}