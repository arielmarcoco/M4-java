package S03.A2;

public class Main {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ariel", "Contaduria", 9.2);    
        Estudiante e2 = new Estudiante("Carlos", "Ingenieria en Sistmea", 8.5);
        Estudiante e3 = new Estudiante("Marco", "Lic. en Sistemas de computación", 7);
        Estudiante e4 = new Estudiante("Maribel", "Medico Cirujano", 6);
    System.out.println("====================================================");
       e1.mostrarDatos();
       e1.evaluarRendimiento();
       e2.mostrarDatos();
       e2.evaluarRendimiento();
       e3.mostrarDatos();
       e3.evaluarRendimiento();
       e4.mostrarDatos();
       e4.evaluarRendimiento();
       
    }
}
