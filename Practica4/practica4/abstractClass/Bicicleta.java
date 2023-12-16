public class Bicicleta extends Vehiculo {

    public boolean movimiento = false;

    public void acelerar(){
        if(movimiento == false){
            movimiento = true;
            System.out.println("La bicicleta esta acelerando");
        }
    }

    public void frenar(){
        if(movimiento == true){
            System.out.println("La bicicleta esta frenando");
        }
    }

    public void cargarCombustible(){
        System.out.println("La bicicleta es electrica, por lo que esta siendo recargada");
    }
    
    public void obtenerInformacion(){
        System.out.println("Caracteristicas de la bicicleta: " +"\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Modelo: " +getModelo() + "\n"+
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n"+
        "Combustible Usado: " + getCombustibleUsado() + "\n"+
        "Color: " + getColor() + "\n");
    }
}
