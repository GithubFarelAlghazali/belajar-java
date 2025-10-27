import java.util.Scanner;

public class Berangkat{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int kapasitasBus = scanner.nextInt();
        int penumpang = scanner.nextInt();
        double persentase = (penumpang * 100.0) / kapasitasBus;
  
        if(persentase > 50.0 && persentase < 75.0){
            System.out.print("berangkat");
        }else{
            System.out.print("tidak berangkat");
        }
        
        scanner.close();
    }
}