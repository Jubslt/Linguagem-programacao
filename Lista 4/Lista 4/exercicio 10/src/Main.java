import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para gerar a sequência de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Sequência de Fibonacci até o " + n + "º termo:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}