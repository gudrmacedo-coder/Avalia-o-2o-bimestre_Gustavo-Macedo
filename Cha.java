package questao3;

/** Bebida base. */
public class Cha implements Item {
    public static final double PRECO = 5.00;

    @Override
    public String getDescricao() { return "Chá"; }

    @Override
    public double getPreco() { return PRECO; }
}
