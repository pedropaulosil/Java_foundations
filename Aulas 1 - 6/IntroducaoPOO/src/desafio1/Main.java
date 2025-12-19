package desafio1;

public class Main {
    static void main() {
        Produto produto = new Produto();
        IO.println("Insira o nome do produto:");
        produto.nome = IO.readln();
        IO.println("Insira o preço do produto: ");
        produto.preco = Double.parseDouble(IO.readln());
        IO.println("Insira o quantidade do produto: ");
        produto.quantidade = Integer.parseInt(IO.readln());

        IO.println("O valor total em estoque de " +produto.nome + " é: " + produto.calcularTotal() + "\ncom " + produto.quantidade + " unidades") ;

    }
}
