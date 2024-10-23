package mensagem;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
        fb.receberMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
