import java.util.Scanner;
public class VetorAulaUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        v();
        ci();


    }


    //  Aprendendo Vetor  utilizando for
    public static void v() {


        //  Entrada
        System.out.println("Fala felas, tudo bem ? quanto tempo em");
        System.out.println("Vou precisar de voce cara");
        System.out.println("Eu vou pedir e  voce vai digitar o tamanho e os valores de um vetor felas");
        System.out.println("Vamos la ?");


    }


    //  colhendo informaçõesm
    public static void ci() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o Tamanho do vetor Desejado");
        int tamanhovetor1 = scanner.nextInt();


        String[] vetor = new String[tamanhovetor1];

        scanner.nextLine();
        for (int i = 0; i < tamanhovetor1; i++) {


            System.out.println("Digite a posição " + i + " do seu vetor");
            vetor[i] = scanner.nextLine();


        }


        System.out.println("Vai tomando, você criou um vetor felas ");
        for (int i = 0; i < tamanhovetor1; i++) {
            System.out.println(vetor[i]);


        }


//    interação fator multiplicativo do vetor
        System.out.println("Felas, vamos multiplicar o seu vetor por um numero que você escolher");
        System.out.println("Faz aquele favor ne vida, digita o numero para eu pode multiplicar, eai qual vai ser ?");


        String palavraASerAcrescida = scanner.nextLine();

        System.out.println("Veja os valores do vetor criado por você com a palavra que você  escoclheu para ser acrescida em cada posição ");
        for (int i = 0; i < tamanhovetor1; i++){


            vetor [i] = vetor [i].concat(palavraASerAcrescida);


            System.out.println(vetor[i]);


        }


        scanner.close();


    }


}
