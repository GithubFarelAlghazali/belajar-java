// Nama: Muhammad Farel Alghazali
// NIM: 109092500033
import java.util.Scanner;

public class HitungDiskon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double persenDiskon = 0.0, jumlahDiskon = 0.0;

        System.out.print("Masukkan Total Belanja: "); 
        double totalBelanja = sc.nextDouble();
        System.out.print("Status Member (Y/T): "); 
        String member = sc.next();
        System.out.println("Total Belanja Awal: " + totalBelanja);

        if(member.equals("Y")){
            if(totalBelanja >= 500000){
                persenDiskon = 25.0;
                jumlahDiskon = totalBelanja / 100 * persenDiskon;
            } else {
                persenDiskon = 15.0;
                jumlahDiskon = totalBelanja / 100 * persenDiskon;
            }
        } else if (member.equals("T")){
            if(totalBelanja >= 500000){
                persenDiskon = 20.0;
                jumlahDiskon = totalBelanja / 100 * persenDiskon;
            } else {
                persenDiskon = 10.0;
                jumlahDiskon = totalBelanja / 100 * persenDiskon;
            }
        }

        System.out.println("Total Diskon: " + persenDiskon + "% (" + jumlahDiskon +")");
        System.out.println("Total Bayar Akhir: " + (totalBelanja - jumlahDiskon));
    }
}