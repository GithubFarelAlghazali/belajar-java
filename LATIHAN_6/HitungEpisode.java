import java.util.Scanner;

public class HitungEpisode{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        int totalDurasi = 0;
        
        while(loop){
            int eps = scanner.nextInt();
            int durasi = scanner.nextInt();

            if(eps == 0 && durasi == 0){
                loop = false;
            } else {
                if(eps % 2 != 0){
                    totalDurasi += durasi;
                }
            }
        }
        System.out.println(totalDurasi);
    }}
