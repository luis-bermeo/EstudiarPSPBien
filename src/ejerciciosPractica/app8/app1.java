package ejerciciosPractica.app8;

import java.io.BufferedReader;
import java.io.FileReader;

public class app1 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento invalido");
        } else{
            String nombreFichero = args[0];
            try(FileReader fr = new FileReader(nombreFichero);
                BufferedReader br = new BufferedReader(fr)){
                String linea;
                int contador = 0;
                while((linea = br.readLine()) != null){
                    contador = contador + 1;
                }
                System.out.println("El numero de lineas que tiene el archivo " + nombreFichero + " son " + contador + " lineas.");

            }catch(Exception e){
                throw new RuntimeException(e);
            }

        }
    }
}
