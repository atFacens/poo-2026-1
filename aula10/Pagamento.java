public abstract class Pagamento {
    protected double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public void exibirPagamento() {
        System.out.println("Valor R$ " + valor);
    }

    public abstract void processar();
}
