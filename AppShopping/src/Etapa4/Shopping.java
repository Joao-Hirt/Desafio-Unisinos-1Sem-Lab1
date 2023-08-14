package Etapa4;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int quantidadeMaximaDeLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaDeLojas];
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }
    public void setLojas(Loja[] lojas){
        this.lojas = lojas;
    }

    @Override
    public String toString(){
        return "Shopping: "+nome+"; Endereço: "+endereco+"; Quantidade Máxima de Lojas: "+lojas.length+";";
    }

    public boolean insereLoja(Loja loja){
        for(int i=0; i<lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = loja;
                return true;
            }
        }return false;
    }

    public boolean removeLoja(String nome){
        for(int i=0; i<lojas.length; i++){
            if(lojas[i] !=null && lojas[i].getNome().equals(nome)){
                lojas[i] = null;
                return true;
            }
        }return false;
    }

    public int quantidadeLojasPorTipo(String tipo){
        int quantidade = 0;

        for(Loja loja : lojas){
            if(loja instanceof Alimentacao && tipo.equalsIgnoreCase("Alimentação")){
                quantidade++;
            }else if(loja instanceof Bijuteria && tipo.equalsIgnoreCase("Bijuteria")){
                quantidade++;
            }else if(loja instanceof Cosmetico && tipo.equalsIgnoreCase("Cosmético")){
                quantidade++;
            }else if(loja instanceof Informatica && tipo.equalsIgnoreCase("Informática")){
                quantidade++;
            }else if(loja instanceof Vestuario && tipo.equalsIgnoreCase("Vestuário")){
                quantidade++;
            }
        }

        if(quantidade != 0){
            return quantidade;
        }else{
            return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica informaticaMaisCara = null;
        double valorSeguroMaisCaro = 0.0;

        for(Loja loja : lojas){
            if(loja instanceof Informatica){
                Informatica informatica = (Informatica) loja;
                double valorSeguro = informatica.getSeguroEletronicos();
                if(valorSeguro > valorSeguroMaisCaro){
                    valorSeguroMaisCaro = valorSeguro;
                    informaticaMaisCara = informatica;
                }
            }
        }return informaticaMaisCara;
    }
}
