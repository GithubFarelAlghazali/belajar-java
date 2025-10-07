import java.util.Scanner;

public class ApakahVokal{
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().trim().charAt(0);
        
         // Deklarasi variabel
        boolean vokal;

        if(input == 'a' ||  input == 'i' || input == 'u' || input == 'e' || input == 'o')
            vokal = true;
        else
            vokal = false;
        System.out.println( vokal);
        
        // tutup scanner
        scanner.close();
    }
}