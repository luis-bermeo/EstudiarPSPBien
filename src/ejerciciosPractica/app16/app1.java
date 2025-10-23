package ejerciciosPractica.app16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class app1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea =  br.readLine();

            if(linea.isEmpty() || linea == null){
                System.out.println("No se recibieron palabras");
            }

            String[] palabrasSeparadas = linea.split(" ");
            List <String> palabras = new ArrayList<>(Arrays.asList(palabrasSeparadas));
            Collections.sort(palabras,  Collections.reverseOrder());

            String resultado = String.join(" ", palabras);
            System.out.println(resultado);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
