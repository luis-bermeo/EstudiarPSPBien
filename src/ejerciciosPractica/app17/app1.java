package ejerciciosPractica.app17;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento invalido");
            return;
        }

        String nombreFichero = args[0];
        Scanner sc = new Scanner(System.in);

        try{
            FileWriter fw = new FileWriter(nombreFichero, true);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("Introduce los nombres con sus notas respectivas a introducir en el fichero!");
            System.out.println("Escribe 'fin' para terminar");
            while(true){
                String linea = sc.nextLine();
                if(linea.equals("fin")) break;
                String[] partes  = linea.split(" ");
                if(partes.length!=2){
                    System.out.println("Error: El formato es por ejemplo --> Juan 8");
                    continue;
                };
                bw.write(linea);
                bw.newLine();
            }
            bw.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
