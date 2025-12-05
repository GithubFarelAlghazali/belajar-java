import java.util.Scanner;

public class tugasKelompokAlpro{
    Scanner input = new Scanner(System.in);
    boolean isValid;
    int sisi1, sisi2;
    
    void isValidNumber(String input){
        try {
            Integer.parseInt(input);
            isValid = true;
        } catch (Exception e) {
            isValid =  false;
        }
    }

    void inputDanValidasi(String pesan, boolean satuSisi){
        String userInput;
        while(true){
            System.out.print(pesan);
            userInput = input.nextLine();
            isValidNumber(userInput);
            if(isValid){
                if(satuSisi){
                    sisi1 =  Integer.parseInt(userInput);
                } else {
                    sisi2 =  Integer.parseInt(userInput);
                }
                break;
            } else {
                System.out.println("Input must a number, try again!");
            }
        }
    }

    void luasKelilingPersegi(){
        // double sisi = inputDanValidasi("Masukkan sisi: ");
        inputDanValidasi("Masukkan sisi: ", true);
        int sisi = sisi1;
        double luas = sisi * sisi;
        double keliling = sisi * 4; 
        System.out.println("Luas persegi: " + luas);
        System.out.println("Keliling persegi: " + keliling);
    }

    void luasKelilingLingkaran(){
        inputDanValidasi("Masukkan jari-jari: ", true);
        int jari = sisi1;
        double luas = jari * jari * Math.PI;
        double keliling = 2 * Math.PI * jari ; 
        System.out.println("Luas lingkaran: " + luas);
        System.out.println("Keliling lingkaran: " + keliling);
    }
  
    void luasKelilingSegitigaSiku(){
        inputDanValidasi("Masukkan alas: ", true);
        inputDanValidasi("Masukkan tinggi: ", false);
        int alas = sisi1;
        int tinggi = sisi2;
        double gradien  = Math.sqrt((alas * alas) + (tinggi * tinggi));
        double luas = (alas * tinggi) / 2;
        double keliling = alas + tinggi + gradien ; 
        System.out.println("Luas segitiga: " + luas);
        System.out.println("Keliling segitiga: " + keliling);
    }
  

    public static void main(String[] args){
        tugasKelompokAlpro app = new tugasKelompokAlpro();
        Scanner input = new Scanner(System.in);

        
        while (true) { 
        System.out.println("===KALKULATOR BANGUN DATAR===");
        System.out.println("1. Luas & Keliling Persegi");
        System.out.println("2. Luas & Keliling Lingkaran");
        System.out.println("3. Luas & Keliling Segitiga");
        System.out.print("Pilih menu: ");

        String opsi = input.nextLine();
        app.isValidNumber(opsi);
            if(app.isValid){
            int opsiNum = Integer.parseInt(opsi);
            switch (opsiNum) {
                case 1:
                    app.luasKelilingPersegi();
                    break;
                case 2:
                    app.luasKelilingLingkaran();
                    break;
                case 3:
                    app.luasKelilingSegitigaSiku();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia, coba pilihan lain");
                   
            }

                break;
            } else {
                System.out.println("Input must a number, try again!");
            }
        }}
    }
