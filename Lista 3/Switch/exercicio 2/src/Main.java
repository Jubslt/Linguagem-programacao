import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número");
        double n1 = in.nextDouble();
        System.out.println("Digite um número");
        double n2 = in.nextDouble();
        System.out.println("1. Soma \n 2. Subtração \n 3. Multiplicação \n 4. Divisão");

        option = in.nextInt();
        switch (option) {
            case 1:
                double soma = n1 + n2;
                System.out.println("Resultado" + soma);
                break;
            case 2:
                double subtração = n1 - n2;
                System.out.println("Resultado"+ subtração);
                break;
            case 3:
                double multiplicação = n1 * n2;
                System.out.println("Resultado"+ multiplicação);
                break;
            case 4:
                double divisão = n1 / n2;
                System.out.println("Resultado"+ divisão);
                break;
            default:
                System.out.println("Opção ínvalida!");


        }
    }
}