import java.util.Random;
public class personagens {
    // atributos
    private String nome;
    private double vida;
    private int ataque;
    private int defesa;

    // construtor
    public personagens(String nome) {
        Random r = new Random();
        this.ataque = r.nextInt(11) + 20;
        this.defesa = r.nextInt(6) + 10;
        this.nome = nome;
        this.vida = 100;
    }
    // metodos

    public void atacar(personagens p1) {
        if (this!=p1)
            p1.vida -= (this.ataque - p1.defesa);
    }

    // getter e setter


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    // toString

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defesa=" + defesa +
                '}';
    }
}
