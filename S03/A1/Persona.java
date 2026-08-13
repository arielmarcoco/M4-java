package S03.A1;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
this.nombre= nombre;
this.edad = edad;

    }
    void presentarse(){

        System.out.println("hola, soy "+ nombre+"y tengo "+edad+" años");
    }
    
}
