package Etapa4;

public class Informatica extends Loja{
    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeMaximaDeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaDeProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }
    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString(){
        return super.toString() + "\nSeguro de Eletrônicos: R$"+seguroEletronicos;
    }
}
