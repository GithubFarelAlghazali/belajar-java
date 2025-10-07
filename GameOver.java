import java.util.Scanner;

public class GameOver {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int health = scanner.nextInt();
        int score = scanner.nextInt();
        int level = scanner.nextInt();
        boolean gameOver;
        
        if(health != 0)
            if(level == 1 && score >= 1000)
                gameOver = false;
            else if(level == 2 && score >= 3000)
                gameOver = false;
            else if(score >= 7000)
                gameOver = false;
            else
                gameOver = true;
        else
            gameOver = true;
        
        System.out.println( gameOver);
        
        // tutup scanner
        scanner.close();
    }
}