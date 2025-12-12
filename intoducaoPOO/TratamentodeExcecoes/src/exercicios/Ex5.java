package exercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {
    static void main() {
        File file = new File("arquivo.txt");
        try {
            Scanner ler = new Scanner(file);
            while (ler.hasNextLine()){
                System.out.println(ler.nextLine());
            }
        } catch (FileNotFoundException e){
            System.out.println("A causa do erro foi" + e.getMessage());
        }

    }
}
