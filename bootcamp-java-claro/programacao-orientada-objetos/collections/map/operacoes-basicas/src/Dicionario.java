import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("O dicionario está vazio!");
        }
    }

    public void exibirPalavras() {
        if(!dicionarioMap.isEmpty()) {
            System.out.println(dicionarioMap);
        } else {
            System.out.println("O dicionário está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPorNome = null;
        if(!dicionarioMap.isEmpty()) {
            definicaoPorNome = dicionarioMap.get(palavra);
            if(definicaoPorNome == null) {
                System.out.println("Palavra não encontrada");
            }
        } else {
            System.out.println("O dicionário está vazio!");
        }
        return definicaoPorNome;
    }


}
