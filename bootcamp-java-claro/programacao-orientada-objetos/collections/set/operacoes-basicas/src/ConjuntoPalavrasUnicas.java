import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if(!palavrasUnicasSet.isEmpty()) {
            if(palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada");
            }
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                System.out.println("Palavra " + palavra + " está presente.");
                return true;
            }
        }
        return false;
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }


}
