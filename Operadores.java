public class Operadores{
    
    public static void main(String [] args){
        
        String saludo = "Soy una cadena";
        System.out.println("Hola, " + saludo);
        int alto= 5;
        int ancho= 10;
        int areaRectangulo = alto * ancho;
        System.out.println("El area del rectangulo es: " + areaRectangulo);

        int n1 = 10; 
        int n2 = 25; 
        int Suma = n1 + n2;
        System.out.println("Suma: " + Suma);

        int n3 = 30; 
        int n4 = 15;
        int Resta = n3 - n4;
        System.out.println("Resta: " + Resta);

        int n5 = 10;
        int n6 = 2; 
        int Division = n5 / n6;
        System.out.println("División: " + Division);

        double altura = 10;
        double radio = 2;
        double pi = 3.1416;
        double Volumen = ((radio * radio)* pi)* altura;
        System.out.println("Volúmen del Cilindro: " + Volumen);

        String autor = "Edgar Alan Poe";
        String libro = "Corazón Delator";
        System.out.println(libro + " fue escrito por " + autor);
        }
    }