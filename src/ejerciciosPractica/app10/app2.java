package ejerciciosPractica.app10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class app2 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            int suma = 0;

            while ((linea = br.readLine()) != null) {
                if(linea.equals("fin")){
                    break;
                }
                try{
                    suma += Integer.parseInt(linea);
                } catch(NumberFormatException e){
                    System.out.println("Dato no valido");
                }
            }

            System.out.println("Resultado: " + suma);

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
