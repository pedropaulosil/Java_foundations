package exercicioPOO;

import estruturadeexercicio.Aluno;

public class Main {
    static void main() {
            AlunoPoo aluno1 = new AlunoPoo();

            IO.println("Digite o nome do aluno: ");
            aluno1.nome = IO.readln();
            IO.println("Digite a nota1 do aluno: ");
            aluno1.nota1 =Integer.parseInt(IO.readln());
            IO.println("Digite a nota2 do aluno: ");
            aluno1.nota2 = Integer.parseInt(IO.readln());

            IO.println(aluno1.nome);
            IO.println(aluno1.nota1);
            IO.println(aluno1.nota2);
            IO.println("Sua média é: "+ aluno1.calcularMedia());

    }
}
