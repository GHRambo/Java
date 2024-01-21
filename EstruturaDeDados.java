import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        //lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Gustavo");
        nomes.add("Cleu");
        nomes.add("Catarina");

        System.out.println(nomes.get(1));

        //for ( String nome : nomes){
        //    System.out.println("O nome é " + nome);
        //}

        nomes.forEach( nome -> System.out.println("O nome é " + nome));


    }
}
