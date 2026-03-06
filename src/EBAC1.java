import java.util.Scanner;

public class EBAC1 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         //Primiero contato com o Felas
         System.out.println("Fala felas, seja bem vindo ao meu primeiro exercico da EBAC");
         System.out.println("Hoje vou montar uma lista cadastral sua");
         System.out.println("Para isso vou precisar da sua ajuda");
         System.out.println("Vamos lá Felas");

         //Colhendo informações
         //Nome
         System.out.println("Qual é o seu nome completo felas?");
         String nome = scanner.nextLine();

         System.out.println("Seja bem vindo " + nome + " vamos continuar");

         //Idade
         System.out.println("Qual é a sua idade?");
         String idade = scanner.nextLine();

         //Peso
         System.out.println("Qual é o seu peso?");
         double peso = scanner.nextDouble();

         //Altura
         System.out.println("Qual é a sua altura?");
         double altura = scanner.nextDouble();
         scanner.nextLine();

        //Quebra de ritimo
        System.out.println("Boa felas, estamos quase acabando");
        System.out.println("Só precisamos de mais duas informações");

        //Estado civil
        System.out.println("Qual é o seu estado civil?");
        String estado = scanner.nextLine();

        //CPF
        System.out.println("Qual é o numero do seu CPF felas?");
        String cpf = scanner.nextLine();


        //Saida
        System.out.print("Que bom que chegou até aqui " + nome );
        System.out.print("Já temos a sua ficha cadastral?");
        System.out.print("\n[Ficha Cadastral]\nNome: " + nome + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura + "\nEstado Civil: " + estado + "\nCPF: " + cpf);
        System.out.print("\nMuito obrigado por contribuir com o meu aprendizado, até a proxima!");







    }
}
