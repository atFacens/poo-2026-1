public class Main {
    public static void main(String[] args) {
        Pagamento p1 = new PagamentoCartao(200);
        Pagamento p2 = new PagamentoPix(100);

        p1.exibirPagamento();
        p1.processar();

        p2.exibirPagamento();
        p2.processar();
        
        Reembolsavel r1 = new PagamentoCartao(300);
        r1.reembolsar();

    }
}
