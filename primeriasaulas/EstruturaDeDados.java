package primeriasaulas;
import java.util.ArrayList;
import java.util.List;

public class EstruturaDeDados {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Victor");
        nomes.add("Monica");
        nomes.add("Gabriel");

        // System.out.println(nomes.get(0));
        // for( String nome : nomes){
        //     System.out.println("O nome é "  + nome);
        // }

        nomes.forEach(System.out::println);
    }
}
