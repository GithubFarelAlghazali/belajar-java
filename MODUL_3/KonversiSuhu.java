import java.util.Scanner;

public class KonversiSuhu{
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan suhu dalam Celcius: ");
    double celcius= scanner.nextDouble();

    double fahrenheit = (celcius * 9/5) + 32;
    double reamur = celcius * 4/5;
    double kelvin = celcius + 273.15;

    System.out.println("Suhu dalam Fahrenheit: "+ fahrenheit);
    System.out.println("Suhu dalam Reamur: "+ reamur);
    System.out.println("Suhu dalam Kelvin: "+ kelvin);

    scanner.close();
    }
}