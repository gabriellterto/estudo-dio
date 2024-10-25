import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    private List<Integer> numerosList = new ArrayList();

    public OrdenacaoNumeros() {
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

   public List<Integer> ordenarAscedente() {
        List<Integer> numerosAscendete = new ArrayList(this.numerosList);
        if(!this.numerosList.isEmpty()) {
            Collections.sort(numerosAscendete);
            return numerosAscendete;
        } else {
            throw  new RuntimeException("A lista está vazia");
        }
   }

   public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscedente = new ArrayList(this.numerosList);
        if(!this.numerosList.isEmpty()) {
            numerosAscedente.sort(Collections.reverseOrder());
            return numerosAscedente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
   }

   public void exibirNumeros() {
        if(!this.numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
   }
}


