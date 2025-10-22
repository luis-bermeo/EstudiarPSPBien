package ejerciciosPractica.app8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del fichero! :)");
        String nombreFichero = sc.nextLine();
        try{
            ProcessBuilder pb = new ProcessBuilder("java",
                    "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app8\\app1.java", nombreFichero);
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
