import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int n3 = scanner.nextInt();
        
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        if (n2 > n3) {
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        if (n1 > n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println("Os números em ordem crescente são: " + n1 + ", " + n2 + ", " + n3);


    }
}

