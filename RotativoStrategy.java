package questao2;

public class RotativoStrategy implements TarifaStrategy {
    @Override
    public String getNome() { return "Rotativo"; }

    @Override
    public double calcular(int minutos) {
        return TabelaTarifas.horasIniciadas(minutos) * TabelaTarifas.VALOR_HORA;
    }
}
