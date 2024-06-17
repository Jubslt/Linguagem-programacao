import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite em km/h");
        double number1 = in.nextInt();
        double metros = (number1) / 3.6;
        System.out.println("Em metros por segundo é" + metros);

    }
}