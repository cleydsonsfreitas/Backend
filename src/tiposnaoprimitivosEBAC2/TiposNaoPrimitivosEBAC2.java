package tiposnaoprimitivosEBAC2;
import java.util.Locale;
import java.util.Scanner;

public class TiposNaoPrimitivosEBAC2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String numero = "5";

        System.out.println(numero);

        int valor = Integer.parseInt(numero);

        int sum = (valor + 10);


        System.out.println(sum);


        scanner.close();

    }

}
