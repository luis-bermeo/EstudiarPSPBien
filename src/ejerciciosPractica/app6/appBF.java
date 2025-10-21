package ejerciciosPractica.app6;

import java.io.BufferedReader;
import java.io.FileReader;

public class appBF {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento inválido!");
        }

        String nombreArchivo = args[0];
        try{
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while((linea = br.readLine())!=null){
                System.out.println(linea);
            }
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
