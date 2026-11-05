package questao1;

/** Observer: área que é informada sobre alterações de estoque. */
public interface AreaInteressada {
    void receberAtualizacao(String nomeProduto, int quantidadeAnterior, int novaQuantidade);
}
