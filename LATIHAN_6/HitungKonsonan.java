import java.util.Scanner;

public class HitungKonsonan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        String input = scanner.nextLine();

        String[]  parts = input.split("");

        for(int i = 0; i < parts.length; i++){
            String huruf = parts[i].toLowerCase();
            if(
            !huruf.equals("a") &&
            !huruf.equals("i") &&
            !huruf.equals("u") &&
            !huruf.equals("e") && 
            !huruf.equals("o") &&
            !huruf.equals(".") 
            ){
                counter++;
            }
        }

        System.out.print(counter);
    }
}