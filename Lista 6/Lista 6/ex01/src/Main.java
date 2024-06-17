public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(soma(n));

    }

    static int soma(int n){
        int soma = 0;
        for(int i = 1; i <= n; i++){
            soma += i;
        }
        return soma;
    }
}

