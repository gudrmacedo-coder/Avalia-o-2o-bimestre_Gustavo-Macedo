package questao1;

public class Vendas implements AreaInteressada {
    @Override
    public void receberAtualizacao(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (quantidadeAnterior == 0 && novaQuantidade > 0) {
            System.out.println("[VENDAS] " + nomeProduto + " voltou a ter estoque (" + novaQuantidade + " unidades)");
        }
    }
}
