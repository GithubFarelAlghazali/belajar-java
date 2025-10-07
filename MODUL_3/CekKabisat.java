import java.util.Scanner;

public class CekKabisat{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan tahun: ");
    int tahun= scanner.nextInt();
    boolean kabisat;

    if(tahun % 400 == 0)
        kabisat = true;
    else if(tahun % 100 == 0)
        kabisat = false;
    else if(tahun % 4 == 0)
        kabisat = true;
    else
        kabisat = false;

    System.out.println("Tahun "+ tahun + ((kabisat) ? " adalah " : " bukan ") + "tahun kabisat");

    scanner.close();
}
}