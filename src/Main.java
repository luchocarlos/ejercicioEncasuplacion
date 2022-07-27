public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(25);
        persona1.setNombre("Gabriela");
        persona1.setTelefono("3108871095");

        Persona persona2 = new Persona();
        persona2.setEdad(26);
        persona2.setNombre("Luis");
        persona2.setTelefono("3108871096");

        System.out.println("Su edad es "+persona1.getEdad());
        System.out.println("Su nombre es "+persona1.getNombre());
        System.out.println("Su telfono es "+persona1.getTelefono());
        System.out.println();
        System.out.println("Su edad es "+persona2.getEdad());
        System.out.println("Su nombre es "+persona2.getNombre());
        System.out.println("Su telfono es "+persona2.getTelefono());

    }
}



class Persona {

    private int edad;
    private String nombre;
    private String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return this.telefono;
    }

}