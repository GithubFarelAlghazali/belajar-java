import java.util.Scanner;

public class beliSampoHujan {
    
    public static void haveSampoHujan(String habisSampo, String hujan) {
        /*
        I.S.: Terdefinisi 2 buah string yang menyatakan status sampo ("ya" berarti kehabisan sampo 
              atau "tidak" bila tidak kehabisan sampo) dan status turun hujan ("ya" berarti hujan turun 
              atau "tidak" berarti tidak turun)
        F.S.: Tercetak string "pergi ke minimarket" atau "tidak pergi ke minimarket"
        */
        if(habisSampo.toLowerCase().equals("ya")){
            if(hujan.toLowerCase().equals("ya")){
                System.out.println("tidak pergi ke minimarket");
            } else{
                System.out.println("pergi ke minimarket");
            }
        } else{
                System.out.println("tidak pergi ke minimarket");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String habisSampo = scanner.next();
        String hujan = scanner.next();
        haveSampoHujan(habisSampo, hujan);
        scanner.close();
    }
}