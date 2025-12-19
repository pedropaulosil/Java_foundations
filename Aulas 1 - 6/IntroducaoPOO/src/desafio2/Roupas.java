package desafio2;

    public class Roupas {
        String marca;
        String tipo;
        String tamanho;
        int quantidade;
        double valor;

        public Roupas(String marca, String tipo, String tamanho, int quantidade, double valor) {
            this.marca = marca;
            this.tipo = tipo;
            this.tamanho = tamanho;
            this.quantidade = quantidade;
            this.valor = valor;
        }

        public double valorTotal() {
            return valor = this.quantidade * this.valor;
        }

        public void venda() {
            if (this.quantidade < quantidade || this.quantidade > 0) {
                this.quantidade -= quantidade;
            } else {
                IO.println("Valor inválido");
            }

        }

        public void abastecer() {
            if (this.quantidade < 0) {
                this.quantidade += quantidade;
                IO.println("Estoque abastecido com sucesso");
            } else {
                IO.println("Valor inválido");
            }
        }

        @Override
        public String toString() {
            return "Roupas{" +
                    "marca='" + marca + '\'' +
                    ", tipo='" + tipo + '\'' +
                    ", tamanho='" + tamanho + '\'' +
                    ", quantidade=" + quantidade +
                    ", valor=" + valor + "\n valor Total" + valorTotal() +
                    '}';
        }
    }




