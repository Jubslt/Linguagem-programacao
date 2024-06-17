import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Digite o coeficiente a: ");
        double a = in.nextDouble();
        System.out.print("Digite o coeficiente b: ");
        double b = in.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("A equação tem infinitas soluções.");
            } else {
                System.out.println("A equação não tem solução.");
            }
        } else {
            double solucao = -b / a;
            System.out.println("A solução da equação é: " + solucao);
        }
    }
}