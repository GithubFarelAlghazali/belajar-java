import java.util.Scanner;

public class HitungAI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] chars = text.toLowerCase().split("");
        int total = 0;

        for(int i = 0; i <= chars.length - 1; i++){
            if(chars[i].equals("a") || chars[i].equals("i") ){
                total++;
            }
        }
        System.out.print(total);
    }
}