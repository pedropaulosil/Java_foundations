package desafio1;

public class Produto {
    String nome;
    Double preco;
    int  quantidade;

        public double calcularTotal() {
            double precoTotal = preco * quantidade;
            return precoTotal;
        }
}
