public class GuGuDanTest{
    public static void main(String[] args){
        int row = 1;
        int col = 1;
        int max = 9;
  
        while(row <= max){
            while(col <= max){
                System.out.print(row + " * " + col + " = " + (row * col) + (col == max ? " \t" : ",\t"));
                col++;
            }
            System.out.println();
            row++;
            col = 1;
        }
       
    }
}