import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public void exibirContatos() {
        if(!agendaContatoMap.isEmpty()) {
            System.out.println(agendaContatoMap);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            if(numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda");
            }
        } else {
            System.out.println("A agenda de contato está vazia");
        }
        return numeroPorNome;
    }
}
