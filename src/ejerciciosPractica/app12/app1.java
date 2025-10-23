package ejerciciosPractica.app12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class app1 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento no válido!");
        }

        try{
            int num = Integer.parseInt(args[0]);
            int doble = 2 * num;
            System.out.println("El doble del numero " + num + " es: " + doble);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }
}
