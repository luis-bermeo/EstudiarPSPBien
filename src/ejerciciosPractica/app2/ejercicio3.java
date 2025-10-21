package ejerciciosPractica.app2;

public class ejercicio3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Argumentos incorrectos!");
        } else {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double suma  = num1 + num2;
            System.out.println("La suma de " + num1 + " y de " + num2 + " es: " + suma);
        }
    }
}
