public class FuncProducao extends Funcionario {

    private String turno;

    public FuncProducao(String nome, double salario, String turno) {
        super(nome, salario);
        this.turno = turno;
    }

    public void operar() {
        System.out.println(nome + " está operando no turno " + turno + ".");
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
        operar();
    }

    public String getTurno() {
        return turno;
    }
}