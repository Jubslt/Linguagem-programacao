import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor do raio o cilindro");
        double raio1 = in.nextInt();

        System.out.println("Digite o valor da altura do cilindro");
        double altura1 = in.nextInt();
        double volume = 3.14 * (raio1)*( raio1 ) * (altura1);
        System.out.println("O valor do volume do cilindro é" + volume);
    }
}