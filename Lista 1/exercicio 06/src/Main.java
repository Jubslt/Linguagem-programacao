import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite m/s: ");
        double number1= in.nextInt();
        double quilômetro = (number1) * 3.6;
        System.out.println(" Em quilômetros por hora é: " + quilômetro);

    }
}