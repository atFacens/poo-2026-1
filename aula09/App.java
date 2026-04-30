public class App {
    public static void main(String[] args) {
        // Uma classe abstrata não pode ser instanciada = gerar objeto
        // Pessoa p = new Pessoa("asdsa","sadsad");

        Aluno a1 = new Aluno("Marcelo", "ma@email.com");
        Aluno a2 = new Aluno("Amanda", "amanda@email.com");
        Professor p1 = new Professor("Ana", "ana@email.com");
        Professor p2 = new Professor("Ricardo", "ricardo@email.com");

        Pessoa pessoas[] = new Pessoa[4];
        pessoas[0] = a1;
        pessoas[1] = p1;
        pessoas[2] = a2;
        pessoas[3] = p2;

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].getClassificacao());
        }

    }
}
