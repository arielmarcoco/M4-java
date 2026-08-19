package S05;

public class Perro extends Animal {
    //Declaracion de atributos propios
    private String raza;
    //constructor de la clase animal
    public Perro(String nombre, int edad, String raza){
       //llamado del contructor de la clase padre
        super(nombre,edad);
        this.raza = raza;
    }
    //sobreescritura del metodo heredado
    @Override
    void sonido(){
        System.out.println(nombre+"ladra: ¡Guauu!");
    }
    //metodo propio
    void moverCola(){
        System.out.println(nombre+" de raza "+raza+" tiene "+edad+"años de edad y mueve la cola felizmente");
    }
}
