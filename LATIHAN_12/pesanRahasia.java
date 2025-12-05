import java.util.Scanner;

public class pesanRahasia{
    void bacaPesan(String text){
        char[] textArr = text.toCharArray();

        for(int i = 0; i <= text.length(); i++){
            if(i == 0 || i == 4 || i == 8 || i == 12){
                System.out.print(textArr[i]);
            }
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        pesanRahasia obj = new pesanRahasia();
        
        String text = input.nextLine();
        obj.bacaPesan(text);
    } 
}