public class PrintStarTest{
    public static void main(String[] args) {
        String star= "* ";
        int size = 10;
        for(int row = 1; row <= size; row++){
            System.out.println(star);
            star = star + "* ";            
        }
    }}
