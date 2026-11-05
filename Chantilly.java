package questao3;

public class Chantilly extends Complemento {
    public static final double PRECO = 3.00;

    public Chantilly(Item item) { super(item); }

    @Override
    protected String getNomeComplemento() { return "Chantilly"; }

    @Override
    protected double getPrecoComplemento() { return PRECO; }
}
