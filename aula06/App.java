import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p = null;

        Pessoa[] pessoas;

        pessoas = new Pessoa[10];


        System.out.println("Tamanho do vetor: " + pessoas.length);
        pessoas[0] = new Pessoa();
        pessoas[0] = null;


        ArrayList<Pessoa> listaPessoas;

        listaPessoas = new ArrayList<>();

        System.out.println("Tamanho da lista de pessoas: " + listaPessoas.size());

        listaPessoas.add(new Pessoa());

        System.out.println("Tamanho da lista de pessoas: " + listaPessoas.size());

        listaPessoas.remove(0);

        System.out.println("Tamanho da lista de pessoas: " + listaPessoas.size());

    }
}
