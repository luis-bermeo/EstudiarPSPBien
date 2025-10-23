package ejerciciosPractica.app18;

import java.io.BufferedReader;
import java.io.FileReader;

public class app2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: <nombreArchivo>");
            return;
        }

        String nombreArchivo = args[0];
        int maxTemp = -1;
        String lineaMax = "";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                int temp = Integer.parseInt(partes[0]);

                if (temp > maxTemp) {
                    maxTemp = temp;
                    lineaMax = linea;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Ciudad (" + nombreArchivo + "): día más caluroso --> " + lineaMax);

    }
}
