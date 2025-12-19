import entidades.Lanches;
import entidades.ListaPedido;
import entidades.MenuLanches;
import entidades.Pedido;

import java.util.Scanner;

public class Main{
    static void main() {
        ListaPedido listaPedido = new ListaPedido();
        Scanner scanner = new Scanner(System.in);
        MenuLanches menu = new MenuLanches();
        int opcao;

        while (true) {
            IO.println("-- Sistema de Pedidos --");
            IO.println("1 - Adicionar item");
            IO.println("2 - Listar Itens");
            IO.println("3 - Atualizar pedido");
            IO.println("4 - Excluir pedido");
            IO.println("5 - Valor total");
            IO.println("6 - Sair do programa");
            opcao = Integer.parseInt(IO.readln());

            switch (opcao) {
                case 1 ->{
                    menu.exibirCardapio();
                    IO.println("Digite o id do lanche");
                    int opcaoLanche = Integer.parseInt(IO.readln());

                    IO.println("Digite o id do lanche");
                    int quantidade = Integer.parseInt(IO.readln());

                    var lanche = menu.getLanche(opcaoLanche);
                    Pedido pedido = new Pedido(lanche.getNome(), lanche.getPrecoUnit());

                }
                case 2 -> {
                    listaPedido.listarPedidos();
                    IO.println("Digite o id do lanche");
                    int idLanvhePedido = Integer.parseInt(IO.readln());
                } case 3 -> {
                    IO.println("Edite o pedido");
                    menu.exibirCardapio();
                    IO.println("Digite o id do lanche");
                    int idLanchePedido = Integer.parseInt(IO.readln());
                    var novoLanche = menu.getLanche(idLanchePedido);

                    IO.println("Digite a quantidade de lanche");
                    int novaQuantidade = Integer.parseInt(IO.readln());

                    listaPedido.alterarPedido(idLanchePedido, novoLanche.getNome(), novaQuantidade,novoLanche.getPrecoUnit());

                }
                case 4 -> {
                    listaPedido.listarPedidos();
                    IO.println("Digite o id do lanche que deseja remover");
                    int idLanchePedido = Integer.parseInt(IO.readln());
                    listaPedido.removerPedido(idLanchePedido);
                }
                case 5 -> {
                    IO.println("O valor total foi R$" + listaPedido.calcularValorTotal());
                }


            }


        }
    }


}