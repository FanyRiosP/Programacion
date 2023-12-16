public class Bicicleta implements Vehiculo{
    
    public String propietario ="";
    public String color = "";
    public String marca = "";
    public int velocidadMaxima = 0;
    public String combustibleUsado = "";

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

    @Override
    public void acelerar(){
        System.out.println("El vehiculo esta acelerando");
    }

    @Override
    public void frenar(){
        System.out.println("El vehiculo esta frenando");
    }

    @Override
    public void cargarCombustible(){
        System.out.println("La bicicleta es electrica y se esta recargando");
    }

    @Override
    public void cargarCombustible(int tiempoEspera){
        System.out.println("La bicicleta requiere: " + tiempoEspera + " minutos para cargarse");
    }

    @Override
    public void obtenerInformacion(){
        System.out.println("Caracteristicas de la bicicleta: " +"\n" + 
        "Propetario: " + getPropietario() + "\n" +
        "Modelo: " +getMarca() + "\n"+
        "Velocidad Máxima: " + getvelocidadMaxima() + "\n"+
        "Combustible Usado: " + getCombustibleUsado() + "\n"+
        "Color: " + getColor() + "\n");
    }

}
