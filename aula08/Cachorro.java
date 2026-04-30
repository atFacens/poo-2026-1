public class Cachorro extends Animal {
    private String numeroColeira;

    public Cachorro(String nome, String raca, String numeroColeira) {
        super(nome, raca);
        this.numeroColeira = numeroColeira;
    }

    public Cachorro(String nome, String raca, int idade, String numeroColeira) {
        super(nome, raca, idade);
        this.numeroColeira = numeroColeira;
    }

    @Override // sobrescrita
    public String exibir() {
        return getNome() + " - " + getRaca() + " - idade: " + ((getIdade() > 0) ? getIdade() : "não informada" + " id= " + numeroColeira); 
    }

    // @Override
    // public String toString() {
    //     return getNome();
    // }

}
