import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int option;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor:");
        double valor= in.nextDouble();
        System.out.println(" 1. Débito \n 2.Pix \n 3. Crédito \n Esolha a forma de pagamento:");


        option = in.nextInt();

        switch (option){
            case 1:
                double debito = valor - (valor * 0.05);
                System.out.println("No débito o valor ficará: " + debito);
                break;
            case 2:
                double pix = valor - (valor * 0.1);
                System.out.println("No pix o valor ficará: " + pix);
                break;
            case 3:
                System.out.println(" Escolha o número de parcelas: ");
                double parcelas = in.nextDouble();
                if (parcelas <= 4) {
                    double juros = valor * (1 + 0.02) / parcelas;
                    System.out.println("O valor de cada parcela ficará: " + juros);
                } else {
                    double ju = valor * (1 + 0.05) / parcelas;
                    System.out.println("O valor de cada parcela ficará:" + ju);
                }
                break;
            default:
                System.out.println("Opção de pagamento ínvalida!");
                return;

        }
    }

}