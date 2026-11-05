package questao3;

import java.util.function.Function;

/** Pedido: começa com uma bebida base e recebe complementos em qualquer quantidade. */
public class Pedido implements Item {
    private Item itemAtual;

    public Pedido(Item bebidaBase) {
        this.itemAtual = bebidaBase;
    }

    /** Recebe a forma de envolver o item, ex.: Leite::new. */
    public Pedido adicionarComplemento(Function<Item, Item> complemento) {
        this.itemAtual = complemento.apply(this.itemAtual);
        return this;
    }

    @Override
    public String getDescricao() { return itemAtual.getDescricao(); }

    @Override
    public double getPreco() { return itemAtual.getPreco(); }
}
