public class PagamentoPix extends Pagamento {

    public PagamentoPix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Processanto pagamento por Pix");
        
    }
    
}
