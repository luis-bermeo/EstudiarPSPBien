package ejerciciosPractica.app13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo");
        String nombreArchivo = sc.nextLine();
        Random random = new Random();
        int veces = 4 + random.nextInt(3);
        System.out.println("Ejecutando app " + veces + " veces...");

        for (int i = 0; i < veces; i++) {
            try{
                ProcessBuilder pb  = new ProcessBuilder("java",
                        "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app13\\app1.java",
                        nombreArchivo);
                Process p = pb.start();

                int espera = 1000 + random.nextInt(2000);
                Thread.sleep(espera);

                System.out.println("Llamada " + (i + 1) + " completada!");

            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }

        //Mostrar contenido archivo completo
        System.out.println("Contenido del archivo " + nombreArchivo);
        try{
            BufferedReader bf = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e){
            throw new RuntimeException(e);
        }

    }
}
