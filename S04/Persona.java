package S04;

public class Persona {
//declaracion de atributos privados    
    private String nombre;
    private int edad;
//contructor
    public Persona(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
    }
//metodo set
    public int setEdad(int nuevaEdad){
        return edad= nuevaEdad;

    }
//metodo get    
public String getNombre(){
    return nombre;
}
//metodo get
public int getEdad(){
    return edad;

}
void mostrarDatos(){
System.out.println("=".repeat(20));
System.out.println("Actividad Encapsulamiento");
System.out.println("=".repeat(20));
System.out.println("nombre"+nombre+"\nEdad"+edad);

}

}
