import java.util.Scanner;

public class GradeTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        String nilai;

        System.out.print("Masukkan nilai: ");
        score = scanner.nextInt();

        if(score > 90 && score <= 100){
            nilai = "A";}
        else if(score > 80  ){
            nilai = "B";}
        else if(score > 70 ){
            nilai= "C";}
        else if(score > 60 ){
            nilai = "D";}
        else{
            nilai = "E";}
        
        System.out.println("Nilai: " + nilai);
        
    }
}