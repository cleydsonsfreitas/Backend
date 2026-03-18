import java.util.Scanner;

public class EstruturaFor{
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        entrada();
        saque();
        saida();

    }

    public static void entrada() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);

//      Entrada
        System.out.println("Bem vindo ao nosso banco");
        System.out.println("Qual é o seu nome ");
        String nome = scanner.nextLine();
        System.out.println(nome + " você pode sacar até R$ 1000,00 reais com saque minimo de R$ 2,00 reais");

    }

    public static void saque() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);


//      Sacar a Grana
        System.out.println("Qual o valor você deseja sacar");
        int saque = scanner.nextInt();

        if (saque < 2 || saque > 1000) {

            while (saque < 2 || saque > 1000) {
                System.out.println("Indisponivel para saque, digite um valor entre 2 a 1000 reais");
                saque = scanner.nextInt();
            }

        }



//      Temos que entregar a menor quantidade de notas possiveis para o cliente
//      No banco temos notas de 100 ; 50 ; 20 ; 10 ; 5 e 2
//      Exemplo, cliente quer sacar 105 reais, ele vai receber  1 nota de 100 e 1 nota de 5


        int nota = 100;

        for (int i = 0 ; i < 6 ; i++ ) {
            int quantidadeDecedulas = saque / nota;
            if (quantidadeDecedulas > 0) {
                System.out.println(quantidadeDecedulas + " notas de R$ " + nota);
                saque = saque % nota;
            }

            if (nota == 100) {
                nota = 50;

            } else if (nota == 50){
            nota = 20;

            } else if (nota == 20){
            nota = 10;

            } else if (nota == 10) {
                nota = 5;

            } else if (nota == 10) {
            nota = 2;
            }



        }

    }

    public static void saida() throws InterruptedException {
        System.out.println("Ate o proximo saque");
    }


}
