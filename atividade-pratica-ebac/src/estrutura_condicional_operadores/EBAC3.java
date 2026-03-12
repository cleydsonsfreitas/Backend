package estrutura_condicional_operadores;
import java.util.Scanner;

public class EBAC3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//      Entrada
        System.out.println("Olá Boa noite!");
        System.out.println("Seja bem vindo ao meu exercico 3 da EBAC");
        System.out.println("Qual é o seu nome?\n");
        String nome = scanner.nextLine();
        System.out.println("Salve felas é bom ter o senhor aqui, " +nome);


//      Função principal
        System.out.println("Hoje vamos precisar que você digite dois numeros inteiros e vamos comparar eles");
        System.out.println(nome + " Digite um numero");
        double numero1 = scanner.nextDouble();
        System.out.println("Boa felas, agora digite outro numero");
        double numero2 = scanner.nextDouble();


//      Funcionalidade
        if (numero1 > numero2){
            System.out.println(nome + " O numero: " + numero1 + " é maior que o numero " + numero2 );


        } else if (numero1 < numero2){
            System.out.println(nome + " O numero: " + numero2 + " é maior que o numero " + numero1);


        } else{
            System.out.println(nome + " seus numeros são iguais");

        }

//      Saida
        System.out.println("Muito obrigado por me ajudar nessa atividade, até a proxima " + nome + " <3");

        scanner.close();
    }
}
