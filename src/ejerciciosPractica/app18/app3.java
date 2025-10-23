package ejerciciosPractica.app18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class app3 {
    public static void main(String[] args) {
        String[] ciudades = {"madrid.txt", "sevilla.txt", "valencia.txt"};
        int min = 10;
        int max = 40;

        Random random = new Random();

        try {
            for (String ciudad : ciudades) {
                int veces = 3 + random.nextInt(3);
                for (int i = 0; i < veces; i++) {
                    ProcessBuilder pb = new ProcessBuilder("java",
                            "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app18\\app1.java",
                            String.valueOf(min), String.valueOf(max), ciudad);
                    pb.inheritIO();
                    Process p = pb.start();
                    p.waitFor();
                }
            }

            System.out.println("\n==== RESULTADOS ====");
            for (String ciudad : ciudades) {
                ProcessBuilder pb2 = new ProcessBuilder("java",
                        "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app18\\app2.java",
                        ciudad);
                Process p2 = pb2.start();

                BufferedReader br = new BufferedReader(new InputStreamReader(p2.getInputStream()));
                String linea;
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
                p2.waitFor();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
