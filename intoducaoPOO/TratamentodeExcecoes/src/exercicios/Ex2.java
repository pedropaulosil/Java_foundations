package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner ler = new Scanner(System.in);
        try{
            System.out.println("Digite um valor numerico");
            double valor = ler.nextDouble();
            ler.nextLine();

            System.out.println("Digite outro valor numerico");
            double valor2 = ler.nextDouble();
            ler.nextLine();

            double divisao = valor/valor2;
            System.out.println("A divisão é " + divisao);
        } catch(InputMismatchException e ){
            System.out.println("Valor inválido! Por favor, insira um número válido.");
        } catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("Erro! Divisão por zero não é permitida.");
        } catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
        }

    }

