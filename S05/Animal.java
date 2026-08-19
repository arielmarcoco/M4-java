package S05;

public class Animal {
    
    //Declaracion de atributos
    protected String nombre;
    protected int edad;
    //constructor de la clase
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    //metodo
    void sonido(){
        System.out.println(nombre+" hizo un sonido."+ nombre+ "tiene "+ edad+ " años de edad");
    
    
}
}
