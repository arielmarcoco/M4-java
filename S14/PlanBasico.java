package S14;

public class PlanBasico extends Subscripcion {
    //llamamos al constructor de la clase padre
    public PlanBasico(String nombreSocio, int meses){
        super (nombreSocio, meses);

    }
    //Sobre escribir el metodo abstracto
    @Override
    public double calcularTotal(){
    return meses * 400;//Tarifa por mes 
    }
    
}
