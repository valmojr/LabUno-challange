package desafio.lab1;

public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao,
            Data dataAlvara, int tamanhoDoEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoDoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public String toString() {
        return super.toString() + " - " + this.dataAlvara;
    }
}
