public abstract class Personagem {

    protected String nome;
    protected int vida, ataque;

    public Personagem(int ataque, int vida, String nome) {
        this.ataque = ataque;
        this.vida = vida;
        this.nome = nome;
    }

    public void receberDano(int dano) {
        this.vida -=  dano;
        if (this.vida < 0) {
            this.vida=0;
        }
        System.out.println("\n" + this.nome + " Sofreu " + dano + " de dano!!!\nVida Atual: " + this.vida);
    }

    public boolean estaVivo() {
        return  this.vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public abstract void atacar(Personagem alvo) throws InterruptedException;
}



