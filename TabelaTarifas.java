package questao2;

/** Constantes de valores do estacionamento. */
public final class TabelaTarifas {
    public static final double VALOR_HORA = 5.00;
    public static final double VALOR_MENSALISTA = 200.00;
    public static final int MINUTOS_POR_HORA = 60;
    public static final int MINUTOS_GRATIS_CONVENIADO = 30;
    public static final double DESCONTO_CONVENIADO = 0.20; // 20%

    private TabelaTarifas() { }

    /** Quantidade de horas iniciadas (ex.: 61 min -> 2 horas). */
    public static long horasIniciadas(int minutos) {
        return Math.max(0, (Math.max(0, minutos) + MINUTOS_POR_HORA - 1) / MINUTOS_POR_HORA);
    }
}
