package Etapa4;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataDeFundacao, int quantidadeMaximaDeProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataDeFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaDeProdutos];
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int quantidadeMaximaDeProdutos){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaDeProdutos];
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

    public Endereco getEndereco(){
        return this.endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Data getDataFundacao(){
        return this.dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString(){
        return "Loja: "+nome+"; Quantidade de Funcionários: "+quantidadeFuncionarios+"; Salário Base dos Funcionários: "+salarioBaseFuncionario+"; Endereço: "+endereco+"; Data de fundação: "+dataFundacao+"; Quantidade máxima de Produtos: "+estoqueProdutos.length+";";
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

    public void imprimeProdutos(){
        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null){
                System.out.println("Produto "+i+": "+estoqueProdutos[i]);
            }
        }
    }

    public boolean insereProduto(Produto x){
        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = x;
                return true;
            }
        }return false;
    }

    public boolean removeProduto(String nome){
        for(int i=0; i<estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nome)){
                estoqueProdutos[i] = null;
                return true;
            }
        }return false;
    }
}

