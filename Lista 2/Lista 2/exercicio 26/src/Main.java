import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Escolha um número inteiro entre 5 e 9");
        double n1= in.nextDouble();
        if (n1>5 && n1<9){
            System.out.println("VÁLIDO");
        } else {
            System.out.println("INVÁLIDO");
        }

    }
}






