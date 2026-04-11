import java.util.ArrayList;

public class Colaborador {
    private String nome;
    private int idade;
    private Endereco endereco;
    // private String[] telefone = new String[3];
    private ArrayList<String> telefones = new ArrayList<>();
    
    // public Colaborador(){}

    public Colaborador(String nome, int idade, Endereco endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        if(endereco != null) {
            this.endereco = endereco;
        } else {
            this.endereco = new Endereco("não cadastrado", 0, "-", "----");
        }
        if(!telefone.trim().isEmpty()) {
            telefones.add(telefone);
        }
    }

    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }

    public String exibirDados() {
        String listaTelefones = "";
        if( ! telefones.isEmpty()) {
            for (String telefone : telefones) {
                listaTelefones += (telefone + "/ ");
            }
        }
        if(endereco != null) {
            return nome + ", " + idade + ", " + endereco.exibir() + " " + listaTelefones;
        } else{
            return nome + ", " + idade  + " " + listaTelefones;
        }
    }
}
