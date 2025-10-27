import java.util.Scanner;

public class MauJalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean tidakHujan = scanner.nextBoolean();
        boolean bagusMood = scanner.nextBoolean();

        if(tidakHujan && bagusMood) {
            System.out.println("keluar jalan-jalan");
        } else {
            System.out.println("diam di rumah saja");
        }

        scanner.close();
    }
}
