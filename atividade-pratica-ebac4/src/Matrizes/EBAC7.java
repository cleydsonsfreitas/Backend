package Matrizes;

import java.util.Scanner;
public class EBAC7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome felas?");
        String nome = scanner.nextLine();

        System.out.println(nome +" hoje vamos fazer voce digitar os valores da nossa matriz 3x3");

        int[][] hellosteak = new int[3][3];

        for(int i = 0; i < hellosteak.length ; i++ ){
            for(int j = 0; j < hellosteak.length ; j++){
                System.out.print(" Digite o valor da posição ["+i+"]["+j+"]");
                hellosteak[i][j] = scanner.nextInt();
            }

        }


        for(int i = 0; i < hellosteak.length ; i++ ){
            for(int j = 0; j < hellosteak.length ; j++){
                System.out.println(hellosteak[i][j]+ "");
            }
            System.out.println();
        }


    }
}
