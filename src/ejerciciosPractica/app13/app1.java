package ejerciciosPractica.app13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class app1 {
    public static void main(String[] args) {
        if(args.length!=1){
            System.out.println("Argumento no válido!");
        }

        try{
            String nombreFichero = args[0];
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreFichero, true));
            LocalDateTime fechaAhora =  LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            bw.write(fechaAhora.format(dtf));
            bw.newLine();
            bw.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
