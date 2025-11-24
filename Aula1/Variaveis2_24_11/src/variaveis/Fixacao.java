package variaveis;

import java.util.Scanner;

public class Fixacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Digite sua cidade:");
        String cidade = ler.nextLine();
        System.out.println("Digite o tamanho da cidade:");
        String tamanhoCidade = ler.nextLine();
        System.out.println("Digite a população da cidade:");
        String populacaoCidade = ler.nextLine();
        System.out.println("Digite seu Estado:");
        String estado = ler.nextLine();

        System.out.println("Seu nome é: " + nome +"\n"+ "Sua cidade é: " + cidade + "\n"+ "O tamanho de " + cidade + " é:" + tamanhoCidade +"\n" +"A população de "+ cidade + " é de: " + populacaoCidade +" pessoas." + "\n" + "Seu estado é: " + estado);
            ler.close();
    }

}
