public class Aluno extends Pessoa {
    private long ra;

    public Aluno(String nome) {
        super(nome);
    }

    public long getRa() {
        return ra;
    }

    public void setRa(long ra) {
        this.ra = ra;
    }
}
