public class Main {

    public static void main(String[] args) {


        Produto memoriaRam = new Produto("Memoria RAM 16GB", 800.99);
        memoriaRam.adicionarEstoque(500);
        System.out.println(memoriaRam);

        Produto processador = new Produto("Processador i7 14º", 2894);
        System.out.println(processador);

        System.out.println("----------------------------");


        Funcionario Guilherme = new FuncProducao("Guilherme", 2300.0, "Noite");
        Funcionario Luiz = new Gestor("Luiz", 5500.0);

        Funcionario[] equipe = { Guilherme, Luiz };

        for (Funcionario f : equipe) {
            f.trabalhar();
            System.out.println();
        }
    }
}
