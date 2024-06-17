import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean jogadorPerdeu = false;

            System.out.println("Bem-vindo ao Jogo da Tabuada!");
            System.out.println("Você deve responder corretamente a cada operação para continuar.");
            System.out.println("Se errar, o jogo termina.");

            for (int tabuada = 1; tabuada <= 10; tabuada++) {
                for (int i = 1; i <= 10; i++) {
                    int resultadoEsperado = tabuada * i;
                    System.out.print(tabuada + " x " + i + " = ");

                    int resposta = scanner.nextInt();

                    if (resposta != resultadoEsperado) {
                        jogadorPerdeu = true;
                        break;
                    }
                }

                if (jogadorPerdeu) {
                    System.out.println("Você errou! Fim de jogo.");
                    break;
                } else {
                    System.out.println("Você acertou a tabuada do " + tabuada + "!");
                }
            }

            if (!jogadorPerdeu) {
                System.out.println("Parabéns! Você acertou todas as tabuadas!");
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            String jogarNovamenteStr = scanner.next();
            jogarNovamente = jogarNovamenteStr.equalsIgnoreCase("s");
        }

        System.out.println("Obrigado por jogar!");
    }
}