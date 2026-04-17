package vetores;


import java.util.Scanner;


public class EBAC6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        entrada();
        opcao();


    }


    public static void opcao(){
        Scanner scanner = new Scanner(System.in);


        int opcao;


        do {
            System.out.println(" Digite [1] Para resolver o Exercicio 1\n Digite [2] Para resolver o Exercicio 2\n Digite [3] Para resolver o Exercicio 3\n Digite [4] Para sair");
            opcao = scanner.nextInt();


            if (opcao == 1) {
                exer1();


            } else if (opcao == 2) {
                exer2();


            } else if (opcao == 3) {
                exer3();


            } else if (opcao == 4) {
                System.out.println("Obrigado por participar, até uma próxima");
                break;


            } else {
                System.out.println("Opção inválida, digite novamente");


            }


        } while (opcao > 1 || opcao <= 4);


    }


    public static void entrada() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá seja bem-vindo");
        System.out.println(" Fala felas, tranquilo com você ? Espero que sim");

        System.out.println(" Qual é o seu nome ?");
        String nome = scanner.nextLine();
        System.out.println(nome + " bom te-lo aqui novamente comigo");
        System.out.println(" Escolhe uma opção do meu menu e execute uma atividade");
    }


    public static void exer1() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o tamanho do seu vetor");
        int TamanhoVetorDousuario = scanner.nextInt();


        int[] vetorUsuario = new int[TamanhoVetorDousuario];


        String buffer = scanner.nextLine();
        for (int i = 0; i < TamanhoVetorDousuario; i++) {

            System.out.println("Digite o valor da posição " + i + " do seu vetor");
            vetorUsuario[i] = scanner.nextInt();


        }


        System.out.println("Seu vetor ficou assim felas");
        for (int i = 0; i < TamanhoVetorDousuario; i++) {
            System.out.println(vetorUsuario[i]);
        }


        System.out.println("Vamos ordenalos");
        String buffer1 = scanner.nextLine();
        for (int i = 0; i < TamanhoVetorDousuario; i++) {
            for (int j = i; j < TamanhoVetorDousuario; j++) {
                if (vetorUsuario[j] < vetorUsuario[i]) {
                    int aux = vetorUsuario[i];
                    vetorUsuario[i] = vetorUsuario[j];
                    vetorUsuario[j] = aux;


                }


            }


        }


        System.out.println("Seu vetor ordenador é ");
        for (int i = 0; i < TamanhoVetorDousuario; i++) {
                System.out.println(vetorUsuario[i]);
        }


        System.out.println("Agora para finalizar eu preciso que voce digite um nome para eu poder saber quantas vogais tem nele");
        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();


        String [] vetor = nome.split("");
        int contador = 0;


        for (int i = 0; i < vetor.length; i++){
            if (vetor[i].equalsIgnoreCase("a") || vetor[i].equalsIgnoreCase("e") || vetor[i].equalsIgnoreCase("i") || vetor[i].equalsIgnoreCase("o") || vetor[i].equalsIgnoreCase("u")) {


                contador++;


            }


        }


        System.out.println("O nome que você digitou tem " + contador + " vogais.");


    }


    public static void exer2(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o tamanho desejado do seu vetor felas");
        int TamanhoVetorUsuario = scanner.nextInt();


        int [] VetorDoUsuario = new int[TamanhoVetorUsuario];

        for(int i = 0; i < TamanhoVetorUsuario ; i++){
            System.out.println("Digite a posição " + i + " do seu vetor");
            VetorDoUsuario[i] = scanner.nextInt();

        }
        System.out.println("Seu vetor ficou assim felas");
        for(int i = 0; i < TamanhoVetorUsuario ; i++){
            System.out.println(VetorDoUsuario[i]);
        }

        System.out.println("Felas, se o a posição do seu vetor for par, vamos multiplicar por 2, se for impar vamos multiplicar mpor ele mesmo ");
        for (int i = 0; i < TamanhoVetorUsuario; i++){
            if (VetorDoUsuario[i] % 2 == 0){
                VetorDoUsuario[i] = VetorDoUsuario[i] * 2;


            }else{
                VetorDoUsuario[i] = VetorDoUsuario[i] * VetorDoUsuario[i];


            }


        }


        System.out.println("Seu vetor ficou assim fellow");
        for(int i = 0; i < TamanhoVetorUsuario ; i++){
            System.out.println(VetorDoUsuario[i]);
        }


    }


    public static void exer3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();


        String invertido = "";


        for (int i = nome.length() - 1; i >= 0; i--) {

            char aux = nome.charAt(i);
            invertido = invertido + aux;

        }

        System.out.println("Nome invertido do felas é: " + invertido);
    }


}