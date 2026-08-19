import java.util.Random;

public class Guerreiro extends Personagem implements Magia{


    public Guerreiro(int ataque, int vida, String nome) {
        super(ataque, vida, nome);
    }

    @Override
    public void curar() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\n *Não Saber com isso Fununceia* ");
    }

    @Override
    public void fireball(Personagem alvo) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\n *Não Saber com isso Fununceia* ");
    }

    @Override
    public void atacar(Personagem alvo) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nO Guerreiro Empunha seu Graveto e Ataca!");
        Random random = new Random();
        int danoR = random.nextInt(110);
        if (danoR > 100) {
            Thread.sleep(1000);
            alvo.receberDano(35);
            System.out.println("E Acabou Acertando partes muitos Doloridas!!!\n ATAQUE CRITICO");
        } else {
            alvo.receberDano(25);
        }

    }
}
