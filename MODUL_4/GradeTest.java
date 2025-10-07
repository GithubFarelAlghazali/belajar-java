import java.util.Scanner;

public class GradeTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.print("Masukkan nilai: ");
        score = scanner.nextInt();

        System.out.println("A: " + (score >= 90 && score <= 100 ?  "benar" :  "salah"));
        System.out.println("B: " + (score >= 80 && score <= 89 ?  "benar" :  "salah"));
        System.out.println("C: " + (score >= 70 && score <= 79 ?  "benar" :  "salah"));
        System.out.println("D: " + (score >= 60 && score <= 69 ?  "benar" :  "salah"));
       
    }
}