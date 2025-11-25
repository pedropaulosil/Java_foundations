package testecalculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //  Scanner ler = new Scanner(System.in);
        //   int operacao = ler.nextInt();
        // switch (operacao) {
        // case 1:
        //    System.out.println("Adição");
        //    colocarNumeros(num1, num2);
        //    double soma = num1 + num2;
        //  case 2:
        //      System.out.println("Subtração");
        //       double subtracao = num1 - num2;

        //  case 3:
        //      System.out.println("Mutiplicação");
        //      double mutiplicacao = num1 * num2;

        //case 4:
        //   System.out.println("Divisão");
        //    double divisao = num1/num2;

        // } ler.close();

    }
        public static double colocarNumeros ( double num1, double num2){
            Scanner ler = new Scanner(System.in);
            System.out.println("\n Coloque um número:");
            num1 = ler.nextDouble();
            System.out.println("\n Coloque outro número:");
            num2 = ler.nextDouble();
            ler.close();

            return 0;

        }
}

