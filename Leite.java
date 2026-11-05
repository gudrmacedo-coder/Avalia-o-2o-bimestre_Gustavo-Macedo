package questao3;

public class Leite extends Complemento {
    public static final double PRECO = 2.50;

    public Leite(Item item) { super(item); }

    @Override
    protected String getNomeComplemento() { return "Leite"; }

    @Override
    protected double getPrecoComplemento() { return PRECO; }
}
