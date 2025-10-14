import java.util.Scanner;

public class TestMenu{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opsi;

        System.out.println("============================\n1. Mendaftar\n2. Lupa nama pengguna\n3. Temukan kata sandi anda\n4. End\n============================");
        System.out.print("Masukkan menu yang anda inginkan: ");
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
                opsi = "Udahan nih? daaa.. :()";
                break;
            default:
                throw new AssertionError();
        }

        System.out.println(opsi);
        
    }
}