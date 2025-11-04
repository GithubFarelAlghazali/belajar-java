import java.util.Scanner;

public class GameDadu{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalGenap = 0;

        while(true){
            int dadu1 = input.nextInt();
            int dadu2 = input.nextInt();
            int dadu3 = input.nextInt();
            boolean semuaGenap = (dadu1 % 2 == 0) && (dadu2 % 2 == 0) && (dadu3 % 2 == 0);

            if(dadu1 + dadu2 + dadu3 == 12 && semuaGenap){
                break;
            } else if(semuaGenap){
                totalGenap++;
            }
            
        }

        System.out.println(totalGenap);
    }}
