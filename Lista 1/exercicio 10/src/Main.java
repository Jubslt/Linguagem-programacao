import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite em milhas");
        double number1= in.nextInt();
        double quilômetros = (number1) * 1.6;
        System.out.println(" A distância em quilômetros é" + quilômetros );
    }
}