package ejerciciosPractica.app5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class claseHija {
    public static void main(String[] args) {
        if(args.length!= 1){
            System.out.println("Argumento inválido!");
        } else{
            String nombreFichero = "palabras.txt";
            String palabra = args[0];
            try{
                FileWriter fw = new FileWriter(nombreFichero, true);
                fw.write(palabra + "\n");
                fw.flush();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
