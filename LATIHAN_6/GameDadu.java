import java.util.Scanner;

public class GameDadu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int skorA = 0, skorB = 0, skorC = 0;

        for(int i = 1; i <= n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            skorA += a;
            skorB += b;
            skorC += c;
        }

        char winner;
        int totalWinner;

        if(skorA < skorB && skorA < skorC){
            winner = 'A';
            totalWinner = skorA;
        } else if(skorB < skorA && skorB < skorC){
            winner = 'B';
            totalWinner = skorB;
        } else {
            winner = 'C';
            totalWinner = skorC;
        }

        System.out.println(winner + " " +totalWinner);
    }}
