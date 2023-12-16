public class Bicicleta extends Vehiculo{

    //Atributos de la clase bicicleta
    private String marca;
    private String modelo;

    /**
     * Constructor de la clase Bicicleta, utiliza el constructor de la clase padre para inicializar los atributos
     * heredados más los de la subclase.
     * @param numRuedas
     * @param color
     * @param velocidadMaxima
     * @param combustibleUsado
     * @param Anio
     * @param propietario
     * @param marca
     * @param modelo
     */
    public Bicicleta(int numRuedas, String color, int velocidadMaxima, String combustibleUsado, int Anio, String propietario,String marca, String modelo){
        super(numRuedas, color, velocidadMaxima, combustibleUsado, Anio, propietario);
        this.marca = marca;
        this.modelo = modelo;
    }

    public void cargarCombustible(int tiempodeEspera){
        System.out.println("Se necesitan: " + tiempodeEspera + " minutos para completar la carga de combustible");
    }
    
    /**
     * Método que establece la marca de una bicicleta
     * @param marca
     */
    public void setMarca(String marca){
        this.marca = marca;
    }

    /**
     * Metodo que nos devuelve la marca de una bicicleta
     * @return
     */
    public String getMarca(){
        return this.marca;
    }

    /**
     * Método que establece el modelo de una bicicleta.
     * @param modelo
     */
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    /**
     * Método que nos devuelve el modelo de una bicicleta
     * @return
     */
    public String getModelo(){
        return this.modelo;
    }

    /**
     * Metodo toString que nos muestra las caracteristicas heredadas de un vehiculo las mas de subclase
     * que la convierten en un objeto bicicleta*/
    public void mostrarBicicleta(){
        System.out.println("Caracteristicas de la bicicleta: " +"\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Marca: "+ getMarca() + "\n" + 
        "Modelo: " +getModelo() + "\n"+
        "Año: " + getAnio() + "\n" +
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n"+
        "Combustible Usado: " + getcombustibleUsado() + "\n"+
        "Color: " + getColor() + "\n"+
        "Número de Ruedas: " + getnumRuedas());
    }
}
