import java.util.Scanner;

public class CekString {
    static final int nMax = 1000;
    
    public static void isiArray(char[] arr, int[] n, Scanner scanner) {
        /* 
        I.S.: Data tersedia dalam piranti masukan
        F.S.: arr telah terisi sejumlah karakter dari string inputan
        */
    
           String text = scanner.nextLine();
           n[0] = text.length();
           for(int i = 0; i < n[0]; i++){
               arr[i] = text.charAt(i);
           }
       
    }
    
    public static boolean isSudahAda(char c, char[] arr, int total) {
        /* Mengecek apakah karakter sudah ada dalam array */
        for(int i = 0; i < total; i++){
            if(arr[i] == c){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isVokal(char c) {
        /* isVokal mengembalikan true jika karakter merupakan huruf vokal false jika sebaliknya */
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o';
    }
    
    public static void prosesHurufVokal(char[] arr, int n, int[] total, char[] arrVokal) {
        /* 
        I.S.: Data tersedia dalam piranti masukan
        F.S.: arrVokal telah terisi huruf vokal dari kata string inputan
        catatan jika didalam array terdapat 2 huruf vokal yang sama maka yang dimasukkan cukup 1
        */
        for(int i = 0; i < n; i++){
            char c = arr[i];
            char low = Character.toLowerCase(c);
 
            if(Character.isLetter(c) && isVokal(low)){
                if(!isSudahAda(c, arrVokal, total[0])){
                    arrVokal[total[0]] = c;
                    total[0]++;
                }
            }
        }
    }
    
    public static void ProsesHurufKonsonan(char[] arr, int n, int[] total, char[] arrKonsonan) {
        /* 
        I.S.: Data tersedia dalam piranti masukan
        F.S.: arrKonsonan telah terisi huruf konsonan dari kata string inputan
        catatan jika didalam array terdapat 2 huruf Konsonan yang sama maka yang dimasukkan cukup 1
        */
        for(int i = 0; i < n; i++){
            char c = arr[i];
            char low = Character.toLowerCase(c);
            if(Character.isLetter(c) && !isVokal(low)){
                if(!isSudahAda(c, arrKonsonan, total[0])){
                    arrKonsonan[total[0]] = c;
                    total[0]++;
                }
            }
        }
    }
    public static void ProsesHurufKarakter(char[] arr, int n, int[] total, char[] arrKar) {
        /* 
        I.S.: Data tersedia dalam piranti masukan
        F.S.: arrKar telah terisi karakter selain huruf vokal dan konsonan dari kata string inputan
        catatan jika didalam array terdapat 2 karakter selain huruf vokal dan konsonan yang sama maka yang dimasukkan cukup 1
        */
        for(int i = 0; i < n; i++){
            char c = arr[i];
            boolean isHuruf = Character.isLetter(c);
            if(!isHuruf){
                if(!isSudahAda(c, arrKar, total[0])){
                    arrKar[total[0]] = c;
                    total[0]++;
                }
            }
        }
    }
    public static void cetakHuruf(char[] arr, int n) {
        /* 
        I.S.: array arr berisi sejumlah n karakter dari suatu string
        F.S.: total huruf vokal, total huruf konsonan, dan karakter lainnya
              beserta huruf vokalnya, konsonan, dan karakter lainnya ditampilkan di layar 
        */
        int[] totalVokal = new int[1];
        int[] totalKonsonan = new int[1];
        int[] totalKarakterLain = new int[1];
        char[] arrVokal = new char[nMax];
        char[] arrKonsonan = new char[nMax];
        char[] arrKarakterLain = new char[nMax];
        prosesHurufVokal(arr, n, totalVokal, arrVokal);
        ProsesHurufKonsonan(arr, n, totalKonsonan, arrKonsonan);
        ProsesHurufKarakter(arr, n, totalKarakterLain, arrKarakterLain);
        
        // CETAK VOKAL
        System.out.println(totalVokal[0]);
        if (totalVokal[0] == 0) System.out.println("Tidak ditemukan");
        else {
            for (int i = 0; i < totalVokal[0]; i++) System.out.print(arrVokal[i] + " ");
            System.out.println();
        }

        // CETAK KONSONAN
        System.out.println(totalKonsonan[0]);
        if (totalKonsonan[0] == 0) System.out.println("Tidak ditemukan");
        else {
            for (int i = 0; i < totalKonsonan[0]; i++) System.out.print(arrKonsonan[i] + " ");
            System.out.println();
        }

        // CETAK KARAKTER LAIN
        System.out.println(totalKarakterLain[0]);
        if (totalKarakterLain[0] == 0) System.out.println("Tidak ditemukan");
        else {
            for (int i = 0; i < totalKarakterLain[0]; i++) System.out.print(arrKarakterLain[i] + " ");
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arrC = new char[nMax];
        int[] N = new int[1];
        isiArray(arrC, N, scanner);
        cetakHuruf(arrC, N[0]);
        scanner.close();
    }
}