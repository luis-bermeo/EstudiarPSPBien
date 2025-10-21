package ejerciciosPractica.app4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class clasePadre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero! :)");
        String nombre = sc.nextLine();
        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app4\\claseHija.java",
                nombre);
        for (int i = 0; i < 3; i++) {
            try{
                System.out.println("Llamada " + (i + 1) + "...");
                if(i > 0){
                    Thread.sleep(1000);
                }
                Process p = pb.start();
                p.waitFor();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombre + ".txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
