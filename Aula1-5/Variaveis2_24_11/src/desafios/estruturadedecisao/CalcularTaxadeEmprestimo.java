package desafios.estruturadedecisao;

import java.io.IO;

public class CalcularTaxadeEmprestimo {
    static void main() {
        IO.println("Insira o valor do emprestímo: ");
        double valorEmprestimo = Double.parseDouble(IO.readln());
        IO.print("Insira a quantidade de parcelas desejadas 6, 12 ou 24 meses: ");
        int parcelas = Integer.parseInt(IO.readln());
            switch (parcelas){
                case 6 :
                    valorEmprestimo = valorEmprestimo*0.05 + valorEmprestimo;
                    IO.print(valorEmprestimo);
                    break;
                case 12:
                    valorEmprestimo = valorEmprestimo*0.10+ valorEmprestimo;
                    IO.print(valorEmprestimo);
                    break;
                case 24:
                    valorEmprestimo = valorEmprestimo*0.20+ valorEmprestimo;
                    IO.print(valorEmprestimo);
                    break;
        }
    }
}
