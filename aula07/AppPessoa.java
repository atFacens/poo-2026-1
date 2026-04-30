public class AppPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");
        Aluno aluno = new Aluno("Adalberto");

        // pessoa.setNome("João");
        // aluno.setNome("Adalberto");
        aluno.setRa(12345678);

        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Nome da aluno: " + aluno.getNome());
    }
}
