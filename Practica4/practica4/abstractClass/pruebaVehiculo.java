public class pruebaVehiculo {
    public static void main(String[] args) {

        // Objeto bicicleta
        Bicicleta bici = new Bicicleta();
        bici.setColor("rojo");
        bici.setCombustibleUsado("electrico");
        bici.setModelo("R700");
        bici.setPropietario("Dicter");
        bici.setvelocidadMaxima(60);
        bici.obtenerInformacion();
        bici.arrancar();
        bici.acelerar();
        bici.frenar();
        bici.cargarCombustible();
        bici.cargarCombustible(10);

        // Objeto automóvil
        Automovil auto = new Automovil();
        auto.setPropietario("Juan");
        auto.setMarca("Ford");
        auto.setModelo("Expedition 2023");
        auto.setColor("Plata");
        auto.setMotor("de Gasolina");
        auto.setCapacidad(7);
        auto.setvelocidadMaxima(100);
        auto.setCombustibleUsado("Diesel");
        auto.obtenerInformacion();
        auto.arrancar();
        auto.acelerar();
        auto.frenar();
        auto.cargarCombustible();
        auto.cargarCombustible(50);

        // Objeto motocicleta
        Motocicleta moto = new Motocicleta();
        moto.setPropietario("Zara");
        moto.setMarca("Yamaha");
        moto.setModelo("MT-03");
        moto.setColor("Gris oscuro");
        moto.setMotor("de Refrigeración líquida");
        moto.setEstilo("Naked");
        moto.setvelocidadMaxima(150);
        moto.setCombustibleUsado("Diesel");
        moto.obtenerInformacion();
        moto.arrancar();
        moto.acelerar();
        moto.frenar();
        moto.cargarCombustible();
        moto.cargarCombustible(20);

    }
}
