package questao1;

public class Main {
    public static void main(String[] args) {
        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        Produto notebook = new Produto("Notebook", 10);
        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        System.out.println("--- Alterações de estoque do Notebook ---");
        notebook.alterarQuantidade(8);
        notebook.alterarQuantidade(8);   // sem mudança: nada é comunicado
        notebook.alterarQuantidade(3);   // Compras alerta (abaixo de 5)
        notebook.alterarQuantidade(0);   // Compras alerta
        notebook.alterarQuantidade(5);   // Vendas avisa que voltou ao estoque

        System.out.println("--- Removendo a área Compras ---");
        notebook.removerArea(compras);
        notebook.alterarQuantidade(2);   // Compras não recebe mais nada

        System.out.println("--- Outro produto ---");
        Produto mouse = new Produto("Mouse", 0);
        mouse.adicionarArea(vendas);
        mouse.adicionarArea(compras);
        mouse.alterarQuantidade(12);     // Vendas e Compras (sem alerta)
    }
}
