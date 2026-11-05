package questao3;

public class Main {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(new Espresso())
                .adicionarComplemento(Leite::new)
                .adicionarComplemento(Chantilly::new);

        Pedido p2 = new Pedido(new Cha())
                .adicionarComplemento(Calda::new);

        // Mesmo complemento repetido
        Pedido p3 = new Pedido(new Espresso())
                .adicionarComplemento(Leite::new)
                .adicionarComplemento(Leite::new)
                .adicionarComplemento(Calda::new);

        imprimir(1, p1);
        imprimir(2, p2);
        imprimir(3, p3);
    }

    private static void imprimir(int numero, Item pedido) {
        System.out.printf("Pedido %d: %s%n", numero, pedido.getDescricao());
        System.out.printf("   Total: R$ %.2f%n%n", pedido.getPreco());
    }
}
