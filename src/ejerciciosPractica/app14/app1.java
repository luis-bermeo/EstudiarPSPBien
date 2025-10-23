package ejerciciosPractica.app14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class app1 {
    public static void main(String[] args) {
        if(args.length!=3){
            System.out.println("Argumentos inválidos!");
            System.out.println("Funcionamiento: <min> <max> <nombreArchivo>");
        }
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        String nombreArchivo = args[2];

        Random random =  new Random();
        int aleatorio = min + random.nextInt(max - min + 1);

        try{
            LocalDateTime fechaAhora = LocalDateTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true));
            bw.write(aleatorio + " Cº -- " + fechaAhora.format(formato));
            bw.newLine();
            bw.close();

        }catch(Exception e){
            throw new RuntimeException(e);
        }

    }
}
