package S01.PP;

public class CalculoArea{
    public static double calcularArea(double base, double altura){
    return base * altura/2;
    }   
   
    public static void main(String[] args){
    double base = 10;
    double altura = 5;
    double area = calcularArea(base, altura);
    System.out.println("Ela área del triangulo es: "+ area); 
    }   
}