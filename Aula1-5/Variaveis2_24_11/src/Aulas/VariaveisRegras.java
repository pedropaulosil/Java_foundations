package Aulas;
import java.util.Scanner;

public class VariaveisRegras {
    public static void main(String[] args) {
        String nome1 = "Pedro"; //variavel nome
                                //nome =  "Manoel"; // nao pode
                                //String pessoa = 10; // nao pode
        String nome2 = "José";
        String nome3 = "Maria";

        //convençao(boas praticas)
        //camelCase: colocar a proxima letra em maiusculo ex: (nomeCompleto)
        //snake-case: underline ex: (nome_completo)

        Scanner ler = new Scanner(System.in); //entrada de dados
        nome1 = ler.next(); //objeto ler é um scanner(classe) e agora executa o metodo next;
        System.out.println(nome1);


    }
}

