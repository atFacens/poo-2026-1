public abstract class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = email;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    // método abstrato é obrigatório nas classes filha
    public abstract int getClassificacao(); 

}
