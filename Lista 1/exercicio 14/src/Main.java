import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double b1=in.nextInt();
        System.out.println("Digite a altura: ");
        double a1= in.nextInt();
        double area1 = b1*a1/2 ;
        System.out.println("A area do triângulo retângulo é: "+area1);
    }
}