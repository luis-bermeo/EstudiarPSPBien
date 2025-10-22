package ejerciciosPractica.app9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class appPadre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del archivo 1 (ya creado)");
        String archivo1 = sc.nextLine();
        System.out.println("Ingresa el nombre del archivo 2 (ya creado)");
        String archivo2 = sc.nextLine();
        System.out.println("Ingresa el nombre del archivo3 (a crear)");
        String archivoNuevo = sc.nextLine();

        try{
            ProcessBuilder pb = new ProcessBuilder("java",
                    "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app9\\appHija.java",
                    archivo1, archivo2, archivoNuevo);
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
            p.waitFor();

        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
