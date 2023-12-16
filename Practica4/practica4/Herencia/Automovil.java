public class Automovil extends Vehiculo{
    
    //Atributos de la clase automovil
    private String motor;
    private String marca;
    private int capacidad;

    // Constructor de la clase Automóvil, utiliza el constructor de la clase padre Vehículo 
    // para inicializar los atributos heredados más los de la subclase
    public Automovil(int numRuedas, String color, int velocidadMaxima, String combustibleUsado, int Anio, String propietario, String marca, String motor, int capacidad){
        super(numRuedas, color, velocidadMaxima, combustibleUsado, Anio, propietario);
        this.marca = marca;
        this.motor = motor;
        this.capacidad = capacidad; 
    }

    public void cargarCombustible(int tiempodeEspera){
        System.out.println("Se necesitan: " + tiempodeEspera + " minutos para completar la carga de combustible");
    }
    
    // Métodos Getters y Setters de los atributos propios del objeto Automóvil
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

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // Método toString que muestra las características heredadas de un vehículo 
    // más las de subclase que la convierten en un objeto automóvil
    public void mostrarAutomovil(){
        System.out.println("Caracteristicas del automóvil: " + "\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Marca: "+ getMarca() + "\n" + 
        "Motor: " +getMotor() + "\n" +
        "Año: " + getAnio() + "\n" +
        "Color: " + getColor() + "\n" +
        "Capacidad: " + getCapacidad() + "\n" +
        "Número de Ruedas: " + getnumRuedas() + "\n" +
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n" +
        "Combustible Usado: " + getcombustibleUsado());
    }
}
