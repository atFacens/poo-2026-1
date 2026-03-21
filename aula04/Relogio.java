public class Relogio {
    // atributos
    // Ecapsulamento: esconder, proteger
    private int hora, minuto, segundo;

    // construtor default (sem parâmetro)
    public Relogio() {
        System.out.println("Criando um reloogio....");
        hora = 12;
    }

    // sobrecarga de método
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    // this.hora é o atributo
    // hora é o parâmetro
    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
