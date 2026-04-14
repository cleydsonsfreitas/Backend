
public class VetorAulaDois {
    public static void main(String[] args){


        int[] vetor = new int[]{5, 44, 3 ,99, 101 ,45};

        for(int i = 0; i < vetor.length; i++){
            for(int j = i; j < vetor.length; j++){
                if(vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

    }

    private static void exibevetor(int[] vetor){

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);

        }
    }
}
