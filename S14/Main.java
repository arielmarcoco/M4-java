package S14;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Subscripcion socio = null;

        System.out.println("=".repeat(50));
        System.out.println("Sistema de cobro de GIM");
        System.out.println("Escribe el nombre del socio:");
        String nombre = sc.nextLine();
        System.out.println("Escribe la cantidad de meses a pagar:");
        String meses = sc.nextInt();
        System.out.println("Seleccione el tipo de plan:");
        System.out.println("1. Plan básico.");
        System.out.println("2. Plan Premium");
        System.out.println("Opcion: ");
        int op = sc.nextInt();
        
        if(op == 1){
            socio = new PlanBasico(nombre, meses);
        } else if (op == 2){
            System.out.println("Ingrese el cargo unico por uso de Spa");
            double CargoSpa = sc.nextDouble();
            
        }
    }
    
}
