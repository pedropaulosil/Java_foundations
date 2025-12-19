package entidades;

public class Lanches {
    private String nome;
    private double precoUnit;

    public Lanches(String nome, double precoUnit) {
        this.nome = nome;
        this.precoUnit = precoUnit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
