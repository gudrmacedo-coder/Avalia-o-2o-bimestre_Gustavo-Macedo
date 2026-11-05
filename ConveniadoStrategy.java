package questao2;

public class ConveniadoStrategy implements TarifaStrategy {
    @Override
    public String getNome() { return "Conveniado"; }

    @Override
    public double calcular(int minutos) {
        int cobraveis = Math.max(0, minutos - TabelaTarifas.MINUTOS_GRATIS_CONVENIADO);
        double valorBruto = TabelaTarifas.horasIniciadas(cobraveis) * TabelaTarifas.VALOR_HORA;
        return valorBruto * (1 - TabelaTarifas.DESCONTO_CONVENIADO);
    }
}
