package desafio.lab1;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao,
            double taxaComercializacao, int tamanhoDoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoDoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString() {
        return super.toString() + " - " + this.taxaComercializacao;
    }

}
