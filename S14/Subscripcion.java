package S14;

public abstract class Subscripcion {
    //Atributos
    protected String nombreSocio;
    protected int meses;
    //constructor
    public Subscripcion(String nombreSocio, int meses){
        this.nombreSocio = nombreSocio;
        this.meses = meses;
    }
    //metodo abstracto
    public abstract double calcularTotal();
}
