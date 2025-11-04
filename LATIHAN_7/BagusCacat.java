import java.util.Scanner;

public class BagusCacat{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBagus = 0, totalCacat = 0;

        while(true){
            String status = input.next();
            int jumlah = input.nextInt();

            if(status.equals("selesai")){
                break;
            } else{
                switch (status) {
                    case "bagus":
                        totalBagus = totalBagus + jumlah;
                        break;
                    case "cacat":
                        totalCacat = totalCacat + jumlah;
                        break;
                
                    default:
                        throw new AssertionError();
                    }
            }
        }

        System.out.println(totalBagus + " " + totalCacat);
    }
}