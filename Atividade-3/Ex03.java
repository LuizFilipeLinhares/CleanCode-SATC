/*Ex03*/

public class FilmeService {

    public void listarApenasFilmesDisponiveis() {
        System.out.println("Listando apenas filmes disponíveis para locação...");
    }

    public void listarTodosFilmes() {
        System.out.println("Listando todos os filmes do catálogo...");
    }

    public void marcarFilmeComoDisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" agora está disponível para locação.");
    }

    public void marcarFilmeComoIndisponivel(String titulo) {
        System.out.println("O filme \"" + titulo + "\" foi marcado como indisponível.");
    }

    public static void main(String[] args) {
        FilmeService service = new FilmeService();

        service.listarApenasFilmesDisponiveis();
        service.listarTodosFilmes();

        service.marcarFilmeComoDisponivel("Inception");
        service.marcarFilmeComoIndisponivel("Matrix");
    }
}