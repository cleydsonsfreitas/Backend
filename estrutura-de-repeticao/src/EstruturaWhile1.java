import java.util.Scanner;

public class EstruturaWhile1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);


        String senhaCorreta = "Java@54321";
        String senhaDigitada;
        int tentativasRestantes = 3;



       while(tentativasRestantes > 0){
            System.out.println("Digite a senha");
            senhaDigitada = scanner.nextLine();

           if (senhaDigitada.equals(senhaCorreta)) {
               System.out.println("Senha correta acesso Liberado!");
               break;

           } else {
               tentativasRestantes--;
               System.out.println("Senha incorreta, tentativas restantes" + tentativasRestantes);

           }
       }
        if (tentativasRestantes == 0) {
            System.out.println("Conta Bloqueada");

        }



    }
}
