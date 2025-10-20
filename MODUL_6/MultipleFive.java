public class MultipleFive{
    public static void main(String[] args){
        int hasil = 0;
        int total = 0;

        do{
            total = total + (hasil + 5 );
            System.out.println("(+"+ (hasil + 5 ) +") " + total );
            hasil = hasil + 5;
        }while(total <= 100);
    }
}