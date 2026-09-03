package S07.Sobreescritura;

public class Main {
    public static void main(String[] args) {
        Animal a= new Animal();
        Animal p = new Perro();
        Animal g = new Gato();
        System.out.println("=".repeat(50));
        a.sonido();
        p.sonido();
        g.sonido();
    }
}
