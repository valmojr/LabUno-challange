package desafio.lab1;

public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String pais;
    private String complemento;

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Endereco(String nomeDaRua, String cidade, String estado, String pais, String complemento) {
        this.nomeDaRua = nomeDaRua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.complemento = complemento;
    }

    public String toString() {
        return this.getNomeDaRua() + ", " + this.getCidade() + " - " + this.getEstado() + ", " + this.getPais()
                + this.getComplemento();
    }
}
