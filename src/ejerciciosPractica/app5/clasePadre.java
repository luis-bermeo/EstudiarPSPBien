package ejerciciosPractica.app5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class clasePadre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce la palabra " + (i +1) + ":");
            String palabra = sc.nextLine();
            String palabraNumerada = "Palabra" + (i + 1) + " --> " + palabra;
            ProcessBuilder  pb = new ProcessBuilder("java",
                    "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app5\\claseHija.java",
                    palabraNumerada);

            try{
                Process p = pb.start();
                p.waitFor();

            }catch(Exception e){
                throw new RuntimeException(e);
            }
        }

        try{
            BufferedReader br = new BufferedReader(new FileReader("palabras.txt"));
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
