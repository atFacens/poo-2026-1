public class Colaborador {
    private String nome;
    private int idade;
    private Endereco endereco;
    
    // public Colaborador(){}

    public Colaborador(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        if(endereco != null) {
            this.endereco = endereco;
        } else {
            this.endereco = new Endereco("não cadastrado", 0, "-", "----");
        }
    }

    public String exibirDados() {
        if(endereco != null) {
            return nome + ", " + idade + ", " + endereco.exibir();
        } else{
            return nome + ", " + idade ;
        }
    }
}
