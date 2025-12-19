import java.util.ArrayList;
import java.util.Scanner;

public class InserirDadosSistema extends Sistema {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        String numeroCorrespondente [] = {"1 - ","2 - ","3 - ","4 - ","5 - ","6 - ","7 - ","8 - ","9 - ","10 - "};
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> pedidos = new ArrayList<>();
        int opcao = 0;
        do {
            System.out.println("\n===== SISTEMA DE PEDIDOS =====");
            System.out.println("1 - Fazer pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar pedido");
            System.out.println("4 - Cancelar pedido");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção:");
            opcao = Integer.parseInt(IO.readln());
            switch (opcao) {
                case 1:
                    lista.add("X-bacon");
                    lista.add("X-salada");
                    lista.add("X-tudo");
                    lista.add("X-burger");
                    lista.add("X-burger duplo");
                    lista.add("X-egg");
                    for (int i = 0; i < lista.size(); i++) {
                        IO.println(numeroCorrespondente[i] + lista.get(i));
                    }
                    Sistema metodo = new Sistema();
                    int lanchePedido = Integer.parseInt(IO.readln());
                    double valorPedido = 0;
                    metodo.processarPedido(lanchePedido, valorPedido, lista);

                    break;

                case 2:
                    System.out.println("\n--- Lista de Pedidos ---");
                    if (pedidos.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int i = 0; i < pedidos.size(); i++) {
                            System.out.println("Índice " + i + ": " + pedidos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Atualizar Pedido ---");
                    for (int i = 0; i < pedidos.size(); i++) {
                        System.out.println(i + " - " + pedidos.get(i));
                    }

                    System.out.print("Digite o índice do pedido que deseja alterar: ");
                    int indiceAlterar = scanner.nextInt();
                    scanner.nextLine();


                    if (indiceAlterar >= 0 && indiceAlterar < pedidos.size()) {
                        System.out.print("Digite o novo nome do lanche: ");
                        String lancheAtualizado = scanner.nextLine();
                        pedidos.set(indiceAlterar, lancheAtualizado);
                        System.out.println("Pedido atualizado com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Cancelar Pedido ---");
                    System.out.print("Digite o índice do pedido a ser removido: ");
                    int indiceRemover = scanner.nextInt();
                    scanner.nextLine();

                    if (indiceRemover >= 0 && indiceRemover < pedidos.size()) {
                        String removido = pedidos.remove(indiceRemover);
                        System.out.println("O pedido '" + removido + "' foi cancelado.");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}