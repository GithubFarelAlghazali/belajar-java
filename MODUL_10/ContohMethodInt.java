public class ContohMethodInt{
    int hitungPersegi(int sisi){
        return sisi * sisi;
    }

    public static void main(String[] args) {
        ContohMethodInt obj = new ContohMethodInt();

        int hasil = obj.hitungPersegi(4);
        System.out.print("Luas persegi adalah "+hasil +" cm");
    }
}