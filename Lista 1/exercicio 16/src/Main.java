import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Digite o valor do raio:");
        double raio1= in.nextInt();
        System.out.println("Digite a altura: ");
        double altura1= in.nextInt();
        double volume= 3.14* (raio1) *(raio1) *(altura1) /3;
        System.out.println("O valor do volume do cone é" +volume);
    }
}