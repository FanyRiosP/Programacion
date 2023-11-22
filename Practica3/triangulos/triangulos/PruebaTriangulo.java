

public class PruebaTriangulo{
	
	public static void main(String[] args){
    
    Triangulo t1 = new Triangulo(new Punto(0,0), new Punto(10,0), new Punto(5,10));
    Triangulo t2 = new Triangulo(new Punto(2,3), new Punto(10,3), new Punto(4,15));
    Triangulo t3 = new Triangulo(new Punto(5,20), new Punto(13,20), new Punto(7,32));
    Triangulo t4 = new Triangulo(new Punto(13,20), new Punto(5,20), new Punto(7,32)); 

    System.out.println("triángulo 1: " + t1.toString());
    System.out.println("triángulo 2: " + t2.toString());
    System.out.println("triángulo 3: " + t3.toString());
    System.out.println("triángulo 4: " + t4.toString());
    
    // Perímetro de los triángulos
    System.out.println("El perímetro del triángulo 1 es: " + t1.calcularPerimetro());
    System.out.println("El perímetro del triángulo 2 es: " + t2.calcularPerimetro());
    System.out.println("El perímetro del triángulo 3 es: " + t3.calcularPerimetro());
    System.out.println("El perímetro del triángulo 4 es: " + t4.calcularPerimetro());

    // Área de los triángulos
    System.out.println("El área del triángulo 1 es: " + t1.calcularArea());
    System.out.println("El área del triángulo 2 es: " + t2.calcularArea());
    System.out.println("El área del triángulo 3 es: " + t3.calcularArea());
    System.out.println("El área del triángulo 4 es: " + t4.calcularArea());

    // Tipo de triángulos
    System.out.println("El triángulo 1 es: " + t1.tipoTriangulo());
    System.out.println("El triángulo 2 es: " + t2.tipoTriangulo());
    System.out.println("El triángulo 3 es: " + t3.tipoTriangulo());
    System.out.println("El triángulo 4 es: " + t4.tipoTriangulo());

    // Comparación de triángulos
    if(t2.equals(t1) == true){
    	System.out.println("Los triángulos 2 y 1 son iguales");
    } else {
    	System.out.println("Los triángulos 2 y 1 no son iguales");
    }

    if(t3.equals(t4) == true){
    	System.out.println("Los triángulos 3 y 4 son iguales");
    } else {
    	System.out.println("Los triángulos 3 y 4 no son iguales");
    }
	}
}