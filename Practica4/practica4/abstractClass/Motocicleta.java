public class Motocicleta extends Vehiculo {

    public String motor;
    public String marca;
    public String estilo;

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

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public void acelerar() {
        if (movimiento == false) {
            movimiento = true;
            System.out.println("La moto está acelerando");
        }
    }

    public void frenar() {
        if (movimiento == true) {
            System.out.println("La moto está frenando");
        }
    }

    public void cargarCombustible() {
        System.out.println("La motocicleta está siendo recargada");
    }

    public void obtenerInformacion(){
        System.out.println("Caracteristicas de la motocicleta: " +"\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Marca: " + getMarca() + "\n" +
        "Modelo: " + getModelo() + "\n" +
        "Color: " + getColor() + "\n" +
        "Motor: " + getMotor() + "\n" +
        "Estilo: " + getEstilo() + "\n" +
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n" +
        "Combustible Usado: " + getCombustibleUsado() + "\n");
    }

}
