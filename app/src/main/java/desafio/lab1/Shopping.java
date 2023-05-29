package desafio.lab1;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public Shopping(String nome, Endereco endereco, int qtdLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qtdLojas];
    }

    public String toString() {
        String str = "Nome: " + this.nome + "\nEndereco: " + this.endereco + "\nLojas: \n";
        for (Loja loja : this.lojas) {
            str += loja + "\n";
        }
        return str;
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] == null) {
                this.lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nome) {
        for (int i = 0; i < this.lojas.length; i++) {
            if (this.lojas[i] != null && this.lojas[i].getNome().equals(nome)) {
                this.lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipo) {
        int qtd = 0;
        for (Loja loja : this.lojas) {
            if (loja != null && loja.getClass().getSimpleName().equals(tipo)) {
                qtd++;
            }
        }
        return qtd;
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaSeguroMaisCaro = null;
        for (Loja loja : this.lojas) {
            if (loja != null && loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (lojaSeguroMaisCaro == null
                        || informatica.getSeguroEletronicos() > lojaSeguroMaisCaro.getSeguroEletronicos()) {
                    lojaSeguroMaisCaro = informatica;
                }
            }
        }
        return lojaSeguroMaisCaro;
    }
}
