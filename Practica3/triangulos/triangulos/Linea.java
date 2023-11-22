/**   
 * Clase para crear líneas rectas en el plano Cartesiano
 * Objetivo: ilustrar la relación de agregación entre objetos.
 * @author  Amparo López Gaona
 * @see     Punto
 * @version 3a edicion
*/
public class Linea {
                        //Estructura
  private Punto p1;    // referencias a puntos (aun no son objetos)
  private Punto p2;

  /**
   * Constructor por omisión.
   * Crea la linea que pasa por los puntos (0,0) y (1,1)
   */
  Linea () { 
      this(new Punto(0,0), new Punto(1,1));  
  }

  /**
   * Constructor de una línea a partir de dos puntos
   * @param p1Ini -- punto de origen
   * @param p2Ini -- segundo punto
   */
  Linea (Punto p1Ini, Punto p2Ini) {
    p1 = new Punto(p1Ini); // utiliza el constructor de copia de la clase Punto
    p2 = new Punto(p2Ini);
  }

  /**
   * Constructor de copia
   * @param recta -- Línea que se toma para crear una nueva
   */
  Linea (Linea recta) { 
      this(recta.p1, recta.p2);
  }

  /**
  * Metodo para obtener el punto inicial de una recta
  * @return Punto -- punto p1
  */
  public Punto obtenerp1(){
      return p1;
  }

  /**
  * Metodo para obtener el punto final de una recta
  * @return Punto -- punto p2
  */
  public Punto obtenerp2(){
      return p2;
  }
  /**
  * Metodo para asignar nuevos puntos a una linea
  * @param nuevoPini
  * @param nuevoPfin
  */
  public void asignarLinea (Punto nuevoPini, Punto nuevoPfin) {
    p1 = nuevoPini;
    p2 = nuevoPfin;
  }

  /**
  * Metodo para asignar un nuevo punto inicial a una linea
  * @param nuevoPini
  */
  public void asignarPiniLinea (Punto nuevoPini) {
    p1 = nuevoPini;
  }

  /**
  * Metodo para asignar un nuevo punto final a una linea
  * @param nuevoPfin
  */
  public void asignarPfinLinea (Punto nuevoPfin) {
    p2 = nuevoPfin;
  }
  /**
   * Determina la ecuación de una recta que pasa por 2 puntos
   * @return String -- La ecuación de la recta
   *
  public String ecuacion() {
    if (p1.obtenerY() == p2.obtenerY())
      return "y = " + p1.obtenerY();  //Recta paralela al eje x.

    if (p1.obtenerX() == p2.obtenerX())
      return "x = " + p1.obtenerX();  //Recta paralela al eje y.

    double m = pendiente();
    double b = p1.obtenerY() - p1.obtenerX()*m;
    return (b >= 0) ? "y = "+ m +"x + "+b
                   : "y = "+ m +"x "+b;
  }
  */
/**
   * Determina la ecuación de una recta que pasa por 2 puntos
   * @return String -- La ecuación de la recta
   *
  */ 
  public String ecuacion() {
    if (pendiente() == Double.POSITIVE_INFINITY) {
      return "x = " + p1.obtenerX();  //Recta paralela al eje y.
    }
    if (pendiente() == 0) {
      return "y = " + ordenada();  //Recta paralela al eje x.
    }
    return (ordenada() >= 0) ? "y = "+ pendiente() +"x + "+ ordenada()
                             : "y = "+ pendiente() +"x "  + ordenada();
  } 

/**
 * Devuelve la pendiente de una recta.
 * @return double - La pendiente de la recta.
 */
  public double pendiente() {
    double divisor = p2.obtenerX() - p1.obtenerX();

    return (divisor != 0) ? (p2.obtenerY() - p1.obtenerY())/divisor
	: Double.POSITIVE_INFINITY;            //Recta paralela al eje Y
  }

/**
 * Método para obtener calcular la ordenada al origen de la recta dada  
 * @return double -- la ordenada al origen
 */
  public double ordenada() {    
      return (p1.obtenerX() == p2.obtenerX())     ? Double.POSITIVE_INFINITY
	     : p1.obtenerY() - pendiente()*p1.obtenerX();
  }

/**
 * Método para determinar si un punto pertenece a la recta
 * @param p -- Punto a determinar si está en la recta
 * @return boolean -- true si el punto está en la recta y false en otro caso
 **/
  public boolean contiene(Punto p) {  
      return p.estanAlineados(p1,p2);
  }

/**
 * Método para determinar si dos líneas son la misma 
 * @param linea1 -- Línea con la que se comparará la línea original
 * @return boolean -- true si son la misma línea y false en otro caso
 */
  public boolean equals(Linea linea1) {  
    return pendiente() == linea1.pendiente() && ordenada() == linea1.ordenada();
  }

/**
 * Método para determinar si dos líneas son paralelas 
 * @param linea1 -- Línea con la que se comparará la línea original
 * @return boolean -- true si ambas líneas son paralelas y false en otro caso
 */
  public boolean esParalelaA(Linea linea1) {  
    return pendiente () == linea1.pendiente();
  }

/**
 * Método para determinar si dos líneas son perpendiculares 
 * @param linea1 -- Línea con la que se comparará la línea original
 * @return boolean -- true si ambas líneas son perpendiculares y false en otro caso
 */
  public boolean esPerpendicularA(Linea linea1) {  
    double m = pendiente();
    double m1 = linea1.pendiente();
    final double INFINITO = Double.POSITIVE_INFINITY;
    boolean perpendicular;

    perpendicular = (m == 0 && m1 == INFINITO) || (m1 == 0 && m == INFINITO);
    if (!perpendicular) {
      perpendicular = (m == (-1 / m1));
  }
  return perpendicular;
  }

  /**
   * Método para determinar el punto de intersección entre dos líneas 
   * @param linea1 - la segunda línea
   * @return Punto - punto de intesercción
   */
  public Punto interseccion(Linea linea1) { 
      double nuevaX, nuevaY;

      if (esParalelaA(linea1)) {
	  nuevaX = nuevaY = Double.POSITIVE_INFINITY;
      } else {
	  nuevaX = (ordenada()- linea1.ordenada())/(linea1.pendiente() - pendiente());
	  nuevaY = (pendiente()*nuevaX + ordenada());
      }
      return new Punto(nuevaX, nuevaY);
  }

    /**
     * Método para escribir la reperesentacion de la linea usando
     * sus dos puntos
     */
    public String toString() {
	//	return ecuacion();
		return "Recta que pasa por "+p1+" y "+p2;
    }
}
