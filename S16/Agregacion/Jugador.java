package S16.Agregacion;

public class Jugador {
    // Atributos
    private String nombre;
    private String posicion;


    // Constructor
    public Jugador (String nombre, String posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }


    // Métodos Getters
    public String getNombre() { return nombre; }    
    public String getPosicion() { return posicion; }    
}

