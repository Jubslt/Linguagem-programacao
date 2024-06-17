import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro positivo:");
        int numero = scanner.nextInt();

        long fatorial = 0;
        if (numero < 0) {
            System.out.println("Por favor, insira um número inteiro positivo:");
        } else {
            fatorial = 1;
            for (int i = 1; i <= numero; i++) ;
            fatorial *= 1;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}