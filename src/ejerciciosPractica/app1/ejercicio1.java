package ejerciciosPractica.app1;

public class ejercicio1 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Introduce un nombre!");
        } else {
            String nombre = args[0];
            System.out.println("Hola " + nombre + ", soy el proceso hijo.");
        }
    }
}
