package desafios.estruturadedecisao;

import java.io.IO;

public class MultaVelocidade {
    static void main() {
        IO.println("Insira a velocidade do veículo: ");
        double velocidade = Double.parseDouble(IO.readln());
        if(velocidade > 90) {
            double multa = (velocidade - 90) * 10;//valorkm
            IO.println("O limite de velocidade foi ultrapassado, o usuário deverá pagar: " + "R$ "+ String.format( "%.2f", multa));
        } else {
            IO.print("Você não foi multado");
        }

    }
}
