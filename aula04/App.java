public class App {
    public static void main(String[] args) {
        Relogio meuRelogio = new Relogio(20, 33, 12);
        Relogio meuRelogio2 = new Relogio();

        // Atributos privados não pode ser acessados fora da classe
        // meuRelogio.hora = 25;

        // meuRelogio.setHora(20);
        // meuRelogio.setMinuto(33);
        // meuRelogio.setSegundo(12);

        System.out.println(meuRelogio.getHora());
        System.out.println(meuRelogio.getMinuto());
        System.out.println(meuRelogio.getSegundo());
        System.out.println("----");
        System.out.println(meuRelogio2.getHora());
        System.out.println(meuRelogio2.getMinuto());
        System.out.println(meuRelogio2.getSegundo());
    }
}
