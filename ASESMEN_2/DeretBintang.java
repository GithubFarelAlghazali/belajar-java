// Nama: Muhammad Farel Alghazali
// NIM: 109092500033

import java.util.Scanner;

public class DeretBintang{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if(n % 2 == 0){
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    System.out.print(i + " ");
                    for(int star = 1; star <= i; star++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        } else {
            for(int i = n; i >= 1; i--){
                if(i % 2 != 0){
                    System.out.print(i + " ");
                    for(int star = 1; star <= i; star++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}