package ejerciciosPractica.app12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class app2 {
    public static void main(String[] args) {
        int[]numeros = {2, 4, 5, 1};

        for(int num : numeros){
            try{
                ProcessBuilder pb = new ProcessBuilder("java",
                        "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app12\\app1.java",
                        String.valueOf(num));
                Process p = pb.start();
                BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
                String linea;
                while((linea = input.readLine()) != null){
                    System.out.println(linea);
                }
                p.waitFor();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        }
    }

}
