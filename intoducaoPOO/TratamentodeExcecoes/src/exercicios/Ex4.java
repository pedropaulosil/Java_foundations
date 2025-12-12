package exercicios;

import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
    static void main() {
        try {
            FileWriter fw = new FileWriter("arquivo.txt");
            fw.write("Queijos Saborosos Manoel\n");
            fw.write("Quejo palitinho\n");
            fw.write("Quejo Meia-Cura\n");
            fw.write("Quejo Nozinho\n");

        } catch (IOException e){
            throw new RuntimeException(e);

        }
    }
}
