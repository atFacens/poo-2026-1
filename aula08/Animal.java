
public class Animal extends Object {
    private String nome;
    private String raca;
    private int idade;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // sobrecarregar = overload
    public Animal(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public String exibir() {
        return nome + " - " + raca + " - idade: " + ((idade > 0) ? idade : "não informada");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    // @Override
    // public String toString() {
    //     return "animal " + nome;
    // }
}
