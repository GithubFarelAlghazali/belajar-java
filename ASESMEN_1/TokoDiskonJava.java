import java.util.Scanner;

public class TokoDiskonJava{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlahBarang, hargaSatuan, total, diskon, totalAkhir;
        boolean isLoop = false;

    do { 
       System.out.print("Masukkan nama barang: ");
       input.nextLine();
       System.out.print("Masukkan jumlah barang: ");
       jumlahBarang = input.nextInt();
       System.out.print("Masukkan harga per barang: ");
       hargaSatuan = input.nextInt();
       input.nextLine();

       total = jumlahBarang * hargaSatuan;
        if(total > 500000){
            diskon = 10;
        } else if(total <= 500000 && total >= 250000){
            diskon = 5;
        } else {
            diskon = 0;
        }

       System.out.println("Total sebelum diskon: " + total);
       System.out.println("Diskon: " + diskon + "%");

        totalAkhir = total - (total / 100 * diskon);
       System.out.println("Total setelah diskon: " + totalAkhir);


       System.out.print("Apakah ingin menghitung ulang? (y/n): ");
        String ulang = input.nextLine();

        if(ulang.equals("y")){
            isLoop = true;
        } else if (ulang.equals("n")){
            isLoop = false;
            System.out.println("Program selesai");
        }

    } while (isLoop);
    }
}