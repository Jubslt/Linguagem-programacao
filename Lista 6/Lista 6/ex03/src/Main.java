import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(elevado(x, y));
        scanner.close();

    }

    static int elevado(int x, int y){
        int resultado = 1;
        for(int i = 0; i < y; i++){
            resultado *= x;
        }
        return resultado;
    }
}