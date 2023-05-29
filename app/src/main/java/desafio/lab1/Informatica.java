package desafio.lab1;

public class Informatica extends Loja {
    private double seguroEletronicos;

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao,
            double seguroEletronicos, int tamanhoDoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoDoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public String toString() {
        return super.toString() + " - " + this.seguroEletronicos;
    }
}
