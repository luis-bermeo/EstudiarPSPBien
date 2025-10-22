package ejerciciosPractica.app12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class app1 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());


        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
