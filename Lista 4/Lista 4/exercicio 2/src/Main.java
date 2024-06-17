import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite" + (i+1) + "º número inteiro: ");
            int numero = scanner.nextInt();


            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }


        System.out.println("O maior número digitado é: " + maior);
        System.out.println("O menor número digitado é: " + menor);


    }
}