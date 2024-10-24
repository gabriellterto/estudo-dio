import model.Iphone;

public class IphonePedrinho {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        //Testando reprodutor musical
        meuIphone.selecionarMusica("Eminem - Lose Yourself");
        meuIphone.tocar();
        meuIphone.pausar();
        System.out.println();

        //Testando aparelho telefonico
        meuIphone.ligar("(61) 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        System.out.println();

        //Testando Navegador internet
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina("https://web.dio.me/home");
        meuIphone.atualizarPagina();
    }
}
