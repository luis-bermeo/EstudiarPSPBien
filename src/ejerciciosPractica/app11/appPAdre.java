package ejerciciosPractica.app11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class appPAdre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app11\\appHija.java");

        try{
            Process p = pb.start();
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));

            System.out.println("Introduce las frases a poner en mayuscula (introduce 'fin' para terminar)");

            //bucle de escribir y mandar a app1
            while(true){
                System.out.print(">");
                String frase = sc.nextLine();
                bw.write(frase);
                bw.newLine();
                bw.flush();

                if(frase.equalsIgnoreCase("fin")){
                    break;
                }
            //imprimir resultado en pantalla
                String respuesta = br.readLine();
                System.out.println("Respuesta: " + respuesta);
            }

            p.waitFor();

        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
