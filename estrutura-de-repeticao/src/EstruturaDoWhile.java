import java.util.Scanner;

public class EstruturaDoWhile{
    public static void main(String[] args) throws InterruptedException{
        Scanner scanner = new Scanner(System.in);


        int base;
        int expoente;
        int resultado;



        do {
            System.out.println("Informe o valor da base, tem que ser maior que zero");
            base = scanner.nextInt();
        } while (base < 0);


        do {
            System.out.println("Informe o valor do expoente, tem que ser maior que zero");
            expoente = scanner.nextInt();
        } while (expoente < 0);


        resultado = 1;

        while (expoente >= 1) {
            resultado = base * resultado;
            expoente--;
        }

        System.out.println("Resultado: " + resultado);




    }

}