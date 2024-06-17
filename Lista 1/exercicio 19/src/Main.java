import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o coeficiente 'a':");
        double a = in.nextDouble();
        System.out.println("Digite o coeficiente 'b':");
        double b = in.nextInt();

        if (a == 0) {

            if (b == 0) {

                System.out.println("A equação é indeterminada (0 = 0), possui infinitas soluções.");

            } else {

                System.out.println("A equação é impossível (0≠ 0), não possui solução.");

            }

        } else {

            double solucao = -b / a;

            System.out.println("A solução da equação é: x = " + solucao);
        }
    }
}