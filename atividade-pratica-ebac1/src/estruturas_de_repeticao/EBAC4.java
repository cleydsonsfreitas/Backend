package estruturas_de_repeticao;
import java.util.Scanner;

public class EBAC4 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        saudacao();
        tentativademenu();
        thal();

    }

    //Entrada dessa bagaça
    public static void tentativademenu() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


        int escolha;
        do {

            System.out.println("O que você deseja meu bem");
            System.out.println("Digite um numero \n[1] Crescente\n[2] Decrescente \n[3] Nome\n[4] Tempo");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("Boa escolha");
                crescente();

            } else if (escolha == 2) {
                System.out.println("Felas, escolheu legal");
                decrescente();

            } else if (escolha == 3) {
                System.out.println("Não gosto dessa opção, fiz pq é os D");
                contagem();

            } else if (escolha == 4) {
                System.out.println("Está com tempo felas");
                geral();


            } else {
                System.out.println("Você digitou uma opção invalida, digite uma valida, tente outra vez");


            }
        } while (escolha == 1 || escolha > 4);
        scanner.close();
    }


    // Primeiro public eu explico o que ele pode fazer e quais são as suas opções
    public static void saudacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá Seja-bem vindo ao nosso exercicio");
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println(nome + " vamos deixar você escolher o que quer fazer");
        System.out.println("Você pode digitar [1] e escolhar um numero que vai aparecer de zero até ele");
        System.out.println("Você pode digitar [2] e escolher um numero que vai aparecer dele até zero");
        System.out.println("Você pode digitar [3] e descobrir quantas letras tem seu nome.");
        System.out.println("Você pode digitar [4] e fazer todas essas opções");
    }


    // Public de contagem de 0 ao numero digitado
    public static void crescente() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int n1 = 0;

        for (n1 = 0; n1 <= numero; n1++) {
            System.out.println(n1);
            Thread.sleep(1000);
        }
        System.out.println("Atividade finbalizada");
    }


    // Public de contagem de numero digitado ao 0
    public static void decrescente() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();
        int n2 = 0;

        for (n2 = 0; numero >= 0; numero--) {
            System.out.println(numero);
            Thread.sleep(1000);
        }
        System.out.println("Atividade finalizada");

    }


    // Public de contagem de caracteres do nome
    public static void contagem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fala felas");
        System.out.println("Vou precisar que digite o seu nome");
        System.out.println("AAAAAAAAAAA pode ser o nome completo, não só o primiero");

        System.out.println("Qual é o seu nome?");
        String nome1 = scanner.nextLine();

        nome1 = nome1.replace(" ", "");

        int contagemtotal = nome1.length();

        System.out.println("Seu nome ao todo tem " + contagemtotal + " caracteres, seu nome é grandinho em");
        System.out.println("Atividade finalizada");
    }


    // Public geral, onde o felas está com tempo
    public static void geral() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Felas você opitou por todas");
        System.out.println("Vai digitar seu nome felas");
        System.out.println("AAAAAAAAAAA pode ser o nome completo, não só o primiero");

        System.out.println("Digite seu nome");
        String nomes = scanner.nextLine();


        System.out.println(nomes + " digite um numero");
        int numeros = scanner.nextInt();

        System.out.println("Vamos la felas");

        //Funcionalidades dos laços em for felas

        System.out.println("[Ordem Crescente Felas]");
        int n3 = 0;
        for (n3 = 0; n3 <= numeros; n3++) {
            System.out.println(n3);
            Thread.sleep(1000);
        }

        System.out.println("\n[Ordem Decrescente Felas}");
        int n4 = 0;
        for (n4 = numeros; n4 >= 0; n4--) {
            System.out.println(n4);
            Thread.sleep(1000);

        }


        //Funcionalidades do nome felas

        nomes = nomes.replace(" ", "");
        int contagemfinal = nomes.length();

        if (contagemfinal >= 6){
            System.out.println( "Por ter dado certo ate aqui, voce vai ver seu nome de acordo com o numero que voce digitou");
            for (int i = 0; i < numeros; i++) {
                System.out.println(nomes);
                Thread.sleep(1000);

            }

        } else {
            System.out.println(nomes);

        }

    }

    public static void thal(){
        System.out.println("Hoje foi longo essa atividade");
        System.out.println("Hoje foi desafiador e com isso aprendi bastante coisa real");
        System.out.println("Densenvolvi e aprendi o que eu pensava que sabia");
        System.out.println("Vai ser assim ate o fim, amem e ate a proxima felas");

    }


}




