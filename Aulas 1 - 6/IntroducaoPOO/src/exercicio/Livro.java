package exercicio;

public class Livro {
    String titulo;
    String autor;
    String editora;
    double preco;
    int quantidade;

    public  Livro(String titulo, String autor, String editora, double preco, int quantidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void alugarLivro(int quantidade) {
        if(this.quantidade < 0 || this.quantidade > quantidade) {
            IO.println("Valor invalído");
        } else {
            this.quantidade -= quantidade;
            IO.println("Alugado com sucesso");
            IO.println("livro"+ this.titulo + "Quantidade atual: " + this.quantidade);
        }

    }
    public void devolverLivro(int quantidade) {
        if(quantidade>0){
            this.quantidade += quantidade;

        } else {
            IO.println("Invalído");
        }
    }
    public double valorTotal() {
        return this.preco * this.quantidade;

    }


    public String toString() {
        return "Livro " + this.titulo +"\nAutor " + this.autor +"\nEditora "+
                this.editora + "\nPreço "+ this.preco +"\nQuantidade "+ this.quantidade + "\n Valor total " + valorTotal();
    }


}
