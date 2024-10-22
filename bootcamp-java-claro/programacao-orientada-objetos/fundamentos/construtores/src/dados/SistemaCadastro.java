package dados;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Gabriel", "123456789-00");
        marcos.setEndereco("RUA DAS MARIAS");

        System.out.println(marcos.getNome() + "->" + marcos.getCpf());
    }
}
