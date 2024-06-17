import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println(" Digite o valor da temperatura em graus Celcius:");
        double number1= in.nextInt();
        double Fahrenheit = (number1) * 1.8 + 32;
        System.out.println(" A temperatura de Celsius em Fahrenheit é:" + Fahrenheit);
    }
}