package Etapa2;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        if (!validaData()) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }
    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    @Override
    public String toString(){
        return dia+"/"+mes+"/"+ano;
    }
    public boolean verificaAnoBissexto(){
        return (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
    }

    private boolean validaData() {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }
        switch (mes) {
            case 4:
            case 6:
            case 9:
            case 11:
                return dia <=30;
            case 2:
                if (verificaAnoBissexto()) {
                    return dia <= 29;
                }else {
                    return dia <= 28;
                }
            default:
                return true;
        }
    }
}
