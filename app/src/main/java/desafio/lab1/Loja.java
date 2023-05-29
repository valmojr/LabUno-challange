package desafio.lab1;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,
            Data dataFundacao, int tamanhoDoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoDoEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int tamanhoDoEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoDoEstoque];
    }

    public String toString() {
        return this.getNome() + " - " + this.getQuantidadeFuncionarios() + " - " + this.getSalarioBaseFuncionario()
                + " - " + this.getEndereco().toString() + " - " + this.getDataFundacao().toString();
    }

    public int gastosComSalario() {
        return this.quantidadeFuncionarios * this.salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios <= 10) {
            return 'P';
        } else if (this.quantidadeFuncionarios < 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public Produto[] imprimeProdutos() {
        return this.estoqueProdutos;
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] == null) {
                this.estoqueProdutos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeDoProduto) {
        for (int i = 0; i < this.estoqueProdutos.length; i++) {
            if (this.estoqueProdutos[i] != null && this.estoqueProdutos[i].getNome().equals(nomeDoProduto)) {
                this.estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }
}
