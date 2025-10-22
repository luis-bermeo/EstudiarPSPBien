package ejerciciosPractica.app11;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class appHija {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String linea;
            while((linea = br.readLine())!=null){
                if(linea.equalsIgnoreCase("fin")){
                    break;
                }
                System.out.println(linea.toUpperCase());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
