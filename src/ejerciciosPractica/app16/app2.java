package ejerciciosPractica.app16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app16\\app1.java");

        try{
            Process p = pb.start();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            StringBuilder sb = new StringBuilder();

            System.out.println("Introduce las palabras que quieras ordenar alfabéticamente en orden descendente! :)");
            System.out.println("Escribe 'fin' para terminar");

            while(true){
                System.out.print(">");
                String palabra = sc.nextLine();

                if(palabra.equals("fin")){
                    break;
                }

                sb.append(palabra).append(" ");
            }

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
            bw.close();

            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println("Palabras ordenadas: " + linea);
            }

            br.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
