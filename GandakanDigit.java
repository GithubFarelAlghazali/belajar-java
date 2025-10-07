import java.util.Scanner;

public class GandakanDigit {
    public static void  main(String[] args){
         // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String nilai = String.valueOf(input);

        StringBuilder hasil = new StringBuilder();

        for(char c : nilai.toCharArray()){
            hasil.append(c).append(c);
            }       

        System.out.println(hasil.toString());       
        
        scanner.close();
    }
}