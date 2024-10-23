package mensagem;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        System.out.println("MSN");
        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("");

        System.out.println("FACEBOOK");
        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();
        fb.receberMensagem();
        System.out.println("");

        System.out.println("TELEGRAM");
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
