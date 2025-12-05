public class FindMinMax{
    public static void main(String[] args) {
        int[] array = {12, 53, 24, 10, 22, 38, 64, 39};

        int maxNum = array[0];
        int minNum = array[0];

        for(int num : array){
            if(num >= maxNum){
                maxNum = num;
            }

            if(num <= minNum){
                minNum = num;
            }
            
        }   

        System.out.print("Data array : ");
        for(int num : array){
            System.out.print(num + (num == array[(array.length) - 1] ? "" : ",") );
        }
        System.out.println();

        System.out.println("Minimum: " + minNum);
        System.out.println("Maksimum: " + maxNum);
    }
}