/**
 * Clase para trabajar con puntos en plano Cartesiano
 * @author Amparo Lopez  Gaona
 * @version 3a. ed.
 */
public class Punto {            
                            //    Atributos
   private double x;      // Coordenada x
   private double y;      // Coordenada y

  /**
   * Metodo para asignar valor a la coordenada x del punto.
   * @param nuevaX - nuevo valor para la coordenada x.
   */
  public void asignarX(double nuevaX) {   
    x = nuevaX; 
  }
  /**
   * Metodo para asignar valor a la coordenada y del punto.
   * @param nuevaY - nuevo valor para la coordenada y.
   */
  public void asignarY(double nuevaY) {   
    y = nuevaY; 
  }
  /** EN LOS METODOS ANTERIORES asignarX y asignarY, se asigna el valor del parametro nuevaX
  *   o nuevaY a la variable de instancia x o y definidas como parte de la estructura de cada
  *   objeto de la clase Punto.
  */
  /**
   * Metodo para obtener el valor de la coordenada x del punto.
   * @return double - la coordenada x del punto.
   */  
  public double obtenerX () { 
    return x; 
  } 
  /**
   * Metodo para obtener el valor de la coordenada y del punto.
   * @return double - la coordenada y del punto.
   */  
  public double obtenerY () { 
    return y; 
  } 
  /**
   * Metodo para asignar nuevos valores a un punto
   * @param nuevaX - coordenada x del punto
   * @param nuevaY - coordenada y del punto
   */
  public void asignarPunto(double nuevaX, double nuevaY) {
    asignarX(nuevaX);
    asignarY(nuevaY);
  }
  /**
   * En el Metodo anterior se hace uso de los metodos asignar definidos previamente
   */
  /**
   * Otra version de Metodo para asignar nuevos valores a un punto
   * utilizando x y y como variables de instancia
   * parametro al punto que lo llama.
   * @param nuevaX - coordenada x del punto
   * @param nuevaY - coordenada y del punto
   */
  /**
  * public void asignarPunto(double nuevaX, double nuevaY) {
  *  x = nuevaX;
  *  y = nuevaY;
  *}
  */
  /**
   * Otra forma de programar este metodo es que tome un punto como parametro.
   *
   * Metodo para asignar el valor del punto p al punto con que se llama el metodo
   * @param p --  punto a asignar
   */
  public void asignarPunto(Punto p) {
    x = p.obtenerX();
    y = p.obtenerY();
  }
  /**
   * Metodo para desplazar un punto.
   * @param deltaX - desplazamiento en el eje de las Xs.
   * @param deltaY - desplazamiento en el eje de las Ys.
   */  
  public void desplazar (double deltaX, double deltaY) {
    x += deltaX;
    y += deltaY;
  }
  /**
   *  Metodo para calcular la distancia entre dos puntos usando la formula
   *  ((x2-x1)^2 + (y2-y1)^2)^1/2
   *  @param p - punto respecto al que se quiere determinar la distancia.
   *  @return double - distancia entre los dos puntos.
   */
  public double distancia (Punto p) {
    return Math.sqrt((x-p.obtenerX())*(x-p.obtenerX()) + (y-p.obtenerY())*(y-p.obtenerY()));
  }

  /**
   * Metodo para determinar si tres puntos estan alineados verificando que se cumpla la
   * igualdad: (y-y1)*(x2-x1) = (y2-y1)*(x -x1)
   * @param p1 - Punto que junto con p2 y el que llama se verifica si estan alineados
   * @param p2 - Punto que junto con p1 y el que llama se verifica si estan alineados
   * se verificara si estan alineados.
   * @return true si estan alineados, false en otro caso.
   */
  public boolean estanAlineados (Punto p1, Punto p2) {
    return (y - p1.y)*(p2.x - p1.x) == (p2.y - p1.y)*(x -p1.x);
  }
  /**
   * Constructor de un punto, crea el punto (0,0)
   */
  public Punto () { 
    x = y = 0; 
  }
  /**
   * Constructor de un punto a partir de dos numeros enteros que
   * representan las coordenadas del nuevo punto.
   * @param x - coordenada x del nuevo punto.
   * @param y - coordenada y del nuevo punto.
   */
  public Punto (double x, double y) { 
    this.x = x; 
    this.y = y; 
  }
  /**
   * Constructor de un punto a partir de otro punto (constructor de Copia)
   * @param p - punto a partir del cual se creara el nuevo.
   */
  public Punto (Punto p) { 
    this(p.x, p.y); 
  }
  /** 
   * Metodo para determinar si dos puntos son iguales.
   * @param p - punto contra el cual se va a comparar
   * @return boolean - true si son iguales y false en otro caso
   */
  public boolean equals (Object p) {
    Punto pto = (Punto)p;
    return x == pto.obtenerX() && y == pto.obtenerY();
  }
  /** 
   * Metodo para convertir un Punto a cadena de caracteres 
   * @return String -- el punto en formato de cadena
   */
     public String toString() {
     return "(" + (int)x + "," + (int)y + ")";
   }
   
}