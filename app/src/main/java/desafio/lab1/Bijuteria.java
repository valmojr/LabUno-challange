package desafio.lab1;

public class Bijuteria extends Loja {
    private double metaVendas;

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao,
            double metaVendas, int tamanhoDoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoDoEstoque);
        this.metaVendas = metaVendas;
    }

    public String toString() {
        return super.toString() + " - " + this.metaVendas;
    }
}
