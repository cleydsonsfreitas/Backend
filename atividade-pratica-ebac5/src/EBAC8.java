import com.projetoebac.entity.Carro;

import java.util.Scanner;


public class EBAC8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ola, seja bem vindo ao nosso exercicio de hoje");
        System.out.println("Qual é o seu nome ?");
        String nomeUsuario = scanner.nextLine();


        System.out.println(nomeUsuario + ", hoje vamos criar uma lista de carros.");


        int escolha = 0;
        int quantidadeDeCarros = 0;
        Carro[] carros = null;


        do {


            System.out.println("[1] Cadastrar carros");
            System.out.println("[2] Listar e ver total (Soma)");
            System.out.println("[3] Sair");
            escolha = scanner.nextInt();
            scanner.nextLine();


            if (escolha == 1) {
                System.out.println("Quantos carros deseja cadastrar? (Máximo 50)");
                quantidadeDeCarros = scanner.nextInt();
                scanner.nextLine();


                if (quantidadeDeCarros <= 50) {
                    carros = new Carro[quantidadeDeCarros];


                    for (int i = 0; i < quantidadeDeCarros; i++) {
                        System.out.println("Nome do carro " + (i + 1) + ":");
                        String nomeCarro = scanner.nextLine();


                        System.out.println("Cor do carro:");
                        String cor = scanner.nextLine();


                        System.out.println("Valor do carro:");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();


                        carros[i] = new Carro(nomeCarro, cor, valor);


                    }


                    System.out.println("Carros cadastrados com sucesso!");


                } else {


                    System.err.println("Limite de 50 carros excedido.");


                }


            } else if (escolha == 2) {


                if (carros == null) {


                    System.out.println("Nenhum carro cadastrado ainda!");


                } else {


                    double soma = 0;
                    System.out.println("\n--- LISTA DE CARROS ---");


                    for (int i = 0; i < quantidadeDeCarros; i++) {


                        System.out.println("Carro: " + carros[i].nome + " | Valor: R$ " + carros[i].valor);
                        soma += carros[i].valor;


                    }


                    System.out.println("Total de carros: " + quantidadeDeCarros);
                    System.out.println("Soma total: R$ " + soma);


                }


            } else if (escolha == 3) {


                System.out.println(nomeUsuario + ", obrigado por participar!");


            } else {


                System.err.println("Opção inválida!");


            }


        } while (escolha != 3);
    }


}

