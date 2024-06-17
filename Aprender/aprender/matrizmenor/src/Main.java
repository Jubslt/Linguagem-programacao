public class Main {
    public static void main(String[] args) {

        //mostrar a diagonal principal
        //exercicio 08 lista 03
        int[][] matriz = {{3, 1, 3},
                          {2, 4, 1},
                          {1, 2, 2}};

        diag_principal(matriz);
    }

    //começa função com "static"
    //printar apenas sem retornar
    //para manipular ou ter ela é necessario adicionar no () do void
    //java completa a matriz com "00"
    //"m" é variavel, não matriz
    static void diag_principal(int[][] m) {
        //verificando se a matriz é quadrada i=j
        if (m.length == m[0].length) {
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i][i] + ", ");
            }
            //retirou o for de dentro
        } else {
            System.out.println("A matriz não é quadrada");
        }
    }


}

