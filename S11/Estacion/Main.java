package S11.Estacion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("===Estacion de Carga Pública=====");
        System.out.println("Ingrese la marca del telefono: ");
        String mt = sc.nextLine();
        TelefonoMovil tm = new TelefonoMovil(mt);
        
        System.out.println("Ingrese el modelo de auto: ");
        String ma = sc.nextLine();
        AutoElectrico ae = new AutoElectrico(ma);

        System.out.println("----------INICIANDO SUMINISTRO DE ENERGIA-------");
        tm.iniciarCarga();
        ae.iniciarCarga();
        sc.close();
    }
    
}
