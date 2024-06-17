import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double n1, n2, n3;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida de um dos lados do triangulo: ");
        n1 = scanner.nextDouble();
        System.out.print("Digite a medida de um dos lados do triangulo: ");
        n2 = scanner.nextDouble();
        System.out.print("Digite a medida de um dos lados do triangulo: ");
        n3 = scanner.nextDouble();

        if (n1 < (n2+n3) && n1 > (n2-n3) && n2 < (n1+n3) && n2 > (n1-n3) && n3 < (n1+n2) && n3 > (n1-n2)) {
            System.out.println("Essas medidas formam um triângulo ");
        }
        else {
            System.out.println("Essas medidas não formam um triângulo ");
        }
        if (n1 == n2 && n1 == n3) {
            System.out.println("O triângulo é equilátero");
        } else if (n1 == n2 || n1 == n3 || n2 == n3) {
            System.out.println("O triângulo é isósceles ");
        }
        else {
            System.out.println("O triângulo é escaleno ");
        }


    }
}
