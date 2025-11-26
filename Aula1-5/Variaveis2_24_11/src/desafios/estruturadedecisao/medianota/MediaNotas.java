package desafios.estruturadedecisao.medianota;

import java.util.Scanner;

public class MediaNotas {
    public static void calcularmedianota() {
        Scanner ler = new Scanner(System.in);
        double[] notas;
        double media = 0;
        notas = new double[4];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite sua nota: ");
            notas[i] = ler.nextInt();
            if (notas[i] > 10) {
                ler.close();
            } else {
                media = +notas[i];

                }
          }
            if (media >= 6 && media <= 10) System.out.println("Você passou de ano!!, com a nota: " + media);
            else if (media < 6) {
                System.out.println("Você não passou de ano. Sua nota é: " + media);
            } else {
                System.out.println("Insira um número válido.");
                ler.close();
            }


        }
    }

