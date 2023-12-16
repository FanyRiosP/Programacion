public class Automovil implements Vehiculo{

    public String propietario ="";
    public String color = "";
    public String marca = "";
    public int velocidadMaxima = 0;
    public String combustibleUsado = "";

    public String motor;
    public String modelo;
    public int capacidad;

    @Override
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    
    @Override
    public String getPropietario(){
        return propietario;
    }

    @Override
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String getColor(){
        return color;
    }

    @Override
    public void setMarca(String marca){
        this.marca = marca;
    }

    @Override
    public String getMarca(){
        return marca;
    }

    @Override
    public void setvelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    public int getvelocidadMaxima(){
        return velocidadMaxima;
    }

    @Override
    public void setCombustibleUsado(String combustibleUsado){
        this.combustibleUsado = combustibleUsado;
    }

    @Override
    public String getCombustibleUsado(){
        return combustibleUsado;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void acelerar(){
        System.out.println("El automóvil esta acelerando");
    }

    @Override
    public void frenar(){
        System.out.println("El automóvil esta frenando");
    }

    @Override
    public void cargarCombustible(){
        System.out.println("El automóvil se esta recargando");
    }

    @Override
    public void cargarCombustible(int tiempoEspera){
        System.out.println("El automóvil requiere: " + tiempoEspera + " minutos para cargarse");
    }

    @Override
    public void obtenerInformacion(){
        System.out.println("Caracteristicas del Automóvil: " + "\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Marca: " +getMarca() + "\n" +
        "Modelo: " + getModelo() + "\n" +
        "Color: " + getColor() + "\n" +
        "Motor: " + getMotor() + "\n" +
        "Capacidad: " + getCapacidad() + "\n" +
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n" +
        "Combustible Usado: " + getCombustibleUsado() + "\n" );
    }

}
