public class ContohIfElse{
    public static void main(String[] args){
        int x = 8;

        // contoh if
        if(x > 10){
            System.out.println("x lebih besar dari 10");
        }

        // contoh if else
        if(x > 5){
            System.out.println("x lebih besar dari 5");
        }else{
            System.out.println("x tidak lebih besar dari 5");
        }

        // contoh else if
        if(x > 10){
            System.out.println("x lebih besar dari 10");
        } else if(x > 5){
            System.out.println("x lebih besar dari 5, tapi tidak lebih besar dari 10");
        } else if(x > 0){
            System.out.println("x lebih besar dari 0, tapi tidak lebih besar dari 5");
        } else {
            System.out.println("x kurang dari atau sama dengan 0");
        }

     
        System.out.print(x);
    }
}