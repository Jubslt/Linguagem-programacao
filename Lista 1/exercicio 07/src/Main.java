import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Digite milímetro: ");
        double number1= in.nextInt();
        double polegada = (number1) / 25.4;
        System.out.println(" Em polegadas fica: " + polegada);


    }
}