import java.util.Scanner;

public class CekKeterlambatan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int hariTelat = scanner.nextInt();
        int denda;
        
        if(hariTelat <= 5){
            denda = hariTelat * 1000;
            System.out.println(denda);
        } else if(hariTelat > 5 && hariTelat < 10){
            denda = hariTelat * 2000;
            System.out.println(denda);
        } else{
            System.out.println("cabut keanggotaan");
        }
        scanner.close();
    }
}