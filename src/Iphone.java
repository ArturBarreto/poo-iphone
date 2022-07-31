public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public Iphone() {

    }

    @Override
    public void ligar(String telefone) {
        System.out.println("Ligando para " + telefone + "...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...");
    }

    @Override
    public void exibirPagina(String paginaWeb) {
        adicionarNovaAba();
        System.out.println("Exibindo a página " + paginaWeb + "...");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar(String musica) {
        selecionarMusica(musica);
        System.out.println("Tocando a música " + musica + "...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música " + musica + "...");
    }
}
