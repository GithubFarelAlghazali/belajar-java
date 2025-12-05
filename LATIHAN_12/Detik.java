import java.util.Scanner;

public class Detik{
    int hitungDetik(int jam, int menit, int detik){
        return (jam * 3600 ) + (menit * 60) + detik;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam = input.nextInt();
        int menit = input.nextInt();
        int detik = input.nextInt();
        Detik app = new Detik();

        int totalDetik = app.hitungDetik(jam, menit, detik);
        System.out.println(totalDetik);
    }

}



