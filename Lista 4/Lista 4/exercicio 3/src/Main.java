import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Números divisíveis por 4 e menor 200:");
        for(int i= 1; i<200; i++){
            if(i % 4==0){
                System.out.println(i);
            }
        }





    }
}