package ejerciciosPractica.app14;

import java.io.BufferedReader;
import java.io.FileReader;

public class app3 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento invalido");
        }

        String nombreArchivo = args[0];
        int maxTemp = Integer.MIN_VALUE;

        try{
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;
            while((linea = br.readLine())!=null){
                String[] partes =  linea.split(" ");
                int temp = Integer.parseInt(partes[0]);
                if(temp>maxTemp){
                    maxTemp = temp;
                }
            }
            System.out.println("Temperatura máxima: " + maxTemp);

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
