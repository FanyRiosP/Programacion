public class Automovil extends Vehiculo{
    
    public String motor;
    public String marca;
    public int capacidad;

    public boolean movimiento = false;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void acelerar(){
        if(movimiento == false){
            movimiento = true;
            System.out.println("El auto esta acelerando");
        }
    }

    public void frenar(){
        if(movimiento == true){
            System.out.println("El auto esta frenando");
        }
    }

    public void cargarCombustible(){
        System.out.println("El automóvil está siendo cargado");
    }
    
    public void obtenerInformacion(){
        System.out.println("Caracteristicas del automóvil: " +"\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Marca: " + getMarca() + "\n" +
        "Modelo: " + getModelo() + "\n" +
        "Color: " + getColor() + "\n" +
        "Motor: " + getMotor() + "\n" +
        "Capacidad: " + getCapacidad() + "\n" +
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n" +
        "Combustible Usado: " + getCombustibleUsado() + "\n");
    }

}
