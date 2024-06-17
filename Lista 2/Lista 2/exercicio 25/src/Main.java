import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota da primeira prova: ");
        double n1 = scanner.nextDouble();

        System.out.print("Nota da segunda prova: ");
        double n2 = scanner.nextDouble();
        double media = (n1 + n2) / 2;
        System.out.println("Média: " + media);

        if (media >= 8.5) {
            System.out.println("Conceito: A");
        } else if (media >= 7 && media < 8.5) {
            System.out.println("Conceito: B");
        } else if (media >= 5 && media < 7) {
            System.out.println("Conceito: C");
        } else {
            System.out.println("Conceito: D");
        }


    }
}