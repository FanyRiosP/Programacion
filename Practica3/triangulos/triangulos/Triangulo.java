/*
 * Clase que simula un triángulo a partir de tres objetos punto
 */

public class Triangulo {

    // Atributos de la clase
    private Punto A;
    private Punto B;
    private Punto C;
    
    // Método constructor por omisión. 
    // Crea un triángulo con extremos en: (0,0), (10,0) y (5,10)
    Triangulo () {
        this(new Punto(0,0), new Punto(10,0), new Punto(5,10));
    }

    // Método constructor de un triangulo a partir de 3 puntos
    Triangulo (Punto p1, Punto p2, Punto p3) {
        A = new Punto(p1);
        B = new Punto(p2);
        C = new Punto(p3);
    }

    // Método constructor copia 
    Triangulo (Triangulo t) {
        this(t.A, t.B, t.C);
    }

    // Métodos para obtener los lados AB, BC Y AC del triángulo 
    public double obtenerAB(){
        double AB = A.distancia(B);
        return AB;
    }
    
    public double obtenerBC(){
        double BC = B.distancia(C);
        return BC;
    }

    public double obtenerAC(){
        double AC = A.distancia(C);
        return AC;
    }

    // Método que calcula el area del triángulo con lados de longitud a, b y c utilizando la fórmula de Herón que dice 
    // que el semi-perímetro de un triángulo es s = (a + b + c)/2 se tiene que el  ́area es √s(s −a)(s −b)(s −c)
    public double calcularArea(){ 
        double s = (this.obtenerAB() + this.obtenerBC() + this.obtenerAC())/2;
        double area = Math.sqrt(s * (s - this.obtenerAB())*(s - this.obtenerBC())*(s - this.obtenerAC()));
        return area;
    }


    // Método que determina el tipo de triángulo: equilatero, isósceles o escaleno
    public String tipoTriangulo(){
		if(this.obtenerAB() == this.obtenerBC() && this.obtenerAC() == this.obtenerAC() && this.obtenerAB() == this.obtenerAC()){
			return "Tipo de triángulo: Equilátero";
		} else if (this.obtenerAB() == this.obtenerBC() && this.obtenerBC() != this.obtenerAC() || this.obtenerBC() == this.obtenerAC() && this.obtenerAC() != this.obtenerAB() || this.obtenerAB() == this.obtenerAC() && this.obtenerAC() != this.obtenerBC()) {
            return "Tipo de triángulo: Isósceles";            
        } else {
            return "Tipo de triángulo: Escaleno"; 
        }
        }
    
    // Método que calcula el perímetro del triángulo 
    public double calcularPerimetro(){
        double p = this.obtenerAB() + this.obtenerBC() + this.obtenerAC();
        return p;
    } 

    // Método que determina si dos triángulos son iguales
    public boolean equals(Triangulo triangulo2){
        return this.calcularArea() == triangulo2.calcularArea() && this.calcularPerimetro() == triangulo2.calcularPerimetro() && this.tipoTriangulo() == triangulo2.tipoTriangulo(); 
    }

    // Método que regresa una cadena con la información del triángulo de la forma:
    // ab: (x1,y1) - (x2,y2 ); bc: (x2,y2)-(x3,y3); ac: (x1,y1)-(x3,y3)
    public String toString(){
        return "ab: (" + A + ")-("+ B + "); bc: (" + B + ")-(" + C + "); ac: (" + A + ")-(" + C + ")"; 
    }


}

