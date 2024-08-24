public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println("Nome: " + estado.getNome() + " - Sigla: " + estado.getSigla() + " - IBGE: " + estado.getIbge());
        }

        EstadoBrasileiro estado = EstadoBrasileiro.CEARA;

        System.out.println("Nome: " + estado.getNome() + "\nSigla: " + estado.getSigla() + "\nIBGE: " + estado.getIbge());
    }
}