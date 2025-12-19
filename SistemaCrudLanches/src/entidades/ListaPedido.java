package entidades;

import java.util.ArrayList;

public class ListaPedido {
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        if (pedido.getQuantidade() > 0) {
            pedidos.add(pedido);
            IO.println("Pedido realizado com sucesso");
        } else {

            IO.println("Digite uma quantidade válida maior que zero");
        }
    }


    public void listarPedidos() {
        for (int i = 0; i < pedidos.size(); i++) {
            IO.println("Pedido " + (i + 1) + ": " + pedidos.get(i).toString());
        }
    }

    public static void editarPedido(Pedido pedido) {
        if (pedido.getQuantidade() > 0) {
            pedido.setNome(pedido.getNome());
            pedido.setQuantidade(pedido.getQuantidade() - 1);
            pedido.setPreco(pedido.getPreco());
            IO.println("Pedido editado com sucesso");
        } else {
            IO.println("Não há pedidos para editar");
        }
    }

    public void alterarPedido(int id, String nome, int quantidade, double preco) {
        if (quantidade <= 0) {
            IO.println("Informe um valor maior que zero");
        } else {
            var pedidoAlterado = pedidos.get(id);
            pedidoAlterado.setNome(nome);
            pedidoAlterado.setQuantidade(quantidade);
            pedidoAlterado.setPreco(preco);
            IO.println("Pedido alterado com sucesso");
        }
    }

    public void removerPedido(int id) {
        pedidos.remove(id);
        IO.println("Pedido removido com sucesso");
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.calcularTotal();
        }
        return total;
    }

}