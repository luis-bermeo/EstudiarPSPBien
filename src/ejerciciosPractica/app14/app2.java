package ejerciciosPractica.app14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero minimo");
        int min = sc.nextInt();
        System.out.println("Introduce el numero maximo");
        int max = sc.nextInt();
        System.out.println("Introduce el nombre del archivo:");
        String nombreArchivo = sc.next();

        Random random =  new Random();
        int veces = 4 +  random.nextInt(3); //lo llamamos entre 4 y 6 veces

        for (int i = 0; i < veces; i++) {
            System.out.println("Llamada " +  (i + 1) + " completada!");
            try{
                ProcessBuilder pb = new ProcessBuilder("java",
                        "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app14\\app1.java",
                        String.valueOf(min), String.valueOf(max), nombreArchivo);
                Process p = pb.start();
                p.waitFor();

            }catch(Exception e){
                throw new RuntimeException(e);
            }

        }

    }
}
