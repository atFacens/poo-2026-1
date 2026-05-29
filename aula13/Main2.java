import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // Pessoa pessoas[] = new Pessoa[5];
        ArrayList<Pessoa> listaPessoas = new ArrayList<>();

        Pessoa p = new Pessoa("Emerson", "emerson@email.com");

        listaPessoas.add(p);
        // System.out.println(listaPessoas.get(0));

        listaPessoas.add(new Pessoa("Ana", "ana@email.com"));
        listaPessoas.add(new Pessoa("Carlos", "carlos@email.com"));

        // for (int i = 0; i < listaPessoas.size(); i++) {
        //     System.out.println(listaPessoas.get(i));
        // }

        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa);
        }
        
    }
}
