import java.util.Random;
public class Main {
    public static void main(String[] args) {
        personagens p1 = new personagens("julia");
        personagens p2 = new personagens("valen");
        personagens p3 = new personagens("nucci");

        /*System.out.println("Rodada 1");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.atacar(p2);
        p2.atacar(p3);
        p3.atacar(p1);

        System.out.println("Final do round: ");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);*/
        while (true) {
            System.out.println("RODADA COMEÇANDO");
            System.out.println("-------------------------------------");
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            Random r = new Random();
            System.out.println("\nATAQUES: ");
            System.out.println("-------------------------------------");
            // ataque do p1
            int ataquep1 = r.nextInt(2);
            if (ataquep1 == 0) {
                p1.atacar(p2);
                System.out.println(p1.getNome() + " atacou " + p2.getNome());
            } else {
                p1.atacar(p3);
                System.out.println(p1.getNome() + " atacou " + p3.getNome());
            }
            // ataque do p2
            int ataquep2 = r.nextInt(2);
            if (ataquep2 == 0) {
                p2.atacar(p1);
                System.out.println(p2.getNome() + " atacou " + p1.getNome());
            } else {
                p2.atacar(p3);
                System.out.println(p2.getNome() + " atacou " + p3.getNome());
            }

            // ataque do p3
            int ataquep3 = r.nextInt(2);
            if (ataquep3 == 0) {
                p3.atacar(p2);
                System.out.println(p3.getNome() + " atacou " + p2.getNome());
            } else {
                p3.atacar(p1);
                System.out.println(p3.getNome() + " atacou " + p1.getNome());
            }
            System.out.println();
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println("\nFIM DA RODADA ");
            System.out.println("--------------------------------------------------");

            if (p1.getVida() <= 0 || p2.getVida() <= 0 || p3.getVida() <= 0) {
                System.out.println("Um dos personagens morreu");
                if (p1.getVida() <= 0)
                    System.out.println(p1.getNome() + " foi jogar no vasco ");
                else if (p2.getVida() <= 0)
                    System.out.println(p2.getNome() + " foi jogar no vasco ");
                else
                    System.out.println(p3.getNome() + " foi jogar no vasco ");
                break;
            }


        }
    }
}