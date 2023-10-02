public class PruebaPersona {
    public static void main(String[] args) {
        //creacion de un objeto persona
        Persona gabriel = new Persona();
        gabriel.ocupacion = "Psicologo";
        gabriel.modificarNombre("Gabriel");
        gabriel.edad = 52;
        
        //obtenemos un atributo especifico del objeto, nombre en este caso
        System.out.println(gabriel.obtenerNombre());

        //obtenemos todos los atributos del objeto
        gabriel.obtenInformacion();

        /**Crea un nuevo ejemplar o instancia de la clase Persona y cambia los valores 
         * por defecto de todos los atributos. 
         * Tu implementación va aqui abajo.**/

        Persona juan = new Persona();
        juan.modificarNombre("Juan");
        juan.modificarOcupacion("Dentista");
        juan.modificarEdad(34);
        juan.modificarAltura(1.76);
        juan.modificarPeso(78.900);
        juan.modificarEstadoCivil("Casado");
        juan.modificarHijos(2);

        System.out.println(juan.obtenerNombre());
        System.out.println(juan.obtenerEdad());
        System.out.println(juan.obtenerAltura());
        System.out.println(juan.obtenerPeso());
        System.out.println(juan.obtenerEstadoCivil());

        juan.obtenInformacion();


    }
}
