import java.util.Scanner;

public class Tot{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int score = 0;

        while(loop && scanner.hasNextLine()){
            String input = scanner.nextLine();
            if(input.equals("TTT")){
                loop = false;
            }else{
               if(input.contains("O")) score++;
            }
            if(score == 10){
                loop = false;
            }
            }


        System.out.println("Poin = " + score);
        }
    }
