public class Main {
    public static void main(String[] args) {
        Pessoa pessoas[] = new Pessoa[5];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa("Pessoa " + (i + 1), "pessoa" + (i + 1) + "@email.com");
        }

        Pessoa.exibir(pessoas);

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }
    }
}
