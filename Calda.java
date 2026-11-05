package questao3;

public class Calda extends Complemento {
    public static final double PRECO = 2.00;

    public Calda(Item item) { super(item); }

    @Override
    protected String getNomeComplemento() { return "Calda"; }

    @Override
    protected double getPrecoComplemento() { return PRECO; }
}
