package ManipulandoVetores;
import java.util.Scanner;


public class Vetores {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        vetor();
        vetorfor();
        vetorsoma();
        vetorsubtracao();
        vetorveses();
        vetordivisao();


    }


//  Como fazer um array simples
    public static void vetor(){
        Scanner scanner = new Scanner(System.in);


        int vetor[] = new int[]{5, 10, 15, 20, 25};
        System.out.println(vetor[2]);


    }


//  Como fazer um laço de repetição em um array
    public static void vetorfor(){
        Scanner scanner = new Scanner(System.in);


        int vetor1[] = new int[]{5, 10, 15, 20, 25};


        for (int i =0 ; i < vetor1.length; i++){
            System.out.println(vetor1[i]);


        }


    }


//    como fazer operações com os valores do array sem alterar seu valor inicial
    public static void vetorsoma(){
        Scanner scanner = new Scanner(System.in);


        int vetor2[] = new int[]{5, 10, 15, 20, 25};
        for (int i=0 ; i < vetor2.length ; i++ ){


            int soma = vetor2[i] + 10;


            System.out.println(soma);


        }
    }


    public static void vetorsubtracao(){
        Scanner scanner = new Scanner(System.in);


        int vetor3[] = new int[]{5, 10, 15, 20, 25};
        for (int i =0 ; i < vetor3.length ; i++){


            int subtracao = vetor3[i] - 2;


            System.out.println(subtracao);


        }
    }


    public static void vetorveses(){
        Scanner scanner = new Scanner(System.in);


        int vetor4[] = new int[]{5 , 10, 15, 20, 25};
        for(int i =0; i < vetor4.length; i++){


            int veses = vetor4[i] * 2;


            System.out.println(veses);


        }
    }


    public static void vetordivisao(){
        Scanner scanner = new Scanner(System.in);


        int vetor5[] = new int[]{5, 10, 15, 20, 25};
        for (int i =0 ; i < vetor5.length; i++){


            int divisao = vetor5[i] / 1;



            System.out.println(divisao);


        }
    }


}
