import java.util.Scanner;

public class TestMenu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opsi;

        System.out.println("============================");
        System.out.println("Masukkan menu yang anda inginkan: ");
        System.out.println("1. Mendaftar");
        System.out.println("2. Lupa nama pengguna");
        System.out.println("3. Temukan kata sandi anda");
        System.out.println("4. End");
        System.out.println("============================");
        int nomorOpsi = scanner.nextInt();

        switch (nomorOpsi) {
            case 1:
                opsi = "Pendaftaran berhasil yeyy!!";
                break;
            case 2:
                opsi = "Waduh, coba bikin nama baru deh";
                break;
            case 3:
                opsi = "Pengambilan kata sandi berhasil!!";
                break;
            case 4:
                opsi = "Udahan nih? daaa.. :(";
                break;
            default:
                throw new AssertionError();
        }

        System.out.println(opsi);
        
    }
}