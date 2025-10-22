package ejerciciosPractica.app7;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento no valido!");
        } else {
            Scanner sc = new Scanner(System.in);
            String nombreFichero = args[0];

            System.out.println("Escribe frases para guardar en el archivo --> " + nombreFichero);
            System.out.println("Cuando quieras terminar escribe 'fin' :)");

            //Escribir en el fichero
            try(
                FileWriter fw = new FileWriter(nombreFichero, true);
                BufferedWriter bw = new BufferedWriter(fw)){

                while(true){
                    System.out.print(">");
                    String linea = sc.nextLine();

                    if(linea.equals("fin")){
                        break;
                    }
                    bw.write(linea);
                    bw.newLine();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            //Mostrar el fichero
            System.out.println("Contenido actual del archivo --> " + nombreFichero);
            try(
                FileReader fr = new FileReader(nombreFichero);
                BufferedReader br = new BufferedReader(fr)
            ){
                String linea;
                while((linea = br.readLine()) != null){
                    System.out.println(linea);
                }

            } catch(Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
