import java.util.Scanner;

public class PertemuanRahasia{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int totalPertemuan = 0;

        for(int hari = 1; hari <= 365; hari++){
            if(hari % x == 0 || hari % y == 0){
                totalPertemuan++;
            }
        }

        System.out.println(totalPertemuan);
    }
}