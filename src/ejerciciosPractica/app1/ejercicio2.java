package ejerciciosPractica.app1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = sc.nextLine();

        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\ejercicio1.java", nombre);

        try{
            Process p = pb.start();
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = input.readLine()) != null) {
                System.out.println(linea);
            }

        } catch(IOException e){
            throw new RuntimeException();
        }
    }
}
