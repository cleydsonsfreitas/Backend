package estrutura_de_repetcao;
import java.util.Scanner;

public class EBAC5{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        entrada();
        escolha();
        saida();

    }


//      Escolha
    public static void escolha() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);


        int escolha;


        do{
            System.out.println("[1] Tabuada\n[2] Continuar\n[3] Sair");
            escolha = scanner.nextInt();


            if (escolha ==1) {
                System.out.println("Boa escolha");
                tabuada();


            } else if (escolha ==2) {
               System.out.println("Uma Escolha não muito interessante");
               frase();


            } else if (escolha ==3) {
                System.out.println("Então ta né felas");
                tchal();
                break;


            } else{
                System.out.println("Opção invalida, digite notamente");
            }


        } while(escolha > 1 || escolha <= 3 );


    }


//  Entrada
    public static void entrada(){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Olá seja bem-vindo");
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        System.out.println(nome + "O que deseja fazer?");


    }


//    Tabuada
    public static void tabuada() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual é o seu nome mesmo?");
        String nome1 = scanner.nextLine();


        System.out.println(nome1 + " vou vai escolher o numero que quer a tabuada e o intervalo que quer ver");
        System.out.println("Digite o número que quer ver a tabuada");
        int numero = scanner.nextInt();


        System.out.println("Digite o número do intervalo");
        System.out.println("[1] 1 a 10 \n[2] 1 a 20\n[3] 1 a 100\n[4] 1 a 1000");


        int intervalo = scanner.nextInt();
        int conta;
        int variavel = 0;


        if(intervalo == 1){
            while( variavel <= 10 ){
                conta = numero * variavel;
                System.out.println("Tabuada de " + numero + " x " + variavel + " é = " + conta);
                variavel++;
                Thread.sleep(1000);
            }


        } else if(intervalo == 2){
            while( variavel <= 20 ){
                conta = numero * variavel;
                System.out.println("Tabuada de " + numero + " x " + variavel + " é = " + conta);
                variavel++;
                Thread.sleep(1000);

            }


        }else if(intervalo == 3){
            while( variavel <= 100 ){
                conta = numero * variavel;
                System.out.println("Tabuada de " + numero + " x " + variavel + " é = " + conta);
                variavel++;
                Thread.sleep(1000);


            }


        }else if (intervalo == 4) {
            while( variavel <= 1000 ){
                conta = numero * variavel;
                System.out.println("Tabuada de " + numero + " x " + variavel + " é = " + conta);
                variavel++;
                Thread.sleep(1000);


            }


        } else {
            System.out.println("Opção invalida, vamos voltar do inicio para parar de ser besta");

        }


    }


//    Continuar
    public static void frase() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);


        System.out.println("Achei meio paia essa parte, porém tenho que entregar a atividade felas");
        System.out.println("Vou mandar você escrever uma frase, e mostrar ela kkkkkkkkkkk");


        System.out.println("Digite uma frase kkkkkkkkkkkk");
        String frase = scanner.nextLine();


        int i = 0;
        for (i = 5 ; i > 0 ; i--){
            System.out.println(i);
        Thread.sleep(1000);


        }


        System.out.println("Me recusei fazer somente isso, coloquei um for felas");
        System.out.println("Finalmente kkkkkkkkkk, sua frase é " + frase);


    }


//    Tchal
    public static void tchal(){
        System.out.println("Po felas, não deu nem uma olhada no código todo, falou ai, tchal, suma daqui kkkkkkkk");


    }


//    Saida
    public static void saida(){
        System.out.println("Estou cada vez mais proximo ao meu objetivo e vocês fazem parte disso, até a proxima felas");


    }


}
