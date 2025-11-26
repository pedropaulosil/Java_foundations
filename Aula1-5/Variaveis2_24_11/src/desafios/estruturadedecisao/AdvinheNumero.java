package desafios.estruturadedecisao;

import java.io.IO;
import java.util.Random;

public class AdvinheNumero {
    static void main() {
        Random rand = new Random();
        int numero = rand.nextInt(10);
        IO.println("Tente advinhar o número de 0 a 10: ");
        int numeroUsuario =  Integer.parseInt(IO.readln());
            if(numero == numeroUsuario){
                IO.print("Parabens, você acertou o número!! \nEra " + numero);
            } else {
                IO.readln("Você errou."+ "\nO certo era " + numero);
            }
    }
}
