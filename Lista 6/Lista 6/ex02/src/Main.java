import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("DIGITE UM  NÚMERO: ");
        int number = scanner.nextInt();

        System.out.println(fatorial(number));
        scanner.close();
    }

    static int fatorial(int n){
        int soma = 1;
        for(int i = 1; i <= n; i++){
            soma *= i;
        }
        return soma;
    }

}
