public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(1000);
        System.out.println("\nVAMOS INICIAR A BATALHA MAIS EPICA DE TODOS OS TEMPO V7.1232132123130");
        Guerreiro g1 = new Guerreiro(25, 100, "Thores");
        Mago m1 = new Mago(30, 80, "Gundalfe");

        int turno = 1;

        while (g1.estaVivo() && m1.estaVivo()) {
            Thread.sleep(3000);
            System.out.println("\nTURNO " + turno);
            Thread.sleep(3000);
            System.out.println("\n------\nVEZ DE: GUERREIRO");
            Thread.sleep(3000);
            System.out.println("\nGUERREIRO USOU A HABILIDADE: ATACAR");
            g1.atacar(m1);

            Thread.sleep(3000);
            if(m1.estaVivo() == false) {
                Thread.sleep(3000);
                System.out.println("\nO DESTINO FOI SELADO...\n O Nobre Guerreiro " + g1.getNome() + " Derrotou o Terrivel Mago e pode enfim Continuar sua Jornada...\n FIM DE JOGO");
                break;
            }
            Thread.sleep(3000);
            System.out.println("\n------\nVEZ DE: MAGO");
            Thread.sleep(3000);
            if(m1.getVida() > 30) {
                System.out.println("\nMAGO USOU A HABILIDADE: FIREBALL");
                m1.fireball(g1);
                Thread.sleep(3000);
            } else {
                System.out.println("\nMAGO USOU A HABILIDADE: CURAR");
                m1.curar();
                Thread.sleep(3000);
            }
            if(g1.estaVivo() == false) {
                Thread.sleep(3000);
                System.out.println("\nO DESTINO FOI SELADO...\n O Poderoso Mago " + m1.getNome() + " Derrotou o Temivel Guerreiro e pode enfim Continuar sua Jornada...\n FIM DE JOGO");
                break;
            }
            turno +=1;
            System.out.println("\n\n****************************************\n\n");
        }
    }
}