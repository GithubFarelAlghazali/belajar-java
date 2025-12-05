public class SecondMinMax{
    public static void main(String[] args) {
        int[] array = {12, 53, 24, 10, 22, 38, 64, 39};

        int maxNum = array[0];
        int minNum = array[0];
        int secMax = array[0];
        int secMin = array[0];

        for(int num : array){
            if(num >= maxNum){
                secMax = maxNum;
                maxNum = num;
            }

            if(num <= minNum){
                secMin = minNum;
                minNum = num;
            }
            
        }   

        System.out.print("Data array : ");
        for(int num : array){
            System.out.print(num + (num == array[(array.length) - 1] ? "" : ",") );
        }
        System.out.println();

        System.out.println("Nilai terkecil kedua: " + secMin);
        System.out.println("Nilai terbesar kedua: " + secMax);
    }
}