package mensagem;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        /*
        * Não se sabe qual app
        * Mas qualquer um deverá enviar e receber mensagem
        * */
        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")) {
            smi = new MsnMessenger();
        } else if(appEscolhido.equals("fb")) {
            smi = new FacebookMessenger();
        } else if(appEscolhido.equals("telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
