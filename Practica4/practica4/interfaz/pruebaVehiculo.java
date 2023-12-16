public class pruebaVehiculo {
    public static void main(String[] args) {

        // Creación de un objeto bicicleta
        Bicicleta bici = new Bicicleta();
        bici.setColor("azul");
        bici.setCombustibleUsado("electrico");
        bici.setMarca("Benotto");
        bici.setPropietario("Tadeo");
        bici.setvelocidadMaxima(50);
        bici.acelerar();
        bici.frenar();
        bici.obtenerInformacion();
        bici.cargarCombustible();
        bici.cargarCombustible(15);

        // Creación de un objeto automóvil
        Automovil auto = new Automovil();
        auto.setColor("Rojo");
        auto.setCombustibleUsado("Diesel");
        auto.setMarca("Ford");
        auto.setModelo("Expedition 2023");
        auto.setMotor("de Gasolina");
        auto.setCapacidad(7);
        auto.setPropietario("Juan");
        auto.setvelocidadMaxima(100);
        auto.acelerar();
        auto.frenar();
        auto.obtenerInformacion();
        auto.cargarCombustible();
        auto.cargarCombustible(30);

        // Creación de un objeto motocicleta
        Motocicleta moto = new Motocicleta();
        moto.setColor("Blanco");
        moto.setCombustibleUsado("Diesel");
        moto.setMarca("Yamaha");
        moto.setModelo("MT-03");
        moto.setMotor("de Refrigeración líquida");
        moto.setEstilo("Naked");
        moto.setPropietario("Zara");
        moto.setvelocidadMaxima(150);
        moto.acelerar();
        moto.frenar();
        moto.obtenerInformacion();
        moto.cargarCombustible();
        moto.cargarCombustible(10);

    }
}
