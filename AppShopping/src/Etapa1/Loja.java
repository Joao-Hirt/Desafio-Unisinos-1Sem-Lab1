package Etapa1;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return this.quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return this.salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    @Override
    public String toString(){
        return "Nome da Etapa1.Loja: "+nome+"; Quantidade de Funcionários: "+quantidadeFuncionarios+"; Salário Base dos Funcionários: "+salarioBaseFuncionario;
    }

    public double gastosComSalario(){
        if (quantidadeFuncionarios <= 0){
            return -1;
        }else{
            return quantidadeFuncionarios*salarioBaseFuncionario;
        }
    }

    public char tamanhoDaLoja(){
        if(quantidadeFuncionarios < 10){
            return 'P';
        }else if(quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30){
            return 'M';
        }else{
            return 'G';
        }
    }
}

