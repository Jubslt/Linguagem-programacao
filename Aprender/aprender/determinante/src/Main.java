public class Main {
    public static void main(String[] args) {
        //mostrar a diagonal principal
        //exercicio 08 lista 03
        int[][] matriz = {{3, 1, 3},
                {2, 4, 1},
                {1, 2, 2}};

        diag_principal(matriz);
        diag_secundaria(matriz);
        determinante(matriz);
    }

    //começa função com "static"
    //printar apenas sem retornar
    //para manipular ou ter ela é necessario adicionar no () do void
    //java completa a matriz com "00"
    //"m" é variavel, não matriz
    static void diag_principal(int[][] m) {
        //verificando se a matriz é quadrada i=j
        if (m.length == m[0].length) {
            //i<=m.length-1 é alternativa
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i][i] + ", ");
            }
            //retirou o for de dentro
        } else {
            System.out.println("A matriz não é quadrada");
        }
    }

    static void diag_secundaria(int[][] m) {
        // for (int i = 0; i < m.length; i++) {
        //"=" pega o numero maior
        //for (int j = m.length - 1; j >= 0; j++) {
        //System.out.println(m[i][j] + ", ");
        //m[0]-1 = constante
        //i= faz contagem crescente e decrescente
        //System.out.println(m[i][m[0].length-1-i]+", ");
        if (m.length == m[0].length) {
            for (int i = m.length - 1; i >= 0; i--) {
                System.out.println(m[m[0].length - 1 - i][i]);


            }
        }
    }//criar contador circular

    static void determinante(int[][]m) {
        int cont,mult_pos,soma_pos=0;
        int cont_neg,mult_neg,soma_neg=0;
        //multiplica para ter mais contagem
        //aprendendo como navegar pela matriz
        for (int i = 0; i < m.length; i++) {
            cont=i;
            mult_pos=1;
            for (int j = 0; j < m[0].length; j++) {
                mult_pos*=m[j][cont];
                cont_pos++;
                if (cont_pos > m.length - 1)
                    cont = 0;


            }
            soma_pos+=mult_pos;
        }
        System.out.println(soma_pos);
    }
}
