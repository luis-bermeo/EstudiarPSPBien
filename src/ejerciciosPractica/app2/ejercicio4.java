package ejerciciosPractica.app2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero uno: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el numero dos: ");
        int num2 = sc.nextInt();

        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\ejercicio3.java", String.valueOf(num1), String.valueOf(num2));

        try{
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        }catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
