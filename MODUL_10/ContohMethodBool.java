public class ContohMethodBool{
    boolean cekGenap(int angka){
        return angka % 2 == 0;
    }

    public static void main(String[] args) {
        ContohMethodBool main = new ContohMethodBool();
        boolean isGenap = main.cekGenap(12);
        System.out.println(isGenap ? "Angka tersebut genap" : "Angka tersebut ganjil");
    }
}