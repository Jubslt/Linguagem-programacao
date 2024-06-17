import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;
        Scanner in = new Scanner(System.in);
        System.out.println("1. Círculo \n 2. Triangulo Retângulo \n 3. Retângulo");
        System.out.println("Informe base");
        double n1 = in.nextDouble();
        System.out.println("Informe altura");
        double n2 = in.nextDouble();

        option = in.nextInt();
        switch (option) {
            case 1:
                System.out.println("Digite o valor do raio");
                double r = in.nextInt();
                double resultado = 3.14 * r * r;
                System.out.println("O valor da área do círculo é:");
                double perimetro = 2 * 3.14 * r;
                System.out.println("O valor do perímetro é:");
                break;
            case 2:
                double area = n1 * n2 / 2;
                System.out.println("O valor da área é:" + area);
                double hipotenusa = Math.sqrt(n1 * n1 + n2 * n2);
                double perim = n1 + n2 + hipotenusa;
                System.out.println(" O valor do perímetro é:" + perim);
                break;
            case 3:
                double a = n1 + n2;
                System.out.println("O valor da área é:" + a);
                double per = 2 * (n1 + n2);
                System.out.println("O valor do perímetro é:" + per);
                break;


        }





        }
    }
