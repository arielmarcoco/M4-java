package S07.Ejemplo;

public class Notificacion {
   //metodo 1
    void enviar(){

        System.out.println("La notificacion del sistema ha sido enviada");
    
    }
    //sobrecarga del metodo 1

    void enviar(String mensaje){
        System.out.println("Mensaje"+ mensaje);
    }
}
