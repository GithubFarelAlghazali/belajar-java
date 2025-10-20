public class GuGuDanTest{
    public static void main(String[] args){
        int i = 1;
        int max = 9;
        int firstNum = 9;

        do{
           System.out.println(firstNum + " * " + i + " = " + (i*firstNum) + ", "); 
           i++;
        } while (i <= max);
    }
}