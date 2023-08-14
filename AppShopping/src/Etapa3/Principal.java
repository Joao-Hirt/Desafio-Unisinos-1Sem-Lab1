package Etapa3;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;
        //Menu
        int opcao = 1;
        while (opcao > 0 && opcao <= 3){
            System.out.println("====== M E N U ======");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.println("\nDigite o número da ação: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("\nDigite o nome da loja: ");
                    String nomeLoja = scanner.nextLine();
                    System.out.println("Digite a quantidade de funcionários: ");
                    int quantidadeFuncionariosLoja = scanner.nextInt();
                    System.out.println("Digite o salário base dos funcionários: ");
                    double salarioBaseFuncionariosLoja = scanner.nextDouble();
                    System.out.println("Digite o endereço da loja: ");
                    System.out.println("Rua: ");
                    String ruaDaLoja = scanner.nextLine();
                    System.out.println("Cidade: ");
                    String cidadeDaLoja = scanner.nextLine();
                    System.out.println("Estado: ");
                    String estadoLoja = scanner.nextLine();
                    System.out.println("Pais: ");
                    String paisDaLoja = scanner.nextLine();
                    System.out.println("CEP: ");
                    String cepDaLoja = scanner.nextLine();
                    System.out.println("Número: ");
                    String numeroDaLoja = scanner.nextLine();
                    System.out.println("Complemento: ");
                    String complementoDaLoja = scanner.nextLine();
                    Endereco enderecoLoja = new Endereco(ruaDaLoja, cidadeDaLoja, estadoLoja, paisDaLoja, cepDaLoja, numeroDaLoja, complementoDaLoja);

                    System.out.println("Digite a data de fundação da loja: ");
                    System.out.println("Dia: ");
                    int diaDeFundacao = scanner.nextInt();
                    System.out.println("Mês: ");
                    int mesDeFundacao = scanner.nextInt();
                    System.out.println("Ano: ");
                    int anoDeFundacao = scanner.nextInt();
                    Data dataLoja = new Data(diaDeFundacao, mesDeFundacao, anoDeFundacao);
                    loja = new Loja(nomeLoja, quantidadeFuncionariosLoja, salarioBaseFuncionariosLoja, enderecoLoja, dataLoja);

                    System.out.println("Loja criada com sucesso!");
                    break;

                case 2:
                    System.out.println("\nDigite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.println("Digite a data de validade do produto: ");
                    System.out.println("Dia: ");
                    int diaDaValidade = scanner.nextInt();
                    System.out.println("Mês: ");
                    int mesDaValidade = scanner.nextInt();
                    System.out.println("Ano: ");
                    int anoDaValidade = scanner.nextInt();
                    Data dataValidade = new Data(diaDaValidade, mesDaValidade, anoDaValidade);

                    produto = new Produto(nomeProduto, precoProduto, dataValidade);
                    System.out.println("Produto criado com sucesso!");
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }
        scanner.close();

        if (produto != null){
            if (produto.estaVencido(new Data(20,10,2023))){
                System.out.println("PRODUTO VENCIDO");
            }else{
                System.out.println("PRODUTO NÃO VENCIDO");
            }
        }

    }
}
