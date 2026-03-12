package exemplo01;

// Nome do arquivo define o nome da classe
public class Pessoa {
    // atributos = características
    String nome;
    private int idade;

    // métodos = comportamentos ou ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }
    
    int obterIdade() {
        return idade;
    }

    void alterarIdade(int novaIdade) {
        if(novaIdade > 0) {
            idade = novaIdade;
        }
    }
}
