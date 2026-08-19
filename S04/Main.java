package S04;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Erick",25);
        p.mostrarDatos();
        p.setEdad(30);
        System.out.println("Despues de 5 años, ahora "+p.getNombre()+" tiene "+p.getEdad()+"años");
    }
}
