import java.util.Scanner;

public class Salam{
    void salamWaktu(int jam){
        if(jam >= 0 && jam <= 10){
            System.out.println("Selamat Pagi");
        } else  if(jam >= 11 && jam <= 14){
            System.out.println("Selamat Siang");
        } else  if(jam >= 15 && jam < 18){
            System.out.println("Selamat Sore");
        }else  if(jam >= 18){
            System.out.println("Selamat Malam");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Salam obj = new Salam();

        System.out.print("Masukkan jam sekarang:");
        int jam = input.nextInt();

        obj.salamWaktu(jam);
    }
}