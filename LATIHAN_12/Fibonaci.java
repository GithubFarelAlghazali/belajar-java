public class Fibonaci{
    long hitungFibonaci(int n){
        if(n <= 1){
            return n;
        }

        long sebelum = 0;
        long saatIni = 1;

        for(int i = 2; i <= n; i++){
            long sementara = saatIni;
            saatIni = sebelum + saatIni;
            sebelum = sementara;
        }
        return saatIni;
    }

    public static void main(String[] args){
        Fibonaci app = new Fibonaci();
        int num= 4;
        long hasil = app.hitungFibonaci(num);
        System.out.println(hasil);
    }
}