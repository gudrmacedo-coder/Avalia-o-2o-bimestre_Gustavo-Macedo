package questao2;

/** Strategy: regra de cobrança de um perfil. */
public interface TarifaStrategy {
    String getNome();
    double calcular(int minutos);
}
