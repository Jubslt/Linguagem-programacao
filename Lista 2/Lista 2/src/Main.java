import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, raiz;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero real:");

        n1 = scanner.nextDouble();

        raiz = Math.sqrt(n1);

        if (n1 > 0) {


            System.out.println("A raiz desse número é:" + raiz);
        } else {

            System.out.println("Valor inválido.");
        }
        scanner.close();
    }
}