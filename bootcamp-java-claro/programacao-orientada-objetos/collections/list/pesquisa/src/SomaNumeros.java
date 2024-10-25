import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros = new ArrayList();

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if(!this.numeros.isEmpty()) {
            Integer numero = 0;
            for(Iterator i = this.numeros.iterator(); i.hasNext(); soma += numero) {
                numero = (Integer)i.next();
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if(!this.numeros.isEmpty()) {
            Iterator i = this.numeros.iterator();

            while(i.hasNext()) {
                Integer numero = (Integer)i.next();
                if(numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }

            return maiorNumero;
        } else {
            throw  new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if(!this.numeros.isEmpty()) {
            Iterator i = this.numeros.iterator();

            while(i.hasNext()) {
                Integer numero = (Integer)i.next();
                if(numero <= menorNumero) {
                    menorNumero = numero;
                }
            }

            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if(!this.numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();
        System.out.println("Soma dos números = " + somaNumeros.calcularSoma());
        System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
    }
}
