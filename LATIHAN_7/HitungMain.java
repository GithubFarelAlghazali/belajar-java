import java.util.Scanner;

public class HitungMain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int totalMain = 0, totalBelajar = 0;

        while(true){
            String text = input.nextLine();
            if(text.equals("tidur")){
                break;
            } 
            if (text.equals("belajar")){
                totalBelajar++;}
            if (text.equals("main")){
                totalMain++;}
            
        }

        System.out.println(totalBelajar + " " + totalMain);
    }
}