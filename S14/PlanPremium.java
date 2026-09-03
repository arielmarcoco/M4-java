package S14;

public class PlanPremium extends Subscripcion {
    //atributo
    private double cargoSpa;

       //llamamos al constructor de la clase padre
    public PlanPremium(String nombreSocio, int meses){
        super (nombreSocio, meses);

    }
    //Sobre escribir el metodo abstracto
    @Override
    public double calcularTotal(){
    return (meses * 600)+ cargoSpa;//Tarifa por mes 
    } 
}
