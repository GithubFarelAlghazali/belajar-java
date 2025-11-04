import java.util.Scanner;

public class CekNilai{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int jumlahMahasiswa = in.nextInt();
        int[] nilai = new int[jumlahMahasiswa];

        for(int i = 0; i < jumlahMahasiswa; i++){
            nilai[i] = in.nextInt();
        }

        int terbaik = nilai[0];
        for(int i = 1; i < jumlahMahasiswa; i++){
            if(nilai[i] > terbaik){
                terbaik = nilai[i];
            }
        }

        for(int i = 0; i < jumlahMahasiswa; i++){
            String huruf;
            if(nilai[i] >= terbaik - 5){
                huruf = "A";
            } else if(nilai[i] >= terbaik - 10){
                huruf = "B";
            } else if(nilai[i] >= terbaik - 15){
                huruf = "C";
            } else if(nilai[i] >= terbaik - 20){
                huruf = "D";
            } else {
                huruf = "F";
            }
            System.out.println("Mahasiswa " + i + " memiliki nilai " + nilai[i] + " dan mendapat nilai " + huruf);
        }
    }
}