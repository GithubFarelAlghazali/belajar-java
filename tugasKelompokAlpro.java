import java.util.Scanner;

public class tugasKelompokAlpro{
    Scanner input = new Scanner(System.in);
    void luasKelilingPersegi(){
        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();
        int luas = sisi * sisi;
        int keliling = sisi * 4; 
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }

    void luasKelilingLingkaran(){
        System.out.print("Masukkan jari-jari: ");
        int jari = input.nextInt();
        double luas = jari * jari * Math.PI;
        double keliling = 2 * Math.PI * jari ; 
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
  
    void luasKelilingSegitigaSiku(){
        System.out.print("Masukkan alas: ");
        int alas = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();
        double gradien  = Math.sqrt((alas * alas) + (tinggi * tinggi));
        double luas = (alas * tinggi) / 2;
        double keliling = alas + tinggi + gradien ; 
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
  
    public static void main(String[] args){
        tugasKelompokAlpro app = new tugasKelompokAlpro();
        Scanner input = new Scanner(System.in);

        System.out.println("===KALKULATOR BANGUN DATAR===");
        System.out.println("1. Luas & Keliling Persegi");
        System.out.println("2. Luas & Keliling Lingkaran");
        System.out.println("3. Luas & Keliling Segitiga");
        System.out.print("Pilih menu: ");

        int menu = input.nextInt();

        switch (menu) {
            case 1:
                app.luasKelilingPersegi();
                break;
            case 2:
                app.luasKelilingLingkaran();
                break;
            case 3:
                app.luasKelilingSegitigaSiku();
                break;
            default:
                throw new AssertionError();
        }
    }
}