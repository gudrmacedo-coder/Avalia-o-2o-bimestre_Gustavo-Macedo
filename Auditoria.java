package questao1;

public class Auditoria implements AreaInteressada {
    @Override
    public void receberAtualizacao(String nomeProduto, int quantidadeAnterior, int novaQuantidade) {
        System.out.println("[AUDITORIA] " + nomeProduto + ": " + quantidadeAnterior + " -> " + novaQuantidade);
    }
}
