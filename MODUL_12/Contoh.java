public class Contoh{
    public static void main(String[] args) {
        int[] nilai = { 70, 85, 90, 75, 80 };
        int total = 0;
        
        for (int i = 0; i < nilai.length; i++) {
         total += nilai[i];
        } 
        
        double rataRata = (double) total / nilai.length;
        System.out.println("Rata-rata nilai: " + rataRata);
    }
}