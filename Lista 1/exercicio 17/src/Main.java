import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println(" Digite o valor da velocidade inicial: ");
        double v1= in.nextInt();
        System.out.println("Digite o valor da aceleração:");
        double a=in.nextInt();
        System.out.println("Digite o valor do tempo do percurso: ");
        double t= in.nextInt();
        double v2= v1+(a*t);
        System.out.println(" A velocidade final é:" +v2);


    }
}