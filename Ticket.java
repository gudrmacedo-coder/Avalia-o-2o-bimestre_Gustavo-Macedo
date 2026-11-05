package questao2;

/** Contexto: o tíquete delega o cálculo ao perfil atual. */
public class Ticket {
    private final String placa;
    private final int minutosPermanencia;
    private TarifaStrategy tarifa;

    public Ticket(String placa, int minutosPermanencia, TarifaStrategy tarifa) {
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        this.tarifa = tarifa;
    }

    public String getPlaca() { return placa; }

    public void setTarifa(TarifaStrategy tarifa) { this.tarifa = tarifa; }

    public double calcularValor() {
        return tarifa.calcular(minutosPermanencia);
    }

    public String getPerfil() { return tarifa.getNome(); }
}
