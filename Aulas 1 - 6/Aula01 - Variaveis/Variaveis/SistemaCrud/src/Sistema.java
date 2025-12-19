import java.util.ArrayList;

public class Sistema {
    static void main() {
        ArrayList<String> lista = new ArrayList<>();
        String numeroCorrespondente [] = {"1 - ","2 - ","3 - ","4 - ","5 - ","6 - ","7 - ","8 - ","9 - ","10 - "};
        lista.add("X-bacon");
        lista.add("X-salada");
        lista.add("X-tudo");
        lista.add("X-burger");
        lista.add("X-burger duplo");
        lista.add("X-egg");
        IO.println("Escolha um lanche:\n");
            for (int i = 0; i < lista.size(); i++) {
               IO.println(numeroCorrespondente[i] + lista.get(i));
            }
        int lanchePedido = Integer.parseInt(IO.readln());
        double valorPedido = 0;
        processarPedido(lanchePedido, valorPedido, lista);
        IO.println("Você quer atualizar seu pedido? \n" + "- Sim\n- Não");
        String atualizarPedido = IO.readln();
                    if(atualizarPedido.equalsIgnoreCase("Sim")) {
                        IO.println("Escolha um lanche:\n");
                        for (int i = 0; i < lista.size(); i++) {
                            IO.println(numeroCorrespondente[i] + lista.get(i));
                        } lanchePedido = Integer.parseInt(IO.readln());
                           processarPedido(lanchePedido,valorPedido,lista);
                        }
                    else if(atualizarPedido.equalsIgnoreCase("Nao")){
                            IO.println("Seu pedido foi finalizado");
                        }
                    else{
                        IO.print("Agradecemos pela preferência!!");
                     }
        }
        static void processarPedido(int lanchePedido, double valorPedido, ArrayList <String>lista) {
            switch (lanchePedido) {
                case 1:
                    valorPedido = 18;
                    IO.println("Seu pedido é um x-bacon" + " que custa:\nR$" + valorPedido);
                    break;
                case 2:
                    valorPedido = 18;
                    IO.println("Seu pedido é um x-salada" + " que custa:\nR$" + valorPedido);
                    break;
                case 3:
                    valorPedido = 21;
                    IO.println("Seu pedido é um x-bacon" + " que custa:\nR$" + valorPedido);
                    break;
                case 4:
                    valorPedido = 23;
                    IO.println("Seu pedido é um x-bacon" + " que custa:\nR$" + valorPedido);
                    break;
                case 5:
                    IO.println("Seu pedido é um x-bacon" + " que custa:\nR$" + valorPedido);
                    valorPedido = 26;
                    break;
                case 6:
                    valorPedido = 22;
                    IO.println("Seu pedido é um x-egg" + " que custa:\nR$" + valorPedido);
                    break;
                default:
                    break;
            }
        }
}








