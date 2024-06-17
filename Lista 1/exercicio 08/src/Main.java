import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite polegada: ");
        double number1= in.nextInt();
        double milímetro= (number1) * 25.4;
        System.out.println(" Em milímetro fica: "+ milímetro);
    }
}