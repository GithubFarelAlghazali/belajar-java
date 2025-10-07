import java.util.Scanner;

public class CekDigitPerkalian{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int a,b, hasil;
    String hasilString;

    System.out.print("Masukkan angak pertama: ");
    a = scanner.nextInt();
    System.out.print("Masukkan angak kedua: ");
    b = scanner.nextInt();
    hasil = b*a;
    hasilString = String.valueOf(hasil);

   if (hasil >= 0) {
       if(hasilString.length()==1){
       System.out.println("Angka satu digit");
       } else if(hasilString.length()==2){
       System.out.println("Angka dua digit");}
         else if(hasilString.length()>=3){
         System.out.println("Angka tiga digit atau lebih");}
       
   }else{
       System.out.println("Angka negatif tidak diperiksa");}
   
    scanner.close();
}
}