import java.util.Scanner;

public class EstruturaWhile{
    public static void main(String[] args) throws InterruptedException{
       entrada();
       enigma();
       funcionalidade();
       saida();


    }


//  Interação com o usuario
    public static void entrada(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, qual é o seu nome ?");
        String nome = scanner.nextLine();

        System.out.println(nome + " , hoje vamos Brincar de Hacker");
        System.out.println("Vou lhe passar um enigma, e a resposta do meu enigima é a senha de acesso a 10 milhoes em bitcoin");
        System.out.println("Caso você acerte  de primeira tentativa, você ganha um bonus de 5 milhoes");
        System.out.println("Vale lembrar que você tem 5 tentaivas para acertar a senha ");
        System.out.println("Caso nao consiga, va vender sorvete");

    }


//  Enigma
    public static  void enigma(){
        System.out.println("Seu enigma é o seguinte:");
        System.out.println("A senha tem 6 números.");
        System.out.println("");

        System.out.println("1º número: é o dobro de 3.");
        System.out.println("2º número: é a raiz quadrada de 81.");
        System.out.println("3º número: é o número de lados de um hexágono.");
        System.out.println("4º número: é o resultado de 10 dividido por 2.");
        System.out.println("5º número: é o fatorial de 3.");
        System.out.println("6º número: é a soma dos números anteriores (apenas os valores, sem repetir cálculos).");
        System.out.println("");
    }


//  Funcionalidade
    public static void funcionalidade() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é a senha?");
        int senha = scanner.nextInt();
        int i = 1;
        int tentativas = 4;



        if (senha == 6965632){
            System.out.println("Você acertou na primeria tentativa");
            for (i = 5 ; i >= 1 ; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("        ___________");
            System.out.println("       '._==_==_=_.'");
            System.out.println("       .-\\:      /-.");
            System.out.println("      | (|:.     |) |");
            System.out.println("       '-|:.     |-'");
            System.out.println("         \\::.    /");
            System.out.println("          '::. .'");
            System.out.println("            ) (");
            System.out.println("          _.' '._");
            System.out.println("         `\"\"\"\"\"\"\"`");
            System.out.println("     =================");
            System.out.println("        PARABENS!!!");
            System.out.println("     =================");
            System.out.println("Você Ganhou 15 milhões em BITCOINS");

        }else if (senha != 6965632) {
            System.out.println("Você errou, tente outra vez");
            while (senha != 6965632) {
                System.out.println("Digite uma  nova senha");
                senha = scanner.nextInt();
                tentativas--;
                if (tentativas == 1) {
                    System.out.println("Você está na sua ultima senha, você temsó mais uma tentativa");
                } else if (tentativas == 0) {
                    System.out.println("Voce Perdeu felas");
                    break;

                } else if (senha == 6965632 ) {
                    for (i = 5; i >= 1; i--) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                    System.out.println("        ___________");
                    System.out.println("       '._==_==_=_.'");
                    System.out.println("       .-\\:      /-.");
                    System.out.println("      | (|:.     |) |");
                    System.out.println("       '-|:.     |-'");
                    System.out.println("         \\::.    /");
                    System.out.println("          '::. .'");
                    System.out.println("            ) (");
                    System.out.println("          _.' '._");
                    System.out.println("         `\"\"\"\"\"\"\"`");
                    System.out.println("     =================");
                    System.out.println("        PARABENS!!!");
                    System.out.println("     =================");
                    System.out.println("Você Ganhou 10 milhões em BITCOINS");
                }
            }
        }



    }
    public static void saida(){
        System.out.println("Eu realmente estou feliz que consegui fazer, sem ajuda de ninguem so aplicando logica");
        System.out.println("estou cada vez mais perto do meu objetivo, isso me deixa feliz");
        System.out.println("Muito obrigado por participar de qualquer forma, ate a proxima felas");

    }
}
