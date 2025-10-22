package ejerciciosPractica.app9;

import java.io.*;

public class appHija {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Uso: nomArchivo1 nomArchivo2 archivoNuevo");
        } else {
            String nombreFichero1 = args[0];
            String nombreFichero2 = args[1];
            String archivoNuevo = args[2];

            try(BufferedReader br1 = new BufferedReader(new FileReader(nombreFichero1));
                BufferedReader br2 = new BufferedReader(new FileReader(nombreFichero2));
                BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNuevo));
                    ){
                String linea;

                //Leer archivo1 y escribir
                while ((linea = br1.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine();
                }

                //Leer archivo2 y escribir
                while ((linea = br2.readLine()) != null) {
                    bw.write(linea);
                    bw.newLine();
                }
                System.out.println("Archivos enlazados correctamente en " + archivoNuevo);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

