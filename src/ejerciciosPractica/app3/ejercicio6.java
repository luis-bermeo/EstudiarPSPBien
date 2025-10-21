package ejerciciosPractica.app3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese frase: ");
        String frase = sc.nextLine();

        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\ejercicio5.java", frase);

        try {
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
