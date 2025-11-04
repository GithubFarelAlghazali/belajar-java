import java.util.Scanner;

public class JumlahGenap{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int hasil = 0;
        int bilanganGenap = 0;
        
        for(int i = 1; bilanganGenap != n; i++){
            if(i % 2 == 0){
                hasil += i;
                bilanganGenap++;
            }
        }

        System.out.println(hasil);
      
    }}
