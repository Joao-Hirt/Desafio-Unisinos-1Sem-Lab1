package Etapa3;

public class Vestuario extends Loja {
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data data, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, data);
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
