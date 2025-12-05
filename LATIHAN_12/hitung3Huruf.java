import java.util.Scanner;

public class hitung3Huruf{
    static void tigaTerakhir(String text){
        if(text.length() < 3){
            System.out.println(text);
        } else{
        int mulaiPotong = text.length() - 3;
        String hasil = text.substring(mulaiPotong);
        System.out.print(hasil);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        hitung3Huruf app = new hitung3Huruf();
 
        String text = input.nextLine();
        app.tigaTerakhir(text);
    }
}