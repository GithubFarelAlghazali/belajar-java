public class ScoreArrayTest{
    public static void main(String[] args){
        int[] scores = {93,87,90};
        int totalScore = 0;

        System.out.println("Bahasa Korea: " + scores[0]);
        System.out.println("Bahasa Inggris: " + scores[1]);
        System.out.println("Matematika: " + scores[2]);
 
        for (int score : scores){
            totalScore += score;
        }

        double rataRata = (double) totalScore / scores.length;
        System.out.println("Rata-rata: " + rataRata);
    }
}