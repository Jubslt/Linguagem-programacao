import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;

        Scanner in = new Scanner(System.in);
        System.out.println("Insira o dinheiro: ");
        double dinheiro = in.nextDouble();
        System.out.println(" 1. Café expresso R$0,50 \n 2. Café Longo R$1,00 \n 3. Capuccino R$2,50 \n 4. Chocolate R$2,00 \n Escolha uma opção:");

        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Bebida selecionada: Café expresso");
                if (dinheiro > 0.50) {
                    double expresso = dinheiro - 0.50;
                    System.out.println(" Seu troco é: " + expresso);
                } else if (dinheiro < 0.50) {
                    double expres = dinheiro - 0.50;
                    System.out.println(" Falta: " + expres);
                }
                break;
            case 2:
                System.out.println("Bebida selecionada: Café Longo");
                if (dinheiro > 1.00) {
                    double longo = dinheiro - 1.00;
                    System.out.println("Seu troco é:" + longo);
                } else if (dinheiro < 1.00) {
                    double grande = dinheiro - 1.00;
                    System.out.println("Falta:" + grande);
                }
                break;
            case 3:
                System.out.println("Bebida selecionada: Capuccino");
                if (dinheiro > 2.50) {
                    double capu = dinheiro - 2.50;
                    System.out.println("Seu troco é:" + capu);
                } else if (dinheiro < 2.50) {
                    double cciono = dinheiro - 2.50;
                    System.out.println("Falta:" + cciono);
                }
                break;
            case 4:
                System.out.println("Bebida selecinada: Chocolate");
                if (dinheiro > 2.00) {
                    double cho = dinheiro - 2.00;
                    System.out.println("Seu troco é:" + cho);
                } else if (dinheiro < 2.00) {
                    double late = dinheiro - 2.00;
                    System.out.println("Falta:" + late);
                }
                break;
            default:
                System.out.println("Opção ínvalida!");
        }


    }
}