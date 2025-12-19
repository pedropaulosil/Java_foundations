package desafio2;

public class Main {
    static void main() {
        Roupas roupa = new Roupas("nike", "blusa", "M", 10, 200);
        roupa.venda();
        roupa.abastecer();

        roupa.quantidade = 50;
        IO.println(roupa.toString());
    }
}
