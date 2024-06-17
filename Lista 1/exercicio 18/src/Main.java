import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira raiz (x1):");
        double raiz1 = scanner.nextDouble();
        System.out.println("Digite a segunda raiz (x2):");
        double raiz2 = scanner.nextDouble();
        double a = 1;
        double b = -(raiz1 + raiz2);
        double c = raiz1* raiz2;
        System.out.println("A equação do segundo grau é: ");
        System.out.println("x^2 + (" + b + ")x + (" + c + ") = 0");
        scanner.close();
    }
}