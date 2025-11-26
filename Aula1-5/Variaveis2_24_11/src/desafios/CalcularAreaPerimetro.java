package desafios;

import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Coloque o raio de um círculo: ");
        double raio = ler.nextDouble();
        double pi = 3.14;
        double area = Math.pow(raio, pi);
        double perimetro = 2*pi*raio;
        System.out.println("Área: " + area +  "\nPerimetro: " + perimetro);

    }
}
