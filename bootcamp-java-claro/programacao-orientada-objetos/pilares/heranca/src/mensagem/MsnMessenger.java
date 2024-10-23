package mensagem;

public class MsnMessenger {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Msn Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Msn Messenger");
    }
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
