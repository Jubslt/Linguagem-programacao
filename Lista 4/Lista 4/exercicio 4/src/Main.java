import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                System.out.println("Tabela de Conversão de Celsius para Fahrenheit:");
                System.out.println("----------------------------------------------");
                System.out.println("Celsius\t|\tFahrenheit");
                System.out.println("----------------------------------------------");

                for (int celsius = -80; celsius <= 80; celsius += 10) {
                    double fahrenheit = (9.0 / 5.0) * celsius + 32;
                    System.out.printf("%d\t|\t%.2f\n", celsius, fahrenheit);
                }
            }
        }
