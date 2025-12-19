package entidades;

import java.util.ArrayList;
public class MenuLanches {
    private ArrayList<Lanches> cardapio = new ArrayList<>();
    public MenuLanches() {
        cardapio = new ArrayList<>();
        cardapio.add(new Lanches("X-Burger", 15.50));
        cardapio.add(new Lanches("X-Salada", 18.00));
        cardapio.add(new Lanches("Hot Dog Especial", 12.00));
        cardapio.add(new Lanches("Refrigerante Lata", 6.00));
        cardapio.add(new Lanches("Batata Frita", 10.00));
    }
    public void exibirCardapio() {
        System.out.println("--- CARDÁPIO ---");
        for (int i = 0; i < cardapio.size(); i++) {
            Lanches l = cardapio.get(i);
            System.out.printf("[%d] %-15s R$ %.2f%n", i, l.getNome(), l.getPrecoUnit());
        }
        System.out.println("----------------");
    }
    public Lanches getLanche(int index) {
        if (index >= 0 && index < cardapio.size()) {
            return cardapio.get(index);
        }
        return null;
    }
    public int getTamanhoCardapio() {
        return cardapio.size();
    }
}


