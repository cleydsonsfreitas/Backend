package CadastrandoProdutos;
import java.util.Scanner;

public class produto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fala Fellow, qual  o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Bom ter você aqui " + nome + "vamos la");
        System.out.println("Hoje vamos encontrar 3 produtos da nossa loja em nosso estoque");

        String[][] produtos = new String[3][3];

        produtos[0][0] = "110";
        produtos[0][1] = "TV";
        produtos[0][2] = "5.300";

        produtos[1][0] = "335";
        produtos[1][1] = "Computador";
        produtos[1][2] = "3.150";

        produtos[2][0] = "545";
        produtos[2][1] = "Camiseta";
        produtos[2][2] = "75.89";

        for (String[] produto : produtos) {
            for (String dadoDoProduto : produto) {
                System.out.println(dadoDoProduto + "");

            }

            System.out.println();

        }

        System.out.println("Digite o codigo do produto que deseja buscar:");
        String codigoDoProduto = scanner.nextLine();

        boolean produtoEncontrado = false;

        for (String[] produto : produtos) {
            if (produto[0].equals(codigoDoProduto)) {
                System.out.println(" Produto encontrado!!!!");
                System.out.println("Codigo: " + produto[0] + " Nome: " + produto[1] + "Preço: " + produto[2]);
                produtoEncontrado = true;
                break;

            }

        }

        if (!produtoEncontrado) {
            System.out.println("Produto não encontrado");
        }



    }
}
