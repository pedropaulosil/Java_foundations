package Aulas;

import java.util.Scanner;

public class DecisaoTexto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se é inteiro ou racional: ");
        double num = ler.nextDouble();
        if(num%2 == 0) {
            System.out.println("O número é inteiro.");
        } else {
            System.out.println("O número é racional.");
        }


        ler.close();
    }
}
