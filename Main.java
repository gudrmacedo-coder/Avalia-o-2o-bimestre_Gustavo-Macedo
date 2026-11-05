package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 95;
        System.out.println("Tempo de permanência: " + minutos + " minutos\n");

        TarifaStrategy[] perfis = { new RotativoStrategy(), new MensalistaStrategy(), new ConveniadoStrategy() };
        for (TarifaStrategy perfil : perfis) {
            Ticket t = new Ticket("ABC1D23", minutos, perfil);
            System.out.printf("%-10s -> R$ %.2f%n", t.getPerfil(), t.calcularValor());
        }

        System.out.println("\n--- Troca de perfil no mesmo tíquete ---");
        Ticket ticket = new Ticket("XYZ9K88", minutos, new RotativoStrategy());
        System.out.printf("Inicial  (%s): R$ %.2f%n", ticket.getPerfil(), ticket.calcularValor());
        ticket.setTarifa(new ConveniadoStrategy());
        System.out.printf("Alterado (%s): R$ %.2f%n", ticket.getPerfil(), ticket.calcularValor());
        ticket.setTarifa(new MensalistaStrategy());
        System.out.printf("Alterado (%s): R$ %.2f%n", ticket.getPerfil(), ticket.calcularValor());
    }
}
