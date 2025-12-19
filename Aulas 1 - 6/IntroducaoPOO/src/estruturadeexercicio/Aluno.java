package estruturadeexercicio;

public class Aluno {
    static void main() {
        IO.println("Digite seu nome");
        String nome = IO.readln();
        IO.println("Digite sua nota");
        int nota = Integer.parseInt(IO.readln());
        IO.println("Digite sua nota");
        int nota2 = Integer.parseInt(IO.readln());;
        double media = nota + nota2;
        IO.println(media);


    }
}
