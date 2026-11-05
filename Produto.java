package questao1;

import java.util.ArrayList;
import java.util.List;

/** Subject: notifica as áreas interessadas somente quando a quantidade muda. */
public class Produto {
    private final String nome;
    private int quantidade;
    private final List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidadeInicial) {
        this.nome = nome;
        this.quantidade = quantidadeInicial;
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }

    public void adicionarArea(AreaInteressada area) {
        if (!areas.contains(area)) {
            areas.add(area);
        }
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade == quantidade) {
            return; // RQ1.4: sem mudança real, sem comunicação
        }
        int anterior = quantidade;
        quantidade = novaQuantidade;
        for (AreaInteressada area : new ArrayList<>(areas)) {
            area.receberAtualizacao(nome, anterior, quantidade);
        }
    }
}
