import java.util.Scanner;

public class HitungSelamaPositif{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int score = 0;

        while(loop){
            int input = scanner.nextInt();
            if(input <= 0 && input % 4 != 0){
                loop = false;
            } else{
                if(input % 4 == 0) score = score + input;
            }
        }
        System.out.println( score);
    }
}