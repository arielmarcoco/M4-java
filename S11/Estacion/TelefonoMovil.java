package S11.Estacion;

public class TelefonoMovil implements Recargable{
    private String marca;
    public TelefonoMovil(String marca){
        this.marca = marca;
    }
    @Override
    public void iniciarCarga(){
        System.out.println("Conectadon cable USB-C... Cargando bateria de telefono"+marca+".");
    }
    
}
