import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a nota 1" );
        double number1= in.nextInt();
        System.out.println("Digite a nota 2:");
        double number2= in.nextInt();
        double media= (number1+number2 *2) /3;
        System.out.println("A média vai ser:" + media);

    }
}