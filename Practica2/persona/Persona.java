public class Persona{

    /**Atributos de la persona proporcionados**/
    String nombre = "";
    String ocupacion="";
    int edad = 0;

    //añade más atributos a la clase, tu implementación va aquí debajo
    double altura = 0; 
    double peso = 0; 
    String estadoCivil = ""; 
    int hijos = 0;

    // Método que devuelve el nombre de un objeto Persona
    public String obtenerNombre(){
        return this.nombre;
    }

    // Método que establece un nuevo nombre para el objeto Persona
    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Implementa los métodos getter y setter para cada uno de los atributos 
     * de la clase, tanto los proporcionados aqui como los que añadirás
     * 
     **/

    // Método que devuelve la ocupación de un objeto Persona
    public String obtenerOcupacion(){
        return this.ocupacion;
    }

    // Método que establece una nueva ocupación para el objeto Persona
    public void modificarOcupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }

    // Método que devuelve la edad del objeto Persona
    public int obtenerEdad(){
        return this.edad;
    }

    // Método que establece una nueva edad para el objeto Persona
    public void modificarEdad(int edad){
        this.edad = edad; 
    }

    // Método que devuelve la altura del objeto Persona
    public double obtenerAltura(){
        return this.altura;
    }

    // Método que establece una nueva altura para el objeto Persona
    public void modificarAltura(double altura){
        this.altura = altura;
    }

    // Método que devuelve el peso del objeto Persona
    public double obtenerPeso(){
        return this.peso;
    }

    // Método que establece un nuevo peso para el objeto Persona 
    public void modificarPeso(double peso){
        this.peso = peso;
    }

    // Método que devuelve el estado civil del objeto Persona
    public String obtenerEstadoCivil(){
        return this.estadoCivil;
    }

    // Método que establece un nuevo estado civil del objeto Persona
    public void modificarEstadoCivil(String estadoCivil){
        this.estadoCivil = estadoCivil;
    }

    // Método que devuelve los hijos del objeto Persona
    public int obtenerHijos(){
        return this.hijos;
    }

    // Método que establece nuevos hijos del objeto Persona
    public void modificarHijos(int hijos){
        this.hijos = hijos;
    }


    /**Método que nos devuelve toda la información de un objeto tipo Persona.
     * Completa este método con los atributos faltantes**/
    public void obtenInformacion(){
        System.out.println("Nombre: " + nombre + ",\n" + 
                            "Edad: " + edad + ",\n" + 
                            "Ocupación: " + ocupacion + "\n" +
                            "Altura: " + altura + "\n" +
                            "Peso: " + peso + "\n" +
                            "Estado civil: " + estadoCivil + "\n" +
                            "Hijos: " + hijos );
    }
     
}