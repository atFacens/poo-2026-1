public class PagamentoCartao extends Pagamento implements Reembolsavel {

    public PagamentoCartao(double valor) {
        super(valor);
    }

    public void processar() {
        System.out.println("Procesando o pagamento no cartão");
    }

    @Override
    public void reembolsar() {
        System.out.println("Reembolso feito no cartão");
    }
    
}
