package desafios.estruturadedecisao;

import java.io.IO;

public class DescontoSwitch {
    static void main() {
        IO.print("Digite o valor: ");
        double valor = Double.parseDouble(IO.readln());
        IO.print("Escolha entre pix(1), débito(2) ou crédito(3): ");
        int escolha= Integer.parseInt(IO.readln());
        switch (escolha) {
            case 1:
                valor = valor - (valor*0.10);
                IO.print("O valor é: " + "R$" + valor);
                break;
            case 2:
                valor = valor - (valor*0.05);
                IO.print("O valor é: "+ "R$" + valor);
                break;
            case 3:
                IO.print("Quantas vezes quer parcelar: \n1x \n2x \n3x? ");
                int parcelas = Integer.parseInt(IO.readln());
                switch (parcelas) {
                    case 1:
                        IO.print("O valor é: "+ "R$" + String.format("%.2f",valor));
                        break;
                    case 2:
                        valor = (valor + (valor*0.05))/parcelas;
                        IO.print("O valor é: "+ "R$" + valor);
                        break;
                    case 3:
                        valor = (valor + (valor*0.10))/parcelas;
                        IO.print("O valor é: "+ "R$" +  valor);
                        break;
                    default:
                        IO.print("Não é possível parcelar mais que 3 vezes.");
                }


        }
    }
    //# Valor gasto pelo usuario.
    //# Metodo de pagamento
    //#   - Dinheiro/Pix = 10% de desconto
    //#   - Debito = 5% de desconto
    //#   - Credito
    //#       - A vista = Valor total
    //#       - 2x = 5% de acrescimo - Valor de cada parcela
    //#       - 3x = 10% de acrescimo - Valor de cada parcela
}
