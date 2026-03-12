package exemplo01;

public class App {

    public static void main(String[] args) {
        // pessoa1 é do tipo Pessoa
        // Pessoa pessoa1;

        // cria um objeto do tipo pessoa
        //pessoa1 = new Pessoa();

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Carlos";
        // pessoa1.idade = -34;
        pessoa1.alterarIdade(-34);
        pessoa2.nome = "Danilo";
        // pessoa2.idade = 12;
        pessoa2.alterarIdade(12);

        // System.out.println(pessoa1.nome + " - " + pessoa1.idade);
        System.out.println(pessoa1.nome + " - " + pessoa1.obterIdade());
        // System.out.println(pessoa2.nome + " - " + pessoa2.idade);
        System.out.println(pessoa1.nome + " - " + pessoa2.obterIdade());

        pessoa1.apresentar();
        pessoa2.apresentar();

    }
}
