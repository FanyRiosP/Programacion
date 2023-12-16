public interface Vehiculo {

    public void setPropietario(String propietario);
    public void setColor(String color);
    public void setCombustibleUsado(String combustible);
    public void setMarca(String marca);
    public void setvelocidadMaxima(int velocidadMaxima);
    public String getPropietario();
    public String getColor();
    public String getCombustibleUsado();
    public String getMarca();
    public int getvelocidadMaxima();
    public void acelerar();
    public void frenar();
    public void cargarCombustible();
    public void cargarCombustible(int tiempoEspera);
    public void obtenerInformacion();
    
}
