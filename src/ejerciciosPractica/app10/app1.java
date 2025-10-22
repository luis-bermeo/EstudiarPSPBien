package ejerciciosPractica.app10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app10\\app2.java");

        try{
            Process p = pb.start();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

            System.out.println("Introduce numeros para sumar (introduce 'fin' para finalizar)");

            //escribir numeros para mandarlos
            while(true){
                System.out.print(">");
                String entrada  = sc.nextLine();

                bw.write(entrada);
                bw.newLine();
                bw.flush();

                if(entrada.equalsIgnoreCase("fin")){
                    break;
                }
            }

            //leer resultado desde app2
            String resultado;
            while((resultado = br.readLine()) != null){
                System.out.println("--> " + resultado);
            }

            p.waitFor();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

