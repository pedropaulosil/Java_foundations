package exercicio;

public class Main {
    static void main() {
        Livro livro1 = new Livro("Galinha Pintadinha", "Juliano Prado", "Ciranda Cultural", 22.9,4);
        IO.println(livro1.toString());
        livro1.alugarLivro(1);
        livro1.devolverLivro(1);
    }
}
