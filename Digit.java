public class Digit {
    public static void main(String[] args) {
        int angka = 12673494;
        int totalAngka = 0;
        String angkaString = String.valueOf(angka);
        String[] angkaArray = angkaString.split("");
        
        for(int i = angkaArray.length - 1; i >= 0; i--){
            System.out.print(angkaArray[i] + " ");
            totalAngka += Integer.parseInt(angkaArray[i]);
        }
        
        System.out.println();
        System.out.print( totalAngka);
    }
}