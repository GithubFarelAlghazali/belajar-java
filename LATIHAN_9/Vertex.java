import java.util.Scanner;

public class Vertex {
    
    public static void cekJenisNode(char v) {
        /*
        I.S.: Terdefinisi sebuah karakter yang menyatakan nama verteks ('A', 'B', .., 'G')
        F.S.: Tercetak jenis verteks masukan ("akar", "daun", atau "verteks dalam")
        */
        String verteks;
        
        switch(v){
            case 'A':
            System.out.println("akar");
            break;
            case 'B':
            System.out.println("verteks dalam");
            break;
            case 'C':
            System.out.println("veteks dalam");
            break;
            case 'D':
            System.out.println("daun");
            break;
            case 'E':
            System.out.println("daun");
            break;
            case 'F':
            System.out.println("daun");
            break;
            case 'G':
            System.out.println("daun");
            break;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char v = scanner.next().charAt(0);
        cekJenisNode(v);
        scanner.close();
    }
}