public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Lulu", "dog alemão");
        Cachorro cachorro = new Cachorro("Pitu", "vira-lata", "ABC1234");
        Cachorro cachorro2 = new Cachorro("Pitu", "vira-lata", "ABC1234");

        System.out.println(animal.exibir());
        System.out.println(cachorro.exibir());

        System.out.println(cachorro);

        cachorro2 = cachorro;


    }
}
