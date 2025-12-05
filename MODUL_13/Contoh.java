public class Contoh{
    public static void main(String[] args){
    int[] array = {12, 3, 5, 7, 19, 1, 25, 17};

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

        System.out.println("Nilai Minimum: " + minNum);
        System.out.println("Nilai Maksimum: " + maxNum);
    }
}