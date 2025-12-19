package entidades;

public class Pedido {
    private String nome;
    private int quantidade;
    private double preco;

    public Pedido(String nome, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}
