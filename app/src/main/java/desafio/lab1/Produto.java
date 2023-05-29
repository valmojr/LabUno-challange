package desafio.lab1;

public class Produto {
    private String nome;
    private int preco;
    private Data dataValidade;

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, int preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String toString() {
        return this.getNome() + " - " + this.getPreco() + " - " + this.getDataValidade().toString();
    }

    public boolean estaVencido(Data dataAtual) {
        return ((dataAtual.getDia() + dataAtual.getMes() * 30
                + dataAtual.getAno() * 365) > (this.dataValidade.getDia()
                        + this.dataValidade.getMes() * 30 + this.dataValidade.getAno() * 365));
    }
}
