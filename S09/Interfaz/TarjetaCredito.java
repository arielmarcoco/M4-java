package S09.Interfaz;

public class TarjetaCredito implements ProcesadorPago {
    private String terminacion;

    public TarjetaCredito(String terminacion){
        this.terminacion = terminacion ;    

    }
    @Override
    public void procesarPago(double monto){

        System.out.println("cobrando $"+monto+" a la tarjeta con terminacion"+terminacion);
    }

}

