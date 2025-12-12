package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner ler = new Scanner(System.in);
        int[]numeros = {10,20,30,40};

        System.out.println("Digite um índice para acessar o array:");
        try{
            int posicao = ler.nextInt();
            numeros[posicao]=numeros[posicao];
            System.out.println("O valor na posição " + posicao+ " é: " +  numeros[posicao]);
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("Erro: Índice fora dos limites do array.");
        } catch (Exception e) {
            e.printStackTrace(); //mostrar qual foi o erro inserido
            System.out.println("Erro: " + e.getMessage());
        } finally {
            ler.close();
        }
    }
}
