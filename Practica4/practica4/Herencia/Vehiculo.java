public class Vehiculo {

    //Atributos de la clase Vehiculo
    private int numRuedas;
    private String color;
    private int velocidadMaxima;
    private String combustibleUsado;
    private int Anio;
    private String propietario;
    
    /**Constructor por defecto de la clase vehiculo */
    public Vehiculo(){
        this(2, "negro", 60, "electrico", 2023, "desconocido");
    }

    /**
     * Constructor de la clase vehiculo.
     * @param numRuedas
     * @param color
     * @param velocidadMaxima
     * @param combustibleUsado
     * @param Anio
     * @param propietario
     */
    public Vehiculo( int numRuedas, String color, int velocidadMaxima, String combustibleUsado, int Anio, String propietario){
        this.numRuedas = numRuedas;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.combustibleUsado = combustibleUsado;
        this.Anio = Anio;
        this.propietario = propietario;
    }

    /**
     * Método que devuelve el número de ruedas del vehiculo
     * @return
     */
    public int getnumRuedas(){
        return this.numRuedas;
    }

    /**
     * Método que devuelve el color del vehiculo.
     * @return
     */
    public String getColor(){
        return this.color;
    }

    /**
     * Método que devuelve la velocidad máxima alcanzada por el vehiculo
     * @return
     */
    public int getvelocidadMaxima(){
        return this.velocidadMaxima;
    }

    /**
     * Método que devuelve el combustible usado por el vehiculo
     * @return
     */
    public String getcombustibleUsado(){
        return this.combustibleUsado;
    }

    /**
     * Método que devuelve el año de creación del vehiculo
     * @return
     */
    public int getAnio(){
        return this.Anio;
    }

    /**
     * Método que establece el número de ruedas del vehiculo
     * @param numRuedas
     */
    public void setnumRuedas(int numRuedas){
        this.numRuedas = numRuedas;
    }

    /**
     * Método que establece el color
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Método que establece la velocidad máxima alcanzada por el vehiculo
     * @param velocidadMaxima
     */
    public void setvelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * Método que establece el combustible usado
     * @param combustibleUsado
     */
    public void setcombustibleUsado(String combustibleUsado){
        this.combustibleUsado = combustibleUsado;
    }

    /**
     * Método que establece el año de creación del vehiculo
     * @param Anio
     */
    public void setAnio(int Anio){
        this.Anio = Anio;
    }

    /**
     * método que devuelve al propietario del vehiculo
     * @return
     */
    public String getPropietario(){
        return this.propietario;
    }

    /**
     * Método que establece al propietario del vehiculo
     * @param propietario
     */
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

    public void cargarCombustible(){
        System.out.println("Se esta cargando combustible al vehiculo");
    }
}