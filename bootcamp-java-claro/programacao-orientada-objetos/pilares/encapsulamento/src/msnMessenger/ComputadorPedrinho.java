package msnMessenger;

public class ComputadorPedrinho {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}
