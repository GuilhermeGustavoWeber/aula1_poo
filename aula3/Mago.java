public class Mago extends Personagem implements Magia{
    private final int VIDA_MAXIMA;

    public Mago(int ataque, int vida, String nome) {
        super(ataque, vida, nome);
        this.VIDA_MAXIMA = vida;
    }




    @Override
    public void atacar(Personagem alvo) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nO Mago Decide jogar uma Pedra Brita no Oponente");
    }

    @Override
    public void curar() throws InterruptedException {
        this.vida += 10;
        if(this.vida > this.VIDA_MAXIMA) {
            this.vida = this.VIDA_MAXIMA;
        }
        Thread.sleep(1000);
        System.out.println("\nO Mago Balança os Braços e se Sente Melhor\n +10 PV");
    }

    @Override
    public void fireball(Personagem alvo) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nO Mago Gira Girasticamente Girastico e Lança uma Bola de Fogo\n");
        alvo.receberDano(this.ataque);
    }

}