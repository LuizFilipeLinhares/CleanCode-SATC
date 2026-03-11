/*Ex02*/

class EstatisticasTime {
    int gols;
    int posseBola;
    int chutes;
    int faltas;
    int cartoesAmarelos;
    int cartoesVermelhos;

    public EstatisticasTime(int gols, int posseBola, int chutes, int faltas,
                            int cartoesAmarelos, int cartoesVermelhos) {
        this.gols = gols;
        this.posseBola = posseBola;
        this.chutes = chutes;
        this.faltas = faltas;
        this.cartoesAmarelos = cartoesAmarelos;
        this.cartoesVermelhos = cartoesVermelhos;
    }
}

class Partida {
    String timeCasa;
    String timeVisitante;
    EstatisticasTime casa;
    EstatisticasTime visitante;

    public Partida(String timeCasa, String timeVisitante,
                   EstatisticasTime casa, EstatisticasTime visitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.casa = casa;
        this.visitante = visitante;
    }
}

public class GerenciadorPartida {

    public void registrarPartida(Partida partida) {
        System.out.println("Partida Registrada:");
        System.out.println(partida.timeCasa + " " + partida.casa.gols +
                " x " + partida.visitante.gols + " " + partida.timeVisitante);

        System.out.println("Posse de Bola: " + partida.casa.posseBola +
                "% - " + partida.visitante.posseBola + "%");

        System.out.println("Chutes: " + partida.casa.chutes +
                " - " + partida.visitante.chutes);

        System.out.println("Faltas: " + partida.casa.faltas +
                " - " + partida.visitante.faltas);

        System.out.println("Cartões Amarelos: " + partida.casa.cartoesAmarelos +
                " - " + partida.visitante.cartoesAmarelos);

        System.out.println("Cartões Vermelhos: " + partida.casa.cartoesVermelhos +
                " - " + partida.visitante.cartoesVermelhos);
    }

    public void gerarRelatorio(Partida partida) {
        String vencedor = partida.casa.gols > partida.visitante.gols
                ? partida.timeCasa
                : (partida.casa.gols < partida.visitante.gols
                ? partida.timeVisitante
                : "Empate");

        System.out.println("=== Relatório da Partida ===");
        System.out.println("Vencedor: " + vencedor);

        System.out.println("Posse de Bola: " + partida.casa.posseBola +
                "% - " + partida.visitante.posseBola + "%");

        System.out.println("Total de Chutes: " +
                (partida.casa.chutes + partida.visitante.chutes));

        System.out.println("Total de Faltas: " +
                (partida.casa.faltas + partida.visitante.faltas));

        System.out.println("Total de Cartões: " +
                ((partida.casa.cartoesAmarelos + partida.visitante.cartoesAmarelos) +
                 (partida.casa.cartoesVermelhos + partida.visitante.cartoesVermelhos)));
    }

    public static void main(String[] args) {
        GerenciadorPartida gerenciador = new GerenciadorPartida();

        EstatisticasTime casa = new EstatisticasTime(2, 55, 10, 15, 3, 1);
        EstatisticasTime visitante = new EstatisticasTime(1, 45, 8, 12, 2, 0);

        Partida partida = new Partida("Time A", "Time B", casa, visitante);

        gerenciador.registrarPartida(partida);
        gerenciador.gerarRelatorio(partida);
    }
}