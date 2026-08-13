package S03.A2;

public class Estudiante {
    //atributos
    String nombre;
    String carrera;
    double promedio;
    //constructor
    public Estudiante(String nombre, String carrera, double promedio){
       this.nombre= nombre;
       this.carrera= carrera;
       this.promedio = promedio; 
    }
    //metodo 1
    void mostrarDatos(){
        System.out.println("Soy "+nombre+", estudio "+carrera+" y mi promedio es de "+promedio);
    }
    //metodo 2
    void evaluarRendimiento(){
        if(promedio >=9){
            System.out.println("Exelente rendimiento");
        }else if(promedio >=7 && promedio <=8){
            System.out.println("Buen rendimiento");
        }else{
            System.out.println("Necesitas mejorar");
        }
        
    }

}
