import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número");
        double number1= in.nextInt();
        double resultado= 3.14 * (number1*number1);
        System.out.println("O resultado da conte é:" + resultado);
    }
}