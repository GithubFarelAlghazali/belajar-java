public class Pyramid{
    public static void main(String[] args){
        int size = 10;
        for(int row = 1; row <= size; row++){
            for(int space = 1; space <= size - row; space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= row; star++){
                System.out.print("o ");
            }
            System.out.println();
        }
    }
}