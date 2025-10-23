package ejerciciosPractica.app18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class app1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Uso: <min> <max> <nombreArchivo>");
            return;
        }

        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        String nombreArchivo = args[2];

        Random random = new Random();
        int temperatura = min + random.nextInt(max - min + 1);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            LocalDateTime ahora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            bw.write(temperatura + " °C -- " + ahora.format(formato));
            bw.newLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
