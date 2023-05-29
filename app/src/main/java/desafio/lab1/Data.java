package desafio.lab1;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Dia inválido");
        }

        if (mes < 1 || mes > 12) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Mês inválido");
        }

        if (ano < 0) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Ano inválido");
        }

        if (mes == 2 && dia > 29) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Dia inválido");
        }

        if (mes == 4 && dia > 30) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Dia inválido");
        }

        if (mes == 6 && dia > 30) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Dia inválido");
        }

        if (mes == 9 && dia > 30) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Dia inválido");
        }

        if (mes == 11 && dia > 30) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Dia inválido");
        }

        if (mes == 2 && dia == 29 && !verificaAnoBissexto()) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;

            throw new IllegalArgumentException("Dia inválido");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Boolean verificaAnoBissexto() {
        if (this.ano % 4 == 0 && this.ano % 100 != 0) {
            return true;
        } else if (this.ano % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
