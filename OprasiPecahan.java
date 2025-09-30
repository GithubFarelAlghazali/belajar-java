import java.util.Scanner;

public class OprasiPecahan{
    public static void  main(String[] args){
       
         // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Input 
        int a  = scanner.nextInt();
        int b  = scanner.nextInt();
        int c  = scanner.nextInt();
        int d  = scanner.nextInt();
       
       int x,y;
      // penjumlahan
       x  = (a*d + b*c) ;
       y = (b*d) ;
       System.out.println("penjumlahan: " + x + '/' + y);
      // pengurangan
       x  = (a*d - b*c) ;
       y = (b*d) ;
       System.out.println("pengurangan: " + x + '/' + y);
      // perkalian
       x  = (a*c) ;
       y = (b*d) ;
       System.out.println("perkalian: " + x + '/' + y);
      // pembagian
       x  = (a*d ) ;
       y = (b*c) ;
       System.out.println("pembagian: " + x + '/' + y);
     

           
        // tutup scanner
        // scanner.close();
    }
}