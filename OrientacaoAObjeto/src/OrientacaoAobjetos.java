import com.orientacaoobjetos.entity.Professor;
import java.util.Scanner;

public class OrientacaoAobjetos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Professor professor1 = new Professor();
         professor1.nome = "Avelino";
         professor1.escola = "Fatec";
         professor1.idade  = 45 ;
         professor1.materia = "GOVERNANÇA" ;




        Professor professor2 = new Professor() ;
         professor2.nome = "JEAN" ;
         professor2.escola = "Fatec" ;
         professor2.idade  = 45 ;
         professor2.materia = "JAVA";


         System.out.println(professor1);
         System.out.println(professor2);









    }


}
