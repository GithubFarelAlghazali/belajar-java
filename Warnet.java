import java.util.Scanner;

public class Warnet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int jumlahPelanggan = scanner.nextInt();
        int total = 0;
        
        for(int i = 1; i <= jumlahPelanggan; i++){
            String nama = scanner.next();
            int lamaJam = scanner.nextInt();
            String tipe = scanner.next();
            int totalBiaya = 0;
            
            if(tipe.equals("biasa")){
                totalBiaya = lamaJam * 10000;
            } else if(tipe.equals("gaming")){
                totalBiaya = lamaJam * 14000;
            }
            
            total += totalBiaya;
            System.out.println("Total yang harus dibayar " + nama + " sebesar " + totalBiaya);
        }
        
            System.out.println("Biaya total sebesar " + total);
        
    }
}