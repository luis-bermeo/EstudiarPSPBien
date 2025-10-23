package ejerciciosPractica.app17;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class app3 {
    public static void main(String[] args) {
        String nombreFichero = "notas.txt";

        try{
            //Llamada app1
            ProcessBuilder pb = new ProcessBuilder("java",
                    "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app17\\app1.java",
                    nombreFichero);
            pb.inheritIO();
            Process p = pb.start();
            p.waitFor();

            //Llamada app2
            ProcessBuilder pb2 = new ProcessBuilder("java",
                    "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app17\\app2.java", nombreFichero);
            pb2.inheritIO();
            Process p2 = pb2.start();

            //Mostrar resultados por pantalla
            BufferedReader br = new BufferedReader(new InputStreamReader(p2.getInputStream()));
            String linea;
            while((linea = br.readLine())!=null){
                System.out.println(linea);
            }
            p2.waitFor();

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
