package questao3;

/** Decorator abstrato: envolve um Item e acrescenta descrição e preço. */
public abstract class Complemento implements Item {
    private final Item itemEnvolvido;

    protected Complemento(Item itemEnvolvido) {
        this.itemEnvolvido = itemEnvolvido;
    }

    protected abstract String getNomeComplemento();
    protected abstract double getPrecoComplemento();

    @Override
    public String getDescricao() {
        return itemEnvolvido.getDescricao() + " + " + getNomeComplemento();
    }

    @Override
    public double getPreco() {
        return itemEnvolvido.getPreco() + getPrecoComplemento();
    }
}
