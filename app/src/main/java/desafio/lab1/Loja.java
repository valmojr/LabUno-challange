package desafio.lab1;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private int salariobaseFuncionario;

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

    public int getSalariobaseFuncionario() {
        return salariobaseFuncionario;
    }

    public void setSalariobaseFuncionario(int salariobaseFuncionario) {
        this.salariobaseFuncionario = salariobaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salariobaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, int salariobaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salariobaseFuncionario = salariobaseFuncionario;
    }

    public String toString() {
        return this.getNome() + " - " + this.getQuantidadeFuncionarios() + " - " + this.getSalariobaseFuncionario();
    }

    public int gastosComSalario() {
        return this.quantidadeFuncionarios * this.salariobaseFuncionario;
    }

    public String tamanhoDaLoja(int quantidadeFuncionarios) {
        if (quantidadeFuncionarios <= 10) {
            return "P";
        } else if (quantidadeFuncionarios < 30) {
            return "M";
        } else {
            return "G";
        }
    }
}
