import java.util.Scanner;

public class HitungDadu{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        do{
            int dadu1 = scanner.nextInt();
            int dadu2 = scanner.nextInt();
            int dadu3 = scanner.nextInt();
            int sum =   dadu1 + dadu2 + dadu3;

            boolean isGanjil = (dadu1 % 2 != 0) && (dadu2 % 2 != 0) && (dadu3 % 2 != 0);
            boolean isGenap = (dadu1 % 2 == 0) && (dadu2 % 2 == 0) && (dadu3 % 2 == 0);

            if(isGenap || isGanjil){
                counter++;
            }

            if(sum > 15){
                break;
            }
        }while(true);
        
        System.out.print(counter);

    }
}