public class Motocicleta extends Vehiculo{
    
    //Atributos de la clase automovil
    private String motor;
    private String marca;
    private String estilo;

    // Constructor de la clase Motocicleta, utiliza el constructor de la clase padre Vehículo 
    // para inicializar los atributos heredados más los de la subclase
    public Motocicleta(int numRuedas, String color, int velocidadMaxima, String combustibleUsado, int Anio, String propietario, String marca, String motor, String estilo){
        super(numRuedas, color, velocidadMaxima, combustibleUsado, Anio, propietario);
        this.marca = marca;
        this.motor = motor;
        this.estilo = estilo;
    }

    public void cargarCombustible(int tiempodeEspera){
        System.out.println("Se necesitan: " + tiempodeEspera + " minutos para completar la carga de combustible");
    }
    
    // Métodos Getters y Setters de los atributos propios del objeto Motocicleta
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }
    
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    // Método toString que muestra las características heredadas de un vehículo 
    // más las de subclase que la convierten en un objeto Motocicleta
    public void mostrarMotocicleta(){
        System.out.println("Caracteristicas de la motocicleta: " + "\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Marca: "+ getMarca() + "\n" + 
        "Motor: " +getMotor() + "\n" +
        "Año: " + getAnio() + "\n" +
        "Color: " + getColor() + "\n" +
        "Estilo: " + getEstilo() + "\n" +
        "Número de Ruedas: " + getnumRuedas() + "\n" +
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n" +
        "Combustible Usado: " + getcombustibleUsado());
    }
}
