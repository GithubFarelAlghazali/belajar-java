import java.util.Scanner;

public class BilanganPrimaPlanetX{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int jumlahFaktor = 0;
        boolean isPrima = false;

        for(int i = 1; i <= input; i++){
            if(input % i == 0){
                jumlahFaktor++;
            }
        }

        if(jumlahFaktor == 3){
            isPrima = true;
        }

        System.out.println(isPrima);
    }}
