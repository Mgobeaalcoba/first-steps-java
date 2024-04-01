public class PasarPorReferencia {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.cambiarNombre("Juan");
        System.out.println("persona = " + persona.getNombre()); // Juan
        modificarPersona(persona); // Se pasa la referencia del objeto persona a modificarPersona y se modifica el objeto persona
        System.out.println("persona = " + persona.getNombre()); // Pedro
    }

    private static void modificarPersona(Persona persona) {
        persona.cambiarNombre("Pedro");
    }
}

class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void cambiarNombre(String nombre) {
        this.nombre = nombre;
    }
}