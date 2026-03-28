public class App {
    public static void main(String[] args) {
        Endereco e = new Endereco("Av Paulista", 123, "12º andar", "001122-000");
        Endereco e2 = null;
        Colaborador c1 = new Colaborador("Carlos", 23, e2);
        // Colaborador c2 = new Colaborador();

        System.out.println(c1.exibirDados());
    }
}
