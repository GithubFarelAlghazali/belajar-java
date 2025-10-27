import java.util.Scanner;

public class Hitungai{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        String kata = scanner.nextLine();
        String[] huruf = kata.split("");
        for(int i = 0; i < huruf.length; i++){
            if(huruf[i].equals("i") || huruf[i].equals("a")){
                total++;
            }
        } 

        System.out.println(total);
    }}
