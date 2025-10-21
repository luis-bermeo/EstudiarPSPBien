package ejerciciosPractica.app4;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class claseHija {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Argumento inválido!");
        } else {
            String nombreFichero = args[0] + ".txt";
            try{
                FileWriter fw = new FileWriter(nombreFichero, true);
                LocalDateTime fechaAhora = LocalDateTime.now();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                fw.write(fechaAhora.format(dtf) + "\n");
                fw.close();
            }catch(IOException e){
                throw new RuntimeException(e);
            }

        }

    }
}
