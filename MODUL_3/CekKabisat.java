import java.util.Scanner;

public class CekKabisat{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan tahun: ");
    int tahun= scanner.nextInt();
    boolean kabisat;

    if((tahun % 4 == 0 && tahun % 100 != 0 && tahun % 400 != 0) || (tahun % 400 == 0))
        kabisat=true;
    else
        kabisat=false;


    System.out.println("Tahun "+tahun+ ((kabisat) ? " adalah " : " bukan ") + "tahun kabisat");
}
}