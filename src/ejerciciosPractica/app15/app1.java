package ejerciciosPractica.app15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessBuilder pb = new ProcessBuilder("java",
                "C:\\Users\\Luis_\\IdeaProjects\\EstudiarPSPBien\\src\\ejerciciosPractica\\app15\\app2.java");
        try{
            //Mandar datos a app2
            Process p = pb.start();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(p.getOutputStream()));
            System.out.println("Introduce los numeros que quieras (termina con 0 o negativo)");
            while(sc.hasNext()){
                int num = sc.nextInt();
                if(num<0) break;
                bw.write(num+"\n");
            }
            bw.flush();
            bw.close();
            p.waitFor();

            //Mostrar datos por pantalla
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();

        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
