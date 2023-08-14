package Etapa4;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados, int quantidadeMaximaDeProdutos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data, quantidadeMaximaDeProdutos);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString(){
        return super.toString() + "\nContém produtos importados? "+produtosImportados;
    }
}
