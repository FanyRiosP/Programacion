public abstract class Vehiculo {
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private String propietario;
    private String combustible;

    public abstract void acelerar();
    public abstract void frenar();
    public abstract void cargarCombustible();
    public abstract void obtenerInformacion();
    
    
    public void cargarCombustible(int tiempodeEspera){
        System.out.println("Se necesitan: " + tiempodeEspera + " minutos para completar la carga de combustible");
    }
    

    public void arrancar(){
        System.out.println("El auto esta encendido");
    }
    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getvelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void setvelocidadMaxima(int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getPropietario(){
        return this.propietario;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }

    public String getCombustibleUsado(){
        return this.combustible;
    }

    public void setCombustibleUsado(String combustible){
        this.combustible = combustible;
    }
}
