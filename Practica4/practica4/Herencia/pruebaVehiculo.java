public class pruebaVehiculo {
    public static void main(String[] args) {

        // Creación de un objeto bicicleta mediante el constructor de la clase, con los atributos heredados.
        Bicicleta bici = new Bicicleta(2, "azul", 50, null, 2023, "Dicter", "Benotto", "R700");
        bici.mostrarBicicleta();
        bici.cargarCombustible();
        bici.cargarCombustible(20);

        // Creación de un objeto automóvil mediante el constructor de la clase, con los atributos heredados.
        Automovil auto = new Automovil(4, "Negro", 100, "10 L", 2023, "Juan", "Ford", "de Gasolina", 7);
        auto.mostrarAutomovil();
        auto.cargarCombustible();
        auto.cargarCombustible(45);

        // Creación de un objeto motocicleta mediante el constructor de la clase, con los atributos heredados.
        Motocicleta moto = new Motocicleta(2, "Verde", 150, "5 L", 2023, "Zara", "Yamaha", "de Refrigeración líquida", "Naked")
        moto.mostrarMotocicleta();
        moto.cargarCombustible();
        moto.cargarCombustible(30);


    }    
}
