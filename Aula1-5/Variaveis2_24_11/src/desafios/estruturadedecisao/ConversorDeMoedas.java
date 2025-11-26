package desafios.estruturadedecisao;

import java.io.IO;

public class ConversorDeMoedas {
    public static void main() {
        IO.println("Digite o valor em R$: ");
        double valor = Double.parseDouble(IO.readln());
        IO.println("Escolha a moeda:\n 1 - dollar \n 2 - euro \n 3 - libra ");
        int opcao = Integer.parseInt(IO.readln());
            switch (opcao){
                case 1:
                    valor = valor * 0.20;
                    IO.println(valor + " em Dollar.");
                    break;
                case 2:
                    valor = valor * 0.18;
                    IO.println(valor + " em euro.");
                    break;
                case 3:
                    valor = valor * 0.15;
                    IO.println(valor + " em libra.");
                    break;
            }
    }
}
