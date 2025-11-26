package testecalculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        System.out.println("Digite qual operação quer realizar: \n 1 - Adição \n 2 - Subtração \n 3 - Mutiplicaçao \n 4 - Divisão");
        Scanner ler = new Scanner(System.in);
        int operacao = ler.nextInt();
        double valores [] = colocarNumeros();
        double num1 = valores [0];
        double num2 = valores [1];

        switch (operacao) {
            case 1:
                System.out.println("Adição:");
                double soma = num1 + num2;
                System.out.println(soma);
                break;
            case 2:
                System.out.println("Subtração:");

                double subtracao = num1 - num2;
                System.out.println(subtracao);
                break;

            case 3:
                System.out.println("Mutiplicação:");
                double mutiplicacao = num1 * num2;
                System.out.println(mutiplicacao);
                break;

            case 4:
                System.out.println("Divisão:");
                double divisao = num1 / num2;
                System.out.println(divisao);
                break;

        }
        ler.close();
}
        public static double[] colocarNumeros (){
            Scanner ler = new Scanner(System.in);
            System.out.println("Coloque um número: ");
            double n1 = ler.nextDouble();
            System.out.println("Coloque outro número: ");
            double n2 = ler.nextDouble();

            return new double[] {n1,n2};
        }

 }
