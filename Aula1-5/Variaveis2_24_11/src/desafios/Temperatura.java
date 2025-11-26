package desafios;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite se quer converter para Fahrenheit ou Kelvin (F ou K): ");
        String escolha = ler.next();
            if(escolha.equalsIgnoreCase("F")) {
                System.out.println("Digite a temperatura: ");
                double temperatura = ler.nextDouble();
                double fahrenheit = temperatura * (9.0/5) + 32;
                System.out.println(fahrenheit + "Fº");
            }else if (escolha.equalsIgnoreCase("K")) {
                    System.out.println("Digite a temperatura: ");
                    double temperatura = ler.nextDouble();
                    double kelvin = temperatura + 273.15;
                    System.out.println(kelvin + "Kº");
                } else {
                    System.out.println("Valor invalído.");
                }   ler.close();
            }
}
