package S08.A1;

public class Main {
    public static void main(String[] args) {
        Pelicula p = new Pelicula("el quinto elemento", 126, "Luc Besson");
        Serie s = new Serie( "hora de aventura", 11, 10);


        System.out.println("=".repeat(60));
        System.out.println("Pelicula de esteno");
        System.out.println("=".repeat(60));
        p.mostrarInfo();
        System.out.println("=".repeat(60));
        System.out.println("Serie favorita");
        System.out.println("=".repeat(60));
        s.mostrarInfo();
        System.out.println("=".repeat(60));


    }
}

