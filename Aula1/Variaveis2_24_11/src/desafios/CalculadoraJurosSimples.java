package desafios;

import java.util.Scanner;

public class CalculadoraJurosSimples {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o capital: ");
        double capitalO = ler.nextDouble();
        double taxadejuros = 10;
        System.out.println("Insira os meses: ");
        int meses = ler.nextInt();
        System.out.println("Juros simples ou compostos? (digite)");
        String escolha = ler.next();
        if(escolha.equalsIgnoreCase("Simples")){
            double totaljuros = taxadejuros/100 * capitalO * meses;
            System.out.println("Juros a pagar: " + totaljuros);
        } else if (escolha.equalsIgnoreCase("Compostos")){
            double totaljuros = capitalO * Math.pow((1 + taxadejuros / 100), meses);;
            double totalapagar = totaljuros - capitalO ;
            System.out.println("Juros a pagar: " + String.format("%.2f",totalapagar));

        } else {
            System.out.println("Insira um nome valido");
        }

        ler.close();
        //string.format("%.2f");
    }
}
