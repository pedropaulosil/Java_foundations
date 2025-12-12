package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    static void main() {
        Scanner ler = new Scanner(System.in);
try {
    System.out.println("Digite uma nota");
    double nota1 = ler.nextDouble();
    ler.nextLine();
    System.out.println("Digite outra nota");
    double nota2 = ler.nextDouble();
    ler.nextLine();

    double media = (nota1 + nota2) / 2;
    System.out.println("A média é " + media);

} catch (InputMismatchException e) {
    System.out.println("Valor inválido! Por favor, insira um número válido.");
}
        ler.close();
    }
}
