package questao2;

public class MensalistaStrategy implements TarifaStrategy {
    @Override
    public String getNome() { return "Mensalista"; }

    @Override
    public double calcular(int minutos) {
        return TabelaTarifas.VALOR_MENSALISTA;
    }
}
