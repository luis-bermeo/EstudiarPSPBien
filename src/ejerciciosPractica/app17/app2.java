package ejerciciosPractica.app17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class app2 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento invalido!");
        }

        String nombreArchivo = args[0];
        String mejorAlumno ="";
        double mejorNota = -1;
        double suma = 0;
        int contador = 0;

        try{
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while((linea = br.readLine())!=null){
                String[] partes  = linea.split(" ");
                if(partes.length!=2) continue;

                String nombre = partes[0];
                double nota = Double.parseDouble(partes[1]);

                suma+=nota;
                contador++;


                if(nota>mejorNota){
                    mejorNota = nota;
                    mejorAlumno = nombre;
                }

            }
            //resultados
            double media =  suma/contador;
            System.out.println("La media de las notas es --> " + media);
            System.out.println("El mejor alumno es " + mejorAlumno + " con una nota de " + mejorNota);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}