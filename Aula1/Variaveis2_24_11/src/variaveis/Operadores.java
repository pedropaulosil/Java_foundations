package variaveis;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = ler.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = ler.nextInt();


        double soma = (int) numero1 + numero2;
        System.out.println("= "+ soma);
        double div = (int) numero1%numero2;
        System.out.println(div);
        ler.close();
    }
}
