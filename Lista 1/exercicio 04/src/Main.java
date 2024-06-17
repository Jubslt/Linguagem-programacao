import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Digite sua primeira nota : ");
        double n1 = in.nextInt();
        System.out.println("Digite sua segunda nota : ");
       double n2 = in.nextInt();
        double media = (n1 + n2) / 2;
        System.out.println("A sua media e" + media);

    }
}