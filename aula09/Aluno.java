public class Aluno extends Pessoa {
    private String nomeCurso;

    public Aluno(String nome, String email){
        super(nome, email);
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    @Override
    public int getClassificacao() {
        return 10;
    }

}
