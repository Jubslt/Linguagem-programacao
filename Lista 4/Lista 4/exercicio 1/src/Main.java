import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número:");
        int numero = scanner.nextInt();

        System.out.println("Tabuada"+ numero + ":");
       for (int i=0; i<=10;i++){
           int resultado = numero * i;
           System.out.println(numero + "x" + i + "=" + resultado);




       }

    }
}