package questao1;

public class Compras implements AreaInteressada {
    public static final int LIMITE_MINIMO = 5;

    @Override
    public void receberAtualizacao(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        if (novaQuantidade < LIMITE_MINIMO) {
            System.out.println("[COMPRAS] ALERTA: " + nomeProduto + " com estoque baixo (" + novaQuantidade + " unidades)");
        }
    }
}
